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
string removeduplicate(string s)
{
    string res;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] != s[i + 1])
        {
            res += s[i];
        }
    }
    return res;
}

int main()
{
    string s;
    cin >> s;
    cout << replaceupperandlower(s) << endl;
    cout << removeduplicate(s);
}
