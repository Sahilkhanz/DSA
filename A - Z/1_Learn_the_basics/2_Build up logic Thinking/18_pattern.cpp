/*
E
D E
C D E
B C D E
A B C D E
*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i < n; i++)
    {
        char cha = 'A' + n - 1 - i;
        for (int j = 0; j <= i; j++)
            cout << cha++ << "  ";
        cout << endl;
        // cha--;
    }
    // another method
    for (int i = 0; i < n; i++)
    {
        for (char ch = 'E' - i; ch <= 'E'; ch++)
            cout << ch << " ";
        cout << endl;
    }

    // I think soo method 1st is mostly correct and 2nd method is has some issue bcz if we put n = 6 it does not go as it should to go..
}