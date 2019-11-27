package ar.edu.fi.algo3;


import ar.edu.fi.algo3.strategies.DisparoStrategy;

import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class UnidadImpl implements Unidad {

    private String nombre;
    private DisparoStrategy disparoStrategy;

    public UnidadImpl(String nombre, DisparoStrategy disparoStrategy) {
        this.nombre = nombre;
        this.disparoStrategy = disparoStrategy;
        this.disparoStrategy.setUnidad(this);
    }

    public List<String> disparar() {

        return this.disparoStrategy.disparar();
    }

    public String mostrarmeComoString(String prefijo) {
        return prefijo + nombre;
    }

    public String toString() {

        return mostrarmeComoString("Unidad ");
    }

}
