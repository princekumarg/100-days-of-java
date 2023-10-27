#include <bits/stdc++.h>
using namespace std;
bool anagramstr(string s1, string s2)
{
    sort(s1.begin(), s1.end());
    sort(s2.begin(), s2.end());
    return s1 == s2;
}
bool anagramstr1(string s1, string s2)
{
    unordered_map<char, int> count;
    for (char c : s1)
    {
        count[c]++;
    }
    for (char c : s2)
    {
        count[c]--;
    }
    for (auto c : count)
    {
        if (c.second != 0)
        {
            return false;
        }
    }
    return true;
}
int main()
{
    string s1, s2;
    cin >> s1 >> s2;
    cout << anagramstr(s1, s2) << anagramstr1(s1, s2) << endl;
}
