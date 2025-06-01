package com.perfuland.msvc.cliente.repository;

import com.perfuland.msvc.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    Iterable<Long> idCliente(Long idCliente);
}
