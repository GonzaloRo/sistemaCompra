package com.proyectoCompra.demo.service;

import com.proyectoCompra.demo.models.solicitud;
import com.proyectoCompra.demo.repository.ISolicitudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService implements ISolicitudService {
    @Autowired
    private ISolicitudRepository solicitudRepository;

    @Override
    public solicitud create(solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    @Override
    public solicitud update(solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    @Override
    public solicitud findById(Long id) {
        Optional<solicitud> optSolicitudes = solicitudRepository.findById(id);
        return optSolicitudes.orElse(null);
    }

    @Override
    public List<solicitud> findAll() {
        return solicitudRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        solicitudRepository.deleteById(id);
    }
}
