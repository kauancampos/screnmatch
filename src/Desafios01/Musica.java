package Desafios01;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do artista/banda: " + artista);
        System.out.println("Nome da música: " + titulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        avaliacao = avaliacao + nota;
        numAvaliacoes++;
    }
    double mediaDasAvalicacoes(){
        return avaliacao/numAvaliacoes;
    }
}
