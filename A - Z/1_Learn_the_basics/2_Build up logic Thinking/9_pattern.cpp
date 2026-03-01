/*
. . . . * . . . .   [4, 1, 4] -> 1
. . . * * * . . .   [3, 3, 3] -> 2
. . * * * * * . .   [2, 5, 2] -> 3
. * * * * * * * .   [1, 7, 1] -> 4
* * * * * * * * *   [0, 9, 0] -> 5
* * * * * * * * *   [0, 9, 0] -> 6
. * * * * * * * .   [1, 7, 0] -> 7
. . * * * * * . .   [2, 5, 2] -> 8
. . . * * * . . .   [3, 3, 3] -> 9
. . . . * . . . .   [4, 1, 4] -> 10
*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i < n; i++)
    {
        for (int x = 0; x < n - i - 1; x++)
            cout << "  ";
        for (int j = 0; j < 2 * i + 1; j++) // main formula
            cout << "* ";
        for (int y = 0; y < n - i - 1; y++)
            cout << "  ";
        cout << endl;
    }
    for (int i = 0; i < n; i++)
    {
        for (int x = 0; x < i; x++)
            cout << "  ";
        for (int j = 0; j < 2 * n - (2 * i + 1); j++) // main formula
            cout << "* ";
        for (int x = 0; x < i; x++)
            cout << "  ";
        cout << endl;
    }
}