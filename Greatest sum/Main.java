#include<iostream>
using namespace std;
int main(){
  int a[10][10],r,c,x,y,rsum,csum,cmax=0,rmax=0;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
    rsum=0;
    for(int j=0;j<c;j++){
      rsum=rsum+a[i][j];
    }
    if(rsum>rmax){
      rmax=rsum;
      x=i;
    }
    cout<<rsum<<" ";
  }
   cout<<"\nRow "<<(x+1)<<" has maximum sum"<<endl;
   cout<<"Sum of columns is ";
  for(int j=0;j<c;j++){
    csum=0;
    for(int i=0;i<r;i++){
      csum=csum+a[i][j];
    }
    if(csum>cmax){
      cmax=csum;
      y=j;
    }
    cout<<csum<<" ";
  }
  cout<<"\nColumn "<<(y+1)<<" has maximum sum"<<endl;
}