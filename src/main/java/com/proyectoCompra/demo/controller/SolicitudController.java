package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.repository.SolicitudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SolicitudController {
    @Autowired
    private SolicitudRepository solicitudRepository;

    // Listar las solicitudes(Requisiiones)
    @GetMapping("/requisicion-index")
    public String getHome(Pageable pageable, Model model) {
        model.addAttribute("solicitudes", solicitudRepository.findAll(pageable));
        return "requisiciones/index";
    }

    // ver detalles de solicitud(Requisicion)
    @GetMapping("/requisicion-show/{id}")
    public ModelAndView getShow(@RequestParam(defaultValue = "0", required = false) int id, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("requisiciones/show");
        modelAndView.addObject("detalles", solicitudRepository.ObtenerById(id));
        modelAndView.addObject("solicitud", solicitudRepository.findById(id));
        return modelAndView;
    }

    // Generar orden de compra
    @GetMapping("/orden-generate/{id}")
    public ModelAndView getOrden(@RequestParam(defaultValue = "0", required = false) int id, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("requisiciones/GenerarOrden");
        modelAndView.addObject("detalles", solicitudRepository.ObtenerById(id));
        modelAndView.addObject("solicitud", solicitudRepository.findById(id));
        return modelAndView;
    }

}
