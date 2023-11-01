public class Milk extends AddOn{
    public Milk(Coffee cof) {
        super("Milk", cof);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 100;
    }
}
