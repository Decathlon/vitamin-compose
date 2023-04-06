package com.decathlon.vitamin.compose.vitaminassets.flags

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

public val FlagsGroup.Kp: ImageVector
    get() {
        if (_kp != null) {
            return _kp!!
        }
        _kp = Builder(name = "Kp", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 13.3333f, -1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1461B6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 4.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1461B6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 18.6667f, 28.0f, 17.3333f, 28.0f, 16.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 17.3333f, -0.0f, 18.6667f, 0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 16.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF53846)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3332f, 10.0f)
                    curveTo(13.3332f, 11.841f, 11.8408f, 13.3334f, 9.9998f, 13.3334f)
                    curveTo(8.1589f, 13.3334f, 6.6665f, 11.841f, 6.6665f, 10.0f)
                    curveTo(6.6665f, 8.1591f, 8.1589f, 6.6667f, 9.9998f, 6.6667f)
                    lineTo(9.2136f, 8.9179f)
                    lineTo(6.8296f, 8.97f)
                    lineTo(8.7277f, 10.4134f)
                    lineTo(8.0406f, 12.6967f)
                    lineTo(9.9998f, 11.3376f)
                    lineTo(11.9591f, 12.6967f)
                    lineTo(11.2719f, 10.4134f)
                    lineTo(13.17f, 8.97f)
                    lineTo(10.786f, 8.9179f)
                    lineTo(9.9998f, 6.6667f)
                    curveTo(11.8408f, 6.6667f, 13.3332f, 8.1591f, 13.3332f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _kp!!
    }

private var _kp: ImageVector? = null
