import java.util.ArrayList;
import java.util.List;

public abstract class Setor {
    private List<Cliente> pedido = new ArrayList<Cliente>();

    public void addPedido(Cliente cliente){
        this.pedido.add(cliente);
    }
    public boolean verificaPedido(Cliente cliente){
        return this.pedido.contains(cliente);
    }
}
