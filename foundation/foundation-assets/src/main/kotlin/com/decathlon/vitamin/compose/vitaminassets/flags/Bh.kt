package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val FlagsGroup.Bh: ImageVector
    get() {
        if (_bh != null) {
            return _bh!!
        }
        _bh = Builder(name = "Bh", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-0.0f, 0.0f)
                    horizontalLineTo(27.9999f)
                    curveTo(28.0004f, 6.6667f, 27.9999f, 13.3333f, 27.9999f, 20.0f)
                    curveTo(18.6666f, 20.0f, 9.3333f, 20.0f, -1.0E-4f, 20.0f)
                    curveTo(-1.0E-4f, 13.3333f, -2.0E-4f, 6.6667f, -0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE7243B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.9999f, 0.0f)
                    horizontalLineTo(7.9999f)
                    lineTo(10.0f, 1.3333f)
                    lineTo(7.9999f, 2.6667f)
                    lineTo(10.0f, 4.0f)
                    lineTo(7.9999f, 5.3333f)
                    lineTo(10.0f, 6.6667f)
                    lineTo(7.9999f, 8.0f)
                    lineTo(10.0f, 9.3333f)
                    lineTo(7.9999f, 10.6667f)
                    lineTo(10.0f, 12.0f)
                    lineTo(7.9999f, 13.3333f)
                    lineTo(10.0f, 14.6667f)
                    lineTo(7.9999f, 16.0f)
                    lineTo(10.0f, 17.3333f)
                    lineTo(7.9999f, 18.6667f)
                    lineTo(10.0f, 20.0f)
                    horizontalLineTo(27.9999f)
                    lineTo(27.9999f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.4999f, 0.5f)
                    lineTo(0.4999f, 19.5f)
                    lineTo(9.2518f, 19.5f)
                    lineTo(10.0026f, 20.0f)
                    horizontalLineTo(-1.0E-4f)
                    lineTo(-0.0f, 0.0f)
                    horizontalLineTo(7.9999f)
                    lineTo(8.7507f, 0.5f)
                    lineTo(0.4999f, 0.5f)
                    close()
                }
            }
        }
        .build()
        return _bh!!
    }

private var _bh: ImageVector? = null
