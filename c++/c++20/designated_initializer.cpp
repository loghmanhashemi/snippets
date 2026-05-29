#include <iostream>
using namespace std;

struct Date {
    int day;
    int month;
    int year;
};

int main()
{
    Date dt{ .day = 24, .month = 4, .year = 2023 }; // dt.day = 24, dt.month = 4, dt.year = 2023
    
    cout << "Month : " << dt.month << "\n";
    cout << "Year : " << dt.year << "\n";
    cout << "Day : " << dt.day;
    return 0;
}