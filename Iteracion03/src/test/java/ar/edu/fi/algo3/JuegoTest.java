package test.java.ar.edu.fi.algo3;

import main.java.ar.edu.fi.algo3.CampoBatalla;
import main.java.ar.edu.fi.algo3.Unidad;
import main.java.ar.edu.fi.algo3.factories.AbstractUnidadFactory;
import main.java.ar.edu.fi.algo3.factories.UnidadRemotaFactory;
import main.java.ar.edu.fi.algo3.strategies.DisparoBasicoStrategy;
import main.java.ar.edu.fi.algo3.strategies.DisparoSuperStrategy;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JuegoTest {

    @Test
    public void test() {
        AbstractUnidadFactory factoryUnidades=getFactoryUnidades();

        CampoBatalla.getInstance().AddUnidad(factoryUnidades.crearUnidad("U1",new DisparoBasicoStrategy()));
        CampoBatalla.getInstance().AddUnidad(factoryUnidades.crearUnidad("U2",new DisparoBasicoStrategy()));

        Unidad unaUnidad=factoryUnidades.crearUnidad("U3",new DisparoSuperStrategy());

        CampoBatalla.getInstance().AddUnidad(unaUnidad);

        List<String> expected = Arrays.asList("super dispara a: Unidad remota U1",
                "super dispara a: Unidad remota U2",
                "super dispara a: Unidad remota U3",
                "Enviando comando a maquina remota - Dispara:Unidad remota U3");
        assertEquals(expected, unaUnidad.disparar());
    }

    public static AbstractUnidadFactory getFactoryUnidades(){
        return new UnidadRemotaFactory();
    }

}
