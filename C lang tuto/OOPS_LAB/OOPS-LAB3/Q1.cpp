#include <iostream>
#include <string>

using namespace std;

class Student {
private:
    string name;
    int rollNumber;
    int age;
    string course;

public:
    void acceptDetails() {
        cout << "Enter Student Name: ";
        getline(cin, name); 

        cout << "Enter Roll Number: ";
        cin >> rollNumber;

        cout << "Enter Age: ";
        cin >> age;

        cin.ignore();  
        cout << "Enter Course: ";
        getline(cin, course);
    }

    void displayDetails() const {
        cout << "\nStudent Details:" << endl;
        cout << "Name: " << name << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Age: " << age << endl;
        cout << "Course: " << course << endl;
    }
};

int main() {
    Student student;

    cout << "Enter Student Details:" << endl;
    student.acceptDetails();

    student.displayDetails();

    return 0;
}