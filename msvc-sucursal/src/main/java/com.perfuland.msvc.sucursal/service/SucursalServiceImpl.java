package com.perfuland.msvc.sucursal.service;

import com.perfuland.msvc.sucursal.exception.SucursalException;
import com.perfuland.msvc.sucursal.model.Sucursal;
import com.perfuland.msvc.sucursal.repository.SucursalRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl implements SucursalService {
    @Autowired
    private SucursalRepository sucursalRepository;
    @Autowired
    private InventarioClientRest inventarioClientRest;

    @Override
    public List<Sucursal> findAll() {
        return this.sucursalRepository.findAll();
    }

    @Override
    public Sucursal findById(Long id) {
        return this.sucursalRepository.findById(id).orElseThrow(
                () -> new SucursalException ("La sucursal con id"+id+" no se encuentra en la base de datos")
        );
    }

}
