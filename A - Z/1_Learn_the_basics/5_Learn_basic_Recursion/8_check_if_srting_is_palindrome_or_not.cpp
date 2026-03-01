/*
Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
*/

#include <iostream>
#include <string>
using namespace std;

bool checkPalindrome(int left, string s, int right)
{
    if (left >= right)
    {
        return true;
    }
    if (s[left] != s[right])
        return false;
    return checkPalindrome(left + 1, s, right - 1);
    // return n;
}

int main()
{
    string s = "TAKE U FORWARD";

    // int o = checkPalindrome(0, s, s.length() - 1);
    if (checkPalindrome(0, s, s.length() - 1))
        cout
            << "plaindrome";
    else
        cout << "not plaindrome";
    // << checkPalindrome(0, s, s.length() - 1);
}