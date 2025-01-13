package dev.abhishekagrahari.programming_mess.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun baseLayout() {
    val primaryColor = Color(0xFF6200EA) // Custom Primary Color
    val onPrimaryColor = Color.White    // Custom On Primary Color
    val secondaryColor = Color(0xFF03DAC6) // Custom Secondary Color
    val surfaceColor = Color(0xFFF5F5F5)  // Custom Surface Color
    val onSurfaceColor = Color(0xFF000000) // Custom On Surface Color

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Read About C++",
                        style = TextStyle(
                            fontSize = 22.sp,
                            color = onPrimaryColor
                        )
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        // Add action for the hamburger icon
                    }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu Icon",
                            tint = onPrimaryColor
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = primaryColor
                )
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.TopStart
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFF8EC5E3)),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    cppUiView(title="Title" , description = "C++ is a versatile programming language widely used for building applications, from simple programs to complex systems. Known for its speed and efficiency, it offers powerful features like object-oriented programming, memory management, and high-level abstractions. Developers use C++ to create software for various industries, including gaming, finance, and embedded systems. Its extensive library support and platform independence make it a preferred choice for performance-critical applications. C++ encourages learning core programming concepts, making it a valuable skill for beginners and professionals alike. Despite its complexity, mastering C++ can open doors to advanced problem-solving and system-level programming." +
                            " With constant updates, C++ remains a vital tool in the rapidly evolving world of technology and software development." , inputCodeSnippet = "//Code Snippet" ,outputCodeSnippet= "")
                    // Welcome Text
                 Text(
                        text = "Welcome to the C++ Learning Page",
                        style = TextStyle(
                            fontSize = 24.sp,
                            color = primaryColor
                        ),
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    // Section Divider
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 8.dp),
                        thickness = 1.dp,
                        color = secondaryColor
                    )

                    // Informational Text
                    Text(
                        text = "Explore detailed chapters and advanced concepts to master C++ programming. Navigate through the sections using the menu.",
                        style = TextStyle(
                            fontSize = 16.sp,
                            color = onSurfaceColor
                        ),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    // Action Buttons
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Button(
                            onClick = { /* Navigate to beginner content */ },
                            colors = ButtonDefaults.buttonColors(containerColor = primaryColor, contentColor = onPrimaryColor)
                        ) {
                            Text("Beginner")
                        }

                        Button(
                            onClick = { /* Navigate to advanced content */ },
                            colors = ButtonDefaults.buttonColors(containerColor = secondaryColor, contentColor = onSurfaceColor)
                        ) {
                            Text("Advanced")
                        }
                    }
                }
            }
        }
    )
}
@Preview(showBackground=true)
@Composable
fun previewbaseLayout(){
    baseLayout()
}
