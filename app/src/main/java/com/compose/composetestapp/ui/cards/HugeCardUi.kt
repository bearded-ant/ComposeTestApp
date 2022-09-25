package com.compose.composetestapp.ui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
                Spacer(modifier = Modifier
                    .height(1.dp)
                    .border(1.dp, MaterialTheme.colors.surface)
                    .fillMaxWidth())
                Spacer(modifier = Modifier.height(23.dp))
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
                Spacer(modifier = Modifier.height(23.dp))
                Spacer(modifier = Modifier
                    .height(1.dp)
                    .border(1.dp, MaterialTheme.colors.surface)
                    .fillMaxWidth())
            }
        }
    }


    @Preview
    @Composable
    fun Preview() {
        HugeCard()
    }
}