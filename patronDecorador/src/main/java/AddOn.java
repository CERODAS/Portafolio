public abstract class AddOn extends Coffee {
    protected  Coffee coffee;
    public AddOn(String description, Coffee cof) {
        super(description);
        this.coffee = cof;
    }

    public abstract String getDescription();
}
