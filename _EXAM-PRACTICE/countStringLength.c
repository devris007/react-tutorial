#include<stdio.h>

int countNameLength(char arr[]) {
  int count = 0;
  for(int i=0; arr[i] != '\0'; i++) {
    count++;
  }
  return count-1;
}

int main() {
  char name[100];

  fgets(name, 100, stdin);
  printf("%d\n", countNameLength(name));
  puts(name);
}