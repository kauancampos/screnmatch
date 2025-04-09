package desafios06;

public class ProdutoPerecivel extends Produto{
    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String validade){
        super(nome, preco, quantidade);
        this.dataDeValidade = validade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }


    @Override
    public String toString() {
        return  "- Nome do produto: " + getNome() + "| Preço do produto: " + getPreco() + "| Quantidade em estoque: " + getQuantidade() + "| Válido até " + getDataDeValidade();
    }
}
