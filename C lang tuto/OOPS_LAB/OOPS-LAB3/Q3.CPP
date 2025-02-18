#include <iostream>
#include <string>

using namespace std;

class Student {
private:
    string name;
    int rollNumber;
    int age;

public:
    void setName(string n) {
        name = n;
    }

    void setRollNumber(int r) {
        rollNumber = r;
    }

    void setAge(int a) {
        age = a;
    }

    string getName() const {
        return name;
    }

    int getRollNumber() const {
        return rollNumber;
    }

    int getAge() const {
        return age;
    }

    void displayDetails() const {
        cout << "\nStudent Details:" << endl;
        cout << "Name: " << name << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Age: " << age << endl;
    }
};

int main() {
    Student student;

    student.setName("John Doe");
    student.setRollNumber(101);
    student.setAge(20);

    cout << "Name: " << student.getName() << endl;
    cout << "Roll Number: " << student.getRollNumber() << endl;
    cout << "Age: " << student.getAge() << endl;

    student.displayDetails();

    return 0;
}