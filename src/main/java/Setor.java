public abstract class Setor {
    private List<Cliente> clienteComCarrinho = new ArrayList<Cliente>();

    public void addClienteComCarrinho(Cliente cliente){
        this.clienteComCarrinho.add(cliente);
    }
    public boolean verificaCarrinhoDeCompra(Cliente cliente){
        return this.clienteComCarrinho.contains(cliente);
    }
}
