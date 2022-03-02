package com.example.f1markbook;

import java.io.Serializable;

public class F1mark implements Serializable {

    String name;
    String country;
    int image;

    //Constructor

    public F1mark(String name, String country, int image){
        this.name = name;
        this.country = country;
        this.image = image;



    }


}
