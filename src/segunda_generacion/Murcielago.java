public interface Murcielago {
    void volar();

    default void comerFrutas() {
        System.out.println("Vampiro vegano...");
    }


}
