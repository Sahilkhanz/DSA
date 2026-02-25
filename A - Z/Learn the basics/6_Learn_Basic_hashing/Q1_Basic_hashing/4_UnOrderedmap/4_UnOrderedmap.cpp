#include <iostream>
#include <unordered_map>
using namespace std;

int main()
{
    int arr[] = {1, 2, 3, 1, 3, 2, 12};
    unordered_map<int, int> ump;

    for (int i = 0; i < 7; i++)
    {
        ump[arr[i]]++;
    }
    for (auto val : ump)
    {
        cout << val.first << " -> " << val.second << endl;
    }
}