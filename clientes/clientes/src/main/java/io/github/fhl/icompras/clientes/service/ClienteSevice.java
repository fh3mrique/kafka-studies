package io.github.fhl.icompras.clientes.service;

import io.github.fhl.icompras.clientes.model.Cliente;
import io.github.fhl.icompras.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteSevice {

    private final ClienteRepository repository;

    public Cliente salvar (Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente> obterPorCodigo (Long codigo){
        return repository.findById(codigo);
    }
}
