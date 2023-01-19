package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FlagsGroup.Mn: ImageVector
    get() {
        if (_mn != null) {
            return _mn!!
        }
        _mn = Builder(name = "Mn", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF146BBC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3335f, 20.0f)
                    horizontalLineTo(18.6668f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.3335f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE43642)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE43642)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.6665f, 20.0f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(18.6665f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF8D246), 1.0f to Color(0xFFF9CE2F),
                        start = Offset(2.6665f,10.0f), end = Offset(2.6665f,16.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6667f, 10.0f)
                    lineTo(5.3333f, 10.6667f)
                    horizontalLineTo(4.6667f)
                    horizontalLineTo(4.0f)
                    lineTo(4.6667f, 10.0f)
                    close()
                    moveTo(5.333f, 14.021f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(4.0f)
                    lineTo(4.6667f, 16.0f)
                    lineTo(5.333f, 14.6673f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(6.6663f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(5.3333f)
                    horizontalLineTo(5.333f)
                    horizontalLineTo(4.6719f)
                    curveTo(5.0377f, 11.9971f, 5.3333f, 11.6998f, 5.3333f, 11.3333f)
                    curveTo(5.3333f, 10.9651f, 5.0349f, 10.6667f, 4.6667f, 10.6667f)
                    curveTo(4.2985f, 10.6667f, 4.0f, 10.9651f, 4.0f, 11.3333f)
                    curveTo(4.0f, 11.6998f, 4.2956f, 11.9971f, 4.6614f, 12.0f)
                    horizontalLineTo(4.0f)
                    lineTo(4.6667f, 13.3333f)
                    curveTo(4.2985f, 13.3333f, 4.0f, 13.6318f, 4.0f, 14.0f)
                    curveTo(4.0f, 14.3681f, 4.2985f, 14.6666f, 4.6667f, 14.6666f)
                    curveTo(5.0278f, 14.6666f, 5.3219f, 14.3795f, 5.333f, 14.021f)
                    close()
                    moveTo(5.333f, 13.9789f)
                    verticalLineTo(12.0006f)
                    lineTo(4.6667f, 13.3333f)
                    curveTo(5.0278f, 13.3333f, 5.3219f, 13.6205f, 5.333f, 13.9789f)
                    close()
                    moveTo(2.6665f, 12.0f)
                    horizontalLineTo(3.9998f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(2.6665f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _mn!!
    }

private var _mn: ImageVector? = null
