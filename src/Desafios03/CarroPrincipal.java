package Desafios03;

public class CarroPrincipal {
    public static void main(String[] args) {
    Carro dadosDoCarro = new Carro();
    dadosDoCarro.setModelo("Argo");
    dadosDoCarro.definirPrecos(32200, 48000, 54000);
    dadosDoCarro.exibirInfo();
    }
}
