package com.whatminjacodes.goalgarden.todo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ToDoCard(
    data: ToDoCardData
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(size = 8.dp)
    ) {
        val (checkedState, onStateChange) = remember { mutableStateOf(true) }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(
                modifier = Modifier.padding(15.dp),
                checked = checkedState,
                onCheckedChange = null // null recommended for accessibility with screenreaders
            )

            Text(
                text = data.title,
                modifier = Modifier.weight(1f),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
fun ToDoCardPreview() {
    ToDoCard(data = ToDoCardData("Random Text"))
}