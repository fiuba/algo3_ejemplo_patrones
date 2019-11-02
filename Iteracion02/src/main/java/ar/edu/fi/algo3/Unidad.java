package main.java.ar.edu.fi.algo3;

import main.java.ar.edu.fi.algo3.strategies.DisparoBasicoStrategy;
import main.java.ar.edu.fi.algo3.strategies.DisparoStrategy;

import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class Unidad {

    private String nombre;
    private DisparoStrategy disparoStrategy;

    public Unidad(String nombre) {

        this.nombre = nombre;
        this.disparoStrategy = new DisparoBasicoStrategy();
        this.disparoStrategy.setUnidad(this);
    }

    public Unidad(String nombre, DisparoStrategy disparoStrategy) {
        this.nombre = nombre;
        this.disparoStrategy = disparoStrategy;
        this.disparoStrategy.setUnidad(this);
    }

    public List<String> disparar() {
        return this.disparoStrategy.disparar();
    }

    public String toString() {
        return "Unidad " + nombre;
    }

    public void setEstrategiaDisparo(DisparoStrategy disparoBasicoStrategy) {
        this.disparoStrategy = disparoBasicoStrategy;

        this.disparoStrategy.setUnidad(this);
    }
}
