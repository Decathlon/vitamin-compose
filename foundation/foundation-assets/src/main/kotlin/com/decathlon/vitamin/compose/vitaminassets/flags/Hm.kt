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

public val FlagsGroup.Hm: ImageVector
    get() {
        if (_hm != null) {
            return _hm!!
        }
        _hm = Builder(name = "Hm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,3.05176E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0A17A7), 1.0f to Color(0xFF030E88),
                        start = Offset(14.0f,3.05176E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 16.3334f)
                    lineTo(4.8244f, 16.9514f)
                    lineTo(5.049f, 15.6424f)
                    lineTo(4.0979f, 14.7153f)
                    lineTo(5.4122f, 14.5244f)
                    lineTo(6.0f, 13.3334f)
                    lineTo(6.5878f, 14.5244f)
                    lineTo(7.9021f, 14.7153f)
                    lineTo(6.9511f, 15.6424f)
                    lineTo(7.1756f, 16.9514f)
                    lineTo(6.0f, 16.3334f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.43229f,-1.20279f), end = Offset(5.43229f,10.5362f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0001f, 4.3067f)
                    lineTo(-1.8021f, -0.6666f)
                    horizontalLineTo(0.8804f)
                    lineTo(5.547f, 2.6667f)
                    horizontalLineTo(6.4755f)
                    lineTo(12.6667f, -1.2028f)
                    verticalLineTo(0.3334f)
                    curveTo(12.6667f, 0.7367f, 12.4442f, 1.1688f, 12.1096f, 1.4077f)
                    lineTo(8.0f, 4.3431f)
                    verticalLineTo(5.0268f)
                    lineTo(12.183f, 8.6122f)
                    curveTo(12.7992f, 9.1403f, 12.4548f, 10.0f, 11.6667f, 10.0f)
                    curveTo(11.3398f, 10.0f, 10.9404f, 9.872f, 10.6679f, 9.6773f)
                    lineTo(6.4531f, 6.6667f)
                    horizontalLineTo(5.5246f)
                    lineTo(-0.6666f, 10.5362f)
                    verticalLineTo(8.3236f)
                    lineTo(4.0001f, 4.9903f)
                    verticalLineTo(4.3067f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.0f,3.05176E-5f), end = Offset(6.0f,9.33336f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6667f, 4.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(0.6667f)
                    lineTo(5.3333f, 3.3334f)
                    horizontalLineTo(6.6667f)
                    lineTo(12.0f, 0.0f)
                    verticalLineTo(0.3334f)
                    curveTo(12.0f, 0.5175f, 11.8846f, 0.7491f, 11.7221f, 0.8652f)
                    lineTo(7.3333f, 4.0f)
                    verticalLineTo(5.3334f)
                    lineTo(11.7491f, 9.1183f)
                    curveTo(11.8877f, 9.2371f, 11.8454f, 9.3334f, 11.6667f, 9.3334f)
                    curveTo(11.4826f, 9.3334f, 11.218f, 9.251f, 11.0554f, 9.1348f)
                    lineTo(6.6667f, 6.0f)
                    horizontalLineTo(5.3333f)
                    lineTo(0.0f, 9.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(4.6667f, 5.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.33333f,3.05176E-5f), end = Offset(6.33333f,10.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.3334f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(9.3395f)
                    curveTo(4.6667f, 9.7043f, 4.9521f, 10.0f, 5.3396f, 10.0f)
                    horizontalLineTo(6.6604f)
                    curveTo(7.0321f, 10.0f, 7.3333f, 9.7124f, 7.3333f, 9.3395f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0127f)
                    curveTo(12.3739f, 6.0f, 12.6667f, 5.7147f, 12.6667f, 5.3271f)
                    verticalLineTo(4.0063f)
                    curveTo(12.6667f, 3.6346f, 12.3799f, 3.3334f, 12.0127f, 3.3334f)
                    horizontalLineTo(7.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(3.3334f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.0f,3.05176E-5f), end = Offset(6.0f,9.33336f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 4.0f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(3.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(3.3334f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(6.0f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(6.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0001f, 17.3334f)
                    lineTo(19.0573f, 17.6095f)
                    lineTo(19.3334f, 16.6667f)
                    lineTo(19.0573f, 15.7239f)
                    lineTo(20.0001f, 16.0f)
                    lineTo(20.9429f, 15.7239f)
                    lineTo(20.6667f, 16.6667f)
                    lineTo(20.9429f, 17.6095f)
                    lineTo(20.0001f, 17.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0001f, 4.6667f)
                    lineTo(19.0573f, 4.9429f)
                    lineTo(19.3334f, 4.0001f)
                    lineTo(19.0573f, 3.0573f)
                    lineTo(20.0001f, 3.3334f)
                    lineTo(20.9429f, 3.0573f)
                    lineTo(20.6667f, 4.0001f)
                    lineTo(20.9429f, 4.9429f)
                    lineTo(20.0001f, 4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(24.0001f, 8.6667f)
                    lineTo(23.0573f, 8.9429f)
                    lineTo(23.3334f, 8.0001f)
                    lineTo(23.0573f, 7.0573f)
                    lineTo(24.0001f, 7.3334f)
                    lineTo(24.9429f, 7.0573f)
                    lineTo(24.6667f, 8.0001f)
                    lineTo(24.9429f, 8.9429f)
                    lineTo(24.0001f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0001f, 10.0f)
                    lineTo(15.0573f, 10.2762f)
                    lineTo(15.3334f, 9.3334f)
                    lineTo(15.0573f, 8.3906f)
                    lineTo(16.0001f, 8.6667f)
                    lineTo(16.9429f, 8.3906f)
                    lineTo(16.6667f, 9.3334f)
                    lineTo(16.9429f, 10.2762f)
                    lineTo(16.0001f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(22.0f, 11.6667f)
                    lineTo(21.5286f, 11.8048f)
                    lineTo(21.6666f, 11.3334f)
                    lineTo(21.5286f, 10.862f)
                    lineTo(22.0f, 11.0001f)
                    lineTo(22.4714f, 10.862f)
                    lineTo(22.3333f, 11.3334f)
                    lineTo(22.4714f, 11.8048f)
                    lineTo(22.0f, 11.6667f)
                    close()
                }
            }
        }
        .build()
        return _hm!!
    }

private var _hm: ImageVector? = null
