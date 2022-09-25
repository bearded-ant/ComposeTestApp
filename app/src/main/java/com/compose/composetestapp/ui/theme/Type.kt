package com.compose.composetestapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.compose.composetestapp.R

// Set of Material typography styles to start with

val robotoFontFamily = FontFamily(
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold),
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
        fontSize = 16.sp,
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Normal,
        textDecoration = TextDecoration.LineThrough,
        color = GraySubtitle
    ),
    subtitle2 = TextStyle(
        fontSize = 16.sp,
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Medium,
        color = RedSubtitle
    ),
    h6 = TextStyle(
        fontSize = 16.sp,
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Light,
    ),
    h5 = TextStyle(
        fontSize = 16.sp,
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Medium,
    )

)


/* Other default text styles to override
button = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.W500,
    fontSize = 14.sp
),
caption = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp
)
*/