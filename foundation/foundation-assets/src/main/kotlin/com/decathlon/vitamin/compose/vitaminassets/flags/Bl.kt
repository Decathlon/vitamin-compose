package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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

public val FlagsGroup.Bl: ImageVector
    get() {
        if (_bl != null) {
            return _bl!!
        }
        _bl = Builder(name = "Bl", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFF216CD3), 1.0f to Color(0xFF1557B2),
                        start = Offset(14.0f,6.66666f), end = Offset(14.0f,17.2313f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.3334f, 6.6667f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(12.6549f)
                    curveTo(18.6667f, 13.3978f, 18.2192f, 14.3835f, 17.6541f, 14.8679f)
                    lineTo(15.5281f, 16.6902f)
                    curveTo(14.6842f, 17.4136f, 13.3115f, 17.4098f, 12.472f, 16.6902f)
                    lineTo(10.346f, 14.8679f)
                    curveTo(9.7867f, 14.3886f, 9.3334f, 13.3999f, 9.3334f, 12.6549f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E),
                        start = Offset(14.0001f,7.99997f), end = Offset(14.0001f,9.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(11.3334f, 9.3333f)
                    curveTo(10.9652f, 9.3333f, 10.6667f, 9.0348f, 10.6667f, 8.6666f)
                    curveTo(10.6667f, 8.2985f, 10.9652f, 8.0f, 11.3334f, 8.0f)
                    curveTo(11.7016f, 8.0f, 12.0001f, 8.2985f, 12.0001f, 8.6666f)
                    curveTo(12.0001f, 9.0348f, 11.7016f, 9.3333f, 11.3334f, 9.3333f)
                    close()
                    moveTo(14.0001f, 9.3333f)
                    curveTo(13.6319f, 9.3333f, 13.3334f, 9.0348f, 13.3334f, 8.6666f)
                    curveTo(13.3334f, 8.2985f, 13.6319f, 8.0f, 14.0001f, 8.0f)
                    curveTo(14.3683f, 8.0f, 14.6667f, 8.2985f, 14.6667f, 8.6666f)
                    curveTo(14.6667f, 9.0348f, 14.3683f, 9.3333f, 14.0001f, 9.3333f)
                    close()
                    moveTo(16.6667f, 9.3333f)
                    curveTo(16.2986f, 9.3333f, 16.0001f, 9.0348f, 16.0001f, 8.6666f)
                    curveTo(16.0001f, 8.2985f, 16.2986f, 8.0f, 16.6667f, 8.0f)
                    curveTo(17.0349f, 8.0f, 17.3334f, 8.2985f, 17.3334f, 8.6666f)
                    curveTo(17.3334f, 9.0348f, 17.0349f, 9.3333f, 16.6667f, 9.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E),
                        start = Offset(14.0f,14.0f), end = Offset(14.0f,16.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.0f, 15.3333f)
                    curveTo(11.6319f, 15.3333f, 11.3334f, 15.0348f, 11.3334f, 14.6666f)
                    curveTo(11.3334f, 14.2984f, 11.6319f, 14.0f, 12.0f, 14.0f)
                    curveTo(12.3682f, 14.0f, 12.6667f, 14.2984f, 12.6667f, 14.6666f)
                    curveTo(12.6667f, 15.0348f, 12.3682f, 15.3333f, 12.0f, 15.3333f)
                    close()
                    moveTo(14.0f, 16.0f)
                    curveTo(13.6319f, 16.0f, 13.3334f, 15.7015f, 13.3334f, 15.3333f)
                    curveTo(13.3334f, 14.9651f, 13.6319f, 14.6666f, 14.0f, 14.6666f)
                    curveTo(14.3682f, 14.6666f, 14.6667f, 14.9651f, 14.6667f, 15.3333f)
                    curveTo(14.6667f, 15.7015f, 14.3682f, 16.0f, 14.0f, 16.0f)
                    close()
                    moveTo(16.0f, 15.3333f)
                    curveTo(15.6319f, 15.3333f, 15.3334f, 15.0348f, 15.3334f, 14.6666f)
                    curveTo(15.3334f, 14.2984f, 15.6319f, 14.0f, 16.0f, 14.0f)
                    curveTo(16.3682f, 14.0f, 16.6667f, 14.2984f, 16.6667f, 14.6666f)
                    curveTo(16.6667f, 15.0348f, 16.3682f, 15.3333f, 16.0f, 15.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE12539), 1.0f to Color(0xFFCA192C),
                        start = Offset(14.0f,10.6666f), end = Offset(14.0f,13.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.6667f, 10.6666f)
                    horizontalLineTo(9.3334f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(10.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0001f, 13.3333f)
                    curveTo(14.7365f, 13.3333f, 15.3334f, 12.7363f, 15.3334f, 12.0f)
                    curveTo(15.3334f, 11.2636f, 14.7365f, 10.6666f, 14.0001f, 10.6666f)
                    curveTo(13.2637f, 10.6666f, 12.6667f, 11.2636f, 12.6667f, 12.0f)
                    curveTo(12.6667f, 12.7363f, 13.2637f, 13.3333f, 14.0001f, 13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E),
                        start = Offset(14.0f,4.0f), end = Offset(14.0f,7.33333f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.6666f, 4.6667f)
                    curveTo(8.6666f, 4.6667f, 11.3333f, 4.0f, 14.0f, 4.0f)
                    curveTo(16.6666f, 4.0f, 19.3333f, 4.6667f, 19.3333f, 4.6667f)
                    lineTo(18.6666f, 7.3333f)
                    curveTo(18.6666f, 7.3333f, 16.3333f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(11.6666f, 6.6667f, 9.3333f, 7.3333f, 9.3333f, 7.3333f)
                    lineTo(8.6666f, 4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5E5216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 6.0f)
                    curveTo(13.6318f, 6.0f, 13.3333f, 5.7015f, 13.3333f, 5.3333f)
                    curveTo(13.3333f, 4.9651f, 13.6318f, 4.6667f, 14.0f, 4.6667f)
                    curveTo(14.3681f, 4.6667f, 14.6666f, 4.9651f, 14.6666f, 5.3333f)
                    curveTo(14.6666f, 5.7015f, 14.3681f, 6.0f, 14.0f, 6.0f)
                    close()
                    moveTo(16.6666f, 6.0f)
                    curveTo(16.2984f, 6.0f, 16.0f, 5.7015f, 16.0f, 5.3333f)
                    curveTo(16.0f, 4.9651f, 16.2984f, 4.6667f, 16.6666f, 4.6667f)
                    curveTo(17.0348f, 4.6667f, 17.3333f, 4.9651f, 17.3333f, 5.3333f)
                    curveTo(17.3333f, 5.7015f, 17.0348f, 6.0f, 16.6666f, 6.0f)
                    close()
                    moveTo(11.3333f, 6.0f)
                    curveTo(10.9651f, 6.0f, 10.6666f, 5.7015f, 10.6666f, 5.3333f)
                    curveTo(10.6666f, 4.9651f, 10.9651f, 4.6667f, 11.3333f, 4.6667f)
                    curveTo(11.7015f, 4.6667f, 12.0f, 4.9651f, 12.0f, 5.3333f)
                    curveTo(12.0f, 5.7015f, 11.7015f, 6.0f, 11.3333f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _bl!!
    }

private var _bl: ImageVector? = null
