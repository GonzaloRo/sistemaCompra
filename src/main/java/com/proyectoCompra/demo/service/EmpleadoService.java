package com.proyectoCompra.demo.service;

import java.util.List;
import java.util.Optional;

import com.proyectoCompra.demo.models.empleado;
import com.proyectoCompra.demo.repository.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public empleado create(empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public empleado update(empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public empleado findById(Long id) {
        Optional<empleado> option = empleadoRepository.findById(id);
        return option.orElse(null);
    }

    public List<empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }
}

