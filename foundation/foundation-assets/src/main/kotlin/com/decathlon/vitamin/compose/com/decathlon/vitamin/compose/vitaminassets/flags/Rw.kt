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

public val FlagsGroup.Rw: ImageVector
    get() {
        if (_rw != null) {
            return _rw!!
        }
        _rw = Builder(name = "Rw", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    curveTo(9.3334f, -1.0E-4f, 18.6668f, 0.0f, 28.0001f, 0.0f)
                    curveTo(28.0001f, 6.6667f, 28.0001f, 13.3333f, 28.0001f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    lineTo(1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2D754D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF25B1EB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 9.3333f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    lineTo(1.0E-4f, 0.0f)
                    verticalLineTo(9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFECB2F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 14.6667f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFECB2F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.3334f, 6.0f)
                    lineTo(20.3129f, 7.1304f)
                    lineTo(20.3906f, 5.6095f)
                    lineTo(18.8697f, 5.6872f)
                    lineTo(20.0001f, 4.6667f)
                    lineTo(18.8697f, 3.6462f)
                    lineTo(20.3906f, 3.7239f)
                    lineTo(20.3129f, 2.203f)
                    lineTo(21.3334f, 3.3333f)
                    lineTo(22.3539f, 2.203f)
                    lineTo(22.2762f, 3.7239f)
                    lineTo(23.7971f, 3.6462f)
                    lineTo(22.6668f, 4.6667f)
                    lineTo(23.7971f, 5.6872f)
                    lineTo(22.2762f, 5.6095f)
                    lineTo(22.3539f, 7.1304f)
                    lineTo(21.3334f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _rw!!
    }

private var _rw: ImageVector? = null
