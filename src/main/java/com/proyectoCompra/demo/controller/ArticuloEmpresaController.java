package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.models.articuloEmpresa;
import com.proyectoCompra.demo.service.ArticuloEmpresaService;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ArticuloEmpresaController {
	 @Autowired
	 private ArticuloEmpresaService articuloEmpresaService;

	 @RequestMapping("/inventarioe")
	 public String inventario(Model model) {
	    List<articuloEmpresa> articulos = articuloEmpresaService.findAll();
	    model.addAttribute("lista_articulos", articulos);
	    System.out.println(articulos);
	    return "inventarioEmpresa/articulos";
	  }  

	
	    @RequestMapping("/nuevoArticuloe")
	    public String nuevoArticulo(Model model) {
	        articuloEmpresa articulo = new articuloEmpresa();
	        model.addAttribute("articulo", articulo);
	        return "inventarioEmpresa/nueva";
	    }

	    @RequestMapping(value="/guardarArticuloe", method = RequestMethod.POST)
	    public String guardarArticulo(@ModelAttribute("product") articuloEmpresa articulo) {
	    	articuloEmpresaService.update(articulo);
	        return "redirect:/inventarioe";
	    }
}
