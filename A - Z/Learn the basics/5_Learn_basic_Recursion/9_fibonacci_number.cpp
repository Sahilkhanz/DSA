/*

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6
Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

*/

#include <iostream>
using namespace std;

int function(int n)
{
    return n;
}

int main()
{
    int n = 1;

    int output = function(n);
    cout << output;
}