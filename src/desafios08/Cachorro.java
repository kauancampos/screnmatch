package desafios08;

public class Cachorro extends Animal {
    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.setRaca("Bone");

        Cachorro meuCacorro = new Cachorro();
        Animal meuAnimal = (Animal) meuCachorro;

        System.out.println(meuAnimal);

    }
}
