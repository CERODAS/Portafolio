public class FlyLikeRocket implements IFly{
    public FlyLikeRocket() {
    }

    @Override
    public void fly() {
        System.out.println("Volar como coete");
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }
}
