package com.perfuland.msvc.inventario.service;

import com.perfuland.msvc.inventario.model.Inventario;

import java.util.List;

public interface InventarioService {
    List<Inventario> findAll();
    Inventario findById(Long id);
    Inventario save(Inventario inventario);

}
