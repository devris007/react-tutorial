#include<iostream>
using namespace std;

int main() {
  int sum=0, k;
  for(int i=50; i<=200; i++) {
    k=0;
    for(int j=2; j<i; j++) {
      if(i%j == 0) {
        k = 1; 
        break;
      }
    }
    if(k == 0) {
      sum += i;
    }
  }
  cout << "sum = " << sum << endl;
}