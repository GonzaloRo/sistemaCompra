package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.models.articuloProveedor;
import com.proyectoCompra.demo.service.ArticuloEmpresaService;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticuloProveedorController {
    @Autowired
    private ArticuloEmpresaService articuloEmpresaService;

    @RequestMapping("/inventario")
    public String inventario(Model model) {
        List<articuloProveedor> solicitudes = articuloEmpresaService.findAll();
        model.addAttribute("lista_articulos", solicitudes);
        return "inventario/articulos";
    }
}
