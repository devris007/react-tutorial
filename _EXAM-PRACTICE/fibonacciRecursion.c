#include<stdio.h>

int fib(int n) {
  if(n == 0){
    return 0;
  }

  if(n == 1) {
    return 1;
  }

  int fibN = fib(n-1) + fib(n-2);
  return fibN;
}

int main() {
  int n=10;
  printf("%d", fib(n-1));
  return 0;
}