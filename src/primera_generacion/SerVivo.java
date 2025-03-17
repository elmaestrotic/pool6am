package primera_generacion;

public interface SerVivo {
    default void vivir(){
        System.out.println("¡Hola munco!");
    }
}
