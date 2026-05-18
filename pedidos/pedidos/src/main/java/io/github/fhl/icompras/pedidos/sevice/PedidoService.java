package io.github.fhl.icompras.pedidos.sevice;

import io.github.fhl.icompras.pedidos.client.ServicoBancarioClient;
import io.github.fhl.icompras.pedidos.model.Pedido;
import io.github.fhl.icompras.pedidos.repository.ItemPedidoRepository;
import io.github.fhl.icompras.pedidos.repository.PedidoRepository;
import io.github.fhl.icompras.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator validator;
    private final ServicoBancarioClient servicoBancarioClient;

    @Transactional()
    public Pedido criarPedido(Pedido pedido){
        validator.validar(pedido);

        realizarPersistencia(pedido);

        enviarSolicitacaoPagamento(pedido);

        return pedido;
    }

    private void enviarSolicitacaoPagamento(Pedido pedido) {
        String chavePagamento = servicoBancarioClient.solicitarPagamento(pedido);
        pedido.setChavePagamento(chavePagamento);
    }

    private void realizarPersistencia(Pedido pedido) {
        repository.save(pedido);
        itemPedidoRepository.saveAll(pedido.getItens());
    }


}
