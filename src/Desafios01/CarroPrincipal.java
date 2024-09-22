package Desafios01;

public class CarroPrincipal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Celta";
        meuCarro.anoDeLancamento = 2020;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();
        System.out.println("Digite o ano atual: ");
        System.out.println("O carro tem " + meuCarro.anosDoCarro() + " anos.");

    }
}
