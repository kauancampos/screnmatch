package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Dublê", 2024);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Deadpool 3", 2024);
        outroFilme.avalia(6);
        var filmeDoKauan = new Filme("Kagliacci", 2003);
        filmeDoKauan.avalia(10);
        Serie lost = new Serie("Lost", 2018);

        Filme f1 = filmeDoKauan;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoKauan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());

            }

        }

        ArrayList<String> buscaPorArtista =  new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Kauan");
        buscaPorArtista.add("Gabriella");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
