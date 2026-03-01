/*

Input: N = 3
Output: Ashish Ashish Ashish
Explanation: Name is printed 3 times.
Input: N = 1
Output: Ashish
Explanation: Name is printed once.

*/

#include <iostream>
#include <string>
using namespace std;

void recursive_function(string name, int count)
{
    if (count <= 0)
        return;
    cout << "name -> " << name << endl;
    recursive_function(name, count - 1);
}

int main()
{
    int n = 3;
    recursive_function("Sahil", n);
    return 0;
}