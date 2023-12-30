#include <iostream>
using namespace std;

// string solve(string s)
// {
//   if (s.length() <= 1)
//     return s;

//   if (s[0] == s[1])
//     return solve(s.substr(1));
//   else
//   {
//     string str = solve(s.substr(1));
//     return s[0] + str;
//   }
// }

string solve(string s)
{
  if (s.length() <= 1)
    return s;

  if (s[0] == 'p' && s[1] == 'i')
    return "3.14" + solve(s.substr(2, s.length()));
  return s[0] + solve(s.substr(1));
}

int main()
{
  string s = "xpixpixpipp";
  string ans = solve(s);
  cout << ans;
  return 0;
}