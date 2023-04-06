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

public val FlagsGroup.Do: ImageVector
    get() {
        if (_do != null) {
            return _do!!
        }
        _do = Builder(name = "Do", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -4.0E-4f, 6.6667f, 1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF083D7A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(0.0f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF083D7A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF1E35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF1E35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F6D1A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.5858f, 8.5858f)
                    curveTo(11.8047f, 9.3668f, 11.8047f, 10.6332f, 12.5858f, 11.4142f)
                    curveTo(13.3668f, 12.1953f, 14.6332f, 12.1953f, 15.4142f, 11.4142f)
                    curveTo(16.1953f, 10.6332f, 16.1953f, 9.3668f, 15.4142f, 8.5858f)
                    lineTo(14.9428f, 9.0572f)
                    curveTo(15.4635f, 9.5779f, 15.4635f, 10.4221f, 14.9428f, 10.9428f)
                    curveTo(14.4221f, 11.4635f, 13.5779f, 11.4635f, 13.0572f, 10.9428f)
                    curveTo(12.5365f, 10.4221f, 12.5365f, 9.5779f, 13.0572f, 9.0572f)
                    lineTo(12.5858f, 8.5858f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF042F60)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.6667f)
                    curveTo(14.3682f, 10.6667f, 14.6667f, 10.3682f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 9.6318f, 14.3682f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(13.6318f, 9.3333f, 13.3333f, 9.6318f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 10.3682f, 13.6318f, 10.6667f, 14.0f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _do!!
    }

private var _do: ImageVector? = null
