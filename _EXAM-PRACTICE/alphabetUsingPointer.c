#include<stdio.h>

void _printAlphabet(char *a, char *z) {
  for(char ch = *a; ch <= *z; ch++) {
    printf("%c\t", ch);
  }
}

int main() {
  char a = 'a';
  char z = 'z';

  _printAlphabet(&a, &z);
  return 0;
}