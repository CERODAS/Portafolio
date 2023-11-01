public class RubberDuck extends Duck{
    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.soundBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un patito de hule");
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "flyBehavior=" + flyBehavior +
                ", soundBehavior=" + soundBehavior +
                '}';
    }

}
