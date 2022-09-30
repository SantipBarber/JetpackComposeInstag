package com.freelosophy.jetpackcomposeinstag.ui.screen

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freelosophy.jetpackcomposeinstag.R
import com.freelosophy.jetpackcomposeinstag.ui.theme.JetpackComposeInstagTheme

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header(
            Modifier
                .align(Alignment.TopEnd)
        )
        Body(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Email(email: String, onTextChanged: (String) -> Unit) {
    TextField(email, onValueChange = { onTextChanged(it) })
}

@Composable
fun Password(password: String, onTextChanged: (String) -> Unit) {
    TextField(password, onValueChange = { onTextChanged(it) })
}


@Composable
fun Body(modifier: Modifier) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    Column(modifier) {
        ImageLogo(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.size(16.dp))
        Email(email) { email = it }
        Spacer(modifier = Modifier.size(4.dp))
        Password(password) { password = it }
        Spacer(modifier = Modifier.size(8.dp))
        ForgotPassword(Modifier.align(Alignment.End))
    }
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "Forgot password?",
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF4EA8E9),
        modifier = modifier
    )

}


@Composable
fun ImageLogo(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.insta),
        contentDescription = "Logo de Instagram",
        modifier = modifier
    )
}

@Composable
fun Header(modifier: Modifier) {
    val activity = LocalContext.current as Activity
    Icon(
        imageVector = Icons.Default.Close,
        contentDescription = "",
        modifier = modifier.clickable { activity.finish() }
    )
}


@Preview(
    showBackground = true,
    device = Devices.PIXEL_XL,
    showSystemUi = true,
)
@Composable
fun LoginPreview() {
    JetpackComposeInstagTheme {
        LoginScreen()
    }
}