package com.compose.composetestapp.ui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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

class HugeCardUi {
    @Composable
    fun HugeCard() {
        ComposeTestAppTheme() {

                Column() {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.no_image),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(328.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .border(
                                1.dp,
                                MaterialTheme.colors.surface,
                                shape = RoundedCornerShape(16.dp)
                            )
                    )
                    Column(Modifier.padding(16.dp)) {

                        Text(
                            text = "20 июля",
                            style = MaterialTheme.typography.h6,
                        )
                        Text(
                            text = "Встреча с оленёнком Бемби в сафари парке \"Дикая природа\"",
                            style = MaterialTheme.typography.h5,
                            maxLines = 2
                        )
                    }
                }
            }
        }


    @Preview
    @Composable
    fun Preview() {
        HugeCard()
    }
}