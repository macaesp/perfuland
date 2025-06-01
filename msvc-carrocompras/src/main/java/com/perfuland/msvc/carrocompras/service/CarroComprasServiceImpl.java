package com.perfuland.msvc.carrocompras.service;

import com.perfuland.msvc.carrocompras.exceptions.CarroComprasException;
import com.perfuland.msvc.carrocompras.model.CarroCompras;
import com.perfuland.msvc.carrocompras.repository.CarroComprasRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CarroComprasServiceImpl implements CarroComprasService {

    @Autowired
    private CarroComprasRepository carroComprasRepository;

    @Override
    public List<CarroCompras> findAll () {
        return this.carroComprasRepository.findAll();
    }

    @Override
    public CarroCompras findById(Long id) {
        return this.carroComprasRepository.findById(id).orElseThrow (
                () -> new CarroComprasException("El carro con id"+id+" no se encuentra en la base de datos")
        );
    }


}
