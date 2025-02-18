#include<iostream>
using namespace std;

int main() {
  int a, b, c;
  cout << "enter three numbers: ";
  
  cin >> a;
  cin >> b;
  cin >> c;

  if(a > b && b > c) {
    cout <<  a << " is greater." << endl;
  } 
  if(b < c) {
    cout <<  c << " is greater." << endl;
  } 
  if(a<b) {
    cout <<  b  << " is greater." << endl;
  }

}