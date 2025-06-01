package com.perfuland.msvc.cliente.service;

import com.perfuland.msvc.cliente.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
}
