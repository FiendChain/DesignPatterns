#include "Singleton.h"
#include <iostream>
#include <string>

std::ostream& operator<< (std::ostream& os, const Singleton& s)
{
    os << "Singleton instance to string"; 
    return os;
}

void Singleton::echo(const std::string& str) const
{
    std::cout << str << std::endl;
}
