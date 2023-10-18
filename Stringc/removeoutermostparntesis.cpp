#include <bits/stdc++.h>
using namespace std;
string removebrackets(string s)
{
    string res;
    int count = 0;
    for (char c : s)
    {
        if (c == '(' && count++ > 0)
        {
            res += c;
        }
        if (c == ')' && count-- > 1)
        {
            res += c;
        }
    }
    return res;
}
int countremovebrac(string s)
{
    int count = 0;
    int maxi = 0;
    for (char c : s)
    {
        if (c == '(')
        {
            count++;
            maxi = max(maxi, count);
        }
        else if (c == ')')
        {
            count--;
        }
    }
    return maxi;
}
int main()
{
    string s;
    cin >> s;
    cout << removebrackets(s) << endl
         << countremovebrac(s);
}