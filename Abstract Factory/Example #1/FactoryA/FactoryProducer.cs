public class FactoryProducer
{
    public static AbstractFactory getFactory(string factory)
    {
        if (factory.Equals("shape"))
        {
            return new ShapeFactory();
        }
        else if (factory.Equals("color"))
        {
            return new ColorFactory();
        }

        return null;
    }
}
