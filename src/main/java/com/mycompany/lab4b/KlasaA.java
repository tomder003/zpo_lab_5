package com.mycompany.lab4b;

import java.io.Serializable;
import javax.inject.Named;


public class KlasaA implements Serializable{
    
    private String poleA;
    
    public KlasaA(){
        
    }
    
    public void setPoleA(String poleA) {
        this.poleA = poleA;
    }
    
    @Named("nowaMetoda")
    public String getPoleA() {
        return poleA;
    }
    
    
}