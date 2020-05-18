#include<iostream>
using namespace std;

struct college
{
  char name[50];
  char city[20];
  int year;
  float per;
};

int main()
  {
  int i,n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  college clg[n];
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name";
    cin>>clg[i].name;
    cout<<"\nEnter city";
    cin>>clg[i].city;
    cout<<"\nEnter year of establishment";
    cin>>clg[i].year;
    cout<<"\nEnter pass percentage"<<endl;
    cin>>clg[i].per;
  }
    cout<<"Details of colleges"<<endl;
    for(int j=0;j<n;j++)
    {
      cout<<"College:"<<j+1<<endl;
      cout<<"Name:"<<clg[j].name<<endl;
      cout<<"City:"<<clg[j].city<<endl;
      cout<<"Year of establishment:"<<clg[j].year<<endl;
      cout<<"Pass percentage:"<<clg[j].per<<endl;
    }
  }