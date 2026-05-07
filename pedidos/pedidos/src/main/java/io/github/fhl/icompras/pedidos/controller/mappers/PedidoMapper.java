package io.github.fhl.icompras.pedidos.controller.mappers;

import io.github.fhl.icompras.pedidos.controller.dto.NovoPedidoDTO;
import io.github.fhl.icompras.pedidos.model.Pedido;

public interface PedidoMapper {

    Pedido map(NovoPedidoDTO dto);
}
