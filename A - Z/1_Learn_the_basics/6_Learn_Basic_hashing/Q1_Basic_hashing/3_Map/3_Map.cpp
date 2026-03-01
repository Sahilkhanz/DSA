#include <iostream>
#include <map>
using namespace std;

int main()
{
    int n = 7;
    int arr[n] = {1, 2, 3, 1, 3, 2, 12};

    map<int, int> mp;
    for (int i = 0; i < n; i++)
    {
        mp[arr[i]]++;
    }

    for (auto value : mp)
    {
        cout << value.first << " -> " << value.second << endl;
    }
}