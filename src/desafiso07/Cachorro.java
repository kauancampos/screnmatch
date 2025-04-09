package desafiso07;

public class Cachorro extends Animal{
    private String nome;

    public Cachorro(String tipo, String nome){
        super(tipo);
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Tipo de animal: "+ getTipo() + "| Nome do animal: " + nome;
    }
}
