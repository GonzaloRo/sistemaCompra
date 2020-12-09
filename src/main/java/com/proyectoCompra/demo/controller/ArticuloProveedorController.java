package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.models.articuloProveedor;
import com.proyectoCompra.demo.service.ArticuloProveedorService;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ArticuloProveedorController {
    @Autowired
    private ArticuloProveedorService articuloProveedorService;

    @RequestMapping("/inventario")
    public String inventario(Model model) {
        List<articuloProveedor> articulos = articuloProveedorService.findAll();
        model.addAttribute("lista_articulos", articulos);
        return "inventario/articulos";
    }


    @RequestMapping("/editarArticulo/{id}")
    public String editarArticulo(Model model, @PathVariable(name="id") Long id) {
        articuloProveedor articulo = articuloProveedorService.findById(id);
        model.addAttribute("articulo", articulo);
        return "inventario/editar";
    }

    @RequestMapping("/eliminarArticulo/{id}")
    public String eliminarArticulo(Model model, @PathVariable(name="id") Long id) {
        articuloProveedorService.delete(id);
        return "redirect:/inventario";
    }

    @RequestMapping("/nuevoArticulo")
    public String nuevoArticulo(Model model) {
        articuloProveedor articulo = new articuloProveedor();
        model.addAttribute("articulo", articulo);
        return "inventario/nueva";
    }

    @RequestMapping(value="/guardarArticulo", method = RequestMethod.POST)
    public String guardarArticulo(@ModelAttribute("product") articuloProveedor articulo) {
        articuloProveedorService.update(articulo);
        return "redirect:/inventario";
    }
}
