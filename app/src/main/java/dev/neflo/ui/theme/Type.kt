package dev.neflo.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val alataFont = FontFamily(
    Font(R.font.alata_regular, FontWeight.Light),
    Font(R.font.alata_regular, FontWeight.Normal),
    Font(R.font.alata_regular, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.alata_regular, FontWeight.Medium),
    Font(R.font.alata_regular, FontWeight.Bold)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Bold,
        fontSize = 57.sp,
        lineHeight = 64.sp
    ),
    h2 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    h3 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),
    h4 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    h5 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    h6 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ),
    body1 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    body2 = TextStyle(
        fontFamily = alataFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    )
)
