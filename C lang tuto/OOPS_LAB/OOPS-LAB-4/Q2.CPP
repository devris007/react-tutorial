#include <iostream>
#include <string>
using namespace std;

int main() {
    string text;
    int wordCount = 0, charCount = 0;
    bool inWord = false; 

    cout << "Enter a text: ";
    getline(cin, text);

    for (char ch : text) {
        if (ch != '\0') {
            charCount++;
        }

        if (ch == ' ' || ch == '\t' || ch == '\n') {
            if (inWord) {
                wordCount++; 
                inWord = false;
            }
        } else {
            if (!inWord) {
                inWord = true; 
            }
        }
    }

    if (inWord) {
        wordCount++;
    }

    cout << "Number of characters: " << charCount << endl;
    cout << "Number of words: " << wordCount << endl;

    return 0;
}