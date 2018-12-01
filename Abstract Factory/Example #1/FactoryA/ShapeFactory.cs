public class ShapeFactory: AbstractFactory
{
    public override IShape getShape(string shape)
    {
        if (shape.Equals("circle"))
        {
            return new Circle();
        }
        else if (shape.Equals("rectangle"))
        {
            return new Rectangle();
        }
        else if (shape.Equals("square"))
        {
            return new Square();
        }

        return null;
    }

    public override IColor getColor(string color)
    {
        return null;
    }
}
