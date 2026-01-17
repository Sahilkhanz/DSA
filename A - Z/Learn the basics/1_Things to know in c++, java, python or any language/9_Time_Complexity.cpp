/*
What is Time Complexity(TC)?
TC != time taken

Rate at which the time taken increases with respect to the input size

how write TC
Big Oh notataion -> O()
eg.
    for(int i = 0; i< 5; i++){
    cout << i;
    }
compute Tc,
in worst case scenario
avoid constant
avoid lower values

we have TC
1. best case (Omega) also know known as lower-bound
2. average (theta)
3. worst case (Big Oh) also known as Upper-bound

--------------------------

what is Space Complexity?
Space Complexity -> Memory space
How write Space Complexity
Big O notation -> O()

Space Complexity ->
Auxillary space -> space that you take to solve the problem
    +
Input space -> the space that you take to store the input

eg.
let say we have variable
int a, b;
int c = a + b;
here.
input space = a, b
axillay spce  = c
Space complexity =  O(3)

---------------------------

solving coding problem which will be executed on the server let say sovling on
leetcode, GFG, codeforce or any other platform
code -> server
nearly takes around
1sec ~ 10^8 operations
not 2sec ~ 2^16 this is wrong
2s ~ 2 x 10^8 operations
5s ~ 5 x 10^8 operations
 */