# Abstract Factory Pattern
Used when you want a certain set of objects to have certain known behaviours (interfaces),
however may vary greatly in implementation.
I.e. Create widgets for a GUI application, which may have a Window, Scrollbar, Toolbar, etc... classes.
The concrete factory will create these widgets to compose the application.
By inheriting from an abstract factory, and having the concrete factory produce parts that inherit from abstract
widget classes/interfaces, you can easily switch between factories.
In this GUI application, this would be useful for switching between different themes/modes.