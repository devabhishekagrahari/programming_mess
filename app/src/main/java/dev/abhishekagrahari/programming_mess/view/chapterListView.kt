package dev.abhishekagrahari.programming_mess.view

import android.net.Uri
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.abhishekagrahari.programming_mess.model.chapterData
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController

val chapterList = listOf(

            chapterData(
                title = "What is C++?",
                description = "C++ is a high-level, general-purpose programming language developed by Bjarne Stroustrup. It supports object-oriented, procedural, and generic programming paradigms, offering a powerful framework for software development. Widely used in system programming, game development, and competitive coding, it provides performance, flexibility, and extensive library support.",
                inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int main() {
            cout << "Hello, C++!";
            return 0;
        }
    """.trimIndent(),
                outputCodeSnippet = "Hello, C++!",
                route = "/cpp-introduction"
            ),
            chapterData(
                title = "History and Features of C++",
                description = "C++, created by Bjarne Stroustrup in 1983, evolved from C to include object-oriented programming features. It introduced classes, inheritance, and polymorphism, making it versatile for complex software development. Its rich library support, template system, and efficient memory management solidify its relevance in modern applications, including games, OS, and real-time systems.",
                inputCodeSnippet = """
        #include <iostream>
        class Feature {
        public:
            void display() {
                std::cout << "C++ Features: Classes, Inheritance, Polymorphism." << std::endl;
            }
        };

        int main() {
            Feature feature;
            feature.display();
            return 0;
        }
    """.trimIndent(),
                outputCodeSnippet = "C++ Features: Classes, Inheritance, Polymorphism.",
                route = "/cpp-history-features"
            ),
            chapterData(
                title = "Setting up a Development Environment",
                description = "To begin coding in C++, install an Integrated Development Environment (IDE) like Visual Studio Code or CLion. Ensure you have a compiler like GCC or MSVC. Set up paths and verify installation using terminal commands. IDEs streamline coding with features like debugging, code completion, and integrated build tools.",
                inputCodeSnippet = """
        // Verify GCC installation
        // Open terminal and type:
        g++ --version
    """.trimIndent(),
                outputCodeSnippet = "g++ (GCC) 12.2.0 Copyright (C) 2022 Free Software Foundation, Inc.",
                route = "/cpp-setup-environment"
            ),
            chapterData(
                title = "Writing Your First C++ Program",
                description = "Writing your first C++ program involves creating a basic 'Hello, World!' application. It demonstrates the use of the standard input/output library, the main function, and returning a value. This foundational program is your entry point into understanding C++ syntax and compiling/running code on your system.",
                inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int main() {
            cout << "Hello, World!";
            return 0;
        }
    """.trimIndent(),
                outputCodeSnippet = "Hello, World!",
                route = "/cpp-first-program"
            ),
    chapterData(
        title = "Data Types and Variables",
description = "Learn the fundamentals of data types and variables in C++. This chapter covers basic, derived, and user-defined data types, along with variable declaration, initialization, and scope, helping you understand how to store and manage data effectively.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            int age = 25;
            float height = 5.9;
            char grade = 'A';
            bool isStudent = true;
            cout << "Age: " << age << ", Height: " << height << ", Grade: " << grade << ", Is Student: " << isStudent;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Age: 25, Height: 5.9, Grade: A, Is Student: 1
    """.trimIndent(),
route = "data-types-and-variables"
),
    chapterData(
        title = "Input and Output",
description = "Explore how to perform input and output operations in C++. This chapter explains the use of `cin`, `cout`, and manipulators for formatting, enabling you to interact with users and display results effectively.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            string name;
            int age;
            cout << "Enter your name: ";
            cin >> name;
            cout << "Enter your age: ";
            cin >> age;
            cout << "Hello, " << name << "! You are " << age << " years old.";
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Enter your name: John
        Enter your age: 30
        Hello, John! You are 30 years old.
    """.trimIndent(),
route = "input-and-output"
),
    chapterData(
        title = "Operators in C++",
description = "Understand the various operators in C++, including arithmetic, relational, logical, bitwise, and assignment operators. This chapter explains operator precedence and associativity to help you write precise and efficient expressions.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            int a = 10, b = 5;
            cout << "Addition: " << (a + b) << endl;
            cout << "Subtraction: " << (a - b) << endl;
            cout << "Multiplication: " << (a * b) << endl;
            cout << "Division: " << (a / b) << endl;
            cout << "Modulus: " << (a % b) << endl;
            cout << "Comparison (a > b): " << (a > b) << endl;
            cout << "Logical AND (a > 5 && b < 10): " << ((a > 5) && (b < 10)) << endl;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Addition: 15
        Subtraction: 5
        Multiplication: 50
        Division: 2
        Modulus: 0
        Comparison (a > b): 1
        Logical AND (a > 5 && b < 10): 1
    """.trimIndent(),
route = "operators-in-cpp"
),

    chapterData(
        title = "Comments in C++",
description = "Learn how to use comments in C++ to enhance code readability and maintainability. This chapter covers single-line and multi-line comments, explaining their importance in documenting code for better collaboration and understanding.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            // This is a single-line comment
            cout << "Hello, World!" << endl; // Output greeting message
            
            /*
                This is a multi-line comment.
                It can span multiple lines.
            */
            cout << "Learning C++ comments!" << endl;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Hello, World!
        Learning C++ comments!
    """.trimIndent(),
route = "comments-in-cpp"
),
    chapterData(
        title = "Conditional Statements (if, else, switch)",
description = "Master decision-making in C++ using conditional statements. This chapter covers `if`, `else`, and `switch` statements, explaining how to execute code blocks based on specific conditions and implement multi-way branching.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            int number;
            cout << "Enter a number: ";
            cin >> number;
            
            // If-else statement
            if (number > 0) {
                cout << "The number is positive." << endl;
            } else if (number < 0) {
                cout << "The number is negative." << endl;
            } else {
                cout << "The number is zero." << endl;
            }
            
            // Switch statement
            cout << "Enter a day number (1-7): ";
            int day;
            cin >> day;
            switch (day) {
                case 1: cout << "Monday" << endl; break;
                case 2: cout << "Tuesday" << endl; break;
                case 3: cout << "Wednesday" << endl; break;
                case 4: cout << "Thursday" << endl; break;
                case 5: cout << "Friday" << endl; break;
                case 6: cout << "Saturday" << endl; break;
                case 7: cout << "Sunday" << endl; break;
                default: cout << "Invalid day number!" << endl;
            }
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Enter a number: 5
        The number is positive.
        Enter a day number (1-7): 3
        Wednesday
    """.trimIndent(),
route = "conditional-statements"
),
    chapterData(
        title = "Loops (for, while, do-while)",
description = "Learn how to perform repetitive tasks in C++ using loops. This chapter covers `for`, `while`, and `do-while` loops, explaining their syntax and use cases for efficient iteration over data.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            // For loop
            cout << "For loop example:" << endl;
            for (int i = 1; i <= 5; i++) {
                cout << i << " ";
            }
            cout << endl;
            
            // While loop
            cout << "While loop example:" << endl;
            int n = 1;
            while (n <= 5) {
                cout << n << " ";
                n++;
            }
            cout << endl;
            
            // Do-while loop
            cout << "Do-while loop example:" << endl;
            int m = 1;
            do {
                cout << m << " ";
                m++;
            } while (m <= 5);
            cout << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        For loop example:
        1 2 3 4 5 
        While loop example:
        1 2 3 4 5 
        Do-while loop example:
        1 2 3 4 5 
    """.trimIndent(),
route = "loops-for-while-do-while"
),
    chapterData(
        title = "Jump Statements (break, continue, goto)",
description = "Understand jump statements in C++ to control loop execution flow. This chapter explains `break`, `continue`, and `goto` statements, showcasing their use cases for managing program control effectively.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            // Break statement
            cout << "Break statement example:" << endl;
            for (int i = 1; i <= 5; i++) {
                if (i == 3) break;  // Exit the loop when i is 3
                cout << i << " ";
            }
            cout << endl;
            
            // Continue statement
            cout << "Continue statement example:" << endl;
            for (int i = 1; i <= 5; i++) {
                if (i == 3) continue;  // Skip the rest of the loop when i is 3
                cout << i << " ";
            }
            cout << endl;
            
            // Goto statement
            cout << "Goto statement example:" << endl;
            int count = 1;
        start:
            cout << count << " ";
            count++;
            if (count <= 5) goto start;  // Jump back to the label
            cout << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Break statement example:
        1 2 
        Continue statement example:
        1 2 4 5 
        Goto statement example:
        1 2 3 4 5 
    """.trimIndent(),
route = "jump-statements-break-continue-goto"
),
    chapterData(
        title = "Defining and Calling Functions",
description = "Learn how to define and call functions in C++. This chapter covers function declaration, definition, and calling methods, helping you break down tasks into modular blocks for improved code reusability and readability.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Function declaration
        void greetUser(string name);
        
        int main() {
            string name;
            cout << "Enter your name: ";
            cin >> name;
            
            // Function call
            greetUser(name);
            return 0;
        }
        
        // Function definition
        void greetUser(string name) {
            cout << "Hello, " << name << "! Welcome to C++." << endl;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Enter your name: Alice
        Hello, Alice! Welcome to C++.
    """.trimIndent(),
route = "defining-and-calling-functions"
) ,
    chapterData(
        title = "Function Parameters and Return Values",
description = "Understand how to pass parameters to functions and return values in C++. This chapter explains pass-by-value, pass-by-reference, and return types to help you manage data flow in functions effectively.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Function with parameters and return value
        int addNumbers(int a, int b);
        
        int main() {
            int x = 5, y = 10;
            int result = addNumbers(x, y);  // Function call with arguments
            cout << "The sum is: " << result << endl;
            return 0;
        }
        
        // Function definition with parameters and return value
        int addNumbers(int a, int b) {
            return a + b;  // Returning the sum
        }
    """.trimIndent(),
outputCodeSnippet = """
        The sum is: 15
    """.trimIndent(),
route = "function-parameters-and-return-values"
) ,
 chapterData(
        title = "Scope and Lifetime of Variables",
description = "Learn about the scope and lifetime of variables in C++. This chapter explains local and global variables, along with how the scope determines where a variable can be accessed, and its lifetime dictates how long it exists.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Global variable
        int globalVar = 10;
        
        void demonstrateScope() {
            // Local variable
            int localVar = 5;
            cout << "Local variable: " << localVar << endl;
            cout << "Global variable: " << globalVar << endl;
        }
        
        int main() {
            cout << "Global variable in main: " << globalVar << endl;
            demonstrateScope();
            
            // Local variable 'localVar' is not accessible here, it's out of scope
            // cout << "Local variable: " << localVar << endl; // Error: 'localVar' not declared
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Global variable in main: 10
        Local variable: 5
        Global variable: 10
    """.trimIndent(),
route = "scope-and-lifetime-of-variables"
) ,
    chapterData(
        title = "Inline Functions",
description = "Learn about inline functions in C++. This chapter explains how inline functions help improve performance by reducing function call overhead, especially for small functions, and when to use them effectively.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Inline function
        inline int square(int x) {
            return x * x;
        }
        
        int main() {
            int num = 4;
            cout << "The square of " << num << " is: " << square(num) << endl;  // Inline function call
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        The square of 4 is: 16
    """.trimIndent(),
route = "inline-functions"
),
    chapterData(
        title = "Function Overloading",
description = "Explore function overloading in C++, where multiple functions with the same name can exist but differ in their parameters. This chapter explains how overloading allows for more readable and reusable code.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Function overloading with different parameter types
        int add(int a, int b) {
            return a + b;
        }
        
        float add(float a, float b) {
            return a + b;
        }
        
        int main() {
            int intResult = add(3, 5);  // Calls int version
            float floatResult = add(2.5f, 3.5f);  // Calls float version
            cout << "Integer sum: " << intResult << endl;
            cout << "Float sum: " << floatResult << endl;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Integer sum: 8
        Float sum: 6
    """.trimIndent(),
route = "function-overloading"
),
    chapterData(
        title = "Recursion",
description = "Understand the concept of recursion in C++. This chapter explains how a function can call itself to solve problems, and provides examples of recursive algorithms such as factorial calculation and Fibonacci series.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Recursive function to find factorial of a number
        int factorial(int n) {
            if (n <= 1) return 1;  // Base case
            return n * factorial(n - 1);  // Recursive call
        }
        
        int main() {
            int number = 5;
            cout << "Factorial of " << number << " is: " << factorial(number) << endl;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Factorial of 5 is: 120
    """.trimIndent(),
route = "recursion"
),
    chapterData(
        title = "Arrays in C++",
description = "Learn about arrays in C++, which allow you to store multiple values of the same type in a single variable. This chapter covers array declaration, initialization, and accessing array elements.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            // Array declaration and initialization
            int numbers[5] = {1, 2, 3, 4, 5};
            
            // Accessing and displaying array elements
            cout << "Array elements: ";
            for (int i = 0; i < 5; i++) {
                cout << numbers[i] << " ";
            }
            cout << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Array elements: 1 2 3 4 5
    """.trimIndent(),
route = "arrays-in-cpp"
),
    chapterData(
        title = "Multidimensional Arrays",
description = "Understand multidimensional arrays in C++, which allow you to store data in a table-like format with multiple rows and columns. This chapter covers 2D arrays and how to access their elements effectively.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            // 2D array declaration and initialization
            int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};
            
            // Accessing and displaying 2D array elements
            cout << "Matrix elements:" << endl;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    cout << matrix[i][j] << " ";
                }
                cout << endl;
            }
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Matrix elements:
        1 2 3 
        4 5 6 
    """.trimIndent(),
route = "multidimensional-arrays"
),
    chapterData(
        title = "String Basics and Manipulation",
description = "Learn the basics of working with strings in C++. This chapter covers string declaration, initialization, and common string manipulation functions such as concatenation, comparison, and length calculation.",
inputCodeSnippet = """
        #include <iostream>
        #include <string>
        using namespace std;
        
        int main() {
            // String initialization
            string str1 = "Hello";
            string str2 = "World";
            
            // String concatenation
            string result = str1 + " " + str2;
            cout << "Concatenated string: " << result << endl;
            
            // String comparison
            if (str1 == "Hello") {
                cout << "str1 equals 'Hello'" << endl;
            }
            
            // String length
            cout << "Length of result string: " << result.length() << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Concatenated string: Hello World
        str1 equals 'Hello'
        Length of result string: 11
    """.trimIndent(),
route = "string-basics-and-manipulation"
),
    chapterData(
        title = "String Functions",
description = "Dive deeper into string manipulation in C++ with built-in string functions. This chapter explains various string functions such as `substr`, `find`, `replace`, and `to_upper`, among others, to help you manipulate strings effectively.",
inputCodeSnippet = """
        #include <iostream>
        #include <string>
        using namespace std;
        
        int main() {
            string str = "C++ Programming";
            
            // Substring function
            string subStr = str.substr(0, 3);  // Extracts "C++"
            cout << "Substring: " << subStr << endl;
            
            // Find function
            size_t pos = str.find("Programming");
            if (pos != string::npos) {
                cout << "'Programming' found at position: " << pos << endl;
            }
            
            // Replace function
            str.replace(0, 3, "Java");  // Replaces "C++" with "Java"
            cout << "Modified string: " << str << endl;
            
            // Convert to uppercase
            for (int i = 0; i < str.length(); i++) {
                str[i] = toupper(str[i]);
            }
            cout << "Uppercase string: " << str << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Substring: C++
        'Programming' found at position: 4
        Modified string: Java Programming
        Uppercase string: JAVA PROGRAMMING
    """.trimIndent(),
route = "string-functions"
),
    chapterData(
        title = "Introduction to Pointers",
description = "Get introduced to pointers in C++. This chapter covers the concept of pointers, memory addresses, and how pointers can be used to reference variables, enabling more efficient memory management and function manipulation.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            int num = 10;
            int* ptr = &num;  // Pointer to the variable 'num'
            
            // Display memory address and value using the pointer
            cout << "Memory address of num: " << ptr << endl;
            cout << "Value of num via pointer: " << *ptr << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Memory address of num: 0x7ffd3b2b5d14
        Value of num via pointer: 10
    """.trimIndent(),
route = "introduction-to-pointers"
),
    chapterData(
        title = "Pointer Arithmetic",
description = "Learn about pointer arithmetic in C++. This chapter explains how pointers can be incremented, decremented, and how pointer arithmetic works to traverse arrays or memory locations, providing more control over data access.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            int arr[] = {10, 20, 30, 40, 50};
            int* ptr = arr;  // Pointer to the first element of the array
            
            // Accessing array elements using pointer arithmetic
            cout << "First element: " << *ptr << endl;  // Output: 10
            
            ptr++;  // Incrementing pointer to next element
            cout << "Second element: " << *ptr << endl;  // Output: 20
            
            ptr += 2;  // Moving pointer two positions ahead
            cout << "Fourth element: " << *ptr << endl;  // Output: 40
            
            ptr--;  // Decrementing pointer to previous element
            cout << "Third element: " << *ptr << endl;  // Output: 30
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        First element: 10
        Second element: 20
        Fourth element: 40
        Third element: 30
    """.trimIndent(),
route = "pointer-arithmetic"
),
    chapterData(
        title = "Pointers and Arrays",
description = "Explore the relationship between pointers and arrays in C++. This chapter explains how pointers can be used to manipulate arrays, access array elements, and how array names themselves act as pointers.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            int arr[] = {10, 20, 30, 40, 50};
            int* ptr = arr;  // Pointer to the first element of the array
            
            // Accessing array elements using pointer
            for (int i = 0; i < 5; i++) {
                cout << "Element " << i + 1 << " using pointer: " << *(ptr + i) << endl;
            }
            
            // Using array name as a pointer
            cout << "First element using array name as pointer: " << *arr << endl;
            cout << "Second element using array name as pointer: " << *(arr + 1) << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Element 1 using pointer: 10
        Element 2 using pointer: 20
        Element 3 using pointer: 30
        Element 4 using pointer: 40
        Element 5 using pointer: 50
        First element using array name as pointer: 10
        Second element using array name as pointer: 20
    """.trimIndent(),
route = "pointers-and-arrays"
),
    chapterData(
        title = "Dynamic Memory Allocation (new and delete)",
description = "Learn about dynamic memory allocation in C++ using `new` and `delete`. This chapter explains how to allocate memory at runtime and deallocate it to prevent memory leaks, enabling more efficient memory management.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        int main() {
            // Dynamically allocating memory for an integer
            int* ptr = new int;  // Allocating memory for a single integer
            *ptr = 10;  // Assigning a value
            
            cout << "Dynamically allocated integer: " << *ptr << endl;
            
            // Dynamically allocating memory for an array of integers
            int* arr = new int[5];  // Allocating memory for an array of 5 integers
            for (int i = 0; i < 5; i++) {
                arr[i] = (i + 1) * 10;  // Initializing array elements
            }
            
            cout << "Dynamically allocated array: ";
            for (int i = 0; i < 5; i++) {
                cout << arr[i] << " ";  // Displaying array elements
            }
            cout << endl;
            
            // Deallocating memory
            delete ptr;  // Deallocating memory for the single integer
            delete[] arr;  // Deallocating memory for the array
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Dynamically allocated integer: 10
        Dynamically allocated array: 10 20 30 40 50
    """.trimIndent(),
route = "dynamic-memory-allocation-new-delete"
),
    chapterData(
        title = "References in C++",
description = "Learn about references in C++, which provide an alias for another variable. This chapter explains how references are different from pointers, their syntax, and how they are used for more efficient function argument passing and memory management.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        void modifyValue(int& ref) {
            ref = 20;  // Modifying the value using reference
        }
        
        int main() {
            int num = 10;
            cout << "Before modification: " << num << endl;
            
            // Passing by reference
            modifyValue(num);
            
            cout << "After modification: " << num << endl;  // Value changed via reference
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Before modification: 10
        After modification: 20
    """.trimIndent(),
route = "references-in-cpp"
),
    chapterData(
        title = "Classes and Objects",
description = "Understand the concepts of classes and objects in C++. This chapter explains how to define classes, create objects, and the principles of object-oriented programming such as encapsulation, inheritance, and polymorphism.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Car {
        public:
            string brand;
            int year;
            
            // Constructor to initialize values
            Car(string b, int y) {
                brand = b;
                year = y;
            }
            
            // Function to display car details
            void displayInfo() {
                cout << "Brand: " << brand << ", Year: " << year << endl;
            }
        };
        
        int main() {
            // Creating objects of the Car class
            Car car1("Toyota", 2020);
            Car car2("Honda", 2022);
            
            // Calling method using objects
            car1.displayInfo();
            car2.displayInfo();
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Brand: Toyota, Year: 2020
        Brand: Honda, Year: 2022
    """.trimIndent(),
route = "classes-and-objects"
),
    chapterData(
        title = "Constructors and Destructors",
description = "Learn about constructors and destructors in C++. This chapter explains how constructors are used to initialize objects and how destructors clean up resources when objects are destroyed.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Car {
        public:
            string brand;
            int year;
            
            // Constructor to initialize values
            Car(string b, int y) {
                brand = b;
                year = y;
                cout << "Car object created: " << brand << ", " << year << endl;
            }
            
            // Destructor to clean up resources
            ~Car() {
                cout << "Car object destroyed: " << brand << ", " << year << endl;
            }
            
            void displayInfo() {
                cout << "Brand: " << brand << ", Year: " << year << endl;
            }
        };
        
        int main() {
            // Creating object of the Car class
            Car car1("Toyota", 2020);
            car1.displayInfo();
            
            // The destructor will be called automatically when the object goes out of scope
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Car object created: Toyota, 2020
        Brand: Toyota, Year: 2020
        Car object destroyed: Toyota, 2020
    """.trimIndent(),
route = "constructors-and-destructors"
),
    chapterData(
        title = "Member Functions and Data",
description = "Understand the role of member functions and data in C++ classes. This chapter explains how member functions access and modify data members, and the use of access specifiers like public, private, and protected.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Rectangle {
        private:
            int length;
            int width;
        
        public:
            // Constructor to initialize the data members
            Rectangle(int l, int w) {
                length = l;
                width = w;
            }
            
            // Member function to calculate area
            int calculateArea() {
                return length * width;
            }
            
            // Member function to display rectangle details
            void displayInfo() {
                cout << "Length: " << length << ", Width: " << width << endl;
            }
        };
        
        int main() {
            // Creating object of the Rectangle class
            Rectangle rect(10, 5);
            
            // Calling member functions
            rect.displayInfo();
            cout << "Area: " << rect.calculateArea() << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Length: 10, Width: 5
        Area: 50
    """.trimIndent(),
route = "member-functions-and-data"
) ,
     chapterData(
        title = "Encapsulation and Abstraction",
description = "Understand the principles of encapsulation and abstraction in C++. This chapter explains how encapsulation hides internal data and functions, providing controlled access, and how abstraction focuses on exposing only essential information to the user.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Car {
        private:
            string brand;  // Private data member
            int year;      // Private data member
            
        public:
            // Constructor to initialize values
            Car(string b, int y) {
                brand = b;
                year = y;
            }
            
            // Encapsulation: Getter functions to access private data
            string getBrand() {
                return brand;
            }
            
            int getYear() {
                return year;
            }
            
            // Function to display car details (Abstraction)
            void displayInfo() {
                cout << "Brand: " << getBrand() << ", Year: " << getYear() << endl;
            }
        };
        
        int main() {
            // Creating object of the Car class
            Car car1("Toyota", 2020);
            car1.displayInfo();  // Accessing public method to display information
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Brand: Toyota, Year: 2020
    """.trimIndent(),
route = "encapsulation-and-abstraction"
),
    chapterData(
        title = "Static Members",
description = "Learn about static members in C++. This chapter explains how static variables and functions belong to the class rather than an instance, allowing them to be shared across all instances of the class.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Counter {
        public:
            static int count;  // Static member variable
            
            Counter() {
                count++;  // Increment static variable on object creation
            }
            
            static void displayCount() {  // Static member function
                cout << "Count: " << count << endl;
            }
        };
        
        // Initializing the static member outside the class
        int Counter::count = 0;
        
        int main() {
            // Creating objects of the Counter class
            Counter obj1;
            Counter obj2;
            Counter obj3;
            
            // Calling the static function using class name
            Counter::displayCount();
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Count: 3
    """.trimIndent(),
route = "static-members"
),
    chapterData(
        title = "Friend Functions and Classes",
description = "Learn about friend functions and classes in C++. This chapter explains how friend functions can access private and protected members of a class, and how they are different from member functions.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Box {
        private:
            int length;
        
        public:
            Box(int len) {
                length = len;
            }
            
            // Declaring friend function
            friend int getLength(Box& b);
        };
        
        // Friend function definition
        int getLength(Box& b) {
            return b.length;  // Accessing private member of Box class
        }
        
        int main() {
            Box box(10);
            cout << "Length of the box: " << getLength(box) << endl;  // Accessing private member via friend function
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Length of the box: 10
    """.trimIndent(),
route = "friend-functions-and-classes"
),
    chapterData(
        title = "Static Members",
description = "Explore static members in C++. This chapter explains how static members (variables and functions) are shared among all instances of a class, and how they differ from regular members by being bound to the class rather than to individual objects.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Counter {
        private:
            static int count;  // Static member variable
            
        public:
            Counter() {
                count++;  // Increment static count for each object created
            }
            
            static int getCount() {  // Static member function
                return count;
            }
        };
        
        // Initialize static variable outside the class
        int Counter::count = 0;
        
        int main() {
            Counter obj1, obj2, obj3;
            cout << "Number of objects created: " << Counter::getCount() << endl;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Number of objects created: 3
    """.trimIndent(),
route = "static-members"
) ,
    chapterData(
        title = "Friend Functions and Classes",
description = "In this chapter, learn about friend functions and classes in C++. Friend functions can access private and protected members of a class, allowing external functions or classes to interact with class internals. This chapter explains the syntax and usage of friend functions.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        class Box {
        private:
            int length;
        
        public:
            Box(int len) {
                length = len;
            }
            
            // Declaring friend function
            friend void printLength(Box& b);
        };
        
        // Friend function definition
        void printLength(Box& b) {
            cout << "Length of the box: " << b.length << endl;  // Accessing private member of Box class
        }
        
        int main() {
            Box box(10);
            printLength(box);  // Accessing private member via friend function
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Length of the box: 10
    """.trimIndent(),
route = "friend-functions-and-classes"
),
    chapterData(
        title = "Basics of Inheritance",
description = "Learn the fundamentals of inheritance in C++. This chapter introduces the concept of inheritance, where a class (derived class) can inherit properties and behaviors from another class (base class), promoting code reuse.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Base class
        class Animal {
        public:
            void eat() {
                cout << "This animal eats food." << endl;
            }
        };
        
        // Derived class inheriting from Animal
        class Dog : public Animal {
        public:
            void bark() {
                cout << "The dog barks." << endl;
            }
        };
        
        int main() {
            Dog dog;
            dog.eat();  // Inherited function from Animal class
            dog.bark();  // Function from Dog class
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        This animal eats food.
        The dog barks.
    """.trimIndent(),
route = "basics-of-inheritance"
),
     chapterData(
        title = "Types of Inheritance",
description = "Explore the different types of inheritance in C++, including single, multiple, multilevel, hierarchical, and hybrid inheritance. This chapter explains how each type allows for different relationships between classes.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Single Inheritance
        class Animal {
        public:
            void eat() {
                cout << "This animal eats food." << endl;
            }
        };
        
        class Dog : public Animal {  // Single inheritance
        public:
            void bark() {
                cout << "The dog barks." << endl;
            }
        };
        
        // Multiple Inheritance
        class Father {
        public:
            void traits() {
                cout << "Traits from father." << endl;
            }
        };
        
        class Mother {
        public:
            void traits() {
                cout << "Traits from mother." << endl;
            }
        };
        
        class Child : public Father, public Mother {  // Multiple inheritance
        public:
            void identity() {
                cout << "The child has traits from both father and mother." << endl;
            }
        };
        
        // Main function demonstrating types of inheritance
        int main() {
            // Single inheritance
            Dog dog;
            dog.eat();
            dog.bark();
            
            // Multiple inheritance
            Child child;
            child.traits();  // Traits from both Father and Mother
            child.identity();
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        This animal eats food.
        The dog barks.
        Traits from father.
        Traits from mother.
        The child has traits from both father and mother.
    """.trimIndent(),
route = "types-of-inheritance"
),
     chapterData(
        title = "Constructor and Destructor in Inheritance",
description = "Understand the role of constructors and destructors in inheritance. This chapter explains how constructors and destructors work in derived and base classes and how to ensure proper initialization and cleanup of objects in an inheritance hierarchy.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Base class
        class Animal {
        public:
            Animal() {
                cout << "Animal Constructor called" << endl;
            }
            
            ~Animal() {
                cout << "Animal Destructor called" << endl;
            }
        };
        
        // Derived class
        class Dog : public Animal {
        public:
            Dog() {
                cout << "Dog Constructor called" << endl;
            }
            
            ~Dog() {
                cout << "Dog Destructor called" << endl;
            }
        };
        
        int main() {
            Dog dog;  // Creating an object of derived class
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Animal Constructor called
        Dog Constructor called
        Dog Destructor called
        Animal Destructor called
    """.trimIndent(),
route = "constructor-and-destructor-in-inheritance"
),
    chapterData(
        title = "Function Overriding",
description = "Learn about function overriding in C++. This chapter explains how a derived class can override a base class function to provide a specific implementation, allowing dynamic polymorphism during runtime.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Base class
        class Animal {
        public:
            virtual void sound() {  // Virtual function
                cout << "Animal makes a sound." << endl;
            }
        };
        
        // Derived class
        class Dog : public Animal {
        public:
            void sound() override {  // Overriding base class function
                cout << "Dog barks." << endl;
            }
        };
        
        int main() {
            Animal* animal = new Dog();
            animal->sound();  // Calls overridden function in Dog class
            
            delete animal;
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Dog barks.
    """.trimIndent(),
route = "function-overriding"
),
    chapterData(
        title = "Virtual Base Classes",
description = "Learn about virtual base classes in C++. This chapter explains how virtual inheritance solves the diamond problem by ensuring that only one instance of a common base class is inherited, even if it is inherited by multiple classes.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Virtual Base class
        class Animal {
        public:
            Animal() {
                cout << "Animal Constructor called" << endl;
            }
            
            virtual void sound() {
                cout << "Animal makes a sound." << endl;
            }
        };
        
        // Derived class 1
        class Mammal : virtual public Animal {
        public:
            Mammal() {
                cout << "Mammal Constructor called" << endl;
            }
        };
        
        // Derived class 2
        class Bird : virtual public Animal {
        public:
            Bird() {
                cout << "Bird Constructor called" << endl;
            }
        };
        
        // Final derived class
        class Bat : public Mammal, public Bird {
        public:
            Bat() {
                cout << "Bat Constructor called" << endl;
            }
            
            void sound() override {
                cout << "Bat screeches." << endl;
            }
        };
        
        int main() {
            Bat bat;
            bat.sound();  // Calls overridden function in Bat class
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Animal Constructor called
        Mammal Constructor called
        Bird Constructor called
        Bat Constructor called
        Bat screeches.
    """.trimIndent(),
route = "virtual-base-classes"
) ,
    chapterData(
        title = "Compile-time Polymorphism (Function Overloading, Operator Overloading)",
description = "Understand compile-time polymorphism in C++ through function overloading and operator overloading. This chapter explains how the same function or operator can behave differently based on the arguments passed.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Function Overloading
        class Calculator {
        public:
            int add(int a, int b) {
                return a + b;
            }
            
            double add(double a, double b) {
                return a + b;
            }
        };
        
        // Operator Overloading
        class Complex {
        private:
            int real, imag;
        
        public:
            Complex(int r, int i) : real(r), imag(i) {}
            
            // Overloading '+' operator
            Complex operator+(const Complex& other) {
                return Complex(real + other.real, imag + other.imag);
            }
            
            void display() {
                cout << real << " + " << imag << "i" << endl;
            }
        };
        
        int main() {
            // Function Overloading
            Calculator calc;
            cout << "Sum of integers: " << calc.add(5, 10) << endl;
            cout << "Sum of doubles: " << calc.add(2.5, 3.7) << endl;
            
            // Operator Overloading
            Complex c1(2, 3), c2(4, 5);
            Complex c3 = c1 + c2;
            cout << "Sum of complex numbers: ";
            c3.display();
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Sum of integers: 15
        Sum of doubles: 6.2
        Sum of complex numbers: 6 + 8i
    """.trimIndent(),
route = "compile-time-polymorphism-function-overloading-operator-overloading"
),
   chapterData(
        title = "Runtime Polymorphism (Virtual Functions and Pure Virtual Functions)",
description = "Learn about runtime polymorphism in C++ using virtual and pure virtual functions. This chapter explains how runtime polymorphism allows the program to decide which function to call based on the object type, enabling dynamic method binding.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Base class with a virtual function
        class Shape {
        public:
            virtual void draw() {  // Virtual function
                cout << "Drawing a shape." << endl;
            }
        };
        
        // Derived class 1
        class Circle : public Shape {
        public:
            void draw() override {  // Overriding base class function
                cout << "Drawing a circle." << endl;
            }
        };
        
        // Derived class 2
        class Square : public Shape {
        public:
            void draw() override {  // Overriding base class function
                cout << "Drawing a square." << endl;
            }
        };
        
        // Derived class with a pure virtual function (abstract class)
        class Polygon : public Shape {
        public:
            virtual void area() = 0;  // Pure virtual function (abstract)
        };
        
        // Derived class implementing pure virtual function
        class Rectangle : public Polygon {
        public:
            void draw() override {
                cout << "Drawing a rectangle." << endl;
            }
            
            void area() override {
                cout << "Calculating area of the rectangle." << endl;
            }
        };
        
        int main() {
            // Using pointers for runtime polymorphism
            Shape* shape1 = new Circle();
            Shape* shape2 = new Square();
            Shape* shape3 = new Rectangle();
            
            shape1->draw();  // Calls Circle's draw
            shape2->draw();  // Calls Square's draw
            shape3->draw();  // Calls Rectangle's draw
            static_cast<Rectangle*>(shape3)->area();  // Calls Rectangle's area
            
            delete shape1;
            delete shape2;
            delete shape3;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Drawing a circle.
        Drawing a square.
        Drawing a rectangle.
        Calculating area of the rectangle.
    """.trimIndent(),
route = "runtime-polymorphism-virtual-functions-pure-virtual-functions"
),
    chapterData(
        title = "Abstract Classes",
description = "Understand the concept of abstract classes in C++. This chapter explains how abstract classes are used to define a base class with pure virtual functions, which must be implemented by derived classes, enforcing a common interface for all derived classes.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Abstract class with a pure virtual function
        class Shape {
        public:
            virtual void draw() = 0;  // Pure virtual function (abstract)
            virtual void area() = 0;  // Pure virtual function (abstract)
        };
        
        // Derived class implementing the pure virtual functions
        class Circle : public Shape {
        private:
            double radius;
        
        public:
            Circle(double r) : radius(r) {}
            
            void draw() override {
                cout << "Drawing a circle." << endl;
            }
            
            void area() override {
                cout << "Area of circle: " << 3.14 * radius * radius << endl;
            }
        };
        
        // Another derived class implementing the pure virtual functions
        class Square : public Shape {
        private:
            double side;
        
        public:
            Square(double s) : side(s) {}
            
            void draw() override {
                cout << "Drawing a square." << endl;
            }
            
            void area() override {
                cout << "Area of square: " << side * side << endl;
            }
        };
        
        int main() {
            Shape* shape1 = new Circle(5);
            Shape* shape2 = new Square(4);
            
            shape1->draw();
            shape1->area();
            
            shape2->draw();
            shape2->area();
            
            delete shape1;
            delete shape2;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Drawing a circle.
        Area of circle: 78.5
        Drawing a square.
        Area of square: 16
    """.trimIndent(),
route = "abstract-classes"
),
    chapterData(
        title = "Function Templates",
description = "Learn about function templates in C++. This chapter explains how function templates allow you to write generic functions that work with different data types, improving code reusability and flexibility.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Function template for finding the maximum of two values
        template <typename T>
        T max(T a, T b) {
            return (a > b) ? a : b;
        }
        
        int main() {
            // Using function template with int
            cout << "Max of 3 and 5: " << max(3, 5) << endl;
            
            // Using function template with double
            cout << "Max of 3.5 and 2.1: " << max(3.5, 2.1) << endl;
            
            // Using function template with string
            cout << "Max of apple and orange: " << max("apple", "orange") << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Max of 3 and 5: 5
        Max of 3.5 and 2.1: 3.5
        Max of apple and orange: orange
    """.trimIndent(),
route = "function-templates"
),
    chapterData(
        title = "Class Templates",
description = "Explore class templates in C++. This chapter explains how class templates enable you to create generic classes that can work with any data type, allowing for reusable and type-safe code across different data types.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // Class template for a Pair
        template <typename T1, typename T2>
        class Pair {
        private:
            T1 first;
            T2 second;
        
        public:
            Pair(T1 f, T2 s) : first(f), second(s) {}
            
            void display() {
                cout << "First: " << first << ", Second: " << second << endl;
            }
        };
        
        int main() {
            // Creating object of Pair with int and double
            Pair<int, double> p1(5, 3.14);
            p1.display();
            
            // Creating object of Pair with string and char
            Pair<string, char> p2("Hello", 'A');
            p2.display();
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        First: 5, Second: 3.14
        First: Hello, Second: A
    """.trimIndent(),
route = "class-templates"
) ,
    chapterData(
        title = "Template Specialization",
description = "Learn about template specialization in C++. This chapter explains how template specialization allows you to define specific behavior for certain data types while keeping the general template intact for others.",
inputCodeSnippet = """
        #include <iostream>
        using namespace std;
        
        // General template
        template <typename T>
        T square(T a) {
            return a * a;
        }
        
        // Template specialization for type int
        template <>
        int square<int>(int a) {
            cout << "Specialized template for int" << endl;
            return a * a;
        }
        
        // Template specialization for type double
        template <>
        double square<double>(double a) {
            cout << "Specialized template for double" << endl;
            return a * a;
        }
        
        int main() {
            cout << "Square of 5 (int): " << square(5) << endl;
            cout << "Square of 5.5 (double): " << square(5.5) << endl;
            cout << "Square of 3.2 (float): " << square(3.2f) << endl;
            
            return 0;
        }
    """.trimIndent(),
outputCodeSnippet = """
        Specialized template for int
        Square of 5 (int): 25
        Specialized template for double
        Square of 5.5 (double): 30.25
        Square of 3.2 (float): 10.24
    """.trimIndent(),
route = "template-specialization"
) ,
    chapterData(
        title = "Basics of Exception Handling",
        description = "Exception handling in C++ ensures smooth error management during runtime. It uses `try`, `catch`, and `throw` blocks to identify and handle exceptions. By catching errors gracefully, programs avoid crashes and ensure robustness. This mechanism is essential for building reliable and maintainable applications.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int main() {
            try {
                int divisor = 0;
                if (divisor == 0) {
                    throw runtime_error("Division by zero error!");
                }
                cout << 10 / divisor;
            } catch (const exception& e) {
                cout << "Exception caught: " << e.what() << endl;
            }
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "Exception caught: Division by zero error!",
        route = "/cpp-exception-handling"
    ),
    chapterData(
        title = "Basics of Exception Handling",
        description = "Exception handling in C++ ensures smooth error management during runtime. It uses `try`, `catch`, and `throw` blocks to identify and handle exceptions. By catching errors gracefully, programs avoid crashes and ensure robustness. This mechanism is essential for building reliable and maintainable applications.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int main() {
            try {
                int divisor = 0;
                if (divisor == 0) {
                    throw runtime_error("Division by zero error!");
                }
                cout << 10 / divisor;
            } catch (const exception& e) {
                cout << "Exception caught: " << e.what() << endl;
            }
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "Exception caught: Division by zero error!",
        route = "/cpp-exception-handling"
    ),
    chapterData(
        title = "Standard Exceptions",
        description = "C++ provides a set of standard exceptions in the `<stdexcept>` header, such as `runtime_error`, `invalid_argument`, `out_of_range`, and `overflow_error`. These predefined exceptions help handle common errors effectively, promoting consistent error handling across applications.",
        inputCodeSnippet = """
        #include <iostream>
        #include <stdexcept>
        using namespace std;

        int main() {
            try {
                throw out_of_range("Index out of range!");
            } catch (const out_of_range& e) {
                cout << "Caught exception: " << e.what() << endl;
            }
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "Caught exception: Index out of range!",
        route = "/cpp-standard-exceptions"
    ),
    chapterData(
        title = "Introduction to STL",
        description = "The Standard Template Library (STL) in C++ provides a collection of pre-built classes and functions for data structures and algorithms. It includes containers like `vector`, `map`, and `set`, iterators for traversal, and algorithms like `sort` and `search`, enabling efficient and reusable code development.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <algorithm>
        using namespace std;

        int main() {
            vector<int> numbers = {5, 1, 4, 2, 3};
            sort(numbers.begin(), numbers.end());
            for (int num : numbers) {
                cout << num << " ";
            }
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "1 2 3 4 5",
        route = "/cpp-stl-introduction"
    ),
    chapterData(
        title = "Containers (Vector, List, Deque, Set, Map)",
        description = "C++ STL provides various containers for storing and managing collections of data. `Vector` offers dynamic arrays, `List` supports doubly linked lists, `Deque` provides double-ended queues, `Set` ensures unique sorted elements, and `Map` stores key-value pairs with fast lookup, enhancing flexibility in data handling.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <list>
        #include <deque>
        #include <set>
        #include <map>
        using namespace std;

        int main() {
            // Vector
            vector<int> vec = {1, 2, 3};
            cout << "Vector: ";
            for (int v : vec) cout << v << " ";

            // List
            list<int> lst = {4, 5, 6};
            cout << "\\nList: ";
            for (int l : lst) cout << l << " ";

            // Deque
            deque<int> deq = {7, 8, 9};
            cout << "\\nDeque: ";
            for (int d : deq) cout << d << " ";

            // Set
            set<int> st = {10, 10, 11};
            cout << "\\nSet: ";
            for (int s : st) cout << s << " ";

            // Map
            map<string, int> mp = {{"Alice", 20}, {"Bob", 25}};
            cout << "\\nMap: ";
            for (auto m : mp) cout << m.first << ":" << m.second << " ";

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Vector: 1 2 3 
        List: 4 5 6 
        Deque: 7 8 9 
        Set: 10 11 
        Map: Alice:20 Bob:25
    """.trimIndent(),
        route = "/cpp-containers"
    ),
    chapterData(
        title = "Iterators",
        description = "Iterators in C++ are used to access elements of containers like arrays, vectors, and lists. They provide a standard way to traverse through elements in containers without exposing the underlying structure. Common iterator types include `begin()`, `end()`, and `rbegin()` for reverse iteration, enabling flexible and efficient traversal.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        using namespace std;

        int main() {
            vector<int> numbers = {1, 2, 3, 4, 5};
            
            // Using an iterator to traverse the vector
            cout << "Using Iterator: ";
            for (auto it = numbers.begin(); it != numbers.end(); ++it) {
                cout << *it << " ";
            }

            // Reverse iteration using rbegin()
            cout << "\\nUsing Reverse Iterator: ";
            for (auto it = numbers.rbegin(); it != numbers.rend(); ++it) {
                cout << *it << " ";
            }
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Using Iterator: 1 2 3 4 5 
        Using Reverse Iterator: 5 4 3 2 1
    """.trimIndent(),
        route = "/cpp-iterators"
    ),
    chapterData(
        title = "Algorithms",
        description = "C++ STL provides powerful algorithms such as `sort`, `find`, `binary_search`, and `accumulate` to manipulate data stored in containers. These algorithms work efficiently with iterators and help in performing common tasks like searching, sorting, and transforming data, reducing the need to manually implement them.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <algorithm>
        #include <numeric>
        using namespace std;

        int main() {
            vector<int> numbers = {5, 1, 4, 2, 3};

            // Sorting
            sort(numbers.begin(), numbers.end());
            cout << "Sorted: ";
            for (int num : numbers) cout << num << " ";

            // Finding an element
            auto it = find(numbers.begin(), numbers.end(), 4);
            if (it != numbers.end()) cout << "\\nFound 4 at position: " << distance(numbers.begin(), it);

            // Accumulating sum
            int sum = accumulate(numbers.begin(), numbers.end(), 0);
            cout << "\\nSum: " << sum;

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Sorted: 1 2 3 4 5 
        Found 4 at position: 3
        Sum: 15
    """.trimIndent(),
        route = "/cpp-algorithms"
    ),
    chapterData(
        title = "Functional Programming in C++",
        description = "C++ supports functional programming features such as lambdas, higher-order functions, and `std::function`. These features enable writing concise and expressive code by treating functions as first-class objects, facilitating cleaner and more modular code with functional techniques like map, filter, and reduce.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <algorithm>
        using namespace std;

        int main() {
            vector<int> numbers = {1, 2, 3, 4, 5};

            // Using lambda for doubling each element
            transform(numbers.begin(), numbers.end(), numbers.begin(), [](int n) { return n * 2; });

            cout << "Doubled numbers: ";
            for (int num : numbers) cout << num << " ";

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "Doubled numbers: 2 4 6 8 10",
        route = "/cpp-functional"
    ),
    chapterData(
        title = "File Input and Output Streams",
        description = "C++ provides file input/output functionality through `fstream` for reading from and writing to files. `ifstream` is used for reading, `ofstream` for writing, and `fstream` for both. These streams allow managing files efficiently, making it easy to store and retrieve data in programs.",
        inputCodeSnippet = """
        #include <iostream>
        #include <fstream>
        using namespace std;

        int main() {
            // Writing to a file
            ofstream outFile("example.txt");
            if (outFile.is_open()) {
                outFile << "Hello, C++ File I/O!";
                outFile.close();
            }

            // Reading from the file
            string line;
            ifstream inFile("example.txt");
            if (inFile.is_open()) {
                while (getline(inFile, line)) {
                    cout << line << endl;
                }
                inFile.close();
            }

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "Hello, C++ File I/O!",
        route = "/cpp-file-io"
    ),
    chapterData(
        title = "Reading and Writing to Files",
        description = "C++ provides functionality for reading from and writing to files using streams. `ofstream` is used for writing data to a file, while `ifstream` is used for reading. By using these streams, you can easily store data to files and read it back for further processing in your programs.",
        inputCodeSnippet = """
        #include <iostream>
        #include <fstream>
        using namespace std;

        int main() {
            // Writing to a file
            ofstream outFile("output.txt");
            if (outFile.is_open()) {
                outFile << "This is a test file written by C++.";
                outFile.close();
            }

            // Reading from the file
            string line;
            ifstream inFile("output.txt");
            if (inFile.is_open()) {
                while (getline(inFile, line)) {
                    cout << line << endl;
                }
                inFile.close();
            }

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "This is a test file written by C++.",
        route = "/cpp-read-write-files"
    ),
    chapterData(
        title = "File Pointers and Their Manipulation",
        description = "In C++, file pointers are used to control the position of reading and writing within a file. The `seekg` and `seekp` functions allow you to move the file pointer to specific positions for input and output operations. `tellg` and `tellp` return the current position of the pointer in the file.",
        inputCodeSnippet = """
        #include <iostream>
        #include <fstream>
        using namespace std;

        int main() {
            // Writing to a file
            ofstream outFile("example.txt");
            outFile << "C++ File Pointers and Manipulation!";
            outFile.close();

            // Reading from a file using file pointers
            ifstream inFile("example.txt");
            if (inFile.is_open()) {
                // Moving the pointer to the 10th character
                inFile.seekg(10, ios::beg);
                string content;
                getline(inFile, content);
                cout << "Content from position 10: " << content << endl;
                inFile.close();
            }

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = "Content from position 10: File Pointers and Manipulation!",
        route = "/cpp-file-pointers"
    ),
    chapterData(
        title = "Smart Pointers (unique_ptr, shared_ptr, weak_ptr)",
        description = "Smart pointers in C++ are used to manage dynamic memory automatically. `unique_ptr` ensures that only one pointer owns the resource, `shared_ptr` allows multiple pointers to share ownership, and `weak_ptr` avoids circular references by providing a non-owning reference to a `shared_ptr` object.",
        inputCodeSnippet = """
        #include <iostream>
        #include <memory>
        using namespace std;

        class MyClass {
        public:
            void display() { cout << "Smart Pointer Example!" << endl; }
        };

        int main() {
            // unique_ptr: unique ownership
            unique_ptr<MyClass> uptr = make_unique<MyClass>();
            uptr->display();

            // shared_ptr: shared ownership
            shared_ptr<MyClass> sptr1 = make_shared<MyClass>();
            shared_ptr<MyClass> sptr2 = sptr1;
            sptr1->display();
            cout << "Shared pointer use count: " << sptr1.use_count() << endl;

            // weak_ptr: non-owning reference
            weak_ptr<MyClass> wptr = sptr1;
            if (auto shared = wptr.lock()) {
                shared->display();
            } else {
                cout << "Weak pointer is expired." << endl;
            }

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Smart Pointer Example!
        Smart Pointer Example!
        Shared pointer use count: 2
        Smart Pointer Example!
    """.trimIndent(),
        route = "/cpp-smart-pointers"
    ),
    chapterData(
        title = "Lambda Expressions",
        description = "Lambda expressions in C++ provide a concise way to define anonymous functions, allowing you to pass behavior as arguments to algorithms. Lambdas can capture variables from the surrounding scope by reference or value and are useful for callbacks, event handling, and functional-style programming.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <algorithm>
        using namespace std;

        int main() {
            vector<int> numbers = {1, 2, 3, 4, 5};

            // Using lambda to double each number
            for_each(numbers.begin(), numbers.end(), [](int& n) { n *= 2; });

            cout << "Doubled numbers: ";
            for (int num : numbers) cout << num << " ";

            // Lambda with capturing variables
            int factor = 3;
            auto multiplyByFactor = [factor](int n) { return n * factor; };
            cout << "\\nMultiplying each by factor: ";
            for (int num : numbers) cout << multiplyByFactor(num) << " ";

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Doubled numbers: 2 4 6 8 10 
        Multiplying each by factor: 6 12 18 24 30
    """.trimIndent(),
        route = "/cpp-lambda-expressions"
    ),
    chapterData(
        title = "Move Semantics and rvalue References",
        description = "Move semantics in C++ optimize resource management by allowing the transfer of resources (such as memory) from one object to another without copying. rvalue references, denoted by `&&`, enable this transfer by distinguishing between lvalues (objects that can be assigned to) and rvalues (temporary objects that can be moved).",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        using namespace std;

        class MyClass {
        public:
            vector<int> data;

            // Constructor
            MyClass() {
                data.push_back(1);
                data.push_back(2);
            }

            // Move constructor
            MyClass(MyClass&& other) noexcept {
                data = move(other.data);
                cout << "Move constructor called!" << endl;
            }

            // Display function
            void display() {
                for (int d : data) cout << d << " ";
                cout << endl;
            }
        };

        int main() {
            MyClass obj1;
            obj1.display();

            // Using move constructor
            MyClass obj2 = move(obj1);
            obj2.display();

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        1 2 
        Move constructor called!
        1 2
    """.trimIndent(),
        route = "/cpp-move-semantics"
    ),
    chapterData(
        title = "Multithreading",
        description = "C++ provides multithreading capabilities through the `<thread>` header. Using threads, you can run multiple functions or tasks concurrently, improving the efficiency of programs, especially on multi-core processors. C++11 introduced a standardized way to handle threads, mutexes, and condition variables for synchronization.",
        inputCodeSnippet = """
        #include <iostream>
        #include <thread>
        using namespace std;

        // Function to be run in a thread
        void printHello() {
            cout << "Hello from the thread!" << endl;
        }

        int main() {
            // Creating a thread to run the printHello function
            thread t(printHello);

            // Wait for the thread to finish
            t.join();

            cout << "Main thread finished." << endl;
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Hello from the thread!
        Main thread finished.
    """.trimIndent(),
        route = "/cpp-multithreading"
    ),
    chapterData(
        title = "Mutex and Locks",
        description = "In C++, `mutex` (short for mutual exclusion) is used to protect shared data from being accessed by multiple threads simultaneously. Locks, such as `std::lock_guard` and `std::unique_lock`, help manage the locking and unlocking of mutexes, preventing race conditions and ensuring thread safety.",
        inputCodeSnippet = """
        #include <iostream>
        #include <thread>
        #include <mutex>
        using namespace std;

        mutex mtx;

        // Function to increment shared data safely
        void increment(int& counter) {
            lock_guard<mutex> lock(mtx); // Locking the mutex
            ++counter;
            cout << "Counter: " << counter << endl;
        }

        int main() {
            int counter = 0;

            // Creating multiple threads that access the shared counter
            thread t1(increment, ref(counter));
            thread t2(increment, ref(counter));
            thread t3(increment, ref(counter));

            // Joining threads
            t1.join();
            t2.join();
            t3.join();

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Counter: 1
        Counter: 2
        Counter: 3
    """.trimIndent(),
        route = "/cpp-mutex-locks"
    ),
    chapterData(
        title = "Memory Management and Garbage Collection",
        description = "C++ requires manual memory management using `new` and `delete` for dynamic memory allocation and deallocation. While C++ does not have automatic garbage collection, smart pointers like `unique_ptr`, `shared_ptr`, and `weak_ptr` provide memory management features, ensuring proper cleanup of resources and avoiding memory leaks.",
        inputCodeSnippet = """
        #include <iostream>
        #include <memory>
        using namespace std;

        class MyClass {
        public:
            MyClass() { cout << "Constructor called!" << endl; }
            ~MyClass() { cout << "Destructor called!" << endl; }
        };

        int main() {
            // Manual memory allocation and deallocation
            MyClass* ptr = new MyClass();
            delete ptr;

            // Using smart pointer for automatic memory management
            unique_ptr<MyClass> smartPtr = make_unique<MyClass>();

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Constructor called!
        Destructor called!
        Constructor called!
        Destructor called!
    """.trimIndent(),
        route = "/cpp-memory-management"
    ),
    chapterData(
        title = "Singleton Pattern",
        description = "The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This is commonly used in scenarios where only one instance of a class should exist, such as logging or configuration management. In C++, the Singleton is typically implemented using static members and private constructors.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        class Singleton {
        private:
            static Singleton* instance;
            Singleton() { cout << "Singleton instance created!" << endl; }

        public:
            // Static method to get the instance of the class
            static Singleton* getInstance() {
                if (instance == nullptr) {
                    instance = new Singleton();
                }
                return instance;
            }

            void displayMessage() { cout << "Singleton Pattern!" << endl; }
        };

        // Initialize the static member
        Singleton* Singleton::instance = nullptr;

        int main() {
            // Accessing the Singleton instance
            Singleton* s1 = Singleton::getInstance();
            s1->displayMessage();

            // Another access to ensure only one instance
            Singleton* s2 = Singleton::getInstance();
            s2->displayMessage();

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Singleton instance created!
        Singleton Pattern!
        Singleton Pattern!
    """.trimIndent(),
        route = "/cpp-singleton-pattern"
    ),
    chapterData(
        title = "Factory Pattern",
        description = "The Factory Pattern is a creational design pattern used to create objects without specifying the exact class of the object that will be created. It allows for the creation of different types of objects based on a given condition, typically through a factory method or a factory class.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        // Base class
        class Product {
        public:
            virtual void display() = 0;
        };

        // Derived classes
        class ProductA : public Product {
        public:
            void display() override { cout << "Product A created!" << endl; }
        };

        class ProductB : public Product {
        public:
            void display() override { cout << "Product B created!" << endl; }
        };

        // Factory class
        class ProductFactory {
        public:
            static Product* createProduct(char type) {
                if (type == 'A') {
                    return new ProductA();
                } else if (type == 'B') {
                    return new ProductB();
                }
                return nullptr;
            }
        };

        int main() {
            // Using factory to create products
            Product* p1 = ProductFactory::createProduct('A');
            p1->display();

            Product* p2 = ProductFactory::createProduct('B');
            p2->display();

            delete p1;
            delete p2;

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Product A created!
        Product B created!
    """.trimIndent(),
        route = "/cpp-factory-pattern"
    ),
    chapterData(
        title = "Observer Pattern",
        description = "The Observer Pattern is a behavioral design pattern where an object (subject) maintains a list of dependents (observers) that are notified of changes in the subject's state. This pattern is commonly used in event-driven systems, where the state of one object triggers updates to other objects.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <string>
        using namespace std;

        // Observer interface
        class Observer {
        public:
            virtual void update(const string& message) = 0;
        };

        // Concrete Observer class
        class ConcreteObserver : public Observer {
        private:
            string name;
        public:
            ConcreteObserver(const string& observerName) : name(observerName) {}
            void update(const string& message) override {
                cout << name << " received message: " << message << endl;
            }
        };

        // Subject class
        class Subject {
        private:
            vector<Observer*> observers;
        public:
            void addObserver(Observer* observer) {
                observers.push_back(observer);
            }

            void removeObserver(Observer* observer) {
                observers.erase(remove(observers.begin(), observers.end(), observer), observers.end());
            }

            void notifyObservers(const string& message) {
                for (auto observer : observers) {
                    observer->update(message);
                }
            }
        };

        int main() {
            Subject subject;
            ConcreteObserver observer1("Observer 1");
            ConcreteObserver observer2("Observer 2");

            subject.addObserver(&observer1);
            subject.addObserver(&observer2);

            subject.notifyObservers("Hello Observers!");

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Observer 1 received message: Hello Observers!
        Observer 2 received message: Hello Observers!
    """.trimIndent(),
        route = "/cpp-observer-pattern"
    ),
    chapterData(
        title = "Strategy Pattern",
        description = "The Strategy Pattern is a behavioral design pattern that allows an algorithm to be selected at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable, enabling the algorithm to be changed without altering the code that uses it.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        // Strategy interface
        class Strategy {
        public:
            virtual void execute() = 0;
        };

        // Concrete strategy classes
        class ConcreteStrategyA : public Strategy {
        public:
            void execute() override {
                cout << "Executing strategy A!" << endl;
            }
        };

        class ConcreteStrategyB : public Strategy {
        public:
            void execute() override {
                cout << "Executing strategy B!" << endl;
            }
        };

        // Context class
        class Context {
        private:
            Strategy* strategy;
        public:
            Context(Strategy* strategy) : strategy(strategy) {}

            void setStrategy(Strategy* newStrategy) {
                strategy = newStrategy;
            }

            void executeStrategy() {
                strategy->execute();
            }
        };

        int main() {
            ConcreteStrategyA strategyA;
            ConcreteStrategyB strategyB;

            // Creating context with initial strategy
            Context context(&strategyA);
            context.executeStrategy();

            // Changing strategy at runtime
            context.setStrategy(&strategyB);
            context.executeStrategy();

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Executing strategy A!
        Executing strategy B!
    """.trimIndent(),
        route = "/cpp-strategy-pattern"
    ),
    chapterData(
        title = "Debugging Techniques",
        description = "Debugging is an essential process in software development for identifying and resolving errors or issues in code. In C++, debugging can be done using various tools and techniques such as breakpoints, logging, step-through debugging, and using debugging tools like gdb.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int divide(int a, int b) {
            // Debugging: Check for divide by zero error
            if (b == 0) {
                cout << "Error: Division by zero!" << endl;
                return 0;
            }
            return a / b;
        }

        int main() {
            int num1 = 10, num2 = 0;
            // Setting a breakpoint here to inspect variables
            cout << "Result: " << divide(num1, num2) << endl;

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Error: Division by zero!
        Result: 0
    """.trimIndent(),
        route = "/cpp-debugging-techniques"
    ),
    chapterData(
        title = "Common Bugs in C++ and How to Avoid Them",
        description = "C++ developers often encounter bugs such as memory leaks, segmentation faults, uninitialized variables, and dangling pointers. These bugs can be avoided by following best practices such as proper memory management, using smart pointers, and ensuring correct use of pointers and references.",
        inputCodeSnippet = """
        #include <iostream>
        #include <memory>
        using namespace std;

        // Function to demonstrate memory leak
        void memoryLeakExample() {
            int* ptr = new int[100];  // Allocating memory but not deallocating
            // Missing delete[] ptr; to avoid memory leak
        }

        // Function to demonstrate using smart pointers
        void smartPointerExample() {
            unique_ptr<int[]> ptr = make_unique<int[]>(100);  // Smart pointer automatically frees memory
        }

        int main() {
            memoryLeakExample();  // This causes a memory leak
            smartPointerExample();  // No memory leak due to smart pointer
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        (No output, but memory leak occurs due to improper deallocation in memoryLeakExample)
    """.trimIndent(),
        route = "/cpp-common-bugs"
    ),
    chapterData(
        title = "Code Profiling and Optimization",
        description = "Code profiling involves analyzing the performance of a program to identify bottlenecks and inefficiencies. In C++, profiling tools like gprof, Valgrind, and Visual Studio Profiler can help track function execution times and memory usage. Optimization techniques include improving algorithm complexity and using appropriate data structures.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <chrono>
        using namespace std;

        // Function to calculate sum of vector elements
        int sumVector(const vector<int>& vec) {
            int sum = 0;
            for (int num : vec) {
                sum += num;
            }
            return sum;
        }

        int main() {
            vector<int> vec(1000000, 1);  // Vector of 1 million elements

            // Start profiling
            auto start = chrono::high_resolution_clock::now();

            int result = sumVector(vec);

            // End profiling
            auto end = chrono::high_resolution_clock::now();
            chrono::duration<double> duration = end - start;
            cout << "Sum: " << result << endl;
            cout << "Time taken: " << duration.count() << " seconds" << endl;

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        Sum: 1000000
        Time taken: 0.002345 seconds
    """.trimIndent(),
        route = "/cpp-code-profiling-optimization"
    ),
    chapterData(
        title = "Writing Clean and Maintainable Code",
        description = "Writing clean and maintainable code is essential for the long-term success of a software project. In C++, this involves following best practices such as using descriptive variable and function names, avoiding hardcoded values, and ensuring modularity and readability. Code should be well-commented and adhere to consistent formatting standards.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        using namespace std;

        // Function to calculate the average of a list of numbers
        double calculateAverage(const vector<int>& numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return static_cast<double>(sum) / numbers.size();
        }

        // Function to print the average result
        void printAverage(const vector<int>& numbers) {
            double avg = calculateAverage(numbers);
            cout << "The average is: " << avg << endl;
        }

        int main() {
            vector<int> numbers = {10, 20, 30, 40, 50};
            printAverage(numbers);
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        The average is: 30
    """.trimIndent(),
        route = "/cpp-clean-maintainable-code"
    ),
    chapterData(
        title = "Understanding Undefined Behavior",
        description = "Undefined behavior in C++ occurs when the program executes operations that are not defined by the C++ standard. This can lead to unpredictable results, crashes, or security vulnerabilities. Common examples include accessing out-of-bounds memory, dereferencing null pointers, or using uninitialized variables.",
        inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int main() {
            int* ptr = nullptr;
            
            // Undefined behavior: Dereferencing a null pointer
            cout << *ptr << endl;

            // Another example: Accessing out-of-bounds array
            int arr[5] = {1, 2, 3, 4, 5};
            cout << arr[10] << endl;  // Undefined behavior

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        (The program may crash or display garbage values)
    """.trimIndent(),
        route = "/cpp-undefined-behavior"
    ),
    chapterData(
        title = "Modern C++ Features (C++11, C++14, C++17, C++20)",
        description = "Modern C++ includes several features introduced in C++11, C++14, C++17, and C++20, which significantly improve the language's performance, safety, and usability. These features include smart pointers, lambda expressions, range-based for loops, constexpr, structured bindings, and concepts, making C++ more powerful and easier to use.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <algorithm>
        #include <memory>

        // C++11: Range-based for loop and auto keyword
        void rangeBasedForLoop() {
            std::vector<int> vec = {1, 2, 3, 4, 5};
            for (auto num : vec) {
                std::cout << num << " ";
            }
            std::cout << std::endl;
        }

        // C++11: Lambda expression
        void lambdaExpression() {
            std::vector<int> vec = {1, 2, 3, 4, 5};
            std::for_each(vec.begin(), vec.end(), [](int num) { std::cout << num * 2 << " "; });
            std::cout << std::endl;
        }

        // C++14: Return type deduction
        auto returnTypeDeduction() -> int {
            return 10;
        }

        // C++17: Structured bindings
        void structuredBindings() {
            std::tuple<int, double> tuple = {1, 3.14};
            auto [intVal, doubleVal] = tuple;
            std::cout << "Integer: " << intVal << ", Double: " << doubleVal << std::endl;
        }

        // C++20: Concept for type checking
        template<typename T>
        concept Integral = std::is_integral<T>::value;

        template<Integral T>
        void printInteger(T num) {
            std::cout << "Integer: " << num << std::endl;
        }

        int main() {
            rangeBasedForLoop();
            lambdaExpression();
            std::cout << "Return type deduction: " << returnTypeDeduction() << std::endl;
            structuredBindings();
            printInteger(100);  // C++20 Concept check
            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        1 2 3 4 5 
        2 4 6 8 10 
        Return type deduction: 10
        Integer: 1, Double: 3.14
        Integer: 100
    """.trimIndent(),
        route = "/cpp-modern-features"
    ),
    chapterData(
        title = "Using C++ in Competitive Programming",
        description = "C++ is widely used in competitive programming due to its efficiency, rich standard library, and support for advanced features like STL. The Standard Template Library (STL) provides data structures such as vectors, sets, maps, and algorithms that help solve problems efficiently. C++ also offers fast input/output operations, making it ideal for time-constrained environments.",
        inputCodeSnippet = """
        #include <iostream>
        #include <vector>
        #include <algorithm>
        using namespace std;

        // Function to find the sum of elements in a vector
        int sumVector(const vector<int>& vec) {
            int sum = 0;
            for (int num : vec) {
                sum += num;
            }
            return sum;
        }

        // Main function for competitive programming
        int main() {
            ios_base::sync_with_stdio(false);  // Faster I/O
            cin.tie(NULL);

            int n;
            cin >> n;  // Input size of array
            vector<int> arr(n);

            for (int i = 0; i < n; i++) {
                cin >> arr[i];  // Input array elements
            }

            // Output the sum of the array
            cout << sumVector(arr) << endl;

            return 0;
        }
    """.trimIndent(),
        outputCodeSnippet = """
        (Example input: 5
                        1 2 3 4 5)
        Output: 15
    """.trimIndent(),
        route = "/cpp-competitive-programming"
    )


)

@Composable
fun ChapterList(
    chapters: List<chapterData>,
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(chapters) { chapter ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {  navController.navigate(
                        "cppUiView/${Uri.encode(chapter.title)}/${Uri.encode(chapter.description)}/${Uri.encode(chapter.inputCodeSnippet)}/${Uri.encode(chapter.outputCodeSnippet)}"
                    ) },
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3F2FD),
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = chapter.title,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}
