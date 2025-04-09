package desafiso07;

import java.util.ArrayList;
public class TestandoForeach {
    public static void main(String[] args) {
    Pessoa primeiraPessoa = new Pessoa("João");
    Pessoa segundaPessoa = new Pessoa("Guilherme");
    Pessoa terceiraPessoa = new Pessoa("José");

    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    listaDePessoas.add(primeiraPessoa);
    listaDePessoas.add(segundaPessoa);
    listaDePessoas.add(terceiraPessoa);
    for(Pessoa lista: listaDePessoas){
        System.out.println(lista);
    }
    }
}
