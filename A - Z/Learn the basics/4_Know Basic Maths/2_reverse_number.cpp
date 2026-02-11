/*
Input: N = 12345
Output:54321
Explanation: The reverse of 12345 is 54321.

Input: N = 7789
Output: 9877
Explanation: The reverse of number 7789 is 9877.

*/

#include <iostream>
using namespace std;

int main()
{
    int n = 12345;

    int temp = n;
    int rev = 0;
    while (temp > 0)
    {
        int rem = temp % 10;
        rev = (rev * 10) + rem;
        temp /= 10;
    }

    cout << rev;

    return 0;
}

/*
Time Complexity: O(log₁₀N),The number of iterations in the loop depends on the number of digits in the number N. Since each digit is processed once using constant time operations (modulo, division, multiplication, and addition), the total time taken is proportional to the number of digits, which is log₁₀N.

Space Complexity: O(1),Only a constant number of variables are used regardless of the size of the input number.
*/