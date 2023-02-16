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

public val FlagsGroup.Vg: ImageVector
    get() {
        if (_vg != null) {
            return _vg!!
        }
        _vg = Builder(name = "Vg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF008339)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3333f, 10.0f)
                    curveTo(17.3333f, 8.9063f, 17.3333f, 7.6131f, 17.3333f, 6.6658f)
                    curveTo(17.3333f, 5.9294f, 17.9303f, 5.3333f, 18.6667f, 5.3333f)
                    horizontalLineTo(22.6667f)
                    curveTo(23.4031f, 5.3333f, 24.0f, 5.9294f, 24.0f, 6.6658f)
                    curveTo(24.0f, 7.6131f, 24.0f, 8.9063f, 24.0f, 10.0f)
                    curveTo(24.0f, 13.3333f, 20.6667f, 14.6667f, 20.6667f, 14.6667f)
                    curveTo(20.6667f, 14.6667f, 17.3333f, 13.3333f, 17.3333f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.3334f, 8.0f)
                    curveTo(19.7015f, 8.0f, 20.0f, 7.7015f, 20.0f, 7.3333f)
                    curveTo(20.0f, 6.9651f, 19.7015f, 6.6667f, 19.3334f, 6.6667f)
                    curveTo(18.9652f, 6.6667f, 18.6667f, 6.9651f, 18.6667f, 7.3333f)
                    curveTo(18.6667f, 7.7015f, 18.9652f, 8.0f, 19.3334f, 8.0f)
                    close()
                    moveTo(19.3334f, 9.3333f)
                    curveTo(19.7015f, 9.3333f, 20.0f, 9.0349f, 20.0f, 8.6667f)
                    curveTo(20.0f, 8.2985f, 19.7015f, 8.0f, 19.3334f, 8.0f)
                    curveTo(18.9652f, 8.0f, 18.6667f, 8.2985f, 18.6667f, 8.6667f)
                    curveTo(18.6667f, 9.0349f, 18.9652f, 9.3333f, 19.3334f, 9.3333f)
                    close()
                    moveTo(19.3334f, 10.6667f)
                    curveTo(18.9652f, 10.6667f, 18.6667f, 10.3682f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 9.6318f, 18.9652f, 9.3333f, 19.3334f, 9.3333f)
                    curveTo(19.7015f, 9.3333f, 20.0f, 9.6318f, 20.0f, 10.0f)
                    curveTo(20.0f, 10.3682f, 19.7015f, 10.6667f, 19.3334f, 10.6667f)
                    close()
                    moveTo(19.3334f, 10.6667f)
                    curveTo(19.7015f, 10.6667f, 20.0f, 10.9651f, 20.0f, 11.3333f)
                    curveTo(20.0f, 11.7015f, 19.7015f, 12.0f, 19.3334f, 12.0f)
                    curveTo(18.9652f, 12.0f, 18.6667f, 11.7015f, 18.6667f, 11.3333f)
                    curveTo(18.6667f, 10.9651f, 18.9652f, 10.6667f, 19.3334f, 10.6667f)
                    close()
                    moveTo(22.6667f, 11.3333f)
                    curveTo(22.6667f, 11.7015f, 22.3682f, 12.0f, 22.0f, 12.0f)
                    curveTo(21.6318f, 12.0f, 21.3334f, 11.7015f, 21.3334f, 11.3333f)
                    curveTo(21.3334f, 10.9651f, 21.6318f, 10.6667f, 22.0f, 10.6667f)
                    curveTo(22.3682f, 10.6667f, 22.6667f, 10.9651f, 22.6667f, 11.3333f)
                    close()
                    moveTo(22.0f, 9.3333f)
                    curveTo(22.3682f, 9.3333f, 22.6667f, 9.6318f, 22.6667f, 10.0f)
                    curveTo(22.6667f, 10.3682f, 22.3682f, 10.6667f, 22.0f, 10.6667f)
                    curveTo(21.6318f, 10.6667f, 21.3334f, 10.3682f, 21.3334f, 10.0f)
                    curveTo(21.3334f, 9.6318f, 21.6318f, 9.3333f, 22.0f, 9.3333f)
                    close()
                    moveTo(22.0f, 8.0f)
                    curveTo(21.6318f, 8.0f, 21.3334f, 8.2985f, 21.3334f, 8.6667f)
                    curveTo(21.3334f, 9.0349f, 21.6318f, 9.3333f, 22.0f, 9.3333f)
                    curveTo(22.3682f, 9.3333f, 22.6667f, 9.0349f, 22.6667f, 8.6667f)
                    curveTo(22.6667f, 8.2985f, 22.3682f, 8.0f, 22.0f, 8.0f)
                    close()
                    moveTo(22.0f, 8.0f)
                    curveTo(21.6318f, 8.0f, 21.3334f, 7.7015f, 21.3334f, 7.3333f)
                    curveTo(21.3334f, 6.9651f, 21.6318f, 6.6667f, 22.0f, 6.6667f)
                    curveTo(22.3682f, 6.6667f, 22.6667f, 6.9651f, 22.6667f, 7.3333f)
                    curveTo(22.6667f, 7.7015f, 22.3682f, 8.0f, 22.0f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.6667f, 11.3333f)
                    curveTo(21.0349f, 11.3333f, 21.3333f, 10.4379f, 21.3333f, 9.3333f)
                    curveTo(21.3333f, 8.2288f, 21.0349f, 7.3333f, 20.6667f, 7.3333f)
                    curveTo(20.2985f, 7.3333f, 20.0f, 8.2288f, 20.0f, 9.3333f)
                    curveTo(20.0f, 10.4379f, 20.2985f, 11.3333f, 20.6667f, 11.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.6667f, 13.3333f)
                    curveTo(16.6667f, 14.6049f, 18.4879f, 15.3333f, 20.6667f, 15.3333f)
                    curveTo(22.8455f, 15.3333f, 24.6667f, 14.6049f, 24.6667f, 13.3333f)
                    curveTo(24.6667f, 12.9651f, 24.3682f, 12.6667f, 24.0f, 12.6667f)
                    curveTo(23.6318f, 12.6667f, 23.3333f, 12.9651f, 23.3333f, 13.3333f)
                    curveTo(23.3333f, 13.3461f, 23.1717f, 13.4989f, 22.7761f, 13.6572f)
                    curveTo(22.239f, 13.872f, 21.4824f, 14.0f, 20.6667f, 14.0f)
                    curveTo(19.8509f, 14.0f, 19.0943f, 13.872f, 18.5572f, 13.6572f)
                    curveTo(18.1616f, 13.4989f, 18.0f, 13.3461f, 18.0f, 13.3333f)
                    curveTo(18.0f, 12.9651f, 17.7015f, 12.6667f, 17.3333f, 12.6667f)
                    curveTo(16.9651f, 12.6667f, 16.6667f, 12.9651f, 16.6667f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDB1E36)), stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -0.3333f)
                    horizontalLineTo(-0.9011f)
                    lineTo(-0.2169f, 0.2531f)
                    lineTo(4.3333f, 4.1533f)
                    verticalLineTo(5.1618f)
                    lineTo(-0.1937f, 8.3954f)
                    lineTo(-0.3333f, 8.4951f)
                    verticalLineTo(8.6667f)
                    verticalLineTo(9.3333f)
                    verticalLineTo(9.9347f)
                    lineTo(0.1767f, 9.616f)
                    lineTo(5.4289f, 6.3333f)
                    horizontalLineTo(6.5598f)
                    lineTo(11.0821f, 9.5635f)
                    curveTo(11.176f, 9.6306f, 11.2886f, 9.6667f, 11.404f, 9.6667f)
                    curveTo(11.9182f, 9.6667f, 12.1548f, 9.027f, 11.7644f, 8.6924f)
                    lineTo(7.6667f, 5.18f)
                    verticalLineTo(4.1715f)
                    lineTo(12.0542f, 1.0376f)
                    curveTo(12.2294f, 0.9125f, 12.3333f, 0.7104f, 12.3333f, 0.4951f)
                    verticalLineTo(0.0f)
                    verticalLineTo(-0.6014f)
                    lineTo(11.8233f, -0.2827f)
                    lineTo(6.5711f, 3.0f)
                    horizontalLineTo(5.4402f)
                    lineTo(0.8604f, -0.2712f)
                    lineTo(0.7735f, -0.3333f)
                    horizontalLineTo(0.6667f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.3333f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(9.3333f)
                    curveTo(4.6667f, 9.7015f, 4.9651f, 10.0f, 5.3333f, 10.0f)
                    horizontalLineTo(6.6667f)
                    curveTo(7.0349f, 10.0f, 7.3333f, 9.7015f, 7.3333f, 9.3333f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0f)
                    curveTo(12.3682f, 6.0f, 12.6667f, 5.7015f, 12.6667f, 5.3333f)
                    verticalLineTo(4.0f)
                    curveTo(12.6667f, 3.6318f, 12.3682f, 3.3333f, 12.0f, 3.3333f)
                    horizontalLineTo(7.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(3.3333f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDB1E36)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 4.0f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(3.3333f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(6.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(6.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0f)
                    close()
                }
            }
        }
        .build()
        return _vg!!
    }

private var _vg: ImageVector? = null
