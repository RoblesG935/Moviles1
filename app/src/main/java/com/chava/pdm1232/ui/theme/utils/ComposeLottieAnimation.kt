package com.chava.pdm1232.ui.theme.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.chava.pdm1232.R

@Composable
fun ComposeLottieAnimation(modifier:Modifier){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_lmfkfwp9))
    LottieAnimation(
        modifier = Modifier,
        composition = composition,
        iterations = LottieConstants.IterateForever,
    )

}
@Composable
fun ComposeLottieAnimation2(modifier:Modifier){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.superman))
    LottieAnimation(
        modifier = Modifier,
        composition = composition,
        iterations = LottieConstants.IterateForever,
    )

}

