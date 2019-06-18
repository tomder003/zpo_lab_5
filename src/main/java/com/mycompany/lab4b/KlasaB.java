package com.mycompany.lab4b;

import java.io.Serializable;
import java.time.LocalDate;


public class KlasaB implements Serializable{
    
    private LocalDate data;
    
    public KlasaB()
    {
        
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
    
}