package com.example.banderascompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaColombia(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(Color(0xFFFCD116))
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFF003893))
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFCE1126))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    Surface {
        BanderaColombia(modifier = Modifier.fillMaxSize())
    }
}