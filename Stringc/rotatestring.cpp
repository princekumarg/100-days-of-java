#include <bits/stdc++.h>
using namespace std;
string rotate(string s, string p)
{
    int start = 0;
    int end = s.length();
    while (start < end)
    {
        if (s == p)
        {
            return "true";
        }
        int temp = s[0];
        s.erase(s.begin() + 0);
        s.push_back(temp);
        start++;
    }
    return "false";
}
void rotate1(string s, string p)
{
    queue<char> q1, q2;
    for (int i = 0; i < s.length(); i++)
    {
        q1.push(s[i]);
    }
    for (int i = 0; i < p.length(); i++)
    {
        q2.push(p[i]);
    }
    int k = p.length() - 1;
    while (k != 0)
    {
        char temp = q2.front();
        q2.pop();
        q2.push(temp);
        if (q1 == q2)
        {
            cout << "true";
            break;
        }
        k--;
    }
    cout << k << endl;
    if (q1 != q2)
    {
        cout << "false";
    }
}
int main()
{
    string s, p;
    cin >> s >> p;
    // cout << rotate(s, p);
    rotate1(s, p);
}