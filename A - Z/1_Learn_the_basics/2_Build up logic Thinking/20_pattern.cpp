/*
 * . . . . . . . . *
 * * . . . . . . * *
 * * * . . . . * * *
 * * * * . . * * * *
 * * * * * * * * * *
 * * * * . . * * * *
 * * * . . . . * * *
 * * . . . . . . * *
 * . . . . . . . . *
 */

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    int star = 0;
    for (int i = 1; i < n * 2; i++)
    {
        int space = 0;
        if (i > n)
            star--;
        else
            star = i;

        // star
        for (int j = 0; j < star; j++)
            cout << " * ";

        // space

        if (i < n)
            space = 2 * n - 2 * i;
        else
            space = 2 * (i - n);

        for (int x = 0; x < space; x++)
            cout << "   ";

        // star
        for (int j = 0; j < star; j++)
            cout << " * ";

        cout << endl;
    }

    // another method
    cout << endl;

    int spaces = 2 * n - 2;
    for (int i = 1; i <= 2 * n - 1; i++)
    {
        int stars = i;
        if (i > n)
            stars = 2 * n - i;
        // stars
        for (int j = 1; j <= stars; j++)
            cout << " * ";

        // spaces
        for (int j = 1; j <= spaces; j++)
            cout << "   ";

        // stars;
        for (int j = 1; j <= stars; j++)
            cout << " * ";

        cout << endl;
        if (i < n)
            spaces -= 2;
        else
            spaces += 2;
    }
}