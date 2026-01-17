/*
  . . . . * . . . .   [4, 1, 4]
  . . . * * * . . .   [3, 3, 3]
  . . * * * * * . .   [2, 5, 2]
  . * * * * * * * .   [1, 7, 1]
  * * * * * * * * *   [0, 9, 0]

*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j < n - i + 1; j++)
        {
            cout << "  ";
        }
        for (int x = 1; x <= i; x++)
        {
            cout << " *";
        }
        for (int y = 0; y < i - 1; y++)
        {

            cout << " *";
        }
        cout << endl;
    }

    // simple and more logical way
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            cout << "  ";
        }
        for (int x = 1; x <= 2 * i - 1; x++) // main formula
        {
            cout << " *";
        }
        for (int k = 1; k <= n - 1; k++)
        {
            cout << "  ";
        }
        cout << endl;
    }

    return 0;
}