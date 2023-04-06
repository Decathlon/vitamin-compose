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

public val FlagsGroup.Si: ImageVector
    get() {
        if (_si != null) {
            return _si!!
        }
        _si = Builder(name = "Si", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-0.0277f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(-0.0277f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C47B7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    lineTo(28.0f, 6.6667f)
                    horizontalLineTo(9.244f)
                    verticalLineTo(5.3333f)
                    curveTo(9.244f, 5.3333f, 8.3037f, 4.6667f, 7.3333f, 4.6667f)
                    curveTo(6.363f, 4.6667f, 5.3333f, 5.3333f, 5.3333f, 5.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(-0.0334f)
                    lineTo(-0.0f, 13.3333f)
                    close()
                    moveTo(8.6667f, 8.0f)
                    curveTo(8.6667f, 8.7364f, 8.0697f, 9.3333f, 7.3333f, 9.3333f)
                    curveTo(6.597f, 9.3333f, 6.0f, 8.7364f, 6.0f, 8.0f)
                    curveTo(6.0f, 7.2636f, 6.597f, 6.6667f, 7.3333f, 6.6667f)
                    curveTo(8.0697f, 6.6667f, 8.6667f, 7.2636f, 8.6667f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE53B35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(-0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    lineTo(28.0f, 6.6528f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 6.6528f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
            }
        }
        .build()
        return _si!!
    }

private var _si: ImageVector? = null
