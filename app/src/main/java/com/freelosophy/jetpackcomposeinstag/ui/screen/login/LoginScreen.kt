package com.freelosophy.jetpackcomposeinstag.ui.screen.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.freelosophy.jetpackcomposeinstag.ui.screen.login.body.Body
import com.freelosophy.jetpackcomposeinstag.ui.screen.login.footer.Footer
import com.freelosophy.jetpackcomposeinstag.ui.screen.login.header.Header
import com.freelosophy.jetpackcomposeinstag.ui.theme.JetpackComposeInstagTheme

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Header(
            modifier = Modifier
                .align(Alignment.TopEnd)
        )
        Body(
            modifier = Modifier
            .align(Alignment.Center)
            .fillMaxWidth()
        )
        Footer(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        )
    }
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