#include<iostream>
using namespace std;
int main()
{
  int a[20],n,ec=0,oc=0,size;
  cout<<"Enter the number of elements in the array "<<endl;
  cin>>n;
  cout<<"Enter the elements in the array "<<endl;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  size=n;
  for(int i=0;i<n;i++){
    if(a[i]%2 == 0){
      ec=ec+1;
    }
    else{
      oc=oc+1;
    }
  }
  if(ec==size){
    cout<<"The array is Even"<<endl;
  }
  else if(oc == size){
     cout<<"The array is Odd"<<endl;
  }
  else{
    cout<<"The array is Mixed"<<endl;
  }
  
}