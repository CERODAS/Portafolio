public class Quack implements ISound {

    public Quack() {
    }
    @Override
    public void makeSound(){
        System.out.println("Estoy haciendo quack");
    }

    @Override
    public String toString() {
        return "Quack{}";
    }
}
