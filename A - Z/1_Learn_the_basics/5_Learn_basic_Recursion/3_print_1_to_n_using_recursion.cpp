/*

Input: N = 4
Output: 1, 2, 3, 4
Explanation: All the numbers from 1 to 4 are printed.
Input: N = 1
Output: 1
Explanation: This is the base case.

*/

#include <iostream>
using namespace std;

void recursive_function(int start, int end)
{
    if (start > end)
        return;
    cout << start << " ";
    recursive_function(start + 1, end);
}

int main()
{
    int n = 4;

    recursive_function(1, n);
    return 0;
}