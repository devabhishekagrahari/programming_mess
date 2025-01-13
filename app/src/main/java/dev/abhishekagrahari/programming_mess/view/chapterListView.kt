package dev.abhishekagrahari.programming_mess.view

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
            title = "Introduction to C++",
    description = """
        C++ is a powerful, general-purpose programming language created by Bjarne Stroustrup in the 1980s. 
        It extends the C language by adding object-oriented features like classes and objects, 
        enabling developers to write efficient and flexible code. C++ is widely used for developing system software, 
        game engines, applications requiring high-performance computation, and more.
         This chapter introduces the fundamentals of C++, including its syntax, key features, and basic structure. 
         Understanding C++ is essential for anyone interested in low-level programming and high-performance applications, 
         as it provides full control over system resources and memory management.
    """.trimIndent(),
    inputCodeSnippet = """
        #include <iostream>
        using namespace std;

        int main() {
            cout << "Hello, World!";
            return 0;
        }
    """.trimIndent(),
    outputCodeSnippet = "Hello, World!",
    route = "introduction"
    ),
    chapterData(
        title = "Basic Syntax and Structure",
        description = "Understand the basic syntax and structure of C++ programs.",
        inputCodeSnippet = """
            #include <iostream>
            using namespace std;

            int main() {
                cout << "This is basic syntax!";
                return 0;
            }
        """.trimIndent(),
        outputCodeSnippet = "This is basic syntax!",
        route = "basic_syntax"
    ),
    chapterData(
        title = "Control Flow",
        description = "Explore control flow structures like if-else, loops, and switch-case in C++.",
        inputCodeSnippet = """
            #include <iostream>
            using namespace std;

            int main() {
                int num = 10;
                if (num > 5) {
                    cout << "Number is greater than 5";
                } else {
                    cout << "Number is 5 or less";
                }
                return 0;
            }
        """.trimIndent(),
        outputCodeSnippet = "Number is greater than 5",
        route = "control_flow"
    ),
    chapterData(
        title = "Functions",
        description = "Learn how to create and use functions in C++ for better code organization.",
        inputCodeSnippet = """
            #include <iostream>
            using namespace std;

            int add(int a, int b) {
                return a + b;
            }

            int main() {
                cout << "Sum: " << add(5, 3);
                return 0;
            }
        """.trimIndent(),
        outputCodeSnippet = "Sum: 8",
        route = "functions"
    ),
    chapterData(
        title = "Arrays and Strings",
        description = "Learn how to use arrays and manipulate strings in C++.",
        inputCodeSnippet = """
            #include <iostream>
            using namespace std;

            int main() {
                string name = "C++";
                cout << "Welcome to " << name;
                return 0;
            }
        """.trimIndent(),
        outputCodeSnippet = "Welcome to C++",
        route = "arrays_strings"
    ),
    chapterData(
        title = "Pointers and References",
        description = "Understand pointers, references, and their applications in C++.",
        inputCodeSnippet = """
            #include <iostream>
            using namespace std;

            int main() {
                int a = 42;
                int* ptr = &a;
                cout << "Value: " << *ptr;
                return 0;
            }
        """.trimIndent(),
        outputCodeSnippet = "Value: 42",
        route = "pointers_references"
    ),
    chapterData(
        title = "Object-Oriented Programming",
        description = "Dive into classes, objects, and the core concepts of OOP in C++.",
        inputCodeSnippet = """
            #include <iostream>
            using namespace std;

            class Car {
            public:
                string brand;
                int year;

                void display() {
                    cout << "Brand: " << brand << ", Year: " << year;
                }
            };

            int main() {
                Car car1;
                car1.brand = "Toyota";
                car1.year = 2020;
                car1.display();
                return 0;
            }
        """.trimIndent(),
        outputCodeSnippet = "Brand: Toyota, Year: 2020",
        route = "oop"
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
                        "cppUiView/${chapter.title}/${chapter.description}/${chapter.inputCodeSnippet}/${chapter.outputCodeSnippet}"
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