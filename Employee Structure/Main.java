#include<iostream>
#include<iomanip>
using namespace std;
struct Employee
{
  int Id;
  char Name[25];
  int age;
  char designation[20];
  long Salary;
};

int main()
{
  int i,n=1;
  Employee Emp[n];
  for(i=0;i<n;i++)
  {
    cout<<setw(5)<<"Enter name:";
    cin>>Emp[i].Name;
    cout<<setw(5)<<"\nEnter ID:";
    cin>>Emp[i].Id;
    cout<<setw(5)<<"\nEnter age:";
    cin>>Emp[i].age;
    cout<<setw(5)<<"\nEnter designation:";
    cin>>Emp[i].designation;
    cout<<setw(5)<<"\nEnter Salary:";
    cin>>Emp[i].Salary;
  }
  cout<<"\nEmployee Details";
  for(i=0;i<n;i++)
  {
    cout<<"\nName of the Employee : "<<Emp[i].Name;
    cout<<"\nID of the Employee : "<<Emp[i].Id;
    cout<<"\nAge of the Employee : "<<Emp[i].age;
    cout<<"\nDesignation of the Employee : "<<Emp[i].designation;
    cout<<"\nSalary of the Employee : "<<Emp[i].Salary;
  }
}