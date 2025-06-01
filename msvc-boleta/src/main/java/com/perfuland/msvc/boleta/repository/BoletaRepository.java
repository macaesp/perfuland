package com.perfuland.msvc.boleta.repository;

import com.perfuland.msvc.boleta.model.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Long> {
}
