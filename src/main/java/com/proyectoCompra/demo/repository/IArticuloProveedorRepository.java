package com.proyectoCompra.demo.repository;

import com.proyectoCompra.demo.models.articuloProveedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticuloProveedorRepository extends JpaRepository<articuloProveedor, Long> {
}
