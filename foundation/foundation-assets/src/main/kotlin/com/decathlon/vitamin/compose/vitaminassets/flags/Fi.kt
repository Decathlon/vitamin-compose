package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
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

public val FlagsGroup.Fi: ImageVector
    get() {
        if (_fi != null) {
            return _fi!!
        }
        _fi = Builder(name = "Fi", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0002f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 19.9999f, 9.3334f, 19.9999f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 2.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0848A6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 12.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _fi!!
    }

private var _fi: ImageVector? = null
