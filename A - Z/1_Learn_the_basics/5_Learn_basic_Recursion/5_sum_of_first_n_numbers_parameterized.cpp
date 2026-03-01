/*
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15
*/

#include <iostream>
using namespace std;

void sumNumbersParamterized(int n, int sum)
{
    if (n < 1)
    {
        cout << sum << endl;
        return;
    }
    sumNumbersParamterized(n - 1, sum + n);
}
int sumNumbersFunctinal(int n)
{
    if (n == 0)
    {
        return 0;
    }

    return n + sumNumbersFunctinal(n - 1);
}

auto main() -> int
{

    int n = 5;
    sumNumbersParamterized(n, 0);
    int sum = sumNumbersFunctinal(n);
    cout << sum;
    return 0;
}