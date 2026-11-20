package com.sazgar.generated.00236db9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.sazgar.generated.00236db9.ui.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isDark by remember { mutableStateOf(true) }
            val baseScheme = if (isDark) darkColorScheme() else lightColorScheme()
            MaterialTheme(
                colorScheme = baseScheme.copy(
                    primary = Color(0xFF0284C7),
                    secondary = Color(0xFF6D28D9)
                )
            ) {
                MainScreen(
                    isDarkTheme = isDark,
                    onToggleTheme = { isDark = !isDark }
                )
            }
        }
    }
}