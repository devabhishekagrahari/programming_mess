package dev.abhishekagrahari.programming_mess.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview

@Composable
fun cppUiView(
    title: String,
    description: String,
    inputCodeSnippet: String,
    outputCodeSnippet: String
) {
    // State for input and output
    var programOutput by remember { mutableStateOf("Output will appear here") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(4.dp),
        horizontalAlignment = Alignment.Start
    ) {

        // Title
        Text(
            text = title,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Description
        Text(
            text = description,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                lineHeight = 22.sp
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // User Input Field
        Text(
            text = "Input:",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        // Code Snippet Display

        Text(
            text = inputCodeSnippet,
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace,
                color = Color(0xFF1E88E5),
                lineHeight = 20.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF5F5F5))
                .padding(12.dp)
        )


        Spacer(modifier = Modifier.height(16.dp))

        // Output Display
        Text(
            text = "Output:",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Execute Button
        Button(
            onClick = {
                // Replace this with actual program execution logic
                programOutput = outputCodeSnippet

            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Run Program")
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFE3F2FD))
                .padding(12.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = programOutput,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Monospace,
                    color = Color.Black
                )
            )
        }
    }
}
