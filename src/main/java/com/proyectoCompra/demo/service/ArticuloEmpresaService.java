package com.proyectoCompra.demo.service;

import com.proyectoCompra.demo.models.articuloEmpresa;
import com.proyectoCompra.demo.repository.IArticuloEmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloEmpresaService {
    @Autowired
    private IArticuloEmpresaRepository articuloEmpresaRepository;

    public articuloEmpresa create(articuloEmpresa articulo) {
        return articuloEmpresaRepository.save(articulo);
    }

    public articuloEmpresa update(articuloEmpresa articulo) {
    	 return articuloEmpresaRepository.save(articulo);
    }

    public articuloEmpresa findById(Long id) {
        Optional<articuloEmpresa> option = articuloEmpresaRepository.findById(id);
        return option.orElse(null);
    }

    public List<articuloEmpresa> findAll() {
        return articuloEmpresaRepository.findAll();
    }

    public void delete(Long id) {
    	articuloEmpresaRepository.deleteById(id);
    }
}
   
