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

public val FlagsGroup.Al: ImageVector
    get() {
        if (_al != null) {
            return _al!!
        }
        _al = Builder(name = "Al", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFEE343C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    lineTo(28.0001f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0001f, 4.0f)
                    lineTo(10.0001f, 5.3333f)
                    lineTo(12.6667f, 6.6667f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(11.3334f)
                    lineTo(8.6667f, 6.6667f)
                    lineTo(7.3334f, 8.0f)
                    lineTo(10.0001f, 9.3333f)
                    lineTo(8.0f, 10.6667f)
                    lineTo(11.3334f, 11.3333f)
                    lineTo(8.6667f, 13.3333f)
                    horizontalLineTo(10.0001f)
                    lineTo(12.6667f, 12.6667f)
                    lineTo(11.3334f, 14.6667f)
                    horizontalLineTo(13.3334f)
                    lineTo(14.0001f, 16.6667f)
                    lineTo(14.6667f, 14.6667f)
                    horizontalLineTo(16.6667f)
                    lineTo(15.3334f, 12.6667f)
                    lineTo(18.0001f, 13.3333f)
                    horizontalLineTo(19.3334f)
                    lineTo(16.6667f, 11.3333f)
                    lineTo(20.0001f, 10.6667f)
                    lineTo(18.0001f, 9.3333f)
                    lineTo(20.6667f, 8.0f)
                    lineTo(19.3334f, 6.6667f)
                    lineTo(16.6667f, 8.0f)
                    horizontalLineTo(15.3334f)
                    verticalLineTo(6.6667f)
                    curveTo(16.2223f, 6.2222f, 18.0001f, 5.3333f, 18.0001f, 5.3333f)
                    lineTo(16.0001f, 4.0f)
                    lineTo(14.0001f, 6.0f)
                    lineTo(12.0001f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _al!!
    }

private var _al: ImageVector? = null
