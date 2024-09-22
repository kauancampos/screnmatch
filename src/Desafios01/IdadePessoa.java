package Desafios01;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void verificaIdade (){
        if (idade >= 18){
            System.out.println("Kauan, vocé é de maior!");
        } else {
            System.out.println("Kauan, você ainda não é de maior");
        }
    }
}
