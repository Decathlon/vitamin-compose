package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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

public val FlagsGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0002f,1.52588E-5f), end = Offset(14.0002f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF72AFC8), 1.0f to Color(0xFF5D98B0),
                        start = Offset(14.0002f,1.52588E-5f), end = Offset(14.0002f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCD2F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0003f, 17.3334f)
                    lineTo(11.0575f, 17.6095f)
                    lineTo(11.3336f, 16.6667f)
                    lineTo(11.0575f, 15.7239f)
                    lineTo(12.0003f, 16.0f)
                    lineTo(12.9431f, 15.7239f)
                    lineTo(12.667f, 16.6667f)
                    lineTo(12.9431f, 17.6095f)
                    lineTo(12.0003f, 17.3334f)
                    close()
                    moveTo(16.0003f, 16.0f)
                    lineTo(15.0575f, 16.2762f)
                    lineTo(15.3336f, 15.3334f)
                    lineTo(15.0575f, 14.3906f)
                    lineTo(16.0003f, 14.6667f)
                    lineTo(16.9431f, 14.3906f)
                    lineTo(16.667f, 15.3334f)
                    lineTo(16.9431f, 16.2762f)
                    lineTo(16.0003f, 16.0f)
                    close()
                    moveTo(20.0003f, 16.0f)
                    lineTo(19.0575f, 16.2762f)
                    lineTo(19.3336f, 15.3334f)
                    lineTo(19.0575f, 14.3906f)
                    lineTo(20.0003f, 14.6667f)
                    lineTo(20.9431f, 14.3906f)
                    lineTo(20.667f, 15.3334f)
                    lineTo(20.9431f, 16.2762f)
                    lineTo(20.0003f, 16.0f)
                    close()
                    moveTo(22.667f, 13.3334f)
                    lineTo(21.7242f, 13.6095f)
                    lineTo(22.0003f, 12.6667f)
                    lineTo(21.7242f, 11.7239f)
                    lineTo(22.667f, 12.0f)
                    lineTo(23.6098f, 11.7239f)
                    lineTo(23.3336f, 12.6667f)
                    lineTo(23.6098f, 13.6095f)
                    lineTo(22.667f, 13.3334f)
                    close()
                    moveTo(25.3336f, 10.6667f)
                    lineTo(24.3908f, 10.9428f)
                    lineTo(24.667f, 10.0f)
                    lineTo(24.3908f, 9.0572f)
                    lineTo(25.3336f, 9.3334f)
                    lineTo(26.2764f, 9.0572f)
                    lineTo(26.0003f, 10.0f)
                    lineTo(26.2764f, 10.9428f)
                    lineTo(25.3336f, 10.6667f)
                    close()
                    moveTo(17.3336f, 12.0f)
                    lineTo(16.3908f, 12.2762f)
                    lineTo(16.667f, 11.3334f)
                    lineTo(16.3908f, 10.3906f)
                    lineTo(17.3336f, 10.6667f)
                    lineTo(18.2764f, 10.3906f)
                    lineTo(18.0003f, 11.3334f)
                    lineTo(18.2764f, 12.2762f)
                    lineTo(17.3336f, 12.0f)
                    close()
                    moveTo(20.0003f, 6.6667f)
                    lineTo(19.0575f, 6.9429f)
                    lineTo(19.3336f, 6.0f)
                    lineTo(19.0575f, 5.0572f)
                    lineTo(20.0003f, 5.3334f)
                    lineTo(20.9431f, 5.0572f)
                    lineTo(20.667f, 6.0f)
                    lineTo(20.9431f, 6.9429f)
                    lineTo(20.0003f, 6.6667f)
                    close()
                    moveTo(22.667f, 5.3334f)
                    lineTo(21.7242f, 5.6095f)
                    lineTo(22.0003f, 4.6667f)
                    lineTo(21.7242f, 3.7239f)
                    lineTo(22.667f, 4.0f)
                    lineTo(23.6098f, 3.7239f)
                    lineTo(23.3336f, 4.6667f)
                    lineTo(23.6098f, 5.6095f)
                    lineTo(22.667f, 5.3334f)
                    close()
                    moveTo(25.3336f, 4.0f)
                    lineTo(24.3908f, 4.2762f)
                    lineTo(24.667f, 3.3334f)
                    lineTo(24.3908f, 2.3906f)
                    lineTo(25.3336f, 2.6667f)
                    lineTo(26.2764f, 2.3906f)
                    lineTo(26.0003f, 3.3334f)
                    lineTo(26.2764f, 4.2762f)
                    lineTo(25.3336f, 4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0A17A7), 1.0f to Color(0xFF030E88),
                        start = Offset(6.00018f,1.52588E-5f), end = Offset(6.00018f,9.33335f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(12.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.43236f,-1.2028f), end = Offset(5.43236f,10.5362f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0001f, 4.3067f)
                    lineTo(-1.8021f, -0.6666f)
                    horizontalLineTo(0.8804f)
                    lineTo(5.5471f, 2.6667f)
                    horizontalLineTo(6.4756f)
                    lineTo(12.6668f, -1.2028f)
                    verticalLineTo(0.3334f)
                    curveTo(12.6668f, 0.7367f, 12.4442f, 1.1687f, 12.1097f, 1.4077f)
                    lineTo(8.0001f, 4.3431f)
                    verticalLineTo(5.0267f)
                    lineTo(12.1831f, 8.6121f)
                    curveTo(12.7992f, 9.1403f, 12.4548f, 10.0f, 11.6668f, 10.0f)
                    curveTo(11.3398f, 10.0f, 10.9405f, 9.8719f, 10.668f, 9.6773f)
                    lineTo(6.4531f, 6.6667f)
                    horizontalLineTo(5.5246f)
                    lineTo(-0.6666f, 10.5362f)
                    verticalLineTo(8.3236f)
                    lineTo(4.0001f, 4.9903f)
                    verticalLineTo(4.3067f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.00018f,1.52588E-5f), end = Offset(6.00018f,9.33335f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6669f, 4.0f)
                    lineTo(2.0E-4f, 0.0f)
                    horizontalLineTo(0.6668f)
                    lineTo(5.3335f, 3.3333f)
                    horizontalLineTo(6.6669f)
                    lineTo(12.0002f, 0.0f)
                    verticalLineTo(0.3333f)
                    curveTo(12.0002f, 0.5174f, 11.8848f, 0.7491f, 11.7222f, 0.8652f)
                    lineTo(7.3335f, 4.0f)
                    verticalLineTo(5.3334f)
                    lineTo(11.7493f, 9.1183f)
                    curveTo(11.8879f, 9.2371f, 11.8456f, 9.3334f, 11.6669f, 9.3334f)
                    curveTo(11.4828f, 9.3334f, 11.2182f, 9.2509f, 11.0556f, 9.1348f)
                    lineTo(6.6669f, 6.0f)
                    horizontalLineTo(5.3335f)
                    lineTo(2.0E-4f, 9.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(4.6669f, 5.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.33352f,1.52588E-5f), end = Offset(6.33352f,10.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(2.0E-4f, 3.3333f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6669f)
                    verticalLineTo(9.3395f)
                    curveTo(4.6669f, 9.7043f, 4.9522f, 10.0f, 5.3398f, 10.0f)
                    horizontalLineTo(6.6606f)
                    curveTo(7.0322f, 10.0f, 7.3335f, 9.7123f, 7.3335f, 9.3395f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0129f)
                    curveTo(12.3741f, 6.0f, 12.6669f, 5.7146f, 12.6669f, 5.3271f)
                    verticalLineTo(4.0063f)
                    curveTo(12.6669f, 3.6346f, 12.3801f, 3.3333f, 12.0129f, 3.3333f)
                    horizontalLineTo(7.3335f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6669f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(2.0E-4f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.00018f,1.52588E-5f), end = Offset(6.00018f,9.33335f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(2.0E-4f, 4.0f)
                    horizontalLineTo(5.3335f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6669f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0002f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6669f)
                    verticalLineTo(6.0f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(5.3335f)
                    verticalLineTo(6.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(4.0f)
                    close()
                }
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
