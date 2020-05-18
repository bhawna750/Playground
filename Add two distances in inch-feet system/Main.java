#include<iostream>
using namespace std;
struct measure{
  int x1;
  float y1;
};

int main()
{
  int ans=0;
  float a=0;
  measure m[2];
  for(int i=0;i<2;i++)
  {
    cin>>m[i].x1;
    cin>>m[i].y1;
  }
  ans = m[0].x1+m[1].x1;
  a = m[0].y1+m[1].y1;
  if(a>=10)
  {
    ans= ans+1;
    a=a-12;
  }
  cout<<ans<<"'-"<<a<<"\""<<endl;
}