#include <stdio.h>


int avg(int a, int b, int c, int d);
int main() {
    int a, b, c, d;
    printf("enter the numbers: ");
    scanf("%d %d %d %d", &a, &b, &c, &d);

    int av = avg(a, b, c, d);
    printf("average is %d", av);
}

int avg(int x, int y, int z, int w) {
    int a = (x + y + z + w)/4;
    return a;
}