package desafiso07;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Cachorro", "Bone");
        Animal meuAnimal = (Animal) meuCachorro;
        if (meuAnimal instanceof Cachorro){
            System.out.println(meuAnimal);
        }else {
            System.out.println("O object não é um cachorro");
        }
    }
}
