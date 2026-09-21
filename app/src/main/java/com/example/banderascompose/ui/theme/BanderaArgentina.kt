package com.example.banderascompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaArgentina(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFF74ACDF))
            )
            Box (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color.White)
            )
            Box (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFF74ACDF))
            )
        }
        Box (
            modifier = Modifier
                .align(Alignment.Center)
                .size(50.dp)
                .clip(CircleShape)
                .background(Color(0xFFF6B40E))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaArgentinaPreview() {
    Surface {
        BanderaArgentina(modifier = Modifier.fillMaxSize())
    }
}