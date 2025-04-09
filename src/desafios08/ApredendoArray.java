package desafios08;

import java.util.ArrayList;

public class ApredendoArray {
    public static void main(String[] args) {

        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C#");
        listaStrings.add("Kotlin");

        for (String elemento : listaStrings) {
            System.out.println(elemento);

        }
    }
}