package sources;

/**
 * Created by alumno on 24/10/2016.
 */
public class Ave extends Animal implements Volador{
    boolean depredador;
    String tipoAlas;

    public int ponerHuevo(){
        return 0;
    }

    public void empollar(){

    }

    @Override
    public String despegar() {
        return null;
    }

    @Override
    public String volar() {
        return null;
    }

    @Override
    public String aterrizar() {
        return null;
    }
}
