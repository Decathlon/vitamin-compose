package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val FlagsGroup.Um: ImageVector
    get() {
        if (_um != null) {
            return _um!!
        }
        _um = Builder(name = "Um", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9998f,0.0f), end = Offset(13.9998f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9998f, 0.0f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFD02F44), 1.0f to Color(0xFFB12537),
                        start = Offset(13.9998f,0.0f), end = Offset(13.9998f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(-2.0E-4f, 0.0f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(1.3333f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(-2.0E-4f, 2.6667f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(2.6667f)
                    close()
                    moveTo(-2.0E-4f, 5.3333f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(5.3333f)
                    close()
                    moveTo(-2.0E-4f, 8.0f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(-2.0E-4f, 10.6667f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(10.6667f)
                    close()
                    moveTo(-2.0E-4f, 13.3333f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(13.3333f)
                    close()
                    moveTo(-2.0E-4f, 16.0f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(-2.0E-4f, 18.6667f)
                    horizontalLineTo(27.9998f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(18.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF46467F), 1.0f to Color(0xFF3C3C6D),
                        start = Offset(5.99976f,0.0f), end = Offset(5.99976f,9.33333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(11.9998f, 0.0f)
                    horizontalLineTo(-2.0E-4f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(11.9998f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.99992f,1.33333f), end = Offset(5.99992f,7.99999f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.9999f, 2.6667f)
                    curveTo(1.6317f, 2.6667f, 1.3333f, 2.3682f, 1.3333f, 2.0f)
                    curveTo(1.3333f, 1.6318f, 1.6317f, 1.3333f, 1.9999f, 1.3333f)
                    curveTo(2.3681f, 1.3333f, 2.6666f, 1.6318f, 2.6666f, 2.0f)
                    curveTo(2.6666f, 2.3682f, 2.3681f, 2.6667f, 1.9999f, 2.6667f)
                    close()
                    moveTo(4.6666f, 2.6667f)
                    curveTo(4.2984f, 2.6667f, 3.9999f, 2.3682f, 3.9999f, 2.0f)
                    curveTo(3.9999f, 1.6318f, 4.2984f, 1.3333f, 4.6666f, 1.3333f)
                    curveTo(5.0348f, 1.3333f, 5.3333f, 1.6318f, 5.3333f, 2.0f)
                    curveTo(5.3333f, 2.3682f, 5.0348f, 2.6667f, 4.6666f, 2.6667f)
                    close()
                    moveTo(7.3333f, 2.6667f)
                    curveTo(6.9651f, 2.6667f, 6.6666f, 2.3682f, 6.6666f, 2.0f)
                    curveTo(6.6666f, 1.6318f, 6.9651f, 1.3333f, 7.3333f, 1.3333f)
                    curveTo(7.7014f, 1.3333f, 7.9999f, 1.6318f, 7.9999f, 2.0f)
                    curveTo(7.9999f, 2.3682f, 7.7014f, 2.6667f, 7.3333f, 2.6667f)
                    close()
                    moveTo(9.9999f, 2.6667f)
                    curveTo(9.6317f, 2.6667f, 9.3333f, 2.3682f, 9.3333f, 2.0f)
                    curveTo(9.3333f, 1.6318f, 9.6317f, 1.3333f, 9.9999f, 1.3333f)
                    curveTo(10.3681f, 1.3333f, 10.6666f, 1.6318f, 10.6666f, 2.0f)
                    curveTo(10.6666f, 2.3682f, 10.3681f, 2.6667f, 9.9999f, 2.6667f)
                    close()
                    moveTo(3.3333f, 4.0f)
                    curveTo(2.9651f, 4.0f, 2.6666f, 3.7015f, 2.6666f, 3.3333f)
                    curveTo(2.6666f, 2.9651f, 2.9651f, 2.6667f, 3.3333f, 2.6667f)
                    curveTo(3.7014f, 2.6667f, 3.9999f, 2.9651f, 3.9999f, 3.3333f)
                    curveTo(3.9999f, 3.7015f, 3.7014f, 4.0f, 3.3333f, 4.0f)
                    close()
                    moveTo(5.9999f, 4.0f)
                    curveTo(5.6317f, 4.0f, 5.3333f, 3.7015f, 5.3333f, 3.3333f)
                    curveTo(5.3333f, 2.9651f, 5.6317f, 2.6667f, 5.9999f, 2.6667f)
                    curveTo(6.3681f, 2.6667f, 6.6666f, 2.9651f, 6.6666f, 3.3333f)
                    curveTo(6.6666f, 3.7015f, 6.3681f, 4.0f, 5.9999f, 4.0f)
                    close()
                    moveTo(8.6666f, 4.0f)
                    curveTo(8.2984f, 4.0f, 7.9999f, 3.7015f, 7.9999f, 3.3333f)
                    curveTo(7.9999f, 2.9651f, 8.2984f, 2.6667f, 8.6666f, 2.6667f)
                    curveTo(9.0348f, 2.6667f, 9.3333f, 2.9651f, 9.3333f, 3.3333f)
                    curveTo(9.3333f, 3.7015f, 9.0348f, 4.0f, 8.6666f, 4.0f)
                    close()
                    moveTo(9.9999f, 5.3333f)
                    curveTo(9.6317f, 5.3333f, 9.3333f, 5.0349f, 9.3333f, 4.6667f)
                    curveTo(9.3333f, 4.2985f, 9.6317f, 4.0f, 9.9999f, 4.0f)
                    curveTo(10.3681f, 4.0f, 10.6666f, 4.2985f, 10.6666f, 4.6667f)
                    curveTo(10.6666f, 5.0349f, 10.3681f, 5.3333f, 9.9999f, 5.3333f)
                    close()
                    moveTo(7.3333f, 5.3333f)
                    curveTo(6.9651f, 5.3333f, 6.6666f, 5.0349f, 6.6666f, 4.6667f)
                    curveTo(6.6666f, 4.2985f, 6.9651f, 4.0f, 7.3333f, 4.0f)
                    curveTo(7.7014f, 4.0f, 7.9999f, 4.2985f, 7.9999f, 4.6667f)
                    curveTo(7.9999f, 5.0349f, 7.7014f, 5.3333f, 7.3333f, 5.3333f)
                    close()
                    moveTo(4.6666f, 5.3333f)
                    curveTo(4.2984f, 5.3333f, 3.9999f, 5.0349f, 3.9999f, 4.6667f)
                    curveTo(3.9999f, 4.2985f, 4.2984f, 4.0f, 4.6666f, 4.0f)
                    curveTo(5.0348f, 4.0f, 5.3333f, 4.2985f, 5.3333f, 4.6667f)
                    curveTo(5.3333f, 5.0349f, 5.0348f, 5.3333f, 4.6666f, 5.3333f)
                    close()
                    moveTo(1.9999f, 5.3333f)
                    curveTo(1.6317f, 5.3333f, 1.3333f, 5.0349f, 1.3333f, 4.6667f)
                    curveTo(1.3333f, 4.2985f, 1.6317f, 4.0f, 1.9999f, 4.0f)
                    curveTo(2.3681f, 4.0f, 2.6666f, 4.2985f, 2.6666f, 4.6667f)
                    curveTo(2.6666f, 5.0349f, 2.3681f, 5.3333f, 1.9999f, 5.3333f)
                    close()
                    moveTo(3.3333f, 6.6667f)
                    curveTo(2.9651f, 6.6667f, 2.6666f, 6.3682f, 2.6666f, 6.0f)
                    curveTo(2.6666f, 5.6318f, 2.9651f, 5.3333f, 3.3333f, 5.3333f)
                    curveTo(3.7014f, 5.3333f, 3.9999f, 5.6318f, 3.9999f, 6.0f)
                    curveTo(3.9999f, 6.3682f, 3.7014f, 6.6667f, 3.3333f, 6.6667f)
                    close()
                    moveTo(5.9999f, 6.6667f)
                    curveTo(5.6317f, 6.6667f, 5.3333f, 6.3682f, 5.3333f, 6.0f)
                    curveTo(5.3333f, 5.6318f, 5.6317f, 5.3333f, 5.9999f, 5.3333f)
                    curveTo(6.3681f, 5.3333f, 6.6666f, 5.6318f, 6.6666f, 6.0f)
                    curveTo(6.6666f, 6.3682f, 6.3681f, 6.6667f, 5.9999f, 6.6667f)
                    close()
                    moveTo(8.6666f, 6.6667f)
                    curveTo(8.2984f, 6.6667f, 7.9999f, 6.3682f, 7.9999f, 6.0f)
                    curveTo(7.9999f, 5.6318f, 8.2984f, 5.3333f, 8.6666f, 5.3333f)
                    curveTo(9.0348f, 5.3333f, 9.3333f, 5.6318f, 9.3333f, 6.0f)
                    curveTo(9.3333f, 6.3682f, 9.0348f, 6.6667f, 8.6666f, 6.6667f)
                    close()
                    moveTo(9.9999f, 8.0f)
                    curveTo(9.6317f, 8.0f, 9.3333f, 7.7015f, 9.3333f, 7.3333f)
                    curveTo(9.3333f, 6.9651f, 9.6317f, 6.6667f, 9.9999f, 6.6667f)
                    curveTo(10.3681f, 6.6667f, 10.6666f, 6.9651f, 10.6666f, 7.3333f)
                    curveTo(10.6666f, 7.7015f, 10.3681f, 8.0f, 9.9999f, 8.0f)
                    close()
                    moveTo(7.3333f, 8.0f)
                    curveTo(6.9651f, 8.0f, 6.6666f, 7.7015f, 6.6666f, 7.3333f)
                    curveTo(6.6666f, 6.9651f, 6.9651f, 6.6667f, 7.3333f, 6.6667f)
                    curveTo(7.7014f, 6.6667f, 7.9999f, 6.9651f, 7.9999f, 7.3333f)
                    curveTo(7.9999f, 7.7015f, 7.7014f, 8.0f, 7.3333f, 8.0f)
                    close()
                    moveTo(4.6666f, 8.0f)
                    curveTo(4.2984f, 8.0f, 3.9999f, 7.7015f, 3.9999f, 7.3333f)
                    curveTo(3.9999f, 6.9651f, 4.2984f, 6.6667f, 4.6666f, 6.6667f)
                    curveTo(5.0348f, 6.6667f, 5.3333f, 6.9651f, 5.3333f, 7.3333f)
                    curveTo(5.3333f, 7.7015f, 5.0348f, 8.0f, 4.6666f, 8.0f)
                    close()
                    moveTo(1.9999f, 8.0f)
                    curveTo(1.6317f, 8.0f, 1.3333f, 7.7015f, 1.3333f, 7.3333f)
                    curveTo(1.3333f, 6.9651f, 1.6317f, 6.6667f, 1.9999f, 6.6667f)
                    curveTo(2.3681f, 6.6667f, 2.6666f, 6.9651f, 2.6666f, 7.3333f)
                    curveTo(2.6666f, 7.7015f, 2.3681f, 8.0f, 1.9999f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _um!!
    }

private var _um: ImageVector? = null
