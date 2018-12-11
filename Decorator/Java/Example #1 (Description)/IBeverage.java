public interface IBeverage {
    public String getDescription();
    public double getCost();
    public void setCost(double cost);
}

class BasicBeverage implements IBeverage {
    private double cost = 0;
    
    @Override
    public String getDescription() {
        return "This is a cup of unknown goo";
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
}

