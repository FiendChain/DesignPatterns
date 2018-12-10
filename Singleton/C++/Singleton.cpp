#include "Singleton.h"
#include <iostream>
#include <string>

Singleton::Singleton()
    : totalCounts(0)
{

}

std::ostream& operator<< (std::ostream& os, const Singleton& s)
{
    os << "Singleton instance to string"; 
    return os;
}

void Singleton::echo(const std::string& str) const
{
    std::cout << str << std::endl;
}

void Singleton::incrementCount()
{
    totalCounts++;
}

int Singleton::getCount()
{
    return totalCounts;
}