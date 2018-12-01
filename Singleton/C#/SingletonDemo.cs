public class SingletonDemo
{
    public static void Main(string[] args)
    {
        Singleton instance = Singleton.Instance;
        instance.echo("Hello there");
        int a = 20;
        int b = 40;
        int c = instance.add(a, b);
        System.Console.WriteLine("{0}+{1}={2}", a, b, c);

        // Cannot create a unique instance of the singleton
        // Singleton forcedInstance = new Singleton();
        // SingletonDemo.cs(12,36): error CS0122: 'Singleton.Singleton()' is inaccessible due to its protection level
        // Singleton.cs(10,13): (Location of symbol related to previous error)
    }
}