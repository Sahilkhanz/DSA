/*
Input: N = 4
Output: 4, 3, 2, 1
Explanation: All the numbers from 4 to 1 are printed.
Input: N = 1
Output: 1
Explanation: This is the base case.
*/
#include <iostream>
using namespace std;

void recursionFunction(int start, int end)
{
    if (start <= end)
    {
        return;
    }

    cout << start << " ";
    recursionFunction(start - 1, end);
}

int main()
{

    int n = 4;
    recursionFunction(4, 0);

    return 0;
}