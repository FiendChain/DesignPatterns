public class BeverageDescriptionDecorator extends BeverageDecorator {
    private String description;

    public BeverageDescriptionDecorator(final IBeverage beverage, String description) {
        super(beverage);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}