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
bool parntestis(string s)
{
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == s[s.length() - i - 1])
        {
            return true;
        }
    }
    return false;
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
string removedduplicate1(string s)
{
    string res;
    set<char> st;
    for (int i = 0; i < s.length(); i++)
    {
        st.insert(s[i]);
    }
    for (char c : st)
    {
        res += c;
    }
    return res;
}
string vowelateven(string s)
{
    string ans;
    int even = 0, odd = 1;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
        {
            ans += s[even];
            even = even + 2;
        }
        else
        {
            ans += s[odd];
            odd = odd + 2;
        }
    }
    return ans;
}
string remove(string s)
{
    unordered_set<char> st;
    string res;
    for (int i = 0; i < s.length(); i++)
    {
        st.insert(s[i]);
    }
    for (char c : st)
    {
        res += c;
    }
    return res;
}
char unique(string s)
{
    char arr[256];
    string res;
    for (int i = 0; i < s.length(); i++)
    {
        arr[s[i]]++;
    }
    for (int i = 0; i < 256; i++)
    {
        if (arr[s[i]] == 1)
        {
            res += s[i];
        }
    }
    return res[0];
}
char uniquecharinarr(string s)
{
    map<char, int> m;
    for (int i = 0; i < s.length(); i++)
    {
        m[s[i]]++;
    }
    for (int i = 0; i < s.length(); i++)
    {
        if (m[s[i]] == 1)
        {
            return s[i];
        }
    }
    return '$';
}
int main()
{
    string s;
    cin >> s;
    cout << replaceupperandlower(s) << endl;
    cout << removeduplicate(s) << endl;
    cout << removedduplicate1(s) << endl;
    cout << remove(s) << endl;
    cout << vowelateven(s) << endl;
    cout << parntestis(s) << endl;
    cout << unique(s) << endl;
    cout << uniquecharinarr(s);
}
