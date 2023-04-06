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

public val FlagsGroup.Tw: ImageVector
    get() {
        if (_tw != null) {
            return _tw!!
        }
        _tw = Builder(name = "Tw", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-0.007f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3338f, 0.0454f, 6.666f, -0.007f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFE3030)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(-0.007f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0909B6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6666f)
                    horizontalLineTo(14.6665f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(-0.007f)
                    lineTo(0.0f, 10.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(7.3334f, 7.0f)
                    lineTo(6.0577f, 8.4129f)
                    lineTo(6.1548f, 6.5118f)
                    lineTo(4.2537f, 6.6089f)
                    lineTo(5.6667f, 5.3333f)
                    lineTo(4.2537f, 4.0577f)
                    lineTo(6.1548f, 4.1548f)
                    lineTo(6.0577f, 2.2537f)
                    lineTo(7.3334f, 3.6667f)
                    lineTo(8.609f, 2.2537f)
                    lineTo(8.5119f, 4.1548f)
                    lineTo(10.4129f, 4.0577f)
                    lineTo(9.0f, 5.3333f)
                    lineTo(10.4129f, 6.6089f)
                    lineTo(8.5119f, 6.5118f)
                    lineTo(8.609f, 8.4129f)
                    lineTo(7.3334f, 7.0f)
                    close()
                }
            }
        }
        .build()
        return _tw!!
    }

private var _tw: ImageVector? = null
