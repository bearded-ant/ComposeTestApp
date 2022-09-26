package com.compose.composetestapp.ui.screen


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.composetestapp.R
import com.compose.composetestapp.ui.cards.BigCardUi
import com.compose.composetestapp.ui.cards.HugeCardUi
import com.compose.composetestapp.ui.cards.SmallCardUi
import com.compose.composetestapp.ui.theme.*

class FirstScreenUi {
    @Composable
    fun FirstScreen() {
        ComposeTestAppTheme {
            Column(
                Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp)
            ) {
                Header()
                FirstDataBlock()
                SecondDataBlock()
                ThirdDataBlock()
                FourthDataBlock()
                FifthDataBlock()
            }
        }
    }

    @Composable
    private fun Header() {

        Text(
            text = stringResource(id = R.string.home_screen),
            style = MaterialTheme.typography.h3
        )
        Spacer(modifier = Modifier.height(24.dp))
        showTopGradientButtons()
        Spacer(modifier = Modifier.height(24.dp))
    }

    @Composable
    private fun FifthDataBlock() {
        SubtitleWithButton()
        Spacer(modifier = Modifier.height(16.dp))
        BigCardUi().BigCard()
        SpacerWithLine(height = 23)
    }

    @Composable
    private fun FourthDataBlock() {
        Text(
            text = stringResource(id = R.string.buildings_and_numbers),
            style = MaterialTheme.typography.h2
        )
        Spacer(modifier = Modifier.height(16.dp))
        //todo загрузить контент
        //2 колонки мидлкарточка
        SpacerWithLine(height = 23)
    }

    @Composable
    private fun ThirdDataBlock() {
        Spacer(modifier = Modifier.height(24.dp))
        SubtitleWithButton()
        Spacer(modifier = Modifier.height(16.dp))

        //todo загрузить данные
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(
                modifier = Modifier
                    .height(96.dp)
                    .width(304.dp)
            ) {
                Row(modifier = Modifier.padding(8.dp)) {
                    SmallCardUi().SmallCard()
                }

            }
            Spacer(modifier = Modifier.height(8.dp))
            Card(modifier = Modifier.padding(8.dp)) {
                SmallCardUi().SmallCard()
            }
            Spacer(modifier = Modifier.height(8.dp))
            Card(modifier = Modifier.padding(8.dp)) {
                SmallCardUi().SmallCard()
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
        //todo_end
        SpacerWithLine(23)
    }

    @Composable
    private fun SecondDataBlock() {
        Spacer(modifier = Modifier.height(24.dp))
        HugeCardUi().HugeCard()
        SpacerWithLine(height = 23)
    }

    @Composable
    private fun FirstDataBlock() {
        Text(
            text = stringResource(id = R.string.buildings_and_numbers),
            style = MaterialTheme.typography.h2
        )
        Spacer(modifier = Modifier.height(16.dp))
        //todo загрузить контент
        Column() {
            for (i in 1..5) {
                SmallCardUi().SmallCard()
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = buttonBackground),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.show_all),
                color = buttonContent,
                style = MaterialTheme.typography.subtitle2
            )
        }
        SpacerWithLine(height = 23)
    }

    @Composable
    private fun showTopGradientButtons() {

        val gradientWeather = Brush.horizontalGradient(listOf(weatherColorStart, weatherColorEnd))
        val gradientHelp = Brush.horizontalGradient(listOf(helpColorStart, helpColorEnd))
        val gradientMap = Brush.horizontalGradient(listOf(mapColorStart, mapColorEnd))

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


    @Composable
    private fun SpacerWithLine(height: Int) {
        Spacer(modifier = Modifier.height(height.dp))
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .border(1.dp, MaterialTheme.colors.surface)
                .fillMaxWidth()
        )
    }


    @Composable
    private fun SubtitleWithButton() {
        Row() {
            Column(
                modifier = Modifier
                    .weight(1F)
                    .align(CenterVertically)
            ) {
                Text(
                    text = stringResource(id = R.string.buildings_and_numbers),
                    style = MaterialTheme.typography.h2,
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(CenterVertically)
            ) {
                Text(
                    text = "Все 20",
                    color = buttonContent,
                    style = MaterialTheme.typography.body2
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
            onClick = { onClick() },
            modifier = Modifier.height(40.dp)
        )
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


    @Preview(heightDp = 2000, showBackground = true)
    @Composable
    fun FirstScreenPreview() {
        ComposeTestAppTheme {
            FirstScreen()
        }
    }
}