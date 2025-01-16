package com.watsidev.barcaoneclone.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.watsidev.barcaoneclone.R

val DharmaSlab = FontFamily(
    Font(R.font.dharmaslabe_regular),
    Font(R.font.dharmaslabe_bold, FontWeight.Bold)
)

val BarcelonaFont = FontFamily(
    Font(R.font.barcelona_regular),
    Font(R.font.barcelona_bold, FontWeight.Bold)
)

val BarcelonaCondensed = FontFamily(
    Font(R.font.barcelona_condenced_regular)
)
// Set of Material typography styles to start with
val Typography = Typography(
    displayMedium = TextStyle(
        fontFamily = BarcelonaFont,
        letterSpacing = ((-0.75).sp),
        lineHeight = 32.sp,
        color = Color.White
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        lineHeight = 32.sp,
        color = Color.White,
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        color = Color.White
    ),
    labelMedium = TextStyle(
        fontFamily = DharmaSlab,
        fontSize = 20.sp,
        color = Color.White,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    ),
    labelSmall = TextStyle(
        fontFamily = DharmaSlab,
        fontSize = 14.sp,
        color = Color.White,
        textAlign = TextAlign.Center
    ),

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)