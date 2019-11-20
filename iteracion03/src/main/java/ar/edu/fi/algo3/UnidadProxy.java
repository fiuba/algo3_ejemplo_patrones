package main.java.ar.edu.fi.algo3;

import main.java.ar.edu.fi.algo3.strategies.DisparoStrategy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class UnidadProxy implements Unidad {

    private final UnidadImpl representado;
    private String nombre;
    private DisparoStrategy estrategiaDisparo;

    public UnidadProxy(String nombre, DisparoStrategy estrategiaDisparo) {
        this.representado = new UnidadImpl(nombre, estrategiaDisparo);
        MaquinaRemota.getInstance().CrearUnidad(this);

    }

    public List<String> disparar() {
        String remoteResult = MaquinaRemota.getInstance().DispararUnidad(this);

        List<String> result = this.representado.disparar();

        result.add(remoteResult);

        return result;

    }

    public String toString() {
        return "Unidad remota " + nombre;
    }

}
