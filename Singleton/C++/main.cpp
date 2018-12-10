#include "Singleton.h"
#include <iostream>

int main(int argc, char *argv[])
{
    Singleton& first = Singleton::getInstance();
    Singleton& second = Singleton::getInstance();
    std::cout << first << std::endl;
    first.echo("Hello there!");

    std::cout << "First: " << first.getCount() << std::endl;
    std::cout << "Second: " << second.getCount() << std::endl;

    std::cout << "Incrementing only the first Singleton reference" << std::endl;
    first.incrementCount();

    std::cout << "After increment" << std::endl;
    std::cout << "First: " << first.getCount() << std::endl;
    std::cout << "Second: " << second.getCount() << std::endl;

    return 0;
} 