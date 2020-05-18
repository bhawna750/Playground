#include<iostream>
using namespace std;
int main()
{
  int n, v;
  cout << "Enter the number of elements in the array";
  cin >> n;
  int a[10];
  cout << "\nEnter the elements in the array";
  for(int i=0 ; i<n ; i++)
    cin >> a[i];
  int x;
  cout << "\nEnter the location where you wish to insert an element";
  cin >> x;
  if(x >= n)
    cout << "\nInvalid Input";
  else{
    a[n] = a[n-1];
  for(int i=x-1 ; i<n-1 ; i++){
      a[i+1] = a[i];
    }
    cout << "\nEnter the value to insert";
  cin >> v;
  a[x-1] = v;
   
  cout << "\nArray after insertion is\n";
  for(int i=0 ; i<=n ; i++)
    cout << a[i] << endl;
  }
}