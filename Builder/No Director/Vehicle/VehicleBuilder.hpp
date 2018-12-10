#pragma once

#include "Vehicle.hpp"

class Vehicle::Builder
{
    private:
        std::string m_Brand = "unknown";
        std::string m_Model = "unknown";
        unsigned m_Year = 0;
        unsigned m_TotalWheels = 0;
    public:
        Builder();
        Builder& SetBrand(const std::string& brand);
        Builder& SetModel(const std::string& model);
        Builder& SetYear(unsigned year);
        Builder& SetTotalWheels(unsigned wheels);
        Vehicle Build() const;
};