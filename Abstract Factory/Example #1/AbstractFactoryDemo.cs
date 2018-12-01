public class AbstractFactoryDemo
{
    public static void Main(string[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        IShape circle = shapeFactory.getShape("circle");
        circle.draw();
        IShape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        IColor red = colorFactory.getColor("red");
        red.fill();
        IColor blue = colorFactory.getColor("blue");
        blue.fill();
    }
}
