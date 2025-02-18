#include <iostream>
using namespace std;

void greet() {
    cout << "Hello! Welcome to the program." << endl;
}

int getRandomNumber() {
    return rand() % 100; 
}

void printSquare(int num) {
    cout << "The square of " << num << " is " << num * num << endl;
}

int add(int a, int b) {
    return a + b;
}

int main() {
    greet();

    int randomNum = getRandomNumber();
    cout << "Random number generated: " << randomNum << endl;

    int num = 5;
    printSquare(num);

    int x = 10, y = 20;
    int sum = add(x, y);
    cout << "The sum of " << x << " and " << y << " is " << sum << endl;

    return 0;
}