package io.github.fhl.icompras.pedidos.sevice;

import io.github.fhl.icompras.pedidos.repository.ItemPedidoRepository;
import io.github.fhl.icompras.pedidos.repository.PedidoRepository;
import io.github.fhl.icompras.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator validator;


}
