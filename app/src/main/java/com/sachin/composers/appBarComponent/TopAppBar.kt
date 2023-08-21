package com.sachin.composers.appBarComponent

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.sachin.composers.ui.theme.ComposerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(){
    androidx.compose.material3.TopAppBar(
        title = {
            Text(text = "TopAppBar", overflow = TextOverflow.Ellipsis)
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription =null )
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription =null )
            }
        }
    )
}

@Preview
@Composable
fun TopAppBarView(){
    ComposerTheme {
        TopAppBar()
    }
}