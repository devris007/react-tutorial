#include<stdio.h>

int fact(int n) {
  if(n == 0) {
    return 1;
  }

  int factorial = fact(n-1) * n;
  return factorial;
}

int main() {
  int n = 5;
  printf("%d", fact(n));

  return 0;
}