#include <stdio.h>

int main() {
  int arr[9];
  int search;

printf("enter elements of the array: ");
  for(int i=0; i<9; i++) {
    scanf("%d", &arr[i]);
  }

  int start = 0;
  int end = 8;

  int mid = (start + end) / 2;

    search = 7;

  while(start <= end) {
    if(arr[mid] == search) {
      printf("FOUND");
    } else if(arr[mid] < search) {
      start = mid + 1;
    } else if(arr[mid] > search) {
      end = mid - 1;
    } else {
      printf("NOT FOUND");
    }
  }
}

