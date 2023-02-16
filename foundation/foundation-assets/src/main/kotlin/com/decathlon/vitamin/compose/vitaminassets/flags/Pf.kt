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

public val FlagsGroup.Pf: ImageVector
    get() {
        if (_pf != null) {
            return _pf!!
        }
        _pf = Builder(name = "Pf", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFFE02639), 1.0f to Color(0xFFCA1A2C),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,5.33333f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDC2235), 1.0f to Color(0xFFCA1A2C),
                        start = Offset(14.0001f,14.6667f), end = Offset(14.0001f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 14.6667f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0001f,5.33333f), end = Offset(14.0001f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 5.3333f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFA135), 1.0f to Color(0xFFFD9C2D),
                        start = Offset(14.0002f,6.66667f), end = Offset(14.0002f,10.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3335f, 6.6667f)
                    horizontalLineTo(10.6669f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(17.3335f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 8.6667f)
                    horizontalLineTo(16.0f)
                    lineTo(15.3333f, 10.0f)
                    horizontalLineTo(12.6667f)
                    lineTo(12.0f, 8.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDF2034), 1.0f to Color(0xFFCA1A2C),
                        start = Offset(14.0f,6.66666f), end = Offset(14.0f,10.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.3333f, 6.6667f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(8.6604f)
                    curveTo(14.6667f, 9.0321f, 14.3574f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(13.6318f, 9.3333f, 13.3333f, 9.0479f, 13.3333f, 8.6604f)
                    verticalLineTo(6.6667f)
                    close()
                    moveTo(12.0f, 8.0f)
                    curveTo(12.0f, 8.0f, 13.0f, 10.0f, 14.0f, 10.0f)
                    curveTo(15.0f, 10.0f, 16.0f, 8.0f, 16.0f, 8.0f)
                    verticalLineTo(9.3333f)
                    curveTo(16.0f, 10.0697f, 15.4098f, 10.6667f, 14.6681f, 10.6667f)
                    horizontalLineTo(13.3319f)
                    curveTo(12.5963f, 10.6667f, 12.0f, 10.0748f, 12.0f, 9.3333f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0B4BAD), 1.0f to Color(0xFF08429A),
                        start = Offset(14.0001f,10.6667f), end = Offset(14.0001f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3334f, 10.6667f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6667f, 11.3333f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(11.3333f)
                    close()
                }
            }
        }
        .build()
        return _pf!!
    }

private var _pf: ImageVector? = null
