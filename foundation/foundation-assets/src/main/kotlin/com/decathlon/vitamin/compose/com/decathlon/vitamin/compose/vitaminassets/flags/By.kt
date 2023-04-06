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

public val FlagsGroup.By: ImageVector
    get() {
        if (_by != null) {
            return _by!!
        }
        _by = Builder(name = "By", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(0.0f, 0.0f, 0.8955f, 0.0f, 2.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(19.3334f, 20.0f, 10.6667f, 20.0f, 2.0f, 20.0f)
                    curveTo(0.8955f, 20.0f, 0.0f, 20.0f, 0.0f, 20.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE54252)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5CBE6B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(4.0f, 0.0f)
                    verticalLineTo(3.0002f)
                    lineTo(3.3335f, 4.0f)
                    lineTo(4.0f, 4.9998f)
                    verticalLineTo(7.0002f)
                    lineTo(3.3335f, 8.0f)
                    lineTo(4.0f, 8.9998f)
                    verticalLineTo(11.0002f)
                    lineTo(3.3335f, 12.0f)
                    lineTo(4.0f, 12.9998f)
                    verticalLineTo(15.0002f)
                    lineTo(3.3335f, 16.0f)
                    lineTo(4.0f, 16.9998f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE54252)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.0f)
                    lineTo(0.0f, 5.0f)
                    lineTo(0.0f, 9.0f)
                    lineTo(0.0f, 15.0f)
                    verticalLineTo(17.0f)
                    lineTo(0.6667f, 16.0f)
                    lineTo(0.0f, 15.0f)
                    verticalLineTo(13.0f)
                    lineTo(0.6667f, 12.0f)
                    lineTo(0.0f, 11.0f)
                    lineTo(0.0f, 9.0f)
                    lineTo(0.6667f, 8.0f)
                    lineTo(0.0f, 7.0f)
                    lineTo(0.0f, 5.0f)
                    lineTo(0.6667f, 4.0f)
                    lineTo(0.0f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE54252)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.6665f, 2.0f)
                    lineTo(2.0f, 0.0f)
                    lineTo(3.3332f, 2.0f)
                    lineTo(1.9999f, 4.0f)
                    lineTo(0.6665f, 2.0f)
                    close()
                    moveTo(1.9999f, 8.0f)
                    lineTo(0.6665f, 6.0f)
                    lineTo(1.9999f, 4.0f)
                    lineTo(3.3332f, 6.0f)
                    lineTo(1.9999f, 8.0f)
                    close()
                    moveTo(1.9999f, 12.0f)
                    lineTo(0.6665f, 10.0f)
                    lineTo(1.9999f, 8.0f)
                    lineTo(3.3332f, 10.0f)
                    lineTo(1.9999f, 12.0f)
                    close()
                    moveTo(1.9999f, 16.0f)
                    lineTo(3.3332f, 14.0f)
                    lineTo(1.9999f, 12.0f)
                    lineTo(0.6665f, 14.0f)
                    lineTo(1.9999f, 16.0f)
                    close()
                    moveTo(1.9999f, 16.0f)
                    lineTo(3.3332f, 18.0f)
                    lineTo(2.0f, 20.0f)
                    lineTo(0.6665f, 18.0f)
                    lineTo(1.9999f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _by!!
    }

private var _by: ImageVector? = null
