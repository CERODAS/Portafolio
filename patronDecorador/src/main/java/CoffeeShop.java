public class CoffeeShop {
    public static void main(String[] args) {
        HouseCoffee houseCoffe = new HouseCoffee();
        System.out.println(houseCoffe.getDescription() + ": " + houseCoffe.cost());

        Milk coffeeWhitMilk = new Milk(houseCoffe);
        System.out.println(coffeeWhitMilk.getDescription() + ": " + coffeeWhitMilk.cost());

        Sugar sugarAddOn = new Sugar(coffeeWhitMilk);
        System.out.println(sugarAddOn.getDescription() + ": " + sugarAddOn.cost());
    }
}
