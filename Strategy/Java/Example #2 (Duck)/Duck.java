public class Duck {
    private IDuckBehaviour behaviour;

    public Duck() {

    }

    public void fly() {
        if (this.behaviour != null)
            this.behaviour.fly();
    }

    public void setBehaviour(final IDuckBehaviour behaviour) {
        this.behaviour = behaviour;
    }
}

class Swan extends Duck {
    public Swan() {
        super();
        // This allows reuse of existing behaviour models
        // across non-hierarchical structures
        super.setBehaviour(new FlyingDuckBehaviour());
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        super();
        super.setBehaviour(new NonFlyingDuckBehaviour());
    }
}

interface IDuckBehaviour {
    public void fly();
}

class FlyingDuckBehaviour implements IDuckBehaviour {
    @Override
    public void fly() {
        System.out.println("Flap flap");
    } 
}

class NonFlyingDuckBehaviour implements IDuckBehaviour {
    @Override
    public void fly() {
        System.out.println("Falls to ground hopelessly");
    }
}