#include<iostream>
using namespace std;
int main()
{
  int a[10][10],r,c,sum;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
    sum=0;
    for(int j=0;j<c;j++){
      sum=sum+a[i][j];
    }
    cout<<sum<<endl;
  }
}