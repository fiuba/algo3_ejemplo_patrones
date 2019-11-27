package ar.edu.fi.algo3;

import ar.edu.fi.algo3.strategies.DisparoBasicoStrategy;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/****
 *
 * War of word craft
 *
 *  - Singleton: Campo batalla
 *  - Strategy: Diferentes ataques.
 *
 */

public class JuegoTest {

    @Test
    public void test() {
        CampoBatalla.getInstance().AddUnidad(
                new Unidad("U1", new DisparoBasicoStrategy()));
        CampoBatalla.getInstance().AddUnidad(new Unidad("U2",
                new DisparoBasicoStrategy()));

        Unidad unaUnidad = new Unidad("U3");
        unaUnidad.setEstrategiaDisparo(new DisparoBasicoStrategy());
        CampoBatalla.getInstance().AddUnidad(unaUnidad);


        List<String> expected = Arrays.asList(
                "basico dispara a: Unidad U1",
                "basico dispara a: Unidad U2");
        assertEquals(unaUnidad.disparar(), expected);
    }
}
