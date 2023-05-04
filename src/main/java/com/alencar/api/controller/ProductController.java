package com.alencar.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alencar.api.entities.Departament;
import com.alencar.api.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public List<Product> getObjects() {

        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Pet");

        Product p1 = new Product(1L, 4.000, "MacBook Pro", d1);
        Product p2 = new Product(2L, 5.000, "PC Gamer", d1);
        Product p3 = new Product(3L, 300.0, "Pet House", d2);

        List <Product> list = Arrays.asList(p1, p2, p3);

        return list;
    }
}
