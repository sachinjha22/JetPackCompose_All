package com.sachin.composers.appBarComponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sachin.composers.ui.theme.ComposerTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MediumTopAppBar() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        androidx.compose.material3.MediumTopAppBar(
            title = {
                Text(
                    text = "Medium TopApp Bar",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            },
            navigationIcon = {
                IconButtonImage(Icons.Filled.ArrowBack)
            },
            actions = {
                Row {
                    IconButtonImage(Icons.Filled.Notifications)
                    IconButtonImage(Icons.Filled.DateRange)
                    IconButtonImage(Icons.Filled.Settings)
                }
            }
        )
        Divider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.onSurface)
    }
}

@Composable
fun IconButtonImage(imageVector: ImageVector) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            imageVector = imageVector,
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun MediumTopAppBarView() {
    ComposerTheme {
        MediumTopAppBar()
    }
}