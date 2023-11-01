public class MallarDuck extends Duck {
    public MallarDuck() {
        super.flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("Hola soy un pato de cabeza roja");
    }

    @Override
    public String toString() {
        return "MallarDuck{}";
    }
}
