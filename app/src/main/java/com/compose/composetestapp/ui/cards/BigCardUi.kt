package com.compose.composetestapp.ui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.composetestapp.R
import com.compose.composetestapp.ui.theme.ComposeTestAppTheme

class BigCardUi {
    @Composable
    fun BigCard() {
        ComposeTestAppTheme() {
            Card(
                shape = MaterialTheme.shapes.large,
                elevation = 4.dp,
                backgroundColor = MaterialTheme.colors.background
            ) {
                Column() {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.no_image),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(304.dp)
                            .height(200.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 8.dp,
                                    topEnd = 8.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 0.dp
                                )
                            )
                            .border(
                                1.dp,
                                MaterialTheme.colors.surface,
                                shape = RoundedCornerShape(
                                    topStart = 8.dp,
                                    topEnd = 8.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 0.dp
                                )
                            )
                    )
                    Column(Modifier.padding(16.dp)) {

                        Text(
                            text = "Дом 2 гостей",
                            style = MaterialTheme.typography.body1,
                        )
                        Text(
                            text = "Молодежная",
                            style = MaterialTheme.typography.body2
                        )
                        Row() {
                            Text(
                                text = "2500R",
                                style = MaterialTheme.typography.subtitle1
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "2000R",
                                style = MaterialTheme.typography.subtitle2
                            )
                            Text(
                                text = "/ночь",
                                style = MaterialTheme.typography.subtitle2
                            )
                        }
                    }
                }
            }
        }

    }

    @Preview
    @Composable
    fun Preview() {
        BigCard()
    }
}