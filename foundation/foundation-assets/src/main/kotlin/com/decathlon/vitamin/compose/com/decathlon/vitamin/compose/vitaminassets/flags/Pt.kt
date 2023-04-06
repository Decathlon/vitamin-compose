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

public val FlagsGroup.Pt: ImageVector
    get() {
        if (_pt != null) {
            return _pt!!
        }
        _pt = Builder(name = "Pt", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF2936)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF128415)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAF94F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6667f, 10.0f)
                    curveTo(14.6667f, 12.2091f, 12.8758f, 14.0f, 10.6667f, 14.0f)
                    curveTo(8.4575f, 14.0f, 6.6667f, 12.2091f, 6.6667f, 10.0f)
                    curveTo(6.6667f, 7.7909f, 8.4575f, 6.0f, 10.6667f, 6.0f)
                    curveTo(12.8758f, 6.0f, 14.6667f, 7.7909f, 14.6667f, 10.0f)
                    close()
                    moveTo(13.3333f, 10.0f)
                    curveTo(13.3333f, 11.4728f, 12.1394f, 12.6667f, 10.6667f, 12.6667f)
                    curveTo(9.1939f, 12.6667f, 8.0f, 11.4728f, 8.0f, 10.0f)
                    curveTo(8.0f, 8.5273f, 9.1939f, 7.3333f, 10.6667f, 7.3333f)
                    curveTo(12.1394f, 7.3333f, 13.3333f, 8.5273f, 13.3333f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3335f, 8.3333f)
                    curveTo(9.3335f, 8.1492f, 9.4827f, 8.0f, 9.6668f, 8.0f)
                    horizontalLineTo(11.6668f)
                    curveTo(11.8509f, 8.0f, 12.0002f, 8.1492f, 12.0002f, 8.3333f)
                    verticalLineTo(10.6667f)
                    curveTo(12.0002f, 11.4031f, 11.4032f, 12.0f, 10.6668f, 12.0f)
                    curveTo(9.9305f, 12.0f, 9.3335f, 11.4031f, 9.3335f, 10.6667f)
                    verticalLineTo(8.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1D50B5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6667f, 10.6667f)
                    curveTo(11.0349f, 10.6667f, 11.3333f, 9.7015f, 11.3333f, 9.3333f)
                    curveTo(11.3333f, 8.9651f, 11.0349f, 8.6667f, 10.6667f, 8.6667f)
                    curveTo(10.2985f, 8.6667f, 10.0f, 8.9651f, 10.0f, 9.3333f)
                    curveTo(10.0f, 9.7015f, 10.2985f, 10.6667f, 10.6667f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _pt!!
    }

private var _pt: ImageVector? = null
