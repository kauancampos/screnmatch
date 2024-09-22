package Desafios01;

public class Produtos {
    private String nome;
    private double preco;


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}
