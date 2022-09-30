package com.freelosophy.jetpackcomposeinstag.ui.screen.login.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freelosophy.jetpackcomposeinstag.R

@Composable
fun LoginDivider(modifier: Modifier){
    Row(
        modifier = modifier.padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Divider(
            Modifier.background(Color(0xFFF9F9F9)).height(1.dp).weight(1f)
        )
        Text(
            text = "or",
            modifier = Modifier.padding(12.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFB5B5B5)
        )
        Divider(
            Modifier.background(Color(0xFFF9F9F9)).height(1.dp).weight(1f)
        )
    }
}


@Composable
fun ImageLogo(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.insta),
        contentDescription = "Logo de Instagram",
        modifier = modifier
    )
}