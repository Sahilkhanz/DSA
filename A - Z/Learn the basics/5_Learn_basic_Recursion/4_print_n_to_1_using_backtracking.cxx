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

void print_n_to_1_using_backtracking(int n, int i)
{
    if (n > i)
        return;

    print_n_to_1_using_backtracking(n + 1, i);
    cout << n << " ";
}

int main()
{
    int n = 4;
    print_n_to_1_using_backtracking(1, n);
}