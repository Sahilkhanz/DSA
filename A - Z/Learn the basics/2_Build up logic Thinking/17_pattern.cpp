/*
. . . A . . .
. . A B A . .
. A B C B A .
A B C D C B A

*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 0; i < n; i++)
    {

        for (int x = 0; x < n - i - 1; x++)
            cout << " ";
        char ch = 'A';
        for (int j = 0; j < 2 * i + 1; j++)
        {
            cout << "" << ch << "";
        }
        for (int x = 0; x < n - i - 1; x++)
            cout << " ";
        cout << endl;
    }
}