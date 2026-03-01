// functions are set if code which performs something for you
// functions are used to modulearise code
// functions are to increase the readabiltity
// functions are used to use same code multiple times
// void -> which does not returns anything
// return
// parameterised
// non parameterised

#include <iostream>
using namespace std;

// pass by value
void passByValue(int num)
{
    cout << num << endl;
    num += 5;
    cout << num << endl;
    num += 5;
    cout << num << endl;
}

// pass by reference & is added before the varibale so it picks the original number and modifies it
void passByReference(int &num)
{
    num += 5;
}

int main()
{
    int num = 10;
    cout << "orinal number " << num << endl;
    passByValue(num);
    // in the passByVlaue function the copy of num goes to, the original number is somewhere in the memory, so the original value remains unchanged
    cout << "After passByValue function " << num << endl;
    passByReference(num);
    cout << "After passByReference function " << num << endl;
    // when array is pass it always goes in reference type
    return 0;
}