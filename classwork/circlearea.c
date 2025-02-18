#include <stdio.h>

void areaOfCircle();

int main() {
    areaOfCircle();

    return 0;
}

void areaOfCircle() {
    float r;
    printf("enter radius: ");
    scanf("%f", &r);

    float area = 3.14*r*r;
    printf("area of circle is %f", area);
}