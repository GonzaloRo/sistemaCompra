package com.proyectoCompra.demo.repository;

import com.proyectoCompra.demo.models.empleado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<empleado, Long> {
}