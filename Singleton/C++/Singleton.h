#pragma once
#include <ostream>
#include <string>

class Singleton
{
    private:
        int totalCounts;
    public:
        static Singleton& getInstance()
        {
            static Singleton instance;
            return instance;
        } 
    private:
        Singleton(); 
        Singleton(const Singleton& s) = delete;
        void operator=(Singleton& s) = delete;
    public:
        friend std::ostream& operator<< (std::ostream& os, const Singleton& s);
        void echo(const std::string& str) const;
        void incrementCount();
        int getCount();
};