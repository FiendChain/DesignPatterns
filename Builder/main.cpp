#include <iostream>
#include "Vehicle/VehicleBuilder.hpp"

int main(int argc, char *argv[])
{
    // generic car builder
    Vehicle::Builder carBuilder = Vehicle::Builder().SetTotalWheels(4);
    Vehicle::Builder bikeBuilder = Vehicle::Builder().SetTotalWheels(2);
    
    // a builder object which can generate cars
    Vehicle::Builder teslaBuilder = carBuilder.SetBrand("Tesla"); // changes member attribute, bug or unimportant side-effect?
    Vehicle::Builder toyotaBuilder = carBuilder.SetBrand("Toyota");
    Vehicle::Builder rampageBikeBuilder = bikeBuilder.SetBrand("Rampage");
    
    Vehicle teslaModel3 = teslaBuilder
        .SetModel("Model 3")
        .SetYear(2018)
        .Build();
    
    Vehicle teslaModelS = teslaBuilder
        .SetModel("Model S P100D")
        .SetYear(2016)
        .Build();

    Vehicle teslaModelX = teslaBuilder
        .SetModel("Model X")
        .SetYear(2016)
        .Build();
    
    std::cout << "Tesla cars: " << std::endl
        << teslaModel3 << std::endl 
        << teslaModelS << std::endl
        << teslaModelX << std::endl;

    return 0;
}