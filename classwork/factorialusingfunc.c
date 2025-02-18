#include <stdio.h>

void factorial(int n);

int main() {
    int n;
    printf("enter number: ");
    scanf("%d", &n);

    factorial(n);
}

void factorial (int x) {
    int fact = 1;
    for(int i=x; i>1; i--) {
        fact = fact * i;
    }
     printf("factorial is %d", fact);
}