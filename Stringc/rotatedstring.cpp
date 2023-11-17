#include <iostream>
using namespace std;
string rotated(string s)
{
    char temp = s[0];
    for (int i = 1; i < s.length(); i++)
    {
        s[i] = s[i + 1];
    }
    s[s.length() - 1] = temp;
    return s;
}
bool rotatedornot(string str1, string str2, int d)
{
    for (int i = 0; i < d; i++)
    {
        char temp = str1[0];
        for (int i = 0; i < str1.length(); i++)
        {
            str1[i] = str1[i + 1];
        }
        str1[str1.length() - 1] = temp;
    }
    if (str1 == str2)
    {
        return true;
    }
    return false;
}
int main()
{
    string s;
    cin >> s;
    cout << rotated(s);
    string str1, str2;
    cin >> str1 >> str2;
    int d = 2;
    cout << rotatedornot(str1, str2, d);
    return 0;
}
