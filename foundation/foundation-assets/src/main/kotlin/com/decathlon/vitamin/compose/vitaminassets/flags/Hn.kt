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

public val FlagsGroup.Hn: ImageVector
    get() {
        if (_hn != null) {
            return _hn!!
        }
        _hn = Builder(name = "Hn", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF5F5F5)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 0.25f)
                    lineTo(26.0f, 0.25f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 27.75f, 2.0f)
                    lineTo(27.75f, 18.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 26.0f, 19.75f)
                    lineTo(2.0f, 19.75f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 0.25f, 18.0f)
                    lineTo(0.25f, 2.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 0.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0884E6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0884E6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.6667f)
                    lineTo(13.0572f, 10.9428f)
                    lineTo(13.3333f, 10.0f)
                    lineTo(13.0572f, 9.0572f)
                    lineTo(14.0f, 9.3333f)
                    lineTo(14.9428f, 9.0572f)
                    lineTo(14.6666f, 10.0f)
                    lineTo(14.9428f, 10.9428f)
                    lineTo(14.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.3333f, 9.3333f)
                    lineTo(18.3905f, 9.6095f)
                    lineTo(18.6667f, 8.6667f)
                    lineTo(18.3905f, 7.7239f)
                    lineTo(19.3333f, 8.0f)
                    lineTo(20.2761f, 7.7239f)
                    lineTo(20.0f, 8.6667f)
                    lineTo(20.2761f, 9.6095f)
                    lineTo(19.3333f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.3333f, 12.0f)
                    lineTo(18.3905f, 12.2761f)
                    lineTo(18.6667f, 11.3333f)
                    lineTo(18.3905f, 10.3905f)
                    lineTo(19.3333f, 10.6667f)
                    lineTo(20.2761f, 10.3905f)
                    lineTo(20.0f, 11.3333f)
                    lineTo(20.2761f, 12.2761f)
                    lineTo(19.3333f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.6667f, 12.0f)
                    lineTo(7.7239f, 12.2761f)
                    lineTo(8.0f, 11.3333f)
                    lineTo(7.7239f, 10.3905f)
                    lineTo(8.6667f, 10.6667f)
                    lineTo(9.6095f, 10.3905f)
                    lineTo(9.3334f, 11.3333f)
                    lineTo(9.6095f, 12.2761f)
                    lineTo(8.6667f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.6667f, 9.3333f)
                    lineTo(7.7239f, 9.6095f)
                    lineTo(8.0f, 8.6667f)
                    lineTo(7.7239f, 7.7239f)
                    lineTo(8.6667f, 8.0f)
                    lineTo(9.6095f, 7.7239f)
                    lineTo(9.3334f, 8.6667f)
                    lineTo(9.6095f, 9.6095f)
                    lineTo(8.6667f, 9.3333f)
                    close()
                }
            }
        }
        .build()
        return _hn!!
    }

private var _hn: ImageVector? = null
