package com.perfuland.msvc.inventario.repository;

import com.perfuland.msvc.inventario.model.entities.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Long> {
}
