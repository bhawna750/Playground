#include <iostream>
using namespace std;
struct student
{
    char name[10],name2[20];
    int roll;
    float marks;
};
int main()
{
  int i;
  student s[1];
  for(i=0;i<1;i++){
    cin>>s[i].name>>s[i].name2;
    cin>>s[i].roll;
    cin>>s[i].marks;
  }
  cout<<endl;
  cout<<"Student Details"<<endl;
  for(i=0;i<1;i++){
    cout<<"Name: "<<s[i].name<<" "<<s[i].name2<<endl;
    cout<<"Roll: "<<s[i].roll<<endl;
    cout<<"Marks: "<<s[i].marks<<endl;
  }
}