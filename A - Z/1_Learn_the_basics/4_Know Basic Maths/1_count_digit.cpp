/*
Example 1:
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.

Example 2:
Input:N = 7789
Output: 4
Explanation: The number 7789 has 4 digits.
*/

#include <iostream>
#include <algorithm>;;
#include <cmath>
using namespace std;

int main()
{
    // int n = 12345;
    int n = 7789;

    // brute force
    int temp = n;
    int count = 0;
    while (temp > 0)
    {
        temp /= 10;
        count++;
    }
    cout << "brute force count -> " << count << endl;

    // optimal approach
    int c = (int)(log10(n) + 1);
    cout << "optimal count -> " << c;
    return 0;
}