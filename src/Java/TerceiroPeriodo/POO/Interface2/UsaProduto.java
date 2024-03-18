package Java.TerceiroPeriodo.POO.Interface2;

public class UsaProduto {
    public static void main(String[] args) {
        ProdutoPersiste produto = new ProdutoPersiste();
        produto.setCodigo(2);
        produto.setDescricao("sabonete");
        System.out.println(produto.gravar());
        Produto p = ProdutoPersiste.ler(2);
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
    }
}
