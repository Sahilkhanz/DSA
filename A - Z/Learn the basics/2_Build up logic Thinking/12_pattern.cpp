/* n = 4
1 . . . . . . 1     2*n - 2*1
1 2 . . . . 2 1     2*n - 2*2
1 2 3 . . 3 2 1     2*n - 2*3
1 2 3 4 4 3 2 1

*/

#include <iostream>
using namespace std;

int main()
{
    int n = 4;
    for (int i = 1; i <= n; i++)
    {
        for (int x = 1; x <= i; x++)
            cout << x << " ";
        for (int j = 1; j <= 2 * n - 2 * i; j++)
            cout << "  ";
        for (int x = i; x > 0; x--)
            cout << x << " ";
        cout << endl;
    }
}
