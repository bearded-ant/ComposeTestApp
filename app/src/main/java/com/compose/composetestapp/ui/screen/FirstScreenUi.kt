package com.compose.composetestapp.ui.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.composetestapp.R
import com.compose.composetestapp.ui.theme.*

class FirstScreenUi {
    @Composable
    fun FirstScreen() {

        val gradientWeather = Brush.horizontalGradient(listOf(weatherColorStart, weatherColorEnd))
        val gradientHelp = Brush.horizontalGradient(listOf(helpColorStart, helpColorEnd))
        val gradientMap = Brush.horizontalGradient(listOf(mapColorStart, mapColorEnd))

        Column() {
            Text(
                text = stringResource(id = R.string.home_screen),
                style = MaterialTheme.typography.h3
            )
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                GradientButton(
                    text = "+29C",
                    gradient = gradientWeather,
                    icon = R.drawable.ic_baseline_wb_sunny_24,
                    onClick = {},
                    contentDescription = "weather"
                )
                Spacer(modifier = Modifier.width(8.dp))
                GradientButton(
                    text = "О базе отдыха",
                    gradient = gradientHelp,
                    icon = R.drawable.ic_baseline_help_24,
                    onClick = {},
                    contentDescription = "about"
                )
                Spacer(modifier = Modifier.width(8.dp))
                GradientButton(
                    text = "Как добраться",
                    gradient = gradientMap,
                    icon = R.drawable.ic_baseline_map_24,
                    onClick = {},
                    contentDescription = "map"
                )
            }
        }
    }


    @Composable
    fun GradientButton(
        text: String,
        contentDescription: String,
        gradient: Brush,
        icon: Int,
        onClick: () -> Unit
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(),
            onClick = { onClick() })
        {
            Row(
                modifier = Modifier
                    .background(gradient)
                    .padding(horizontal = 16.dp, vertical = 8.dp)

            ) {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = contentDescription,
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = text,
                    color = Color.White,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
        }
    }


    @Preview
    @Composable
    fun FirstScreenPreview() {
        ComposeTestAppTheme {
            FirstScreen()
        }
    }
}