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

public val FlagsGroup.Pn: ImageVector
    get() {
        if (_pn != null) {
            return _pn!!
        }
        _pn = Builder(name = "Pn", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,1.52588E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF07319C), 1.0f to Color(0xFF00247E),
                        start = Offset(14.0f,1.52588E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1F8BDE), 1.0f to Color(0xFF1075C2),
                        start = Offset(20.6667f,8.00002f), end = Offset(20.6667f,17.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3334f, 12.6667f)
                    verticalLineTo(8.6795f)
                    curveTo(17.3334f, 8.3042f, 17.6198f, 8.0f, 17.997f, 8.0f)
                    horizontalLineTo(23.3364f)
                    curveTo(23.7029f, 8.0f, 24.0f, 8.3022f, 24.0f, 8.6795f)
                    verticalLineTo(12.6667f)
                    curveTo(24.0f, 16.0f, 20.6667f, 17.3333f, 20.6667f, 17.3333f)
                    curveTo(20.6667f, 17.3333f, 17.3334f, 16.0f, 17.3334f, 12.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF7E14A), 1.0f to Color(0xFFF7DE38),
                        start = Offset(20.6667f,8.00002f), end = Offset(20.6667f,18.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(16.6667f, 16.0f)
                    lineTo(20.6667f, 8.0f)
                    lineTo(24.6667f, 16.0f)
                    verticalLineTo(18.6667f)
                    horizontalLineTo(16.6667f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF4B8C36), 1.0f to Color(0xFF397127),
                        start = Offset(20.6667f,9.49074f), end = Offset(20.6667f,18.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3334f, 16.1574f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(16.1574f)
                    lineTo(20.6667f, 9.4907f)
                    lineTo(17.3334f, 16.1574f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.43254f,-1.2028f), end = Offset(5.43254f,10.5362f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0003f, 4.3067f)
                    lineTo(-1.8019f, -0.6666f)
                    horizontalLineTo(0.8806f)
                    lineTo(5.5473f, 2.6667f)
                    horizontalLineTo(6.4758f)
                    lineTo(12.667f, -1.2028f)
                    verticalLineTo(0.3334f)
                    curveTo(12.667f, 0.7367f, 12.4444f, 1.1687f, 12.1098f, 1.4077f)
                    lineTo(8.0003f, 4.3431f)
                    verticalLineTo(5.0267f)
                    lineTo(12.1833f, 8.6121f)
                    curveTo(12.7994f, 9.1403f, 12.455f, 10.0f, 11.667f, 10.0f)
                    curveTo(11.34f, 10.0f, 10.9407f, 9.8719f, 10.6682f, 9.6773f)
                    lineTo(6.4533f, 6.6667f)
                    horizontalLineTo(5.5248f)
                    lineTo(-0.6664f, 10.5362f)
                    verticalLineTo(8.3236f)
                    lineTo(4.0003f, 4.9903f)
                    verticalLineTo(4.3067f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.0f,1.52588E-5f), end = Offset(6.0f,9.33335f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6667f, 4.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(0.6667f)
                    lineTo(5.3333f, 3.3333f)
                    horizontalLineTo(6.6667f)
                    lineTo(12.0f, 0.0f)
                    verticalLineTo(0.3333f)
                    curveTo(12.0f, 0.5174f, 11.8846f, 0.7491f, 11.7221f, 0.8652f)
                    lineTo(7.3333f, 4.0f)
                    verticalLineTo(5.3334f)
                    lineTo(11.7491f, 9.1183f)
                    curveTo(11.8877f, 9.2371f, 11.8454f, 9.3334f, 11.6667f, 9.3334f)
                    curveTo(11.4826f, 9.3334f, 11.218f, 9.2509f, 11.0554f, 9.1348f)
                    lineTo(6.6667f, 6.0f)
                    horizontalLineTo(5.3333f)
                    lineTo(0.0f, 9.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(4.6667f, 5.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.33333f,1.52588E-5f), end = Offset(6.33333f,10.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.3333f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(9.3395f)
                    curveTo(4.6667f, 9.7043f, 4.9521f, 10.0f, 5.3396f, 10.0f)
                    horizontalLineTo(6.6604f)
                    curveTo(7.0321f, 10.0f, 7.3333f, 9.7123f, 7.3333f, 9.3395f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0127f)
                    curveTo(12.3739f, 6.0f, 12.6667f, 5.7146f, 12.6667f, 5.3271f)
                    verticalLineTo(4.0063f)
                    curveTo(12.6667f, 3.6346f, 12.3799f, 3.3333f, 12.0127f, 3.3333f)
                    horizontalLineTo(7.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.0f,1.52588E-5f), end = Offset(6.0f,9.33335f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 4.0f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(3.3333f)
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
            }
        }
        .build()
        return _pn!!
    }

private var _pn: ImageVector? = null
