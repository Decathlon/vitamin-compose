package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
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
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.9999f, 0.0f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF138E16), 1.0f to Color(0xFF0F7F12),
                        start = Offset(13.9998f,-0.0176392f), end = Offset(13.9998f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9998f, 13.3333f)
                    horizontalLineTo(-2.0E-4f)
                    lineTo(-1.0E-4f, 20.0f)
                    horizontalLineTo(27.9999f)
                    lineTo(27.9998f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF26A7DC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(0.0f)
                    lineTo(9.3334f, -0.0f)
                    lineTo(-1.0E-4f, 0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF03633)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3334f, -0.0f)
                    lineTo(-1.0E-4f, 0.0f)
                    lineTo(-0.0f, 6.6666f)
                    horizontalLineTo(9.3333f)
                    lineTo(9.3334f, -0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2AA854)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6667f, 2.3905f)
                    lineTo(2.2495f, -0.0176f)
                    lineTo(0.3818f, -0.0054f)
                    lineTo(3.7239f, 3.3333f)
                    lineTo(0.4063f, 6.6718f)
                    horizontalLineTo(2.1763f)
                    lineTo(4.6667f, 4.2761f)
                    lineTo(7.1201f, 6.684f)
                    horizontalLineTo(9.0244f)
                    lineTo(5.6096f, 3.3333f)
                    lineTo(9.0122f, 0.0068f)
                    lineTo(7.0713f, -0.0054f)
                    lineTo(4.6667f, 2.3905f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3332f, 2.6667f)
                    verticalLineTo(-0.0176f)
                    horizontalLineTo(3.9998f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(3.9998f)
                    verticalLineTo(6.6718f)
                    horizontalLineTo(5.3332f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(9.3332f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(5.3332f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBCD3F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(23.1005f, 8.5715f)
                    curveTo(24.4705f, 8.235f, 25.3332f, 8.1456f, 25.3332f, 9.3333f)
                    curveTo(25.3332f, 11.5424f, 22.3484f, 13.3333f, 18.6665f, 13.3333f)
                    curveTo(14.9846f, 13.3333f, 11.9998f, 11.5424f, 11.9998f, 9.3333f)
                    curveTo(11.9998f, 8.1456f, 12.8625f, 8.235f, 14.2325f, 8.5715f)
                    curveTo(14.1456f, 8.3349f, 14.0729f, 8.084f, 14.0172f, 7.822f)
                    curveTo(13.6344f, 6.0212f, 14.2f, 4.3753f, 15.2804f, 4.1456f)
                    curveTo(16.3608f, 3.916f, 17.547f, 5.1896f, 17.9298f, 6.9903f)
                    curveTo(18.1102f, 7.8392f, 18.0799f, 8.6536f, 17.8843f, 9.3015f)
                    curveTo(18.1408f, 9.3219f, 18.4019f, 9.3333f, 18.6665f, 9.3333f)
                    curveTo(18.9311f, 9.3333f, 19.1922f, 9.3219f, 19.4487f, 9.3015f)
                    curveTo(19.2531f, 8.6536f, 19.2228f, 7.8392f, 19.4032f, 6.9903f)
                    curveTo(19.786f, 5.1896f, 20.9721f, 3.916f, 22.0526f, 4.1456f)
                    curveTo(23.133f, 4.3753f, 23.6986f, 6.0212f, 23.3158f, 7.822f)
                    curveTo(23.2601f, 8.084f, 23.1874f, 8.3349f, 23.1005f, 8.5715f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0352f, 17.2629f)
                    curveTo(21.2229f, 17.3568f, 21.4438f, 17.3568f, 21.6314f, 17.2629f)
                    lineTo(24.2981f, 15.9296f)
                    curveTo(24.6274f, 15.7649f, 24.7609f, 15.3645f, 24.5963f, 15.0352f)
                    curveTo(24.4316f, 14.7058f, 24.0312f, 14.5724f, 23.7018f, 14.737f)
                    lineTo(21.3333f, 15.9213f)
                    lineTo(18.9648f, 14.737f)
                    curveTo(18.7771f, 14.6432f, 18.5562f, 14.6432f, 18.3685f, 14.737f)
                    lineTo(16.0f, 15.9213f)
                    lineTo(13.6315f, 14.737f)
                    curveTo(13.3021f, 14.5724f, 12.9017f, 14.7058f, 12.737f, 15.0352f)
                    curveTo(12.5724f, 15.3645f, 12.7058f, 15.7649f, 13.0352f, 15.9296f)
                    lineTo(15.7018f, 17.2629f)
                    curveTo(15.8895f, 17.3568f, 16.1104f, 17.3568f, 16.2981f, 17.2629f)
                    lineTo(18.6666f, 16.0787f)
                    lineTo(21.0352f, 17.2629f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3333f, 6.6666f)
                    horizontalLineTo(-0.0f)
                    lineTo(-2.0E-4f, 13.3333f)
                    lineTo(9.3332f, 13.3333f)
                    lineTo(9.3333f, 6.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.9998f, 9.3333f)
                    curveTo(1.6316f, 9.3333f, 1.3331f, 9.0349f, 1.3331f, 8.6667f)
                    curveTo(1.3331f, 8.2985f, 1.6316f, 8.0f, 1.9998f, 8.0f)
                    curveTo(2.368f, 8.0f, 2.6665f, 8.2985f, 2.6665f, 8.6667f)
                    curveTo(2.6665f, 9.0349f, 2.368f, 9.3333f, 1.9998f, 9.3333f)
                    close()
                    moveTo(4.6665f, 9.3333f)
                    curveTo(4.2983f, 9.3333f, 3.9998f, 9.0349f, 3.9998f, 8.6667f)
                    curveTo(3.9998f, 8.2985f, 4.2983f, 8.0f, 4.6665f, 8.0f)
                    curveTo(5.0346f, 8.0f, 5.3331f, 8.2985f, 5.3331f, 8.6667f)
                    curveTo(5.3331f, 9.0349f, 5.0346f, 9.3333f, 4.6665f, 9.3333f)
                    close()
                    moveTo(7.3331f, 9.3333f)
                    curveTo(6.9649f, 9.3333f, 6.6665f, 9.0349f, 6.6665f, 8.6667f)
                    curveTo(6.6665f, 8.2985f, 6.9649f, 8.0f, 7.3331f, 8.0f)
                    curveTo(7.7013f, 8.0f, 7.9998f, 8.2985f, 7.9998f, 8.6667f)
                    curveTo(7.9998f, 9.0349f, 7.7013f, 9.3333f, 7.3331f, 9.3333f)
                    close()
                    moveTo(5.9998f, 12.0f)
                    curveTo(5.6316f, 12.0f, 5.3331f, 11.7015f, 5.3331f, 11.3333f)
                    curveTo(5.3331f, 10.9651f, 5.6316f, 10.6667f, 5.9998f, 10.6667f)
                    curveTo(6.368f, 10.6667f, 6.6665f, 10.9651f, 6.6665f, 11.3333f)
                    curveTo(6.6665f, 11.7015f, 6.368f, 12.0f, 5.9998f, 12.0f)
                    close()
                    moveTo(3.3331f, 12.0f)
                    curveTo(2.9649f, 12.0f, 2.6665f, 11.7015f, 2.6665f, 11.3333f)
                    curveTo(2.6665f, 10.9651f, 2.9649f, 10.6667f, 3.3331f, 10.6667f)
                    curveTo(3.7013f, 10.6667f, 3.9998f, 10.9651f, 3.9998f, 11.3333f)
                    curveTo(3.9998f, 11.7015f, 3.7013f, 12.0f, 3.3331f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD7181D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3332f, 13.3333f)
                    lineTo(-2.0E-4f, 13.3333f)
                    lineTo(-1.0E-4f, 20.0f)
                    lineTo(9.3331f, 20.0f)
                    lineTo(9.3332f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBCD3F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6665f, 16.0f)
                    curveTo(2.8255f, 16.0f, 1.3331f, 15.7015f, 1.3331f, 15.3333f)
                    curveTo(1.3331f, 14.9651f, 2.8255f, 14.6667f, 4.6665f, 14.6667f)
                    curveTo(6.5074f, 14.6667f, 7.9998f, 14.9651f, 7.9998f, 15.3333f)
                    curveTo(7.9998f, 15.7015f, 6.5074f, 16.0f, 4.6665f, 16.0f)
                    close()
                    moveTo(4.6665f, 18.6667f)
                    curveTo(2.8255f, 18.6667f, 1.3331f, 18.3682f, 1.3331f, 18.0f)
                    curveTo(1.3331f, 17.6318f, 2.8255f, 17.3333f, 4.6665f, 17.3333f)
                    curveTo(6.5074f, 17.3333f, 7.9998f, 17.6318f, 7.9998f, 18.0f)
                    curveTo(7.9998f, 18.3682f, 6.5074f, 18.6667f, 4.6665f, 18.6667f)
                    close()
                }
            }
        }
        .build()
        return _pm!!
    }

private var _pm: ImageVector? = null
