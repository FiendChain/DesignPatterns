public interface IWheel
{
    float Radius { get; set; }
    float RimRadius { get; set; }
}

public interface IWindow
{
    float Width { get; set; }
    float Height { get; set; }
    float Opacity { get; set; }
}

public interface IChassis
{
    float Weight { get; set; }
}