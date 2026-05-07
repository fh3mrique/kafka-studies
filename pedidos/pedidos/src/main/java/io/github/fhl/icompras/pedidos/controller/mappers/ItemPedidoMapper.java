package io.github.fhl.icompras.pedidos.controller.mappers;

import io.github.fhl.icompras.pedidos.controller.dto.ItemPedidoDTO;
import io.github.fhl.icompras.pedidos.model.ItemPedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemPedidoMapper {


    ItemPedido map(ItemPedidoDTO dto);
}
