package main.java.ar.edu.fi.algo3.factories;

import main.java.ar.edu.fi.algo3.Unidad;
import main.java.ar.edu.fi.algo3.UnidadImpl;
import main.java.ar.edu.fi.algo3.strategies.DisparoStrategy;

/**
 * @author Marcio Degiovannini
 */
public class UnidadLocalFactory extends AbstractUnidadFactory {
	public Unidad crearUnidad(String nombre, DisparoStrategy estrategiaDisparo){
		return new UnidadImpl(nombre,estrategiaDisparo);
	}
}
