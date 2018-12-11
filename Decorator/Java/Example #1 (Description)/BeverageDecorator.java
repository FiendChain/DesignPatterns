abstract public class BeverageDecorator implements IBeverage {
    private final IBeverage wrapped;

    public BeverageDecorator(final IBeverage beverage) {
        this.wrapped = beverage;
    }

    @Override
    public String getDescription() {
        return this.wrapped.getDescription();
    }

    @Override
    public double getCost() {
        return this.wrapped.getCost();
    }

    @Override
    public void setCost(double cost) {
        this.wrapped.setCost(cost);
    }
}