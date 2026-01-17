/*
A
A B
A B C
A B C D
A B C D E
*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;
    for (int i = 0; i < n; i++)
    {
        char ch = 'A';
        for (int j = 0; j <= i; j++)
            cout << ch++ << " ";
        cout << endl;
    }
    for (int i = 0; i < n; i++)
    {
        for (char j = 'A'; j <= 'A' + i; j++)
            cout << j << " ";
        cout << endl;
    }
}