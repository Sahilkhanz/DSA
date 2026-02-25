#include <iostream>
#include <string>
using namespace std;

int main()
{
    string s = "abcdabefc";

    int n = 26;
    int arr[n] = {0};

    for (int i = 0; i < n; i++)
    {
        arr[s[i] - 'a']++;
    }

    cout << arr['z' - 'a'] << endl;

    return 0;
}