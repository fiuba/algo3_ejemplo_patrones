package ar.edu.fi.algo3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/****
 *
 * War of word craft
 *
 *  - Singleton: Campo batalla
 *
 */
public class JuegoTest {

    @Test
    public void test() {
        CampoBatalla.getInstance().AddUnidad(new Unidad(
                "U1"));
        CampoBatalla.getInstance().AddUnidad(new Unidad(
                "U2"));

        Unidad unaUnidad = new Unidad("U3");
        CampoBatalla.getInstance().AddUnidad(unaUnidad);

        List<String> expected = Arrays.asList(
                "dispara a: Unidad U1", "dispara a: Unidad U2");
        assertEquals(unaUnidad.disparar(), expected);

    }
}
