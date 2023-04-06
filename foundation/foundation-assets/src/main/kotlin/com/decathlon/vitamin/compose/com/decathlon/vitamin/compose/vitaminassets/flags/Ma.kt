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

public val FlagsGroup.Ma: ImageVector
    get() {
        if (_ma != null) {
            return _ma!!
        }
        _ma = Builder(name = "Ma", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, -1.0E-4f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE33B44)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0A6135)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.7026f)
                    lineTo(15.0589f, 11.4574f)
                    lineTo(14.6682f, 10.2171f)
                    lineTo(15.7133f, 9.4433f)
                    lineTo(14.413f, 9.4316f)
                    lineTo(14.0f, 8.1986f)
                    lineTo(13.587f, 9.4316f)
                    lineTo(12.2867f, 9.4433f)
                    lineTo(13.3318f, 10.2171f)
                    lineTo(12.9411f, 11.4574f)
                    lineTo(14.0f, 10.7026f)
                    close()
                    moveTo(10.4733f, 14.8541f)
                    lineTo(11.7745f, 10.7231f)
                    lineTo(8.2937f, 8.1459f)
                    lineTo(12.6246f, 8.1069f)
                    lineTo(14.0f, 4.0f)
                    lineTo(15.3754f, 8.1069f)
                    lineTo(19.7063f, 8.1459f)
                    lineTo(16.2255f, 10.7231f)
                    lineTo(17.5267f, 14.8541f)
                    lineTo(14.0f, 12.34f)
                    lineTo(10.4733f, 14.8541f)
                    close()
                }
            }
        }
        .build()
        return _ma!!
    }

private var _ma: ImageVector? = null
