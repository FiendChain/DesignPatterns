using System.Collections.Generic;

public class Car
{
    private List<IWheel> wheels = new List<IWheel>();
    private List<IWindows> windows = new List<IWindows>();
    private IChassis chassis;

    public List<IWheel> Wheels
    {
        get { return wheels; }
    }
    public List<IWindow> Windows
    {
        get { return windows; }
    }

    public IChassis Chassis
    {
        get { return chassis; }
        set { return chassis; }
    }

    public void addWheel(IWheel wheel)
    {
        wheels.Add(wheel);
    } 

    public void addWindow(IWindow window)
    {
        windows.Add(window);
    }
}