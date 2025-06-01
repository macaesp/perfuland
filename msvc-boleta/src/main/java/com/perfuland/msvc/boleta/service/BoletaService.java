package com.perfuland.msvc.boleta.service;

import com.perfuland.msvc.boleta.model.Boleta;

import java.util.List;

public interface BoletaService {
    List<Boleta> findAll ();
    Boleta findById (Long id);
    Boleta save (Boleta boleta);
}
