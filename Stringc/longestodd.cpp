#include <bits/stdc++.h>
using namespace std;
string longestodd(string s)
{
    int i = 0;
    for (int i = s.length() - 1; i >= 0; i--)
    {
        if (s[i] % 2 != 0)
        {
            break;
        }
        else if (i == 0 && s[i] % 2 == 0)
        {
            return "";
        }
    }
    return s.substr(0, i + 1);
}
int main()
{
    string s;
    cin >> s;
    cout << longestodd(s);
}