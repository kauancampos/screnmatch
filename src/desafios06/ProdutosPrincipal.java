package desafios06;

import java.util.ArrayList;
import java.util.SortedMap;

public class ProdutosPrincipal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Amaciante", 4.50, 4);
        Produto produto2 = new Produto("Esponja", 3.00, 10);
        Produto produto3 = new Produto("Sabão", 10.50, 7);
        Produto produto4 = new Produto("Pano", 2.50, 5);
        ProdutoPerecivel produto5 = new ProdutoPerecivel("Queijo de Minas", 5.50, 8, "10/11/2024");

        ArrayList<Produto> meusProdutos = new ArrayList<Produto>();
        meusProdutos.add(produto1);
        meusProdutos.add(produto2);
        meusProdutos.add(produto3);
        meusProdutos.add(produto4);
        System.out.println(meusProdutos.size());
        System.out.println(meusProdutos.get(0));
        System.out.println(meusProdutos);
        System.out.println(produto5);
    }
}
