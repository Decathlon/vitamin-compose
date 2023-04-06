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

public val FlagsGroup.Ws: ImageVector
    get() {
        if (_ws != null) {
            return _ws!!
        }
        _ws = Builder(name = "Ws", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFE31F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF083B9A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.6667f, 2.6667f)
                    lineTo(5.7239f, 2.9428f)
                    lineTo(6.0f, 2.0f)
                    lineTo(5.7239f, 1.0572f)
                    lineTo(6.6667f, 1.3333f)
                    lineTo(7.6095f, 1.0572f)
                    lineTo(7.3333f, 2.0f)
                    lineTo(7.6095f, 2.9428f)
                    lineTo(6.6667f, 2.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.6667f, 9.3333f)
                    lineTo(5.7239f, 9.6095f)
                    lineTo(6.0f, 8.6667f)
                    lineTo(5.7239f, 7.7239f)
                    lineTo(6.6667f, 8.0f)
                    lineTo(7.6095f, 7.7239f)
                    lineTo(7.3333f, 8.6667f)
                    lineTo(7.6095f, 9.6095f)
                    lineTo(6.6667f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0572f, 6.2761f)
                    lineTo(4.0f, 6.0f)
                    lineTo(4.9428f, 6.2761f)
                    lineTo(4.6667f, 5.3333f)
                    lineTo(4.9428f, 4.3905f)
                    lineTo(4.0f, 4.6667f)
                    lineTo(3.0572f, 4.3905f)
                    lineTo(3.3333f, 5.3333f)
                    lineTo(3.0572f, 6.2761f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 5.3333f)
                    lineTo(9.0572f, 5.6095f)
                    lineTo(9.3333f, 4.6667f)
                    lineTo(9.0572f, 3.7239f)
                    lineTo(10.0f, 4.0f)
                    lineTo(10.9428f, 3.7239f)
                    lineTo(10.6667f, 4.6667f)
                    lineTo(10.9428f, 5.6095f)
                    lineTo(10.0f, 5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6667f, 7.0f)
                    curveTo(8.6667f, 7.1841f, 8.5174f, 7.3333f, 8.3333f, 7.3333f)
                    curveTo(8.1492f, 7.3333f, 8.0f, 7.1841f, 8.0f, 7.0f)
                    curveTo(8.0f, 6.8159f, 8.1492f, 6.6667f, 8.3333f, 6.6667f)
                    curveTo(8.5174f, 6.6667f, 8.6667f, 6.8159f, 8.6667f, 7.0f)
                    close()
                }
            }
        }
        .build()
        return _ws!!
    }

private var _ws: ImageVector? = null
