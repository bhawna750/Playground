#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 	int r,c;
  cin>>r>>c;
  int i,j;
  int mat[r][c];
  for(i=0; i<r; i++)
  {
   for(j=0; j<c; j++)
   {
    cin>>mat[i][j];  
   }
  }
  int sum=0,sum1=0,sum2=0;
    for(i=0; i<r; i++)
    {
   for(j=0; j<c; j++)
   {
     if(i==0)
     { sum=sum+mat[i][j]; }
     else if(i==j)
     { sum1=sum1+mat[i][j]; }
     else if(i==r-1)
     { sum2=sum2+mat[i][j]; }
   }
 }
  cout<<"Sum of Zig-Zag pattern is "<<sum+sum1+sum2<<"\n";

   return 0;
}