public class Director
{
    public Car construct(AbstractCarBuilder builder)
    {
        Car car = new Car();
        car.Chassis = builder.buildChassis();
        for (int i = 0; i < 4; i++)
            car.addWheel(builder.buildWheel);
        car.addWindow(builder.addWindow);
        return car;
    }
}