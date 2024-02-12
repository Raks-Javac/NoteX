package com.example.notex.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notex.components.NoteTextField
import com.example.notex.ui.theme.NoteXTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
) {

    Column {
        TopAppBar(title = { }, actions = {

        })

        //TextFields
        NoteTextField(
            modifier = Modifier.padding(5.dp),
            text = "",
            onValueChanged = {

            },
            label = "",
        )

    }


}


@Preview(showBackground = true)
@Composable
fun NoteXPreview() {
    NoteXTheme {
        NoteScreen()
    }
}



