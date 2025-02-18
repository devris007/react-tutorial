#include <stdio.h>

void fibonacci(int n, int fib[]);

int main() {
    int n;
    printf("enter n: ");
    scanf("%d", &n);
    int fib[n];
    
    int p = 0;
    int q = 1;
    printf("%d\t %d\t", p, q);
    fibonacci(n, fib);

}

void fibonacci(int n, int fib[]) {
    fib[0] = 0;
    fib[1] = 1;
    for(int i=2; i<n; i++) {
       fib[i] = fib[i-1] + fib[i-2];
       printf("%d\t", fib[i]);
   }
}