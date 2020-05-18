#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],b[100][100];
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    cin>>b[i][j];
    }
  }
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    cout<<(a[i][j]+b[i][j])<<" ";
    }
    cout<<endl;
  }
}