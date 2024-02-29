package com.prueba1.prueba1.controller;

import com.prueba1.prueba1.service.LibrosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j//es una parte de loombok, es oara que la vista entienda lo que se va a procesar, es un protocolo 
@RequestMapping("/libros")//Este es otro API
public class LibrosController {

    @Autowired
    private LibrosService LibrosService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var Libros = LibrosService.getLibros(false);
        model.addAttribute("Libros", Libros);
        model.addAttribute("totalCategorias", Libros.size());
        return "/Libros/listado";
    }
}
