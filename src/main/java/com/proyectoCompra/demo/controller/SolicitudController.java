package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.models.solicitud;
import com.proyectoCompra.demo.service.SolicitudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
//@RequestMapping("/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;

    @RequestMapping("/solicitudes")
    public String solicitudes(Model model) {
        List<solicitud> solicitudes = solicitudService.findAll();
        model.addAttribute("lista_solicitudes", solicitudes);
        return "solicitud/solicitudes";
    }

    @RequestMapping("/editar/{id}")
    public String editar(Model model, @PathVariable(name="id") Long id) {
        solicitud solicitud = solicitudService.findById(id);
        model.addAttribute("solicitud", solicitud);
        return "solicitud/editar";
    }

    @RequestMapping("/eliminar/{id}")
    public String borrar(Model model, @PathVariable(name="id") Long id) {
        solicitudService.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/nueva")
    public String borrar(Model model) {
        return "solicitud/nueva";
    }

    @RequestMapping(value="/guardar", method = RequestMethod.POST)
    public String guardar(@ModelAttribute("product") solicitud solicitud) {
        solicitudService.update(solicitud);
        return "redirect:/";
    }

}
