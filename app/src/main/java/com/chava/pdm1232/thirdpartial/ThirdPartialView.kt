package com.chava.pdm1232

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun ThirdPartialView(){
    Box(modifier = Modifier.fillMaxSize()
    ){
        Text(text = stringResource(id = R.string.third_partial))


    }
}