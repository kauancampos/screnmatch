package desafios05;

import java.util.ArrayList;
public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Kauan", 21);
        Pessoa pessoa2 = new Pessoa("Pedro", 10);
        Pessoa pessoa3 = new Pessoa("Bruna", 36);

        ArrayList<Pessoa> familia = new ArrayList<Pessoa>();
        familia.add(pessoa1);
        familia.add(pessoa2);
        familia.add(pessoa3);
        System.out.println("Tamanho da lista: " + familia.size());
        System.out.println("Primeira pessoa da lista: " + familia.get(0));
        System.out.println(familia);
    }
}
