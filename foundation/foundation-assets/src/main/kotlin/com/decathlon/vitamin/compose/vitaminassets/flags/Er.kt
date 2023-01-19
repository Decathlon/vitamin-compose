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

public val FlagsGroup.Er: ImageVector
    get() {
        if (_er != null) {
            return _er!!
        }
        _er = Builder(name = "Er", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF29C53F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF579DED)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 10.0f)
                    verticalLineTo(20.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF42D56)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    lineTo(28.0f, 10.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFC63C)),
                        strokeLineWidth = 1.33333f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.6667f, 10.0f)
                    curveTo(12.6667f, 12.2091f, 10.8758f, 14.0f, 8.6667f, 14.0f)
                    curveTo(6.4575f, 14.0f, 4.6667f, 12.2091f, 4.6667f, 10.0f)
                    curveTo(4.6667f, 7.7909f, 6.4575f, 6.0f, 8.6667f, 6.0f)
                    curveTo(10.8758f, 6.0f, 12.6667f, 7.7909f, 12.6667f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 9.3333f)
                    curveTo(8.3682f, 9.3333f, 8.6667f, 9.0349f, 8.6667f, 8.6667f)
                    curveTo(8.6667f, 8.2985f, 8.3682f, 8.0f, 8.0f, 8.0f)
                    curveTo(7.6318f, 8.0f, 7.3334f, 8.2985f, 7.3334f, 8.6667f)
                    curveTo(7.3334f, 9.0349f, 7.6318f, 9.3333f, 8.0f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3333f, 10.0f)
                    curveTo(9.7015f, 10.0f, 10.0f, 9.7015f, 10.0f, 9.3333f)
                    curveTo(10.0f, 8.9651f, 9.7015f, 8.6667f, 9.3333f, 8.6667f)
                    curveTo(8.9651f, 8.6667f, 8.6666f, 8.9651f, 8.6666f, 9.3333f)
                    curveTo(8.6666f, 9.7015f, 8.9651f, 10.0f, 9.3333f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.6667f, 8.6667f)
                    curveTo(9.0349f, 8.6667f, 9.3333f, 8.3682f, 9.3333f, 8.0f)
                    curveTo(9.3333f, 7.6318f, 9.0349f, 7.3333f, 8.6667f, 7.3333f)
                    curveTo(8.2985f, 7.3333f, 8.0f, 7.6318f, 8.0f, 8.0f)
                    curveTo(8.0f, 8.3682f, 8.2985f, 8.6667f, 8.6667f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 10.6667f)
                    curveTo(8.3682f, 10.6667f, 8.6667f, 10.3682f, 8.6667f, 10.0f)
                    curveTo(8.6667f, 9.6318f, 8.3682f, 9.3333f, 8.0f, 9.3333f)
                    curveTo(7.6318f, 9.3333f, 7.3334f, 9.6318f, 7.3334f, 10.0f)
                    curveTo(7.3334f, 10.3682f, 7.6318f, 10.6667f, 8.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3333f, 11.3333f)
                    curveTo(9.7015f, 11.3333f, 10.0f, 11.0349f, 10.0f, 10.6667f)
                    curveTo(10.0f, 10.2985f, 9.7015f, 10.0f, 9.3333f, 10.0f)
                    curveTo(8.9651f, 10.0f, 8.6666f, 10.2985f, 8.6666f, 10.6667f)
                    curveTo(8.6666f, 11.0349f, 8.9651f, 11.3333f, 9.3333f, 11.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 12.0f)
                    curveTo(8.3682f, 12.0f, 8.6667f, 11.7015f, 8.6667f, 11.3333f)
                    curveTo(8.6667f, 10.9651f, 8.3682f, 10.6667f, 8.0f, 10.6667f)
                    curveTo(7.6318f, 10.6667f, 7.3334f, 10.9651f, 7.3334f, 11.3333f)
                    curveTo(7.3334f, 11.7015f, 7.6318f, 12.0f, 8.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC63C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3333f, 12.6667f)
                    curveTo(9.7015f, 12.6667f, 10.0f, 12.3682f, 10.0f, 12.0f)
                    curveTo(10.0f, 11.6318f, 9.7015f, 11.3333f, 9.3333f, 11.3333f)
                    curveTo(8.9651f, 11.3333f, 8.6666f, 11.6318f, 8.6666f, 12.0f)
                    curveTo(8.6666f, 12.3682f, 8.9651f, 12.6667f, 9.3333f, 12.6667f)
                    close()
                }
            }
        }
        .build()
        return _er!!
    }

private var _er: ImageVector? = null
