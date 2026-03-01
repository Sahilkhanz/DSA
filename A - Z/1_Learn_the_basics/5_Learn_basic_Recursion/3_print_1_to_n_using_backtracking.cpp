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

void print_1_to_n_with_backtracking(int i, int n)
{
    if (i < 1)
        return;
    print_1_to_n_with_backtracking(i - 1, n);
    cout << i << " ";
}

auto main() -> int
{
    int n = 3;
    print_1_to_n_with_backtracking(n, n);
    return 0;
}
