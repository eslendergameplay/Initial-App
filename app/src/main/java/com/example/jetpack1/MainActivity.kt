package com.example.jetpack1

import android.os.Bundle
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack1.ui.theme.Jetpack1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Text(text = "Hola Mundo", textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth().padding(top= 400.dp,start = 40.dp, end = 40.dp, bottom = 300.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack1Theme {
        Greeting("Android")
    }
}