public class AbstractFactoryDemo
{
    public static void Main(string[] args)
    {
        AbstractFactory factory = ConcreteFactoryA.Instance;
        IWindow window = factory.createWindow();
        IScrollbar scrollbar = factory.createScrollbar();

        window.resize(20, 10);
        window.maximise();
        window.minimise();
        window.close();
        window.render();

        scrollbar.up();
        scrollbar.down();
        scrollbar.render();
    }
}