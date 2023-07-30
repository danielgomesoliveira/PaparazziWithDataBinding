package com.test.paparazziwithdatabinding.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun AvatarGlideImage(
    modifier: Modifier = Modifier,
    size: Dp = 28.dp
) {
    Column {
        GlideImage(
            modifier = modifier
                .size(size)
                .background(Color.Black),
            imageModel = { "url" },
            loading = {
                Text(text = "LP", color = Color.White)
            },
            failure = {
                Text(text = "FP", color = Color.White)
            }
        )
    }

}