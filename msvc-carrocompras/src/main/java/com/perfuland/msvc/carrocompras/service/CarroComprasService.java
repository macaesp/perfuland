package com.perfuland.msvc.carrocompras.service;

import com.perfuland.msvc.carrocompras.model.CarroCompras;

import java.util.List;

public interface CarroComprasService {
    List<CarroCompras>findAll();
    CarroCompras findById (Long id);
    CarroCompras save (CarroCompras carroCompras);
}
