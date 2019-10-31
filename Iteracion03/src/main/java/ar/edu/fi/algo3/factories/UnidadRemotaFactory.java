package main.java.ar.edu.fi.algo3.factories;

import main.java.ar.edu.fi.algo3.Unidad;
import main.java.ar.edu.fi.algo3.UnidadProxy;
import main.java.ar.edu.fi.algo3.strategies.DisparoStrategy;

/**
 * @author Marcio Degiovannini
 */
public class UnidadRemotaFactory extends AbstractUnidadFactory {

    public Unidad crearUnidad(String nombre, DisparoStrategy estrategiaDisparo) {
        return new UnidadProxy(nombre, estrategiaDisparo);
    }

}
