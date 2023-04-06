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

public val FlagsGroup.Mz: ImageVector
    get() {
        if (_mz != null) {
            return _mz!!
        }
        _mz = Builder(name = "Mz", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, -1.0E-4f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFE547)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF118C81)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.0f, 5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
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
                path(fill = SolidColor(Color(0xFFEF2147)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(13.3333f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDE444)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6668f, 11.2741f)
                    lineTo(2.7076f, 12.6967f)
                    lineTo(3.4551f, 10.3937f)
                    lineTo(1.4966f, 8.97f)
                    lineTo(3.9179f, 8.9693f)
                    lineTo(4.6668f, 6.6667f)
                    lineTo(5.4157f, 8.9693f)
                    lineTo(7.837f, 8.97f)
                    lineTo(5.8786f, 10.3937f)
                    lineTo(6.6261f, 12.6967f)
                    lineTo(4.6668f, 11.2741f)
                    close()
                }
            }
        }
        .build()
        return _mz!!
    }

private var _mz: ImageVector? = null
