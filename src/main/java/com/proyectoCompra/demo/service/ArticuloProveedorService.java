package com.proyectoCompra.demo.service;

import com.proyectoCompra.demo.models.articuloProveedor;
import com.proyectoCompra.demo.repository.IArticuloProveedorRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloProveedorService {
    @Autowired
    private IArticuloProveedorRepository articuloProveedorRepository;

    public articuloProveedor create(articuloProveedor articulo) {
        return articuloProveedorRepository.save(articulo);
    }

    public articuloProveedor update(articuloProveedor articulo) {
        return articuloProveedorRepository.save(articulo);
    }

    public articuloProveedor findById(Long id) {
        Optional<articuloProveedor> option = articuloProveedorRepository.findById(id);
        return option.orElse(null);
    }

    public List<articuloProveedor> findAll() {
        return articuloProveedorRepository.findAll();
    }

    public void delete(Long id) {
        articuloProveedorRepository.deleteById(id);
    }
}
