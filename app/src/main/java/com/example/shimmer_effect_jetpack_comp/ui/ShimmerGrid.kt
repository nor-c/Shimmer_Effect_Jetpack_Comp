package com.example.shimmer_effect_jetpack_comp.ui

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ShimmerGrid(brush: Brush){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(brush)
        )
        Spacer(
            modifier = Modifier
                .width(12.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth(fraction = 0.5f)
                    .background(brush)
            )
            Spacer(
                modifier = Modifier
                    .padding(8.dp)
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth(fraction = 0.95f)
                    .background(brush)
            )
            Spacer(
                modifier = Modifier
                    .padding(4.dp)
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth(fraction = 0.95f)
                    .background(brush)
            )
        }
    }
}
@Composable
@Preview(showBackground = true)
fun SimmerGridPreview(){
    ShimmerGrid(brush = Brush.linearGradient(
        listOf(
            Color.LightGray.copy(alpha = 0.9f),
            Color.LightGray.copy(alpha = 0.2f),
            Color.LightGray.copy(alpha = 0.9f)
        )
    ))
}

@Composable
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun SimmerGridNightPreview(){
    ShimmerGrid(
        brush = Brush.linearGradient(
            listOf(
                Color.LightGray.copy(alpha = 0.9f),
                Color.LightGray.copy(alpha = 0.2f),
                Color.LightGray.copy(alpha = 0.9f)
            )
        )
    )
}