/*
 * * * * * * * * * *
 * * * * . . * * * *
 * * * . . . . * * *
 * * . . . . . . * *
 * . . . . . . . . *     2*n - 2
 * . . . . . . . . *
 * * . . . . . . * *
 * * * . . . . * * *
 * * * * . . * * * *
 * * * * * * * * * *
 */

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i < n; i++)
    {
        for (int x = 0; x < n - i; x++)
            cout << " * ";
        for (int j = 0; j < i * 2; j++) // main formula
            cout << "   ";
        for (int x = 0; x < n - i; x++)
            cout << " * ";
        cout << endl;
    }

    for (int i = 0; i < n; i++)
    {
        for (int x = 0; x <= i; x++)
            cout << " * ";
        for (int j = 0; j < 2 * n - 2 * (i + 1); j++) // main formula
            cout << "   ";
        for (int x = 0; x <= i; x++)
            cout << " * ";
        cout << endl;
    }
}