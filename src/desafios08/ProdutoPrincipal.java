package desafios08;

import java.util.ArrayList;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Sabão", 8.00);
        Produto produto2 = new Produto("Melancia", 60);
        Produto produto3 = new Produto("Leite", 5.00);

        ArrayList<Produto> meusProdutos = new ArrayList<>();
        meusProdutos.add(produto1);
        meusProdutos.add(produto2);
        meusProdutos.add(produto3);

        double somaPreco = 0;
        for(Produto produto : meusProdutos){
            somaPreco += produto.getPreco();
        }

        double precoMedio = 0;
        precoMedio = somaPreco / meusProdutos.size();

        System.out.println(" O preço médio dos produtos é de " + precoMedio);
    }
}
