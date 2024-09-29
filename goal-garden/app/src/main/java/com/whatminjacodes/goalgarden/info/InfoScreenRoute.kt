package com.whatminjacodes.goalgarden.info

import androidx.compose.runtime.Composable

@Composable
fun InfoScreenRoute (
    OnOpenAppClicked :() -> Unit
){
    StartScreen(OnOpenAppClick = OnOpenAppClicked)
}