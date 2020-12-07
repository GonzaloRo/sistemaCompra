package com.proyectoCompra.demo.controller;

import com.proyectoCompra.demo.repository.CompraRepository;
import com.proyectoCompra.demo.repository.DetalleCompraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CompraController {
    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private DetalleCompraRepository detalleCompraRepository;

    @GetMapping("/compra-index")
    public String getHome(Pageable pageable, Model model) {
        model.addAttribute("compras", compraRepository.findAll(pageable));
        return "compras/index";
    }

    @GetMapping("/compra-show/{id}")
    public ModelAndView getShow(@RequestParam(defaultValue = "0", required = false) int id, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("compras/show");
        modelAndView.addObject("detalles", detalleCompraRepository.ObtenerDetalleById(id));
        modelAndView.addObject("compra", compraRepository.findById(id));
        return modelAndView;
    }

}
