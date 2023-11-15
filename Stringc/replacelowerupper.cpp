#include <bits/stdc++.h>
using namespace std;
string replaceupperandlower(string s)
{
    string res;
    for (char c : s)
    {
        if (isupper(c))
        {
            res += tolower(c);
        }
        else
        {
            res += toupper(c);
        }
    }
    return res;
}

int main()
{
    string s;
    cin >> s;
    cout << replaceupperandlower(s);
}
