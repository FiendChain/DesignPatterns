public class Rectangle: IShape
{
    public void draw()
    {
        System.Console.WriteLine("Inside Rectange::draw()");
    }
}

public class Square: IShape
{
    public void draw()
    {
        System.Console.WriteLine("Inside Square::draw()");
    }
}

public class Circle: IShape
{
    public void draw()
    {
        System.Console.WriteLine("Inside Circle::draw()");
    }
}

