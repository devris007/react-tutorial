#include<stdio.h>
int main() {
  int n;
  int fact = 1;
  printf("enter n: ");
  scanf("%d", &n);

  for(int i=n; i>=1; i--) {
    fact = fact * i;
  }
  printf("factorial is: %d", fact);
  return 0;
}