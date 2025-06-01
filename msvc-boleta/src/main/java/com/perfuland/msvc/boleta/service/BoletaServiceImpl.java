package com.perfuland.msvc.boleta.service;

import com.perfuland.msvc.boleta.model.Boleta;
import com.perfuland.msvc.boleta.repository.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoletaServiceImpl {
    @Autowired
    private BoletaRepository boletaRepository;

    @Override
    public List<Boleta> findAll (){
        return this.boletaRepository.findAll();
    }

    @Override
    public Boleta findById(Long id) {
        return this.boletaRepository.findById(id).orElseThrow(
                () -> new BoletaException("La boleta con id"+id+" no se encuentra en la base de datos")
        );
    }
}
