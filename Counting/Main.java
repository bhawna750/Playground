#include<iostream>
#include<string>
#include<bits/stdc++.h>
using namespace std;
int main ()
{
    char str[200];
    int v = 0, c = 0, n = 0, s = 0, w = 0;
    cin.get(str,200);
    for (int i = 0; str[i]!='\0'; ++i)
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
            ++v;
        else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
                ++c;
      else if((str[i] == 32))
              {   ++w; }
             else if (str[i] >= '0' && str[i] <= '9')
                      ++n;
                  else
                      ++s;
    }
    cout << "Vowels:" << v;
    cout << "\nConsonants:" << c;
    cout << "\nWhite Spaces:" <<w;
    cout << "\nDigits:" << n;
    cout << "\nSymbols:" << s;
    return 0;
}
