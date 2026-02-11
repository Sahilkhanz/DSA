/*
Example 1:
Input:  X = 5
Output:  120
Explanation:  5! = 5*4*3*2*1

Example 2:
Input:   X = 3
Output:   6
Explanation:  3!=3*2*1
*/

#include <iostream>
using namespace std;

int fact(int n)
{
    if (n <= 1)
        return n;
    return n * fact(n - 1);
}

int main()
{
    int n = 6;

    int output = fact(n);
    cout << output;
}