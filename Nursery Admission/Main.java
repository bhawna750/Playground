#include<iostream>
#include<string>
using namespace std;
int main()
{
  std::string str;
  std::getline(std::cin,str);
 int res= str.length();
  std::cout<<"The number of letters in the name is "<<res;
  
}