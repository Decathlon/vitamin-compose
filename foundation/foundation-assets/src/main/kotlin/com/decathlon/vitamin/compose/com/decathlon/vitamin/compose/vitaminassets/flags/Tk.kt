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

public val FlagsGroup.Tk: ImageVector
    get() {
        if (_tk != null) {
            return _tk!!
        }
        _tk = Builder(name = "Tk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0637C5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDD33F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3336f, 16.0f)
                    horizontalLineTo(25.3336f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(4.0003f)
                    lineTo(5.3336f, 16.0f)
                    close()
                    moveTo(15.3336f, 8.0f)
                    curveTo(19.3336f, 5.3333f, 24.0003f, 2.6667f, 24.0003f, 2.6667f)
                    curveTo(24.0003f, 2.6667f, 21.8101f, 6.7646f, 22.0003f, 8.6667f)
                    curveTo(22.2545f, 11.209f, 25.3336f, 14.6667f, 25.3336f, 14.6667f)
                    horizontalLineTo(6.667f)
                    curveTo(6.667f, 14.6667f, 11.3336f, 10.6667f, 15.3336f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3337f, 12.0f)
                    lineTo(4.3909f, 12.2762f)
                    lineTo(4.667f, 11.3334f)
                    lineTo(4.3909f, 10.3905f)
                    lineTo(5.3337f, 10.6667f)
                    lineTo(6.2765f, 10.3905f)
                    lineTo(6.0004f, 11.3334f)
                    lineTo(6.2765f, 12.2762f)
                    lineTo(5.3337f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.667f, 3.3333f)
                    lineTo(5.7242f, 3.6095f)
                    lineTo(6.0004f, 2.6667f)
                    lineTo(5.7242f, 1.7239f)
                    lineTo(6.667f, 2.0f)
                    lineTo(7.6099f, 1.7239f)
                    lineTo(7.3337f, 2.6667f)
                    lineTo(7.6099f, 3.6095f)
                    lineTo(6.667f, 3.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3337f, 7.3334f)
                    lineTo(8.3909f, 7.6095f)
                    lineTo(8.6671f, 6.6667f)
                    lineTo(8.3909f, 5.7239f)
                    lineTo(9.3337f, 6.0f)
                    lineTo(10.2765f, 5.7239f)
                    lineTo(10.0004f, 6.6667f)
                    lineTo(10.2765f, 7.6095f)
                    lineTo(9.3337f, 7.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(2.667f, 7.3334f)
                    lineTo(1.7242f, 7.6095f)
                    lineTo(2.0004f, 6.6667f)
                    lineTo(1.7242f, 5.7239f)
                    lineTo(2.667f, 6.0f)
                    lineTo(3.6099f, 5.7239f)
                    lineTo(3.3337f, 6.6667f)
                    lineTo(3.6099f, 7.6095f)
                    lineTo(2.667f, 7.3334f)
                    close()
                }
            }
        }
        .build()
        return _tk!!
    }

private var _tk: ImageVector? = null
