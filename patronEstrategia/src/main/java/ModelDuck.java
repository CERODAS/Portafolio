public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        soundBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("soy un pato modelo");
    }

    @Override
    public String toString() {
        return "ModelDuck{" +
                "flyBehavior=" + flyBehavior +
                ", soundBehavior=" + soundBehavior +
                '}';
    }
}
