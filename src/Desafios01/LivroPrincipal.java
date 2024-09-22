package Desafios01;

public class LivroPrincipal {
    public static void main(String[] args) {
        Livro dadosDoLivro1 = new Livro();
        Livro dadosDoLivro2 = new Livro();
        dadosDoLivro1.setTitulo("O amor");
        dadosDoLivro1.setAutor("Kauan");

        dadosDoLivro2.setTitulo("O ódio");
        dadosDoLivro2.setAutor("Gabriellinha");
        dadosDoLivro1.exibirDetalhes();
        System.out.println();
        dadosDoLivro2.exibirDetalhes();

    }
}
