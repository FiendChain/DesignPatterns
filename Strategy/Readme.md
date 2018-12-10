# Strategy Pattern
## Inserting different algorithms at runtime in OOP
Allows for selecting different algorithms at runtime.
In purely OOP languages such as Java or C#, there are no pure functions, only
static functions or methods. 
The strategy pattern involves inheriting from an interface, and using it within
the program. The algorithm will be determined at run-time.

## Defining specific behaviour across multiple classes
Consider an example with a duck, where there is a quack and fly method.
For any subclass and subclasses of those, they would need to implement or reimplement
the quack or fly method, some of which could be identical to each other.
However, inheritance (single) only allows behaviour to be shared in a 
hierarchical manner. 

Duck.fly -> FlyingDuck.fly -> Swan.fly

By implementing an interface with these methods, the subclasses can reuse
an existing implementation of this interface.
```java
    public class Duck {
        private IDuckBehaviour behaviour;

        public void setBehaviour(final IDuckBehaviour behaviour) {
            this.behaviour = behaviour;
        }
    }

    public class Swan extends Duck {
        public Swan() {
            super();
            // This allows reuse of existing behaviour models
            // across non-hierarchical structures
            super.setBehaviour(FlyingDuckBehaviour);
        }
    }

    public interface IDuckBehaviour {
        public static void fly();
    }

    public class FlyingDuckBehaviour implements IDuckBehaviour {
        @override
        public static void fly() {
            System.out.println('Flap flap');
        } 
    }

    public class NonFlyingDuckBehaviour implements IDuckBehaviour {
        @override
        public static void fly() {
            System.out.println('Falls to ground hopelessly');
        }
    }
```