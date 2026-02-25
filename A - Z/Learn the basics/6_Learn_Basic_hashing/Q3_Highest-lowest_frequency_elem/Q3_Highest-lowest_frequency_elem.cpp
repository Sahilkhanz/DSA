/*
Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

Example 2:
Input: array[] = {2,2,3,4,4,2};
Output: 2 3
Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
*/

#include <iostream>
#include <unordered_map>
#include <math.h>
#include <climits>
using namespace std;

int main()
{
    int arr[] = {2, 2, 3, 4, 4, 2};
    int len = sizeof(arr) / sizeof(arr[0]);
    unordered_map<int, int> mpp;
    for (int i = 0; i < len; i++)
    {
        mpp[arr[i]]++;
    }

    int high = INT_MIN, low = INT_MAX;
    int high_val = INT_MIN, low_val = INT_MAX;

    for (auto val : mpp)
    {
        if (low > val.second)
        {
            low = val.second;
            low_val = val.first;
        }
        if (high < val.second)
        {
            high = val.second;
            high_val = val.first;
        }
    }
    cout << high_val << " " << low_val << endl;
    return 0;
}
