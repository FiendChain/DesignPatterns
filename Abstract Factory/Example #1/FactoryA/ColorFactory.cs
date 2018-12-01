public class ColorFactory: AbstractFactory
{
    public override IShape getShape(string shape)
    {
        return null;
    }

    public override IColor getColor(string color)
    {
        if (color.Equals("red"))
        {
            return new Red(); 
        }
        else if (color.Equals("green"))
        {
            return new Green(); 
        }
        else if (color.Equals("blue"))
        {
            return new Blue(); 
        }

        return null;
    }

}
