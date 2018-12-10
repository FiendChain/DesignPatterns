#pragma once
#include <string>
#include <ostream>

class Vehicle
{
    public:
        class Builder;
    private:
        const std::string m_Brand;
        const std::string m_Model;
        const unsigned m_Year;
        const unsigned m_TotalWheels;
    public:
        Vehicle(
            const std::string& brand, const std::string& model, 
            unsigned year, unsigned totalWheels);
        friend std::ostream& operator <<(std::ostream& os, Vehicle& vehicle);
};