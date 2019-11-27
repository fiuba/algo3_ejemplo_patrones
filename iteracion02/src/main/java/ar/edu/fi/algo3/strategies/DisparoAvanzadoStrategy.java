package ar.edu.fi.algo3.strategies;

import main.java.ar.edu.fi.algo3.CampoBatalla;
import main.java.ar.edu.fi.algo3.Unidad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class DisparoAvanzadoStrategy extends main.java.ar.edu.fi.algo3.strategies.DisparoStrategy {

    private Unidad unidad;

    public List<String> disparar() {
        List<String> result = new ArrayList<>();

        Collection unidades = CampoBatalla.getInstance().getUnidadesCercanas();
        Iterator it = unidades.iterator();
        while (it.hasNext()) {
            Unidad other = (Unidad) it.next();
            if (other != unidad) {
                result.add("avanzado dispara a: " + other.toString());
            }
        }

        return result;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

}
