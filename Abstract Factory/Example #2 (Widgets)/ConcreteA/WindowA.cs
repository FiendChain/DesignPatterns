public class WindowA: IWindow
{
    private float mX, mY;
    public void resize(float x, float y)
    {
        mX = x;
        mY = y;
        System.Console.WriteLine("WindowA.resize({0}, {1})", x, y);
    }

    public void minimise()
    {
        System.Console.WriteLine("WindowA.minimise()");
    }

    public void maximise()
    {
        System.Console.WriteLine("WindowA.maximise()");
    }

    public void close()
    {
        System.Console.WriteLine("WindowA.close()");
    }

    public void render()
    {
        System.Console.WriteLine("WindowA.render()");
    }
}