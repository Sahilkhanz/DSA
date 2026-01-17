/*
* * * * * * * * *   [0, 9, 0]
. * * * * * * *     [1, 7, 1]
. . * * * * *       [2, 5, 2]
. . . * * *         [3, 3, 3]
. . . . *           [4, 1, 4]


formula = 2n - (2i + 1)
*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i < n; i++)
    {
        for (int x = 0; x < i; x++)
        {
            cout << " ";
        }
        for (int j = 0; j < (2 * n - (2 * i + 1)); j++) // main formula
        {
            cout << "*";
        }
        for (int y = 0; y < i; y++)
        {
            cout << " ";
        }
        cout << endl;
    }

    return 0;
}