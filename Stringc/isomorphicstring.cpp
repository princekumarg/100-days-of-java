#include <bits/stdc++.h>
using namespace std;
bool isomphoric(string s, string t)
{
    if (s.length() == t.length())
    {
        unordered_map<char, char> stot;
        unordered_map<char, char> ttos;
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            if (stot.find(s[i]) == stot.end() && ttos.find(t[i]) == ttos.end())
            {
                stot[s[i]] = t[i];
                ttos[t[i]] = s[i];
            }
            else
            {
                if (stot[s[i]] != t[i] || ttos[t[i]] != s[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
    return true;
}
int main()
{
    string s, t;
    cin >> s >> t;
    cout << isomphoric(s, t);
}