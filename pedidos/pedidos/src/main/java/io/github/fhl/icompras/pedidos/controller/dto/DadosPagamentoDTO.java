package io.github.fhl.icompras.pedidos.controller.dto;

import io.github.fhl.icompras.pedidos.model.enums.TipoPagamento;

public record DadosPagamentoDTO(
        String dados,
        TipoPagamento tipoPagamento
) {
}
