#include <iostream>
using namespace std;

int nthFibonacciNumber(int n)
{
    if (n <= 1)
        return n;
    int last = nthFibonacciNumber(n - 1);
    int slast = nthFibonacciNumber(n - 2);
    return last + slast;
}

int main()
{
    int n = 4;

    int output = nthFibonacciNumber(n);
    cout << output;
}

/*
Time complexity :
            4
          /   \
         3     2
     2/n, 2/n-1, 2/n-2, ...
     T(c) = 2^n    -> not exactl, but near by 2^n this is called exponential
*/