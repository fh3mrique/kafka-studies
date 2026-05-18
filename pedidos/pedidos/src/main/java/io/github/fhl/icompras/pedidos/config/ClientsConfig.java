package io.github.fhl.icompras.pedidos.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.github.fhl.icompras.pedidos.client")
public class ClientsConfig {
}
