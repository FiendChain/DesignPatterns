public class DecoratorDemo {
    public static void main(String[] args) {
        IBeverage basicBeverage = new BasicBeverage();
        basicBeverage.setCost(2.50);

        IBeverage beer = new BeverageDescriptionDecorator(
                            new BasicBeverage(), "This is a beer");
        beer.setCost(3.50);
        
        IBeverage normalCoffee = new BeverageDescriptionDecorator(
                                    new BasicBeverage(), "This is a coffee");
        normalCoffee.setCost(5.00);

        IBeverage discountedCoffee = new BeverageDiscountDecorator(normalCoffee, 0.5);

        System.out.println("Basic beverage");
        System.out.println(basicBeverage.getDescription() + ", $" + basicBeverage.getCost());

        System.out.println("Beer");
        System.out.println(beer.getDescription() + ", $" + beer.getCost());
        
        System.out.println("Normal coffee");
        System.out.println(normalCoffee.getDescription() + ", $" + normalCoffee.getCost());

        System.out.println("Discounted Coffee");
        System.out.println(discountedCoffee.getDescription() + ", $" + discountedCoffee.getCost());
    }
}