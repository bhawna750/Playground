#include<iostream>
using namespace std;
int main()
{
  int x,i,m,j,sum=0;
  cin>>x;
  int arr[x],arr1[x];
  for(i=0;i<x;i++)
  {
    arr[i]=0;
  }
  for(i=0;i<x;i++)
  {
    cin>>arr[i];
  }
  m=arr[0];
  arr1[0]=1;
   for(i=1;i<x;i++)
  {
     if(arr[i]<m)
     {
       arr1[i]=1;
       m=arr[i];
       //cout<<m<<"\n";
     }
     else if(arr[i]>m)
     {
       sum=sum+2;
       arr1[i]=sum;
       m=arr[i];
     //  cout<<m<<"\n";
     }
  }
   for(i=0;i<x;i++)
   {
     cout<<arr1[i]<<"\n";
   }
 
 
}

