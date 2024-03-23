package com.example.layoutjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutjc.ui.theme.LayoutJcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutJcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnRowColumnLayout()
                }
            }
        }
    }
}

@Composable
fun LearnRowColumnLayout(){
    // Overlap text
   /* Text(text = "Hello Column")
    Text(text = "Hello Row")
    Text(text = "Hello Box")*/

    //Show text in column or vertical
  /*  Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Column 1")
        Text(text = "Column 2")
    }*/

    //Show text in horizontal or Row
/*
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Text(text = "Row 1")
        Text(text = "Row 2")
        Text(text = "Row 3")
    }
*/

    //Box layout 
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier
            .height(300.dp)
            .width(300.dp)
            .background(Color.Blue)) {
            Text(text = "Box layout", modifier = Modifier.align(Alignment.Center), Color.White, fontStyle = FontStyle.Italic, fontSize = 30.sp )
        }
    }
}