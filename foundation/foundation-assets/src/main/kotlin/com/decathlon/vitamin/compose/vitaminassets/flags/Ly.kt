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

public val FlagsGroup.Ly: ImageVector
    get() {
        if (_ly != null) {
            return _ly!!
        }
        _ly = Builder(name = "Ly", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF34B857)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF41F34)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 12.0f)
                    curveTo(14.4113f, 12.0f, 14.7936f, 11.8759f, 15.1114f, 11.663f)
                    curveTo(15.0746f, 11.6654f, 15.0374f, 11.6667f, 15.0f, 11.6667f)
                    curveTo(14.0795f, 11.6667f, 13.3333f, 10.9205f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 9.0795f, 14.0795f, 8.3333f, 15.0f, 8.3333f)
                    curveTo(15.0374f, 8.3333f, 15.0746f, 8.3346f, 15.1114f, 8.337f)
                    curveTo(14.7936f, 8.1241f, 14.4113f, 8.0f, 14.0f, 8.0f)
                    curveTo(12.8954f, 8.0f, 12.0f, 8.8954f, 12.0f, 10.0f)
                    curveTo(12.0f, 11.1046f, 12.8954f, 12.0f, 14.0f, 12.0f)
                    close()
                    moveTo(16.0f, 10.0f)
                    curveTo(16.0f, 10.3682f, 15.7015f, 10.6667f, 15.3333f, 10.6667f)
                    curveTo(14.9651f, 10.6667f, 14.6667f, 10.3682f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 9.6318f, 14.9651f, 9.3333f, 15.3333f, 9.3333f)
                    curveTo(15.7015f, 9.3333f, 16.0f, 9.6318f, 16.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _ly!!
    }

private var _ly: ImageVector? = null
