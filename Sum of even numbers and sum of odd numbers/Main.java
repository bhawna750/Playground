#include<iostream>
using namespace std;
int main()
{
  int a[16],x;
  int sume=0,sumo=0;
  cin>>a[0];
  x=a[0];
  for(int i=1;i<x+1;i++)
  {
    cin>>a[i];
  }
  for(int i=1;i<x+1;i++)
  {
     if(a[i]%2==0)
    {
      sume=sume+a[i];
    }
     if(a[i]%2!=0)
    {
      sumo=sumo+a[i];
    }
  }
 cout<<"The sum of the even numbers in the array is "<<sume<<endl;
   cout<<"The sum of the odd numbers in the array is "<<sumo<<endl;
}