package com.perfuland.msvc.inventario.service;



import com.perfuland.msvc.inventario.exception.InventarioException;
import com.perfuland.msvc.inventario.model.Inventario;
import com.perfuland.msvc.inventario.repository.InventarioRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class InventarioServiceImpl implements InventarioService{
    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public List<Inventario>findAll(){
        return this.inventarioRepository.findAll();
    }

    @Override
    public Inventario findById(Long id){
        return this.inventarioRepository.findById(id).orElseThrow(
                () -> new InventarioException("El inventario con id"+id+"no se encuentra")
        );
    }

}
