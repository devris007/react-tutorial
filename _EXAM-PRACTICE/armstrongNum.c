#include<stdio.h>
#include<math.h>

int main() {
  int num, originalNum, fDigit;
  int count = 0;
  int sum = 0;

  printf("enter number: ");
  scanf("%d", &num);

  originalNum = num;

  int temp = num;
  while(temp > 0) {
    temp /= 10;
    count++;
  }

  temp = num;

  while(temp > 0) {
    int remainder = temp % 10;
    sum += pow(remainder, count);
    temp /= 10;
    if(temp > 0 && temp <=9) {
      sum += pow(temp, count);
      break;
    }
  }


  if(sum == originalNum) {
    printf("yes");
  } else {
    printf("no");
  }
}