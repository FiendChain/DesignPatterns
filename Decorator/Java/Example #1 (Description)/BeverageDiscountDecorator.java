public class BeverageDiscountDecorator extends BeverageDecorator {
    private double discount;
    
    public BeverageDiscountDecorator(IBeverage beverage, double discount) {
        super(beverage);
        this.setDiscount(discount);
    }

    private double getDiscount() {
        return this.discount;
    }

    private void setDiscount(final double discount) {
        if (discount < 0 || discount > 1)
            throw new IllegalArgumentException("Discount outside of range");
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return super.getCost() * this.getDiscount();
    }
}