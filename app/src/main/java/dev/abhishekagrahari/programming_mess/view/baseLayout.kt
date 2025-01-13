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
fun baseLayout(
    content: @Composable () -> Unit
) {
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
                     content()
                }
            }
        }
    )
}

