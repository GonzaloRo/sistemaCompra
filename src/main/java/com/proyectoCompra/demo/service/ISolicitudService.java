package com.proyectoCompra.demo.service;

import com.proyectoCompra.demo.models.solicitud;

import java.util.List;

public interface ISolicitudService {
    public solicitud create(solicitud solicitud);

    public solicitud update(solicitud solicitud);

    public solicitud findById(Long id);

    public List<solicitud> findAll();

    public void delete(Long id);
}
