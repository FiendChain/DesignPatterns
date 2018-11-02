#include "Vehicle.hpp"

Vehicle::Vehicle(
    const std::string& brand, const std::string& model, 
    unsigned year, unsigned totalWheels)
    : m_Brand(brand), m_Model(model),
      m_Year(year), m_TotalWheels(totalWheels)
{

}

std::ostream& operator <<(std::ostream& os, Vehicle& vehicle)
{
    os << vehicle.m_Brand << " " << vehicle.m_Model << 
          " (" << vehicle.m_Year << ")";
    return os;
}