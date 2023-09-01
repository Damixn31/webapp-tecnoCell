package org.olmedo.tecnocell.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.olmedo.tecnocell.jsf3.entities.Producto;
import org.olmedo.tecnocell.jsf3.services.ProductoService;

import java.util.List;

@Model
public class ProductoController {

    @Inject
    private ProductoService service;
    @Produces
    @Model
    public String titulo() {
        return "Tecno Cell";
    }

    @Produces
    @RequestScoped
    @Named("listado")
    public List<Producto> findAll() {
        return service.listar();
    }
}
