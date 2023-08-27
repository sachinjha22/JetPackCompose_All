package com.sachin.composers.component.bottomSheet

import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sachin.composers.ui.theme.ComposerTheme
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetV() {
    val animationSpec = remember {
        Animatable(0f)
            .run {
                TweenSpec<Float>(durationMillis = 300)
            }
    }
    val coroutineScope = rememberCoroutineScope()
    val modalSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmValueChange = { it != ModalBottomSheetValue.HalfExpanded },
        skipHalfExpanded = false,
        animationSpec = animationSpec
    )

    ModalBottomSheetLayout(
        sheetState = modalSheetState,
        sheetShape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        modifier = Modifier.background(MaterialTheme.colors.background),
        sheetContent = {
            Column {
                Button(
                    onClick = {
                        coroutineScope.launch {
                            modalSheetState.hide()
                        }
                    }
                ) {
                    Text(text = "Hide Sheet")
                }
            }
        }
    ) {
        Scaffold {
            Box{
                Button(
                    onClick = {
                        coroutineScope.launch {
                            if (modalSheetState.isVisible)
                                modalSheetState.hide()
                            else
                                modalSheetState.show()
                        }
                    },
                ) {
                    Text(text = "Open Sheet")
                }
            }
        }

    }

}


@Preview
@Composable
fun ModalBottomSheetView() {
    ComposerTheme {
        ModalBottomSheetV()
    }
}