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

public val FlagsGroup.Tz: ImageVector
    get() {
        if (_tz != null) {
            return _tz!!
        }
        _tz = Builder(name = "Tz", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-1.0E-4f, -0.0f)
                    curveTo(-1.0E-4f, -0.0f, 0.8953f, -0.0f, 1.9999f, -0.0f)
                    horizontalLineTo(25.9999f)
                    curveTo(27.1045f, -0.0f, 27.9999f, -0.0f, 27.9999f, -0.0f)
                    verticalLineTo(20.0f)
                    curveTo(27.9999f, 20.0f, 27.1045f, 20.0f, 25.9999f, 20.0f)
                    horizontalLineTo(1.9999f)
                    curveTo(0.8954f, 20.0f, -1.0E-4f, 20.0f, -1.0E-4f, 20.0f)
                    verticalLineTo(-0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF33CC4D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 13.3333f)
                    lineTo(27.9999f, -0.0f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2DAFE4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(6.6667f)
                    lineTo(-1.0E-4f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD84F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(7.3654f, 20.0078f)
                    lineTo(28.012f, 7.0656f)
                    lineTo(27.9999f, -0.0f)
                    lineTo(20.7164f, -0.0216f)
                    lineTo(-0.0165f, 12.9531f)
                    lineTo(-1.0E-4f, 20.0f)
                    lineTo(7.3654f, 20.0078f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.3123f, 19.992f)
                    lineTo(28.012f, 5.1255f)
                    lineTo(27.9999f, -0.0f)
                    lineTo(23.779f, -0.0055f)
                    lineTo(-0.0209f, 14.8212f)
                    lineTo(-1.0E-4f, 20.0f)
                    lineTo(4.3123f, 19.992f)
                    close()
                }
            }
        }
        .build()
        return _tz!!
    }

private var _tz: ImageVector? = null
