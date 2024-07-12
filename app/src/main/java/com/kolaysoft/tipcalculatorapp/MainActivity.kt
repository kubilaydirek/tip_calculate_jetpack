package com.kolaysoft.tipcalculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kolaysoft.tipcalculatorapp.ui.components.MainPage
import com.kolaysoft.tipcalculatorapp.ui.theme.TipCalculatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MainContent()
            }
        }
    }
}


@Composable
fun MyApp(modifier: Modifier = Modifier, mainContent: @Composable () -> Unit) {
    TipCalculatorAppTheme {
        Scaffold(modifier = modifier.fillMaxSize()) { innerpadding ->
            Column(modifier = modifier.fillMaxSize().padding(innerpadding)) {
                mainContent()
            }
        }
    }
}

@Preview
@Composable
private fun MainContent() {
    MainPage()
}