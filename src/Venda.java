public class Venda {
    private Produto produto;
    private Cliente cliente;
    public Venda(Produto produto, Cliente cliente) {
        this.produto = produto;
        this.cliente = cliente;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void VenderProduto(){
        if (this.produto.getDisponivel() == true){
            System.out.println("Produto: " + this.produto.getNome_produto());
            System.out.println("R$ " + this.produto.getValor_produto());
            System.out.println("Vendido para " + this.cliente.getNome());
            this.produto.setDisponivel(false);
        }
    }

}
