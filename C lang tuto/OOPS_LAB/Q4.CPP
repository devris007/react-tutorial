#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b, c;
    double discriminant, root1, root2;

    cout << "Enter coefficient a: ";
    cin >> a;
    cout << "Enter coefficient b: ";
    cin >> b;
    cout << "Enter coefficient c: ";
    cin >> c;

    discriminant = b * b - 4 * a * c;

    switch (discriminant > 0 ? 1 : (discriminant == 0 ? 0 : -1)) {
        case 1:
            root1 = (-b + sqrt(discriminant)) / (2 * a);
            root2 = (-b - sqrt(discriminant)) / (2 * a);
            cout << "Roots are real and distinct." << std::endl;
            cout << "Root 1 = " << root1 << endl;
            cout << "Root 2 = " << root2 << endl;
            break;

        case 0:
            root1 = -b / (2.0 * a);
            cout << "Roots are real and repeated." << endl;
            cout << "Root = " << root1 << endl;
            break;

        case -1:
            double realPart = -b / (2.0 * a);
            double imaginaryPart = sqrt(-discriminant) / (2 * a);
            cout << "Roots are complex and different." << std::endl;
            cout << "Root 1 = " << realPart << " + " << imaginaryPart << "i" << endl;
            cout << "Root 2 = " << realPart << " - " << imaginaryPart << "i" << endl;
            break;
    }

    return 0;
}