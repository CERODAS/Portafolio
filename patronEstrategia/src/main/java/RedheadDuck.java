public class RedheadDuck extends Duck{
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato cabeza roja");
    }

    @Override
    public String toString() {
        return "RedheadDuck{" +
                "flyBehavior=" + flyBehavior +
                ", soundBehavior=" + soundBehavior +
                '}';
    }
}
