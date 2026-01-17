
/*
Rules ->
1. For the outer loop, count the number of lines.
2. For the inner loop, focus on the columns, & cnvert them somehow to the rows.
3. Print them '*' inside the inner loop
4. observe symmetry [ optional ]

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

#include <iostream>
using namespace std;

int main()
{

    int n = 4;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            cout << " * ";
        }
        cout << "\n";
    }

    return 0;
}
