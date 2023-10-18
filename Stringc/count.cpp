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
int main()
{
    string s;
    cin >> s;
    cout << countchar(s) << endl
         << reverse(s, 0, s.length() - 1);
}