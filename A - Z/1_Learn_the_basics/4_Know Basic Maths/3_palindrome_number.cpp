/*
Example 1:
Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

Example 2:
Input:N = 7789
Output: Not Palindrome
Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome

*/

#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;

int main()
{
    int n = 451154;

    int temp = n;

    int count = 0;
    int rev = 0;
    while (count < ((int)log10(n) + 1) / 2)
    {
        int rem = temp % 10;
        rev = (rev * 10) + rem;
        temp /= 10;
        count++;
    }

    if (((int)log10(n) + 1) % 2 == 0)
        if (temp == rev)
            cout << "palindrome" << temp << " - " << rev;
        else
            cout << "not palindrome" << temp << " - " << rev;
    else if (temp / 10 == rev)
        cout << "palindrome" << temp << " - " << rev;
    else
        cout << "not palindrome" << temp << " - " << rev;
    // cout << (temp / 10 == rev) ? "palindrome" : "not palindrome";

    // simple method
    cout << endl;
    int t = n;
    rev = 0;
    while (t > 0)
    {

        int rem = t % 10;
        rev = (rev * 10) + rem;
        t /= 10;
    }

    if (rev == n)
        cout << "palindrome";
    else
        cout << " not palindrome";
}

/*
Time Complexity: O(log10N + 1), as in the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1. In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations. In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.

Space Complexity: O(1), as only a constant amount of additional memory for the reversed number regardless of size of the input number.
*/