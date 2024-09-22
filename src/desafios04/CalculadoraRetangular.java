package desafios04;

public class CalculadoraRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Área da sala retangular: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = altura * largura;
        System.out.println("O perímetro da sala retangular:" + perimetro);
    }
}
