#include <bits/stdc++.h>
using namespace std;
int countchar(string s)
{
    int count = 0;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == 'a')
        {
            count++;
        }
    }
    return count;
}
string reverse(string s, int start, int end)
{
    while (start <= end)
    {
        swap(s[start], s[end]);
        start++;
        end--;
    }
    return s;
}
bool palindrom(string s)
{
    string res;
    int start = 0;
    int end = s.length() - 1;
    while (start <= end)
    {
        if (s[start] != s[end])
        {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
string removespace(string s)
{
    string res;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] != ' ')
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
    cout << countchar(s) << endl;
    cout << reverse(s, 0, s.length() - 1) << endl;
    cout << palindrom(s) << endl;
    cout << removespace(s);
}