#include<iostream>
using namespace std;

int main() {
  int n;
  cout << "enter a number: ";
  cin >> n;

  if(n == 0) {
    cout << n << " is zero" << endl;
  } else {
    if(n > 0) {
       cout << n << " is positive" << endl;
    } else {
       cout << n << " is negative" << endl;
    }
  }
}