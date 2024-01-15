package com.example.marketplace;

public class Categorie {
    private Long id;
    private String designation;
    public Categorie() {
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
