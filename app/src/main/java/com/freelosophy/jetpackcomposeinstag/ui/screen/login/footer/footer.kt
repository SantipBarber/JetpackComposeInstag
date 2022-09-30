package com.freelosophy.jetpackcomposeinstag.ui.screen.login.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Footer(modifier: Modifier) {
    Column(
        modifier = modifier) {
        Divider(
            modifier
                .background(Color(0xFFF9F9F9))
                .height(1.dp)
        )
        Spacer(modifier = modifier.size(24.dp))
        Signup(modifier)
        Spacer(modifier = modifier.size(24.dp))
    }
}


@Composable
fun Signup(modifier: Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            color = Color.LightGray,
            fontWeight = FontWeight.Bold,
            text = "Don't have an account?",
            fontSize = 12.sp
        )
        Text(
            modifier = Modifier.padding(horizontal = 12.dp),
            text = "Sign up.",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4EA8E9),
        )
    }
}
