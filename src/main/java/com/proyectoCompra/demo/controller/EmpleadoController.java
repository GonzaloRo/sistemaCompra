package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.models.empleado;
import com.proyectoCompra.demo.service.EmpleadoService;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping("/empleado")
    public String empleado(Model model) {
        List<empleado> empleados = empleadoService.findAll();        
        model.addAttribute("lista_empleados", empleados);
        return "empleado/empleados";
    }


    @RequestMapping("/editarEmpleado/{id}")
    public String editarEmpleado(Model model, @PathVariable(name="id") Long id) {
        empleado empleados = empleadoService.findById(id);
        model.addAttribute("empleado", empleados);
        return "empleado/editar";
    }

    @RequestMapping("/eliminarEmpleado/{id}")
    public String eliminarEmpleado(Model model, @PathVariable(name="id") Long id) {
        empleadoService.delete(id);
        return "redirect:/empleado";
    }

    @RequestMapping("/nuevoEmpleado")
    public String nuevoArticulo(Model model) {
        empleado empleados = new empleado();
        model.addAttribute("empleado", empleados);
        return "empleado/nuevo";
    }

    @RequestMapping(value="/guardarEmpleado", method = RequestMethod.POST)
    public String guardarEmpleado(@ModelAttribute("empleado") empleado empleados) {
        empleadoService.update(empleados);
        return "redirect:/empleado";
    }
}
