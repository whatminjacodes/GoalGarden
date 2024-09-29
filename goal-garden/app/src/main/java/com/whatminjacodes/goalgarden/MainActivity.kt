package com.whatminjacodes.goalgarden

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.whatminjacodes.goalgarden.ui.theme.GoalGardenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoalGardenTheme {
                NavGraph()
            }
        }
    }
}