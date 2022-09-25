package com.compose.composetestapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.compose.composetestapp.R
import com.compose.composetestapp.ui.theme.ComposeTestAppTheme

class SecondScreenUi {

    @Composable
    fun SecondScreen() {

        Column(Modifier.verticalScroll(rememberScrollState())) {
            Image(
                bitmap = ImageBitmap.imageResource(id = R.drawable.no_image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(304.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(Modifier.padding(horizontal = 16.dp)) {
                Text(text = "20.10.2022", style = MaterialTheme.typography.caption)
                Text(
                    text = "Двухэтажная Сауна! Бассейн, Бильярд, Караоке! ВеникиАкция! Час 850",
                    style = MaterialTheme.typography.h4
                )
                Spacer(modifier = Modifier.height(16.dp))
                Spacer(
                    modifier = Modifier
                        .border(Dp.Hairline, MaterialTheme.colors.surface)
                        .fillMaxWidth()
                        .height(0.5.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.app_fish),
                    style = MaterialTheme.typography.body2
                )
            }
        }
        Column(Modifier.padding(start = 20.dp, top = 44.dp)) {
            TextButton(
                onClick = { /*TODO*/ },
                Modifier
                    .border(1.dp, MaterialTheme.colors.background, CircleShape)
                    .clip(CircleShape)
                    .size(width = 40.dp, height = 40.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.background)

            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "",
                    Modifier.size(width = 24.dp, height = 24.dp)
                )
            }
        }
    }


    @Preview
    @Composable
    fun SecondScreenPreview() {
        ComposeTestAppTheme() {
            SecondScreen()
        }
    }
}