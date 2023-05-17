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

public val FlagsGroup.Ch: ImageVector
    get() {
        if (_ch != null) {
            return _ch!!
        }
        _ch = Builder(name = "Ch", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -2.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF0000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 12.0f)
                    horizontalLineTo(8.3333f)
                    curveTo(8.1492f, 12.0f, 8.0f, 11.8508f, 8.0f, 11.6667f)
                    verticalLineTo(8.3333f)
                    curveTo(8.0f, 8.1492f, 8.1492f, 8.0f, 8.3333f, 8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(4.3333f)
                    curveTo(12.0f, 4.1492f, 12.1492f, 4.0f, 12.3333f, 4.0f)
                    horizontalLineTo(15.6667f)
                    curveTo(15.8508f, 4.0f, 16.0f, 4.1492f, 16.0f, 4.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(19.6667f)
                    curveTo(19.8508f, 8.0f, 20.0f, 8.1492f, 20.0f, 8.3333f)
                    verticalLineTo(11.6667f)
                    curveTo(20.0f, 11.8508f, 19.8508f, 12.0f, 19.6667f, 12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(15.6667f)
                    curveTo(16.0f, 15.8508f, 15.8508f, 16.0f, 15.6667f, 16.0f)
                    horizontalLineTo(12.3333f)
                    curveTo(12.1492f, 16.0f, 12.0f, 15.8508f, 12.0f, 15.6667f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _ch!!
    }

private var _ch: ImageVector? = null
