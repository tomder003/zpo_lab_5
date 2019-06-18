package com.mycompany.lab4b;

import java.io.Serializable;

public class KlasaC implements Serializable {

    public enum Kolor {
        CZERWONY, ZIELONY, NIEBIESKI;
    }
    
    private boolean czyZielony=false;

    @Override
    public String toString() {
        return "KlasaC{" + Kolor.CZERWONY.toString() + '}';
    }

}
