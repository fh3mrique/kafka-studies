package io.github.fhl.icompras.pedidos.controller;

import io.github.fhl.icompras.pedidos.controller.dto.NovoPedidoDTO;
import io.github.fhl.icompras.pedidos.controller.mappers.PedidoMapper;
import io.github.fhl.icompras.pedidos.sevice.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
@RequiredArgsConstructor
class PedidoController {

    private final PedidoService service;
    private final PedidoMapper mapper;

    public ResponseEntity<Object> criar (@RequestBody NovoPedidoDTO dto) {

        var pedido = mapper.map(dto);
        var novoPedido = service.criarPedido(pedido);
        return ResponseEntity.ok(novoPedido.getCodigo());
    }

}
