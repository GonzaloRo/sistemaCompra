package com.proyectoCompra.demo.repository;

import com.proyectoCompra.demo.models.articuloEmpresa;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IArticuloEmpresaRepository extends JpaRepository<articuloEmpresa, Long> {
 
}
