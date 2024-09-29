package com.whatminjacodes.goalgarden.todo

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val dataList = listOf(
    ToDoCardData("Do this"),
    ToDoCardData("And this"),
    ToDoCardData("And this too")
)

@Composable
fun ToDoScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "To Do list:",
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            color = Color.Black,
            modifier = Modifier.padding(20.dp)
        )

        LazyColumn(
            modifier = Modifier.padding(top = 70.dp, start = 20.dp, end = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            items(dataList) { data ->
                ToDoCard(data = data)
            }
        }

    }
}

@Preview
@Composable
fun ToDoScreenPreview() {
    ToDoScreen()
}
