package dev.abhishekagrahari.programming_mess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.navigation.compose.rememberNavController
import dev.abhishekagrahari.programming_mess.navigation.NavigationGraph



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           NavigationGraph(navController = rememberNavController())
        }
    }
}

