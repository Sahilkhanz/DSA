/*
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

Example 2:
Input:N = 371
Output: True
Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371

*/

#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int main()
{

    int n = 153;

    int len = to_string(n).length();
    int temp = n;
    int sum = 0;
    while (temp > 0)
    {
        int rem = temp % 10;
        sum += round(pow(rem, len));
        // cout << rem << endl;
        // cout << sum << endl;
        temp /= 10;
    }
    cout << len << endl;

    if (n == sum)
    {
        cout << "armstrong";
    }
    else
        cout << "not armstrong";
}