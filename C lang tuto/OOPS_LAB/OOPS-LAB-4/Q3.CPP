#include <iostream>
#include <string>
using namespace std;

int main() {
    string str1, str2;

    cout << "Enter the first string: ";
    getline(cin, str1);
    cout << "Enter the second string: ";
    getline(cin, str2);

    int result = str1.compare(str2);
    if (result == 0) {
        cout << "The strings are equal (using compare())." << endl;
    } else if (result < 0) {
        cout << "The first string is less than the second string (using compare())." << endl;
    } else {
        cout << "The first string is greater than the second string (using compare())." << endl;
    }

    if (str1 == str2) {
        cout << "The strings are equal (using == operator)." << endl;
    } else if (str1 < str2) {
        cout << "The first string is less than the second string (using < operator)." << endl;
    } else {
        cout << "The first string is greater than the second string (using > operator)." << endl;
    }

    return 0;
}