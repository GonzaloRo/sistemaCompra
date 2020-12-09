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
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;

    @RequestMapping("/solicitudes")
    public String solicitudes(Model model) {
        List<solicitud> solicitudes = solicitudService.findAll();
        model.addAttribute("lista_solicitudes", solicitudes);
        return "solicitud/solicitudes";
    }

    @RequestMapping("/editarSolicitud/{id}")
    public String editarSolicitud(Model model, @PathVariable(name="id") Long id) {
        solicitud solicitud = solicitudService.findById(id);
        model.addAttribute("solicitud", solicitud);
        return "solicitud/editar";
    }

    @RequestMapping("/eliminarSolicitud/{id}")
    public String eliminarSolicitud(Model model, @PathVariable(name="id") Long id) {
        solicitudService.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/nuevaSolicitud")
    public String nuevaSolicitud(Model model) {
        solicitud sol = new solicitud();
        model.addAttribute("solicitud", sol);
        return "solicitud/nueva";
    }

    @RequestMapping(value="/guardarSolicitud", method = RequestMethod.POST)
    public String guardarSolicitud(@ModelAttribute("product") solicitud solicitud) {
        solicitudService.update(solicitud);
        return "redirect:/";
    }

}
