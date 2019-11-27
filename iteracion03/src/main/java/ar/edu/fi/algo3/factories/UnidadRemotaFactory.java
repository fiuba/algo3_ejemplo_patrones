package ar.edu.fi.algo3.factories;

import ar.edu.fi.algo3.Unidad;
import ar.edu.fi.algo3.UnidadProxy;
import ar.edu.fi.algo3.strategies.DisparoStrategy;

/**
 * @author Marcio Degiovannini
 */
public class UnidadRemotaFactory extends AbstractUnidadFactory {

    public Unidad crearUnidad(String nombre, DisparoStrategy estrategiaDisparo) {
        return new UnidadProxy(nombre, estrategiaDisparo);
    }

}
