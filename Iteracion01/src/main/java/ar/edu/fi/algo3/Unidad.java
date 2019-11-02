package main.java.ar.edu.fi.algo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class Unidad {

    private String nombre;

    public Unidad(String nombre) {
        this.nombre = nombre;
    }

    public List<String> disparar() {
        List<String> result = new ArrayList<>();

        Collection unidades = CampoBatalla.getInstance()
                .getUnidadesCercanas();
        Iterator it = unidades.iterator();
        while (it.hasNext()) {
            Unidad unidad = (Unidad) it.next();
            if (unidad != this) {
                result.add("dispara a: " + unidad.toString());
            }
        }

        return result;
    }

    public String toString() {


        return "Unidad " + nombre;
    }
}
