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

public val FlagsGroup.Gy: ImageVector
    get() {
        if (_gy != null) {
            return _gy!!
        }
        _gy = Builder(name = "Gy", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-2.0E-4f, 2.0f)
                    curveTo(-2.0E-4f, 0.8954f, -3.0E-4f, 0.0f, -3.0E-4f, 0.0f)
                    lineTo(27.9998f, 0.0f)
                    curveTo(27.9998f, 6.6667f, 27.9998f, 13.3333f, 27.9998f, 20.0f)
                    curveTo(19.3331f, 20.0f, 10.6665f, 20.0f, 1.9998f, 20.0f)
                    curveTo(0.8952f, 20.0f, -1.0E-4f, 20.0f, -1.0E-4f, 20.0f)
                    lineTo(-2.0E-4f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF08C55F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-3.0E-4f, 0.0f)
                    lineTo(27.9998f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(-1.0E-4f)
                    lineTo(-3.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD831)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    lineTo(-3.0E-4f, 0.0f)
                    lineTo(27.9996f, 9.3333f)
                    verticalLineTo(10.6667f)
                    lineTo(-1.0E-4f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-4.0E-4f, 18.5945f)
                    lineTo(25.7833f, 10.0f)
                    lineTo(-4.0E-4f, 1.4055f)
                    verticalLineTo(18.5945f)
                    close()
                    moveTo(27.9996f, 10.6667f)
                    lineTo(-1.0E-4f, 20.0f)
                    lineTo(-3.0E-4f, 0.0f)
                    lineTo(27.9996f, 9.3333f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE92034)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    lineTo(-3.0E-4f, 0.0f)
                    lineTo(15.333f, 10.0f)
                    lineTo(-1.0E-4f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-4.0E-4f, 18.4082f)
                    lineTo(12.8922f, 10.0f)
                    lineTo(-4.0E-4f, 1.5918f)
                    verticalLineTo(18.4082f)
                    close()
                    moveTo(15.333f, 10.0f)
                    lineTo(-1.0E-4f, 20.0f)
                    lineTo(-3.0E-4f, 0.0f)
                    lineTo(15.333f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _gy!!
    }

private var _gy: ImageVector? = null
