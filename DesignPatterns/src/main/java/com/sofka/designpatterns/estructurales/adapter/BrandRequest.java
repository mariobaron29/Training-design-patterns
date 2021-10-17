package com.sofka.designpatterns.estructurales.adapter;

public class BrandRequest {
    String type;

    public BrandRequest(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
