package com.pablo.jetpackcomposenavigation3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pablo.jetpackcomposenavigation3.advance_navigation3.AdvanceNavigation3Wrapper
import com.pablo.jetpackcomposenavigation3.ui.theme.JetpackComposeNavigation3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeNavigation3Theme {
                AdvanceNavigation3Wrapper()
            }
        }
    }
}