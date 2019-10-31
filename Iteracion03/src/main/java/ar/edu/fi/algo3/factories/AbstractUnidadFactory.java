package main.java.ar.edu.fi.algo3.factories;

import main.java.ar.edu.fi.algo3.Unidad;
import main.java.ar.edu.fi.algo3.strategies.DisparoStrategy;

/**
 * @author Marcio Degiovannini
 */
public abstract class AbstractUnidadFactory {
    public abstract Unidad crearUnidad(String nombre, DisparoStrategy estrategiaDisparo);
}
