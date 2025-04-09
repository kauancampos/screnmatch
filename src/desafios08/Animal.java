package desafios08;

import implementacoes.aprendendo.Cachorro;

public class Animal extends Cachorro {
    private String raca;
    private String nome;
    private int valor;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Animal: " + getRaca();
    }
}
