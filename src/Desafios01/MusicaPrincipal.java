package Desafios01;

public class MusicaPrincipal {
    public static void main(String[] args) {

        Musica musicasFav = new Musica();
        musicasFav.artista = "Queen";
        musicasFav.titulo = "Made in Heaven";
        musicasFav.anoDeLancamento = 1994;

        musicasFav.exibeFichaTecnica();
        musicasFav.avalia(8.5);
        musicasFav.avalia(10);
        musicasFav.avalia(10);
        System.out.println("A soma das avaliações: " + musicasFav.avaliacao);
        System.out.println("O total de avaliações foi de " + musicasFav.numAvaliacoes + " pessoas.");
        System.out.println("A média da avaliação dessa música é de " + musicasFav.mediaDasAvalicacoes());
    }
}
