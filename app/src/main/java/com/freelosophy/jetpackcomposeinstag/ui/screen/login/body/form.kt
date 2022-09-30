package com.freelosophy.jetpackcomposeinstag.ui.screen.login.body

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.*

@Composable
fun Email(email: String, modifier: Modifier, onTextChanged: (String) -> Unit) {
    TextField(
        maxLines = 1,
        singleLine = true,
//        label = { Text("Phone number, username or email") },
        placeholder = { Text("Phone number, username or email") },
        value = email,
        onValueChange = { onTextChanged(it) },
        modifier = modifier,
        keyboardOptions = KeyboardOptions.Default.copy(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = false,
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFFB2B2B2),
            backgroundColor = Color(0xFFF9F9F9),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun Password(password: String, modifier: Modifier, onTextChanged: (String) -> Unit) {
    var showPassword by remember { mutableStateOf(false) }
    TextField(
        maxLines = 1,
        singleLine = true,
//        label = { Text("Password") },
        placeholder = { Text("Password") },
        value = password,
        onValueChange = { onTextChanged(it) },
        modifier = modifier,
        keyboardOptions = KeyboardOptions.Default.copy(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = false,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Next
        ),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFFB2B2B2),
            backgroundColor = Color(0xFFF9F9F9),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        trailingIcon = {
            val image = if (!showPassword){
                Icons.Filled.VisibilityOff
            } else {
                Icons.Filled.Visibility
            }
            IconButton(onClick = { showPassword = !showPassword }){
                Icon(imageVector = image, contentDescription = "Botón ver mostrar/ocultar contraseña")
            }
        },
        visualTransformation = if (!showPassword)  PasswordVisualTransformation() else VisualTransformation.None,
    )
}
