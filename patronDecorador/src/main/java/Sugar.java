public class Sugar extends AddOn{
    public Sugar(Coffee cof) {
        super("Sugar", cof);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 50;
    }
}
