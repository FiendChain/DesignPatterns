public class DuckStrategy {
    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.fly();
        RubberDuck rubberduck = new RubberDuck();
        rubberduck.fly();
    }
}