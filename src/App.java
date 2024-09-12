public class App {
    public static void main(String[] args) throws Exception {
       Cliente c1 = new Cliente("CARLOS", "2343.343.343/23");
       Funcionario f1 = new Funcionario("MIGUEL", 001);
       Produto p1 = new Produto("Mesa de Madeira", 250, f1, "Martelo");

       Venda v1 = new Venda(p1, c1);

       v1.VenderProduto();
       v1.VenderProduto();
       p1.status();
       //System.out.println(p1.getDisponivel());
    }
}
