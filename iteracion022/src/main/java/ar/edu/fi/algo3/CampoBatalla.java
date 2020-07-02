package ar.edu.fi.algo3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Marcio Degiovannini
 */
public class CampoBatalla {

    private static CampoBatalla INSTANCE = null;

    private Collection unidades = new ArrayList();

    private CampoBatalla() {
    }

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CampoBatalla();
        }
    }

    public static CampoBatalla getInstance() {
        if (INSTANCE == null)
            createInstance();
        return INSTANCE;
    }

    public Collection getUnidadesCercanas() {
        return this.unidades;
    }

    public void AddUnidad(Unidad unidad) {
        unidades.add(unidad);
    }
}


