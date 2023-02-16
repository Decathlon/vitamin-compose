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

public val FlagsGroup.Nf: ImageVector
    get() {
        if (_nf != null) {
            return _nf!!
        }
        _nf = Builder(name = "Nf", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFF219646), 1.0f to Color(0xFF197837),
                        start = Offset(20.6668f,0.0f), end = Offset(20.6668f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(13.3335f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF219646), 1.0f to Color(0xFF197837),
                        start = Offset(4.66667f,0.0f), end = Offset(4.66667f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.3333f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0002f,0.0f), end = Offset(14.0002f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(20.0002f, 0.0f)
                    horizontalLineTo(8.0002f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF259D4B), 1.0f to Color(0xFF197837),
                        start = Offset(14.0002f,2.66666f), end = Offset(14.0002f,17.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.5916f, 5.3375f)
                    lineTo(13.1543f, 3.3118f)
                    curveTo(13.2533f, 2.9555f, 13.6427f, 2.6667f, 14.0002f, 2.6667f)
                    curveTo(14.3684f, 2.6667f, 14.7492f, 2.9633f, 14.846f, 3.3118f)
                    lineTo(15.4087f, 5.3375f)
                    curveTo(15.384f, 5.3348f, 15.3589f, 5.3333f, 15.3335f, 5.3333f)
                    curveTo(14.9653f, 5.3333f, 14.6668f, 5.6318f, 14.6668f, 6.0f)
                    curveTo(14.6668f, 6.3682f, 14.9653f, 6.6667f, 15.3335f, 6.6667f)
                    curveTo(15.4863f, 6.6667f, 15.6272f, 6.6152f, 15.7396f, 6.5287f)
                    lineTo(16.1532f, 8.0176f)
                    curveTo(16.1041f, 8.0061f, 16.0528f, 8.0f, 16.0002f, 8.0f)
                    curveTo(15.632f, 8.0f, 15.3335f, 8.2985f, 15.3335f, 8.6667f)
                    curveTo(15.3335f, 9.0349f, 15.632f, 9.3333f, 16.0002f, 9.3333f)
                    curveTo(16.1814f, 9.3333f, 16.3458f, 9.261f, 16.466f, 9.1436f)
                    lineTo(16.9008f, 10.7089f)
                    curveTo(16.828f, 10.6816f, 16.7492f, 10.6667f, 16.6668f, 10.6667f)
                    curveTo(16.2986f, 10.6667f, 16.0002f, 10.9651f, 16.0002f, 11.3333f)
                    curveTo(16.0002f, 11.7015f, 16.2986f, 12.0f, 16.6668f, 12.0f)
                    curveTo(16.8785f, 12.0f, 17.0672f, 11.9013f, 17.1893f, 11.7475f)
                    lineTo(18.0002f, 14.6667f)
                    horizontalLineTo(14.6668f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(13.3335f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(10.0002f)
                    lineTo(10.8111f, 11.7475f)
                    curveTo(10.9332f, 11.9013f, 11.1218f, 12.0f, 11.3335f, 12.0f)
                    curveTo(11.7017f, 12.0f, 12.0002f, 11.7015f, 12.0002f, 11.3333f)
                    curveTo(12.0002f, 10.9651f, 11.7017f, 10.6667f, 11.3335f, 10.6667f)
                    curveTo(11.2512f, 10.6667f, 11.1723f, 10.6816f, 11.0996f, 10.7089f)
                    lineTo(11.5344f, 9.1436f)
                    curveTo(11.6545f, 9.261f, 11.8189f, 9.3333f, 12.0002f, 9.3333f)
                    curveTo(12.3684f, 9.3333f, 12.6668f, 9.0349f, 12.6668f, 8.6667f)
                    curveTo(12.6668f, 8.2985f, 12.3684f, 8.0f, 12.0002f, 8.0f)
                    curveTo(11.9475f, 8.0f, 11.8963f, 8.0061f, 11.8471f, 8.0176f)
                    lineTo(12.2607f, 6.5287f)
                    curveTo(12.3732f, 6.6152f, 12.514f, 6.6667f, 12.6668f, 6.6667f)
                    curveTo(13.035f, 6.6667f, 13.3335f, 6.3682f, 13.3335f, 6.0f)
                    curveTo(13.3335f, 5.6318f, 13.035f, 5.3333f, 12.6668f, 5.3333f)
                    curveTo(12.6414f, 5.3333f, 12.6163f, 5.3348f, 12.5916f, 5.3375f)
                    close()
                }
            }
        }
        .build()
        return _nf!!
    }

private var _nf: ImageVector? = null
