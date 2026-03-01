/*
A B C D E
A B C D
A B C
A B
A

*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;
    for (int i = 0; i < n; i++)
    {
        char ch = 'A';
        for (int j = n; j > i; j--)
            cout << ch++ << " ";
        cout << endl;
    }
    // another method
    for (int i = 0; i < n; i++)
    {
        for (char j = 'A'; j < 'A' + n - i; j++)
            cout << j << " ";
        cout << endl;
    }
}