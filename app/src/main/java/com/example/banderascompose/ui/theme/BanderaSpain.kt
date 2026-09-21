package com.example.banderascompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaSpain(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFAA151B))
        )
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(Color(0xFFF1BF00))
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFAA151B))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSpainPreview() {
    Surface {
        BanderaSpain(modifier = Modifier.fillMaxSize())
    }
}