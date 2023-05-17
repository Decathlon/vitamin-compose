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

public val FlagsGroup.Am: ImageVector
    get() {
        if (_am != null) {
            return _am!!
        }
        _am = Builder(name = "Am", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-1.0E-4f, 0.0f)
                    curveTo(9.3332f, 0.0f, 18.6666f, 1.0E-4f, 27.9999f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6666f, 20.0f, 9.3333f, 20.0f, -1.0E-4f, 20.0f)
                    curveTo(-1.0E-4f, 13.3333f, 3.0E-4f, 6.6667f, -1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1047B9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 13.3333f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF01C31)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 6.6667f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(0.0f)
                    lineTo(-1.0E-4f, 0.0f)
                    lineTo(-1.0E-4f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFECB2F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.0f)
                    close()
                }
            }
        }
        .build()
        return _am!!
    }

private var _am: ImageVector? = null
