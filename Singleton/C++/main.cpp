#include "Singleton.h"
#include <iostream>

int main(int argc, char *argv[])
{
    Singleton& s = Singleton::getInstance();
    std::cout << s << std::endl;
    s.echo("Hello there!");
    return 0;
} 