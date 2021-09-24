import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void verificaPedidoPronto(){
        Cliente cliente = new Cliente();
        Pedido.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void verificaPagamentoDoPedidoPronto(){
        Cliente cliente = new Cliente();
        Pedido.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void verificaPreparoDoPedidoPronto(){
        Cliente cliente = new Cliente();
        Pedido.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void pedidoSaiuParaEntrega(){
        Cliente cliente = new Cliente();
        Pedido.getInstancia().addPedido(cliente);
        assertEquals(false, cliente.realizacaoDoPedido());
    }
    @Test
    void verifaPedidoFinalizado(){
        Cliente cliente = new Cliente();
        assertEquals(true, cliente.realizacaoDoPedido());
    }

}