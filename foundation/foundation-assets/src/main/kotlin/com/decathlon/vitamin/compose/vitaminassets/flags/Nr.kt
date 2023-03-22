package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0744A7), 1.0f to Color(0xFF00307D),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFCC747), 1.0f to Color(0xFFFEC539),
                        start = Offset(14.0001f,8.0f), end = Offset(14.0001f,10.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 8.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(7.33346f,11.4965f), end = Offset(7.33346f,17.8369f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.3335f, 16.3334f)
                    lineTo(6.3034f, 17.8369f)
                    lineTo(6.3538f, 16.0151f)
                    lineTo(4.6367f, 16.626f)
                    lineTo(5.7484f, 15.1817f)
                    lineTo(4.0001f, 14.6667f)
                    lineTo(5.7484f, 14.1517f)
                    lineTo(4.6367f, 12.7074f)
                    lineTo(6.3538f, 13.3183f)
                    lineTo(6.3034f, 11.4965f)
                    lineTo(7.3335f, 13.0f)
                    lineTo(8.3635f, 11.4965f)
                    lineTo(8.3131f, 13.3183f)
                    lineTo(10.0302f, 12.7074f)
                    lineTo(8.9185f, 14.1517f)
                    lineTo(10.6668f, 14.6667f)
                    lineTo(8.9185f, 15.1817f)
                    lineTo(10.0302f, 16.626f)
                    lineTo(8.3131f, 16.0151f)
                    lineTo(8.3635f, 17.8369f)
                    lineTo(7.3335f, 16.3334f)
                    close()
                }
            }
        }
        .build()
        return _nr!!
    }

private var _nr: ImageVector? = null
