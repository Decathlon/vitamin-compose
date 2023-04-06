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

public val FlagsGroup.Nr: ImageVector
    get() {
        if (_nr != null) {
            return _nr!!
        }
        _nr = Builder(name = "Nr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0744A7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFCC747)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0002f, 8.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(7.3335f, 16.3334f)
                    lineTo(6.3034f, 17.8369f)
                    lineTo(6.3538f, 16.0151f)
                    lineTo(4.6368f, 16.626f)
                    lineTo(5.7484f, 15.1817f)
                    lineTo(4.0002f, 14.6667f)
                    lineTo(5.7484f, 14.1517f)
                    lineTo(4.6368f, 12.7074f)
                    lineTo(6.3538f, 13.3183f)
                    lineTo(6.3034f, 11.4965f)
                    lineTo(7.3335f, 13.0f)
                    lineTo(8.3636f, 11.4965f)
                    lineTo(8.3131f, 13.3183f)
                    lineTo(10.0302f, 12.7074f)
                    lineTo(8.9186f, 14.1517f)
                    lineTo(10.6668f, 14.6667f)
                    lineTo(8.9186f, 15.1817f)
                    lineTo(10.0302f, 16.626f)
                    lineTo(8.3131f, 16.0151f)
                    lineTo(8.3636f, 17.8369f)
                    lineTo(7.3335f, 16.3334f)
                    close()
                }
            }
        }
        .build()
        return _nr!!
    }

private var _nr: ImageVector? = null
