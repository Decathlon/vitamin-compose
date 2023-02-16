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

public val FlagsGroup.Cw: ImageVector
    get() {
        if (_cw != null) {
            return _cw!!
        }
        _cw = Builder(name = "Cw", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0543A8), 1.0f to Color(0xFF00307D),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFCC747), 1.0f to Color(0xFFFEC539),
                        start = Offset(14.0f,13.3333f), end = Offset(14.0f,16.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(8.66667f,4.66666f), end = Offset(8.66667f,9.4907f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.6667f, 8.356f)
                    lineTo(7.0992f, 9.4907f)
                    lineTo(7.694f, 7.6494f)
                    lineTo(6.1305f, 6.5093f)
                    lineTo(8.0655f, 6.5059f)
                    lineTo(8.6667f, 4.6667f)
                    lineTo(9.2678f, 6.5059f)
                    lineTo(11.2028f, 6.5093f)
                    lineTo(9.6393f, 7.6494f)
                    lineTo(10.2341f, 9.4907f)
                    lineTo(8.6667f, 8.356f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(3.99992f,2.0f), end = Offset(3.99992f,5.61803f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.9999f, 4.767f)
                    lineTo(2.8244f, 5.618f)
                    lineTo(3.2705f, 4.237f)
                    lineTo(2.0978f, 3.382f)
                    lineTo(3.5491f, 3.3795f)
                    lineTo(3.9999f, 2.0f)
                    lineTo(4.4508f, 3.3795f)
                    lineTo(5.902f, 3.382f)
                    lineTo(4.7294f, 4.237f)
                    lineTo(5.1755f, 5.618f)
                    lineTo(3.9999f, 4.767f)
                    close()
                }
            }
        }
        .build()
        return _cw!!
    }

private var _cw: ImageVector? = null
