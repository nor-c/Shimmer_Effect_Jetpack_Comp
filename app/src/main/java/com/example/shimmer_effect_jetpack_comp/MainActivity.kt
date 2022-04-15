package com.example.shimmer_effect_jetpack_comp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shimmer_effect_jetpack_comp.ui.ShimmerEffect
import com.example.shimmer_effect_jetpack_comp.ui.theme.Shimmer_Effect_Jetpack_CompTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Shimmer_Effect_Jetpack_CompTheme( darkTheme = true) {
                Surface(color = MaterialTheme.colors.background){
                    LazyColumn {
                        repeat(8){
                            item {
                                ShimmerEffect()
                            }
                        }
                    }
                }
            }
        }
    }
}
