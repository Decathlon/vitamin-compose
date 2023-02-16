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

public val FlagsGroup.Kh: ImageVector
    get() {
        if (_kh != null) {
            return _kh!!
        }
        _kh = Builder(name = "Kh", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF0F3EB6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F3EB6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFED1A3C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 8.7272f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(8.0f)
                    curveTo(13.3333f, 7.6318f, 13.6318f, 7.3333f, 14.0f, 7.3333f)
                    curveTo(14.3682f, 7.3333f, 14.6667f, 7.6318f, 14.6667f, 8.0f)
                    verticalLineTo(8.7272f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(8.7272f)
                    close()
                    moveTo(17.3333f, 8.0f)
                    curveTo(16.9651f, 8.0f, 16.6667f, 8.2985f, 16.6667f, 8.6667f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(8.6667f)
                    curveTo(18.0f, 8.2985f, 17.7015f, 8.0f, 17.3333f, 8.0f)
                    close()
                    moveTo(11.3333f, 13.3333f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(10.0f)
                    lineTo(8.6667f, 13.3333f)
                    horizontalLineTo(11.3333f)
                    close()
                    moveTo(16.0f, 10.6667f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.6667f)
                    close()
                    moveTo(16.6667f, 10.6667f)
                    horizontalLineTo(18.0f)
                    lineTo(19.3333f, 13.3333f)
                    horizontalLineTo(16.6667f)
                    verticalLineTo(10.6667f)
                    close()
                    moveTo(10.6667f, 8.0f)
                    curveTo(10.2985f, 8.0f, 10.0f, 8.2985f, 10.0f, 8.6667f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(11.3333f)
                    verticalLineTo(8.6667f)
                    curveTo(11.3333f, 8.2985f, 11.0348f, 8.0f, 10.6667f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _kh!!
    }

private var _kh: ImageVector? = null
