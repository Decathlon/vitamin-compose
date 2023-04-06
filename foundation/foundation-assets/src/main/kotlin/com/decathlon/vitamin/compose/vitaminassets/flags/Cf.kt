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

public val FlagsGroup.Cf: ImageVector
    get() {
        if (_cf != null) {
            return _cf!!
        }
        _cf = Builder(name = "Cf", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 2.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF083D96)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF37AE39)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD13F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE42346)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6667f, 20.0f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD03B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6667f, 3.4467f)
                    lineTo(3.4911f, 4.2847f)
                    lineTo(3.9249f, 2.9077f)
                    lineTo(2.7646f, 2.0486f)
                    lineTo(4.2082f, 2.0356f)
                    lineTo(4.6667f, 0.6667f)
                    lineTo(5.1252f, 2.0356f)
                    lineTo(6.5688f, 2.0486f)
                    lineTo(5.4085f, 2.9077f)
                    lineTo(5.8423f, 4.2847f)
                    lineTo(4.6667f, 3.4467f)
                    close()
                }
            }
        }
        .build()
        return _cf!!
    }

private var _cf: ImageVector? = null
