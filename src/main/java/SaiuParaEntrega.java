public class SaiuParaEntrega extends Setor{
    private static SaiuParaEntrega entrega = new SaiuParaEntrega();

    private SaiuParaEntrega(){};

    public static SaiuParaEntrega getInstancia() {
        return entrega;
    }
}
