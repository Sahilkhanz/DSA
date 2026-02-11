/*
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
*/
#include <iostream>
using namespace std;

void reverseArrayUsingTwoVariable(int arr[], int left, int right)
{
    if (left >= right)
    {
        return;
    }

    // swap(left, right);
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverseArrayUsingTwoVariable(arr, left + 1, right - 1);
}

void reverseArrayUsingSingleVariable(int i, int arr[], int n)
{
    if (i >= n / 2)
    {
        return;
    }

    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
    reverseArrayUsingSingleVariable(i + 1, arr, n);
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int len = 5;

    reverseArrayUsingTwoVariable(arr, 0, len - 1);
    reverseArrayUsingSingleVariable(0, arr, len);
    // cout << output;
    for (int cell : arr)
    {
        cout << cell << " ";
    }
}