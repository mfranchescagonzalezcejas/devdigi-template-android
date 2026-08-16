package com.example.androidtemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { AndroidTemplateApp() }
    }
}

@Composable
private fun AndroidTemplateApp() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Text(
                text = stringResource(R.string.app_name),
                modifier = Modifier.safeDrawingPadding(),
            )
        }
    }
}
