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

public val FlagsGroup.Il: ImageVector
    get() {
        if (_il != null) {
            return _il!!
        }
        _il = Builder(name = "Il", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-1.0E-4f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    horizontalLineTo(-1.0E-4f)
                    curveTo(2.0E-4f, 13.3333f, -0.0f, 6.6667f, -1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E46D4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-0.0f, 4.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(-1.0E-4f, 0.0f)
                    curveTo(-0.0f, 1.3333f, -0.0f, 2.6667f, -0.0f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E46D4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(-0.0f)
                    lineTo(-1.0E-4f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF093EC5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.0151f, 10.0f)
                    lineTo(9.5336f, 12.6667f)
                    horizontalLineTo(12.4966f)
                    lineTo(13.9999f, 15.3728f)
                    lineTo(15.5033f, 12.6667f)
                    horizontalLineTo(18.4663f)
                    lineTo(16.9848f, 10.0f)
                    lineTo(18.4663f, 7.3334f)
                    horizontalLineTo(15.5033f)
                    lineTo(13.9999f, 4.6272f)
                    lineTo(12.4966f, 7.3334f)
                    lineTo(9.5336f, 7.3334f)
                    lineTo(11.0151f, 10.0f)
                    close()
                    moveTo(11.3964f, 10.6864f)
                    lineTo(10.6666f, 12.0f)
                    horizontalLineTo(12.1262f)
                    lineTo(11.3964f, 10.6864f)
                    close()
                    moveTo(12.8888f, 12.0f)
                    lineTo(11.7777f, 10.0f)
                    lineTo(12.8888f, 8.0f)
                    horizontalLineTo(15.1111f)
                    lineTo(16.2222f, 10.0f)
                    lineTo(15.1111f, 12.0f)
                    horizontalLineTo(12.8888f)
                    close()
                    moveTo(13.2592f, 12.6667f)
                    lineTo(13.9999f, 14.0f)
                    lineTo(14.7407f, 12.6667f)
                    lineTo(13.2592f, 12.6667f)
                    close()
                    moveTo(16.6035f, 10.6864f)
                    lineTo(15.8737f, 12.0f)
                    horizontalLineTo(17.3333f)
                    lineTo(16.6035f, 10.6864f)
                    close()
                    moveTo(16.6035f, 9.3136f)
                    lineTo(17.3333f, 8.0f)
                    horizontalLineTo(15.8737f)
                    lineTo(16.6035f, 9.3136f)
                    close()
                    moveTo(14.7407f, 7.3334f)
                    lineTo(13.9999f, 6.0f)
                    lineTo(13.2592f, 7.3334f)
                    horizontalLineTo(14.7407f)
                    close()
                    moveTo(12.1262f, 8.0f)
                    lineTo(11.3964f, 9.3136f)
                    lineTo(10.6666f, 8.0f)
                    horizontalLineTo(12.1262f)
                    close()
                }
            }
        }
        .build()
        return _il!!
    }

private var _il: ImageVector? = null
