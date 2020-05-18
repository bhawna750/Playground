#include<iostream>
using namespace std;
int main()
{
  int a[10][10],r,c,max=0;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      if(max<a[i][j]){
        max = a[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<max<<endl;
}