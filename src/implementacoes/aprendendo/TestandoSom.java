package implementacoes.aprendendo;

public class TestandoSom {
    public static void main(String[] args) {
        Cachorro bone = new Cachorro();
        Gato costela = new Gato();

        bone.emitiSom();
        bone.emitirSom("Auuu");
        costela.emitiSom();
        costela.emitirSom("Miauuuu");
    }
}
