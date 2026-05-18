package io.github.fhl.icompras.pedidos.client;

import io.github.fhl.icompras.pedidos.model.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

//simula um gateway de pagamento
@Component
@Slf4j
public class ServicoBancarioClient {

    public String solicitarPagamento(Pedido pedido){
        log.info("Solicitando pagamento para o pedido de código {}.", pedido.getCodigo());
        return UUID.randomUUID().toString();
    }
}
