public class ConcreteFactoryA: AbstractFactory
{
    private static readonly ConcreteFactoryA instance = new ConcreteFactoryA();
    private ConcreteFactoryA()
    {

    }

    public static AbstractFactory Instance
    {
        get { return instance; }
    }
    public override IWindow createWindow()
    {
        return new WindowA();
    }

    public override IScrollbar createScrollbar()
    {
        return new ScrollbarA();
    }
}