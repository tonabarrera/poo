package sources;

/**
 * Created by alumno on 24/10/2016.
 */
public interface Volador {
    double GRAVEDAD =9.81;

    String despegar();
    String volar();
    String aterrizar();
    default String chocar() {
        return null;
    }

    default void recuperar() {
        int a =5+56;
    }
}
