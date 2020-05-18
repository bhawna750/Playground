#include<iostream>
using namespace std;
string reverse(string &s)
{
  int n=s.length();
  for(int i=0;i<n/2;i++)
  {
    swap(s[i],s[n-i-1]);
  }
  return s;
}
int main()
{
  string str,str1,s;
  cin>>str>>str1;
  s=reverse(str);
            if(s==str1)
            {
              cout<<"It is correct";
            }
            else
            {
              cout<<"It is wrong";
            }
            
            
}