package com.perfuland.msvc.sucursal.service;

import com.perfuland.msvc.sucursal.model.entities.Sucursal;
import java.util.List;

public interface SucursalService {
    List<Sucursal> findAll ();
    Sucursal findById (Long id);
    Sucursal save (Sucursal sucursal);
}
