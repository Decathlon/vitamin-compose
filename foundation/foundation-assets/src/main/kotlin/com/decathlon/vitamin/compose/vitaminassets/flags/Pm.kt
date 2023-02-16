package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Pm: ImageVector
    get() {
        if (_pm != null) {
            return _pm!!
        }
        _pm = Builder(name = "Pm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF138E16), 1.0f to Color(0xFF0F7F12),
                        start = Offset(13.9999f,13.3333f), end = Offset(13.9999f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9999f, 13.3333f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF26A7DC), 1.0f to Color(0xFF1B94C6),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(9.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFBCD3F), 1.0f to Color(0xFFFFCE2F),
                        start = Offset(18.6665f,4.1189f), end = Offset(18.6665f,13.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(23.1006f, 8.5716f)
                    curveTo(24.4705f, 8.235f, 25.3332f, 8.1456f, 25.3332f, 9.3333f)
                    curveTo(25.3332f, 11.5425f, 22.3484f, 13.3333f, 18.6665f, 13.3333f)
                    curveTo(14.9846f, 13.3333f, 11.9999f, 11.5425f, 11.9999f, 9.3333f)
                    curveTo(11.9999f, 8.1456f, 12.8626f, 8.235f, 14.2325f, 8.5716f)
                    curveTo(14.1456f, 8.3349f, 14.0729f, 8.084f, 14.0172f, 7.822f)
                    curveTo(13.6345f, 6.0213f, 14.2f, 4.3753f, 15.2805f, 4.1457f)
                    curveTo(16.3609f, 3.916f, 17.547f, 5.1896f, 17.9298f, 6.9903f)
                    curveTo(18.1102f, 7.8392f, 18.0799f, 8.6536f, 17.8843f, 9.3015f)
                    curveTo(18.1409f, 9.3219f, 18.4019f, 9.3333f, 18.6665f, 9.3333f)
                    curveTo(18.9312f, 9.3333f, 19.1922f, 9.3219f, 19.4488f, 9.3015f)
                    curveTo(19.2532f, 8.6536f, 19.2229f, 7.8392f, 19.4033f, 6.9903f)
                    curveTo(19.786f, 5.1896f, 20.9722f, 3.916f, 22.0526f, 4.1457f)
                    curveTo(23.1331f, 4.3753f, 23.6986f, 6.0213f, 23.3159f, 7.822f)
                    curveTo(23.2602f, 8.084f, 23.1875f, 8.3349f, 23.1006f, 8.5716f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(18.6667f,14.6665f), end = Offset(18.6667f,17.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(21.0352f, 17.2629f)
                    curveTo(21.2229f, 17.3568f, 21.4438f, 17.3568f, 21.6315f, 17.2629f)
                    lineTo(24.2981f, 15.9296f)
                    curveTo(24.6274f, 15.7649f, 24.7609f, 15.3645f, 24.5963f, 15.0352f)
                    curveTo(24.4316f, 14.7059f, 24.0312f, 14.5724f, 23.7018f, 14.737f)
                    lineTo(21.3333f, 15.9213f)
                    lineTo(18.9648f, 14.737f)
                    curveTo(18.7771f, 14.6432f, 18.5562f, 14.6432f, 18.3685f, 14.737f)
                    lineTo(16.0f, 15.9213f)
                    lineTo(13.6315f, 14.737f)
                    curveTo(13.3021f, 14.5724f, 12.9017f, 14.7059f, 12.737f, 15.0352f)
                    curveTo(12.5724f, 15.3645f, 12.7059f, 15.7649f, 13.0352f, 15.9296f)
                    lineTo(15.7018f, 17.2629f)
                    curveTo(15.8895f, 17.3568f, 16.1104f, 17.3568f, 16.2981f, 17.2629f)
                    lineTo(18.6666f, 16.0787f)
                    lineTo(21.0352f, 17.2629f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF03633), 1.0f to Color(0xFFD82A28),
                        start = Offset(4.66667f,0.0f), end = Offset(4.66667f,6.66667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.3333f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF2AA854), 1.0f to Color(0xFF219447),
                        start = Offset(4.74981f,-2.15707f), end = Offset(4.57386f,8.25927f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6668f, 2.3905f)
                    lineTo(0.8956f, -1.3807f)
                    lineTo(-0.0472f, -0.4379f)
                    lineTo(3.724f, 3.3333f)
                    lineTo(-0.0472f, 7.1046f)
                    lineTo(0.8956f, 8.0474f)
                    lineTo(4.6668f, 4.2761f)
                    lineTo(8.438f, 8.0474f)
                    lineTo(9.3808f, 7.1046f)
                    lineTo(5.6096f, 3.3333f)
                    lineTo(9.3808f, -0.4379f)
                    lineTo(8.438f, -1.3807f)
                    lineTo(4.6668f, 2.3905f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(4.66654f,-1.33333f), end = Offset(4.66654f,8.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(5.3332f, 2.6667f)
                    verticalLineTo(-1.3333f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(5.3332f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(9.3332f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(5.3332f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(4.66654f,6.66667f), end = Offset(4.66654f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.3332f, 6.6667f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(9.3332f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(4.66659f,8.0f), end = Offset(4.66659f,12.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.9999f, 9.3333f)
                    curveTo(1.6317f, 9.3333f, 1.3333f, 9.0349f, 1.3333f, 8.6667f)
                    curveTo(1.3333f, 8.2985f, 1.6317f, 8.0f, 1.9999f, 8.0f)
                    curveTo(2.3681f, 8.0f, 2.6666f, 8.2985f, 2.6666f, 8.6667f)
                    curveTo(2.6666f, 9.0349f, 2.3681f, 9.3333f, 1.9999f, 9.3333f)
                    close()
                    moveTo(4.6666f, 9.3333f)
                    curveTo(4.2984f, 9.3333f, 3.9999f, 9.0349f, 3.9999f, 8.6667f)
                    curveTo(3.9999f, 8.2985f, 4.2984f, 8.0f, 4.6666f, 8.0f)
                    curveTo(5.0348f, 8.0f, 5.3333f, 8.2985f, 5.3333f, 8.6667f)
                    curveTo(5.3333f, 9.0349f, 5.0348f, 9.3333f, 4.6666f, 9.3333f)
                    close()
                    moveTo(7.3333f, 9.3333f)
                    curveTo(6.9651f, 9.3333f, 6.6666f, 9.0349f, 6.6666f, 8.6667f)
                    curveTo(6.6666f, 8.2985f, 6.9651f, 8.0f, 7.3333f, 8.0f)
                    curveTo(7.7014f, 8.0f, 7.9999f, 8.2985f, 7.9999f, 8.6667f)
                    curveTo(7.9999f, 9.0349f, 7.7014f, 9.3333f, 7.3333f, 9.3333f)
                    close()
                    moveTo(5.9999f, 12.0f)
                    curveTo(5.6317f, 12.0f, 5.3333f, 11.7015f, 5.3333f, 11.3333f)
                    curveTo(5.3333f, 10.9651f, 5.6317f, 10.6667f, 5.9999f, 10.6667f)
                    curveTo(6.3681f, 10.6667f, 6.6666f, 10.9651f, 6.6666f, 11.3333f)
                    curveTo(6.6666f, 11.7015f, 6.3681f, 12.0f, 5.9999f, 12.0f)
                    close()
                    moveTo(3.3333f, 12.0f)
                    curveTo(2.9651f, 12.0f, 2.6666f, 11.7015f, 2.6666f, 11.3333f)
                    curveTo(2.6666f, 10.9651f, 2.9651f, 10.6667f, 3.3333f, 10.6667f)
                    curveTo(3.7014f, 10.6667f, 3.9999f, 10.9651f, 3.9999f, 11.3333f)
                    curveTo(3.9999f, 11.7015f, 3.7014f, 12.0f, 3.3333f, 12.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFD7181D), 1.0f to Color(0xFFC60E13),
                        start = Offset(4.66654f,13.3333f), end = Offset(4.66654f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.3332f, 13.3333f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(9.3332f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFBCD3F), 1.0f to Color(0xFFFECB2F),
                        start = Offset(4.66659f,14.6667f), end = Offset(4.66659f,18.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6666f, 16.0f)
                    curveTo(2.8256f, 16.0f, 1.3333f, 15.7015f, 1.3333f, 15.3333f)
                    curveTo(1.3333f, 14.9651f, 2.8256f, 14.6667f, 4.6666f, 14.6667f)
                    curveTo(6.5075f, 14.6667f, 7.9999f, 14.9651f, 7.9999f, 15.3333f)
                    curveTo(7.9999f, 15.7015f, 6.5075f, 16.0f, 4.6666f, 16.0f)
                    close()
                    moveTo(4.6666f, 18.6667f)
                    curveTo(2.8256f, 18.6667f, 1.3333f, 18.3682f, 1.3333f, 18.0f)
                    curveTo(1.3333f, 17.6318f, 2.8256f, 17.3333f, 4.6666f, 17.3333f)
                    curveTo(6.5075f, 17.3333f, 7.9999f, 17.6318f, 7.9999f, 18.0f)
                    curveTo(7.9999f, 18.3682f, 6.5075f, 18.6667f, 4.6666f, 18.6667f)
                    close()
                }
            }
        }
        .build()
        return _pm!!
    }

private var _pm: ImageVector? = null
