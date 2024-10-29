package com.example.movietrack.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainView() {
    Box(modifier = Modifier.fillMaxSize().padding(bottom = 20.dp)) {
        FloatingActionButton(
            modifier = Modifier.padding(16.dp)
                .align(Alignment.BottomCenter),
            onClick = {},
            shape = CircleShape,
            containerColor = Color.Red,
            contentColor = Color.White,
            elevation = FloatingActionButtonDefaults.elevation(10.dp),
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Add Item")
        }
    }
}

