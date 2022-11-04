package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//                    Greeting()
            UserInfo(name = "Dennis", age = 46)
        }
    }
}

@Composable
fun Greeting() {
    val name = "John"
    Text(text = "Hello $name!")
}

@Composable
fun UserInfo(name: String, age: Int) {
    Text(text = "Hello, $name. You are $age years old")
}