public class ScrollbarA: IScrollbar
{
    public void up()
    {
        System.Console.WriteLine("ScrollbarA.up()");
    }

    public void down()
    {
        System.Console.WriteLine("ScrollbarA.down()");
    }

    public void render()
    {
        System.Console.WriteLine("ScrollbarA.render()");
    }
}