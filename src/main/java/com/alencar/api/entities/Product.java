package com.alencar.api.entities;

public class Product {
    
    private Long id;
    private Double price;
    private String name;
    private Departament departament;

    public Product() {

    }

    public Product(Long id, Double price, String name, Departament departament) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.departament = departament;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

}
