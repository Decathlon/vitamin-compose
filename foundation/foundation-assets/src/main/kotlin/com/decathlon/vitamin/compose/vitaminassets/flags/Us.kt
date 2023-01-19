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

public val FlagsGroup.Us: ImageVector
    get() {
        if (_us != null) {
            return _us!!
        }
        _us = Builder(name = "Us", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFD02F44)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(1.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(28.0f, 2.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(2.6667f)
                    close()
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    close()
                    moveTo(28.0f, 8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    close()
                    moveTo(28.0f, 13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    close()
                    moveTo(0.0f, 16.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(28.0f, 18.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(18.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF46467F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(12.0f)
                    verticalLineToRelative(9.3333f)
                    horizontalLineToRelative(-12.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(1.33331f,1.33333f), end = Offset(1.33331f,7.99999f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(2.6667f, 2.0f)
                    curveTo(2.6667f, 2.3682f, 2.3682f, 2.6667f, 2.0f, 2.6667f)
                    curveTo(1.6318f, 2.6667f, 1.3333f, 2.3682f, 1.3333f, 2.0f)
                    curveTo(1.3333f, 1.6318f, 1.6318f, 1.3333f, 2.0f, 1.3333f)
                    curveTo(2.3682f, 1.3333f, 2.6667f, 1.6318f, 2.6667f, 2.0f)
                    close()
                    moveTo(5.3333f, 2.0f)
                    curveTo(5.3333f, 2.3682f, 5.0348f, 2.6667f, 4.6666f, 2.6667f)
                    curveTo(4.2985f, 2.6667f, 4.0f, 2.3682f, 4.0f, 2.0f)
                    curveTo(4.0f, 1.6318f, 4.2985f, 1.3333f, 4.6666f, 1.3333f)
                    curveTo(5.0348f, 1.3333f, 5.3333f, 1.6318f, 5.3333f, 2.0f)
                    close()
                    moveTo(7.3333f, 2.6667f)
                    curveTo(7.7015f, 2.6667f, 8.0f, 2.3682f, 8.0f, 2.0f)
                    curveTo(8.0f, 1.6318f, 7.7015f, 1.3333f, 7.3333f, 1.3333f)
                    curveTo(6.9651f, 1.3333f, 6.6666f, 1.6318f, 6.6666f, 2.0f)
                    curveTo(6.6666f, 2.3682f, 6.9651f, 2.6667f, 7.3333f, 2.6667f)
                    close()
                    moveTo(10.6666f, 2.0f)
                    curveTo(10.6666f, 2.3682f, 10.3682f, 2.6667f, 10.0f, 2.6667f)
                    curveTo(9.6318f, 2.6667f, 9.3333f, 2.3682f, 9.3333f, 2.0f)
                    curveTo(9.3333f, 1.6318f, 9.6318f, 1.3333f, 10.0f, 1.3333f)
                    curveTo(10.3682f, 1.3333f, 10.6666f, 1.6318f, 10.6666f, 2.0f)
                    close()
                    moveTo(3.3333f, 4.0f)
                    curveTo(3.7015f, 4.0f, 4.0f, 3.7015f, 4.0f, 3.3333f)
                    curveTo(4.0f, 2.9651f, 3.7015f, 2.6667f, 3.3333f, 2.6667f)
                    curveTo(2.9651f, 2.6667f, 2.6667f, 2.9651f, 2.6667f, 3.3333f)
                    curveTo(2.6667f, 3.7015f, 2.9651f, 4.0f, 3.3333f, 4.0f)
                    close()
                    moveTo(6.6666f, 3.3333f)
                    curveTo(6.6666f, 3.7015f, 6.3682f, 4.0f, 6.0f, 4.0f)
                    curveTo(5.6318f, 4.0f, 5.3333f, 3.7015f, 5.3333f, 3.3333f)
                    curveTo(5.3333f, 2.9651f, 5.6318f, 2.6667f, 6.0f, 2.6667f)
                    curveTo(6.3682f, 2.6667f, 6.6666f, 2.9651f, 6.6666f, 3.3333f)
                    close()
                    moveTo(8.6666f, 4.0f)
                    curveTo(9.0348f, 4.0f, 9.3333f, 3.7015f, 9.3333f, 3.3333f)
                    curveTo(9.3333f, 2.9651f, 9.0348f, 2.6667f, 8.6666f, 2.6667f)
                    curveTo(8.2985f, 2.6667f, 8.0f, 2.9651f, 8.0f, 3.3333f)
                    curveTo(8.0f, 3.7015f, 8.2985f, 4.0f, 8.6666f, 4.0f)
                    close()
                    moveTo(10.6666f, 4.6667f)
                    curveTo(10.6666f, 5.0349f, 10.3682f, 5.3333f, 10.0f, 5.3333f)
                    curveTo(9.6318f, 5.3333f, 9.3333f, 5.0349f, 9.3333f, 4.6667f)
                    curveTo(9.3333f, 4.2985f, 9.6318f, 4.0f, 10.0f, 4.0f)
                    curveTo(10.3682f, 4.0f, 10.6666f, 4.2985f, 10.6666f, 4.6667f)
                    close()
                    moveTo(7.3333f, 5.3333f)
                    curveTo(7.7015f, 5.3333f, 8.0f, 5.0349f, 8.0f, 4.6667f)
                    curveTo(8.0f, 4.2985f, 7.7015f, 4.0f, 7.3333f, 4.0f)
                    curveTo(6.9651f, 4.0f, 6.6666f, 4.2985f, 6.6666f, 4.6667f)
                    curveTo(6.6666f, 5.0349f, 6.9651f, 5.3333f, 7.3333f, 5.3333f)
                    close()
                    moveTo(5.3333f, 4.6667f)
                    curveTo(5.3333f, 5.0349f, 5.0348f, 5.3333f, 4.6666f, 5.3333f)
                    curveTo(4.2985f, 5.3333f, 4.0f, 5.0349f, 4.0f, 4.6667f)
                    curveTo(4.0f, 4.2985f, 4.2985f, 4.0f, 4.6666f, 4.0f)
                    curveTo(5.0348f, 4.0f, 5.3333f, 4.2985f, 5.3333f, 4.6667f)
                    close()
                    moveTo(2.0f, 5.3333f)
                    curveTo(2.3682f, 5.3333f, 2.6667f, 5.0349f, 2.6667f, 4.6667f)
                    curveTo(2.6667f, 4.2985f, 2.3682f, 4.0f, 2.0f, 4.0f)
                    curveTo(1.6318f, 4.0f, 1.3333f, 4.2985f, 1.3333f, 4.6667f)
                    curveTo(1.3333f, 5.0349f, 1.6318f, 5.3333f, 2.0f, 5.3333f)
                    close()
                    moveTo(4.0f, 6.0f)
                    curveTo(4.0f, 6.3682f, 3.7015f, 6.6667f, 3.3333f, 6.6667f)
                    curveTo(2.9651f, 6.6667f, 2.6667f, 6.3682f, 2.6667f, 6.0f)
                    curveTo(2.6667f, 5.6318f, 2.9651f, 5.3333f, 3.3333f, 5.3333f)
                    curveTo(3.7015f, 5.3333f, 4.0f, 5.6318f, 4.0f, 6.0f)
                    close()
                    moveTo(6.0f, 6.6667f)
                    curveTo(6.3682f, 6.6667f, 6.6666f, 6.3682f, 6.6666f, 6.0f)
                    curveTo(6.6666f, 5.6318f, 6.3682f, 5.3333f, 6.0f, 5.3333f)
                    curveTo(5.6318f, 5.3333f, 5.3333f, 5.6318f, 5.3333f, 6.0f)
                    curveTo(5.3333f, 6.3682f, 5.6318f, 6.6667f, 6.0f, 6.6667f)
                    close()
                    moveTo(9.3333f, 6.0f)
                    curveTo(9.3333f, 6.3682f, 9.0348f, 6.6667f, 8.6666f, 6.6667f)
                    curveTo(8.2985f, 6.6667f, 8.0f, 6.3682f, 8.0f, 6.0f)
                    curveTo(8.0f, 5.6318f, 8.2985f, 5.3333f, 8.6666f, 5.3333f)
                    curveTo(9.0348f, 5.3333f, 9.3333f, 5.6318f, 9.3333f, 6.0f)
                    close()
                    moveTo(10.0f, 8.0f)
                    curveTo(10.3682f, 8.0f, 10.6666f, 7.7015f, 10.6666f, 7.3333f)
                    curveTo(10.6666f, 6.9651f, 10.3682f, 6.6667f, 10.0f, 6.6667f)
                    curveTo(9.6318f, 6.6667f, 9.3333f, 6.9651f, 9.3333f, 7.3333f)
                    curveTo(9.3333f, 7.7015f, 9.6318f, 8.0f, 10.0f, 8.0f)
                    close()
                    moveTo(8.0f, 7.3333f)
                    curveTo(8.0f, 7.7015f, 7.7015f, 8.0f, 7.3333f, 8.0f)
                    curveTo(6.9651f, 8.0f, 6.6666f, 7.7015f, 6.6666f, 7.3333f)
                    curveTo(6.6666f, 6.9651f, 6.9651f, 6.6667f, 7.3333f, 6.6667f)
                    curveTo(7.7015f, 6.6667f, 8.0f, 6.9651f, 8.0f, 7.3333f)
                    close()
                    moveTo(4.6666f, 8.0f)
                    curveTo(5.0348f, 8.0f, 5.3333f, 7.7015f, 5.3333f, 7.3333f)
                    curveTo(5.3333f, 6.9651f, 5.0348f, 6.6667f, 4.6666f, 6.6667f)
                    curveTo(4.2985f, 6.6667f, 4.0f, 6.9651f, 4.0f, 7.3333f)
                    curveTo(4.0f, 7.7015f, 4.2985f, 8.0f, 4.6666f, 8.0f)
                    close()
                    moveTo(2.6667f, 7.3333f)
                    curveTo(2.6667f, 7.7015f, 2.3682f, 8.0f, 2.0f, 8.0f)
                    curveTo(1.6318f, 8.0f, 1.3333f, 7.7015f, 1.3333f, 7.3333f)
                    curveTo(1.3333f, 6.9651f, 1.6318f, 6.6667f, 2.0f, 6.6667f)
                    curveTo(2.3682f, 6.6667f, 2.6667f, 6.9651f, 2.6667f, 7.3333f)
                    close()
                }
            }
        }
        .build()
        return _us!!
    }

private var _us: ImageVector? = null
