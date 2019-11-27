package ar.edu.fi.algo3;

/**
 * @author Marcio Degiovannini
 */
public class MaquinaRemota {
    private static MaquinaRemota INSTANCE = null;

    private MaquinaRemota() {
    }

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MaquinaRemota();
        }
    }

    public static MaquinaRemota getInstance() {
        if (INSTANCE == null)
            createInstance();
        return INSTANCE;
    }

    public String DispararUnidad(UnidadProxy proxy) {
        return "Enviando comando a maquina remota - Dispara:" + proxy.toString();
    }

    public void CrearUnidad(UnidadProxy proxy) {
        System.out.print("Enviando comando a maquina remota: ");
        System.out.println("Crea:" + proxy);
    }


}
