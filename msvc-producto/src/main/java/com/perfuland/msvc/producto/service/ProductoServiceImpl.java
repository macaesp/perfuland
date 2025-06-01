package com.perfuland.msvc.producto.service;

import com.perfuland.msvc.producto.exceptions.ProductoException;
import com.perfuland.msvc.producto.model.Producto;
import com.perfuland.msvc.producto.repository.ProductoRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ProductoServiceImpl implements ProductoService {
        @Autowired
        private ProductoRepository productoRepository;

        @Override
        public List<Producto> listarProducto() {
            return productoRepository.findAll();
        }

        @Override
        public Producto findById(Long id) {
            return productoRepository.findById(id).orElseThrow(
                    () -> new ProductoException("La boleta con id " + id + " no se encuentra en la base de datos"));
        }

        @Override
        public void eliminarProducto(Long id) {
            productoRepository.deleteById(id);
        }
}






