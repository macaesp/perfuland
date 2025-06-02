package com.perfuland.msvc.sucursal.repository;

import com.perfuland.msvc.sucursal.model.entities.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long>{
}
