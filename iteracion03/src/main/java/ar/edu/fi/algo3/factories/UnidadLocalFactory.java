package ar.edu.fi.algo3.factories;

import ar.edu.fi.algo3.Unidad;
import ar.edu.fi.algo3.UnidadImpl;
import ar.edu.fi.algo3.strategies.DisparoStrategy;

/**
 * @author Marcio Degiovannini
 */
public class UnidadLocalFactory extends AbstractUnidadFactory {
    public Unidad crearUnidad(String nombre, DisparoStrategy estrategiaDisparo) {
        return new UnidadImpl(nombre, estrategiaDisparo);
    }
}
