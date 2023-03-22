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

public val FlagsGroup.Ky: ImageVector
    get() {
        if (_ky != null) {
            return _ky!!
        }
        _ky = Builder(name = "Ky", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFFAD051)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.6665f, 6.6667f)
                    curveTo(21.7711f, 6.6667f, 22.6665f, 6.0697f, 22.6665f, 5.3333f)
                    curveTo(22.6665f, 4.597f, 21.7711f, 4.0f, 20.6665f, 4.0f)
                    curveTo(19.5619f, 4.0f, 18.6665f, 4.597f, 18.6665f, 5.3333f)
                    curveTo(18.6665f, 6.0697f, 19.5619f, 6.6667f, 20.6665f, 6.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(17.3335f,5.33331f), end = Offset(17.3335f,14.6666f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(17.3335f, 10.0f)
                    curveTo(17.3335f, 8.0f, 17.3335f, 5.3333f, 17.3335f, 5.3333f)
                    horizontalLineTo(24.0002f)
                    curveTo(24.0002f, 5.3333f, 24.0002f, 8.0f, 24.0002f, 10.0f)
                    curveTo(24.0002f, 13.3333f, 20.6668f, 14.6666f, 20.6668f, 14.6666f)
                    curveTo(20.6668f, 14.6666f, 17.3335f, 13.3333f, 17.3335f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCF142C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3335f, 5.3333f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(6.6666f)
                    horizontalLineTo(21.3335f)
                    horizontalLineTo(20.0002f)
                    horizontalLineTo(17.3335f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF125FBA)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(24.0002f, 8.0f)
                    horizontalLineTo(17.3335f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(20.0002f)
                    horizontalLineTo(21.3335f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(17.3335f, 10.6666f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(21.3335f)
                    horizontalLineTo(20.0002f)
                    horizontalLineTo(17.3335f)
                    verticalLineTo(10.6666f)
                    close()
                    moveTo(17.3335f, 13.3333f)
                    horizontalLineTo(24.0002f)
                    verticalLineTo(14.6666f)
                    horizontalLineTo(21.3335f)
                    horizontalLineTo(20.0002f)
                    horizontalLineTo(17.3335f)
                    verticalLineTo(13.3333f)
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
        return _ky!!
    }

private var _ky: ImageVector? = null
