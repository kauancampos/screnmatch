package Desafios03;

public class TestesAnimais {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();
        meuCachorro.abanarRabo();

        System.out.println();

        Gato meuGato = new Gato();
        meuGato.emitirSom();
        meuGato.aranhaMoveis();
    }
}
