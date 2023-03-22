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
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Dm: ImageVector
    get() {
        if (_dm != null) {
            return _dm!!
        }
        _dm = Builder(name = "Dm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF108753)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF108753)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6667f, 20.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFCD449)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3333f, 20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE02C42), 1.0f to Color(0xFFD22036),
                        start = Offset(9.33333f,5.33334f), end = Offset(9.33333f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 14.6667f)
                    curveTo(16.5773f, 14.6667f, 18.6667f, 12.5773f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 7.4227f, 16.5773f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(11.4227f, 5.3333f, 9.3333f, 7.4227f, 9.3333f, 10.0f)
                    curveTo(9.3333f, 12.5773f, 11.4227f, 14.6667f, 14.0f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0E673F)),
                        strokeLineWidth = 1.33333f, strokeLineCap = Round, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 13.3333f)
                    curveTo(15.841f, 13.3333f, 17.3333f, 11.8409f, 17.3333f, 10.0f)
                    curveTo(17.3333f, 8.159f, 15.841f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(12.1591f, 6.6667f, 10.6667f, 8.159f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 11.8409f, 12.1591f, 13.3333f, 14.0f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E673F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 11.3333f)
                    curveTo(14.7364f, 11.3333f, 14.6667f, 10.7364f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 9.2636f, 14.7364f, 8.6667f, 14.0f, 8.6667f)
                    curveTo(13.2636f, 8.6667f, 13.3333f, 9.2636f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 10.7364f, 13.2636f, 11.3333f, 14.0f, 11.3333f)
                    close()
                }
            }
        }
        .build()
        return _dm!!
    }

private var _dm: ImageVector? = null
