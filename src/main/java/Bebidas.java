public class Bebidas {
    private static Bebidas bebidas = new Bebidas();

    private Bebidas(){};

    public static Bebidas getInstancia(){
        return bebidas;
    }
}
