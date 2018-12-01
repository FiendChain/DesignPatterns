# Builder Pattern
Used when several properties must be provided when instantiating a complex class, that requires
several default attributes. 
It is also more ideal when used for complex immutable instances, since you only need to set the 
properties once in the builder, and can create multiple copies.