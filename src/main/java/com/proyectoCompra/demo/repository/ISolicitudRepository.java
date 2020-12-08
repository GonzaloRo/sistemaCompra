package com.proyectoCompra.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyectoCompra.demo.models.solicitud;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitudRepository extends JpaRepository<solicitud, Long> {
}
