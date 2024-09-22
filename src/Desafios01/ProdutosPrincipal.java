package Desafios01;

public class ProdutosPrincipal {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.setNome("Celular");
        produto.setpreco(1900.0);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("O novo preço após o desconto é de " + produto.getPreco());
    }
}
