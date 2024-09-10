package com.example.a501hw1q2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MyButton()
                }
            }
        }
    }
}
@Composable
fun MyButton() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End,
    ) {
        val context = LocalContext.current

        Button(
            onClick = {
                Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.padding(0.dp),
            enabled = true,
            shape = RoundedCornerShape(100.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Magenta
            ),
            border = BorderStroke(width = 10.dp, brush = SolidColor(Color.Red)),
            contentPadding = PaddingValues(
                start = 10.dp,
                top = 8.dp,
                end = 10.dp,
                bottom = 8.dp
            ),
            interactionSource = remember { MutableInteractionSource() }
        ) {
            Text(
                text = "PRESS ME NOW",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        MyButton()
    }
}