package main.java.ar.edu.fi.algo3.strategies;

import main.java.ar.edu.fi.algo3.Unidad;

import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public abstract class DisparoStrategy {
	public abstract List<String>  disparar();
	public abstract void setUnidad(Unidad unidad);
}
