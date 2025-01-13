package dev.abhishekagrahari.programming_mess.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Public
import androidx.compose.material3.*
import androidx.compose.material3.DividerDefaults.color

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.abhishekagrahari.programming_mess.R

@Composable
fun ContactUsScreen() {
    val primaryColor = Color(0xFF6200EA) // Custom Primary Color

    // Outer column for the whole screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFF2F4F7)),
        horizontalAlignment = Alignment.Start
    ) {

        // Contact Information Cards
        ContactItem("Phone", "+123 456 7890", Icons.Filled.Phone)

        ContactItem("Email", "contact@programmingmess.com", Icons.Filled.Email)

        ContactItem("Address", "123, Programming Mess Street, City, Country", Icons.Filled.LocationOn)

        ContactItem("Social Media", "@programming_mess", Icons.Filled.Public)

        Spacer(modifier = Modifier.height(16.dp))

        // Additional information or button can be added below
        Button(
            onClick = { /* Handle the click */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = primaryColor)
        ) {
            Text(text = "Reach Out", color = Color.White)
        }
    }
}

@Composable
fun ContactItem(label: String, value: String, icon: ImageVector) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { /* Handle click event here */ },
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icon
            Icon(
                imageVector = icon,
                contentDescription = label,
                modifier = Modifier.size(32.dp),
                tint = Color.Gray
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Text Information
            Column {
                Text(
                    text = label,
                    style = TextStyle(fontSize = 14.sp, color = Color.Gray)
                )
                Text(
                    text = value,
                    style = TextStyle(fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
                )
            }
        }
    }
}

