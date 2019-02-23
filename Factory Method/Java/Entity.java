abstract public class Entity {
    private float mass;

    public Entity() {
        this.setMass(0);
    }
    
    public float getMass() {
        return this.mass;
    }

    public void setMass(float mass) {
        if (mass < 0)
            throw new IllegalArgumentException("Mass cannot be negative");
        this.mass = mass;
    }
}