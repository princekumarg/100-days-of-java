#include <bits/stdc++.h>
using namespace std;
int binaryarray(string s)
{
    int op1 = int(s[0]);
    int i = 2;
    int n = s.length();
    if (n % 2 == 0)
    {
        return -1;
    }
    while (i < n)
    {
        int op2 = int(s[i]);
        char opstr = s[i - 1];
        if (opstr == '&')
        {
            op1 = op1 & op2;
        }
        else if (opstr == '|')
        {
            op1 = op1 | op2;
        }
        else
        {
            op1 = op1 ^ op2;
        }
        i = i + 2;
        return op1;
    }
}
int main()
{
    string s;
    cin >> s;
    cout << binaryarray(s);
}