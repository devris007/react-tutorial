#include <iostream>
#include <string>

using namespace std;

// Define the Student class
class Student {
private:
    string name;
    int rollNumber;
    int age;
    string course;

public:
    // Function to accept student details
    void acceptDetails() {
        cout << "Enter Student Name: ";
        getline(cin, name);  // Using getline to handle spaces in names

        cout << "Enter Roll Number: ";
        cin >> rollNumber;

        cout << "Enter Age: ";
        cin >> age;

        cin.ignore();  // To ignore the newline character left by cin
        cout << "Enter Course: ";
        getline(cin, course);
    }

    // Function to display student details
    void displayDetails() const {
        cout << "\nStudent Details:" << endl;
        cout << "Name: " << name << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Age: " << age << endl;
        cout << "Course: " << course << endl;
    }
};

int main() {
    const int MAX_STUDENTS = 3;  // Maximum number of students
    Student students[MAX_STUDENTS];  // Array of Student objects

    // Accept details for multiple students
    for (int i = 0; i < MAX_STUDENTS; i++) {
        cout << "\nEnter details for Student " << i + 1 << ":" << endl;
        students[i].acceptDetails();
    }

    // Display details for all students
    cout << "\nDisplaying details for all students:" << endl;
    for (int i = 0; i < MAX_STUDENTS; i++) {
        students[i].displayDetails();
    }

    return 0;
}