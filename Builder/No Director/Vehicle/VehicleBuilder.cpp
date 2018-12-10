#include "VehicleBuilder.hpp"

Vehicle::Builder::Builder()
{

}

Vehicle::Builder& Vehicle::Builder::SetBrand(const std::string& brand)
{
    // check brand length
    m_Brand = brand; 
    return *this;
}

Vehicle::Builder& Vehicle::Builder::SetModel(const std::string& model)
{
    // check model length
    m_Model = model;
    return *this;
}

Vehicle::Builder& Vehicle::Builder::SetYear(unsigned year)
{
    // check on year
    m_Year = year;
    return *this;
}

Vehicle::Builder& Vehicle::Builder::SetTotalWheels(unsigned wheels)
{
    // check max wheel count?
    m_TotalWheels = wheels;
    return *this;
}

Vehicle Vehicle::Builder::Build() const
{
    return Vehicle(m_Brand, m_Model, m_Year, m_TotalWheels);
}
