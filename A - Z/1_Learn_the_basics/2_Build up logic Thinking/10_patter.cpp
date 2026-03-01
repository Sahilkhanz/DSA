/*
 * . . . .
 * * . . .
 * * * . .
 * * * * .
 * * * * *
 * * * * .
 * * * . .
 * * . . .
 * . . . .
 */

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i < 2 * n; i++)
    {
        int stars = i;
        if (stars > 5)
            stars = 2 * n - i; // main formula
        for (int j = 0; j < stars; j++)
            cout << " * ";
        cout << endl;
    }
}