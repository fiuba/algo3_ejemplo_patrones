package ar.edu.fi.algo3;

import ar.edu.fi.algo3.strategies.DisparoStrategy;

import java.util.List;

/**
 * @author Marcio Degiovannini
 */
public class UnidadProxy implements Unidad {

    private final UnidadImpl representado;

    public UnidadProxy(String nombre, DisparoStrategy estrategiaDisparo) {
        this.representado = new UnidadImpl(nombre, estrategiaDisparo);
        MaquinaRemota.getInstance().CrearUnidad(this);

    }

    public List<String> disparar() {
        String remoteResult = MaquinaRemota.getInstance().DispararUnidad(this);

        List<String> result = this.representado.disparar();

        result.add(remoteResult);

        return result;

    }

    public String toString() {

        return this.representado.mostrarmeComoString("Unidad remota ");
    }

}
