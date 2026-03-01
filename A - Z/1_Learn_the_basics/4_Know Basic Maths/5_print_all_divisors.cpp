/*
Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
*/
#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
using namespace std;

void brute_force(int n)
{
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
            cout << i << " ";
    }
    cout << endl;
    // Time Complexity: O(N), we check for every number from 1 to N.1
    // Space Complexity: O(N), extra space used for storing divisors.
}
void optimal_approach(int n)
{
    vector<int> vr;
    for (int i = 1; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            vr.push_back(i);
            if (i != n / i)
                vr.push_back(n / i);
        }
    }

    sort(vr.begin(), vr.end());

    for (auto i : vr)
        cout << i << " ";
    //         Time Complexity: O(sqrt(N)), we check for every number between 1 and sqaure root of N.
    //         Space Complexity: O(2*sqrt(N)), extra space used for storing divisors.
}

int main()
{
    int n = 36;

    // int output1 =
    brute_force(n);
    // int output2 =
    optimal_approach(n);
    // cout << output1 << endl;
    // cout << output2 << endl;
}