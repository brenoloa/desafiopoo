public class Produto {
    private String nome_produto;
    private double valor_produto;
    private Funcionario funcionaro_resp;
    private String ferramenta;
    private boolean disponivel;
    public Produto(String nome_produto, double valor_produto, Funcionario funcionaro_resp, String ferramenta) {
        this.nome_produto = nome_produto;
        this.valor_produto = valor_produto;
        this.funcionaro_resp = funcionaro_resp;
        this.ferramenta = ferramenta;
        this.disponivel = true;
    }
    
    public void status(){
        if (disponivel == true){
            System.out.println("PRODUTO DISPONIVEL");
            System.out.println(this.getNome_produto());
            System.out.println(this.getValor_produto());
            System.out.println("Ferramenta: " + this.getFerramenta());
            System.out.println("Funcionario responsavel :" + this.getFuncionaro_resp().getNome());
        }
        else {
            System.out.println("PRODUTO VENDIDO.");
        }
    }
    
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public double getValor_produto() {
        return valor_produto;
    }
    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }
    public Funcionario getFuncionaro_resp() {
        return funcionaro_resp;
    }
    public void setFuncionaro_resp(Funcionario funcionaro_resp) {
        this.funcionaro_resp = funcionaro_resp;
    }
    public String getFerramenta() {
        return ferramenta;
    }
    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }
    public boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    

}
