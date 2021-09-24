public class Pedido extends Setor{
    private static Pedido pedido = new Pedido();

    private Pedido(){};

    public static Pedido getInstancia(){
        return pedido;
    }
}
