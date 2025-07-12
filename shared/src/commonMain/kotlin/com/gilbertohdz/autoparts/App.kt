package com.gilbertohdz.autoparts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.gilbertohdz.autoparts.theme.MyApplicationTheme

@Composable
fun App() {

    MyApplicationTheme(true) {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) {
            val greeting by remember {
                mutableStateOf(Greeting().greet())
            }
            Column(
                modifier = Modifier.fillMaxSize().padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(greeting)
            }
        }
    }
}