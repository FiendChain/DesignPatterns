public class Singleton
{
    private static readonly Singleton instance = new Singleton();

    static Singleton()
    {

    }

    private Singleton()
    {

    }

    public static Singleton Instance
    {
        get { return instance; }
    }

    public void echo(string line)
    {
        System.Console.WriteLine(line);
    }

    public int add(int a, int b)
    {
        return a+b;
    }
}