package com.perfuland.msvc.carrocompras.repository;

import com.perfuland.msvc.carrocompras.model.CarroCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroComprasRepository extends JpaRepository<CarroCompras, Long> {
}
