package main.java.ar.edu.fi.algo3.strategies;

import main.java.ar.edu.fi.algo3.CampoBatalla;
import main.java.ar.edu.fi.algo3.Unidad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class DisparoSuperStrategy extends DisparoStrategy {

	private Unidad unidad;

	@Override
	public List<String> disparar() {
		List<String> result = new ArrayList<>();

		Collection unidades = CampoBatalla.getInstance().getUnidadesCercanas();
		Iterator it = unidades.iterator();
		while (it.hasNext()) {
			Unidad other = (Unidad) it.next();
			if (other != unidad) {
				result.add("super dispara a: " + other.toString());
			}
		}

		return result;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad=unidad;		
	}

}
