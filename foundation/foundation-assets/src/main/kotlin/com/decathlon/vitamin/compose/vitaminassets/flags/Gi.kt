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

public val FlagsGroup.Gi: ImageVector
    get() {
        if (_gi != null) {
            return _gi!!
        }
        _gi = Builder(name = "Gi", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,13.3333f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE71924), 1.0f to Color(0xFFD6101B),
                        start = Offset(14.0f,13.3333f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFEA1824), 1.0f to Color(0xFFD6101B),
                        start = Offset(14.0001f,4.0f), end = Offset(14.0001f,12.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.0001f, 8.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(5.9873f)
                    curveTo(10.6667f, 5.6201f, 10.3654f, 5.3333f, 9.9938f, 5.3333f)
                    horizontalLineTo(8.673f)
                    curveTo(8.2854f, 5.3333f, 8.0f, 5.6261f, 8.0f, 5.9873f)
                    verticalLineTo(9.0063f)
                    verticalLineTo(10.6667f)
                    lineTo(6.6667f, 12.0f)
                    horizontalLineTo(21.3334f)
                    lineTo(20.0001f, 10.6667f)
                    verticalLineTo(9.0063f)
                    verticalLineTo(5.9873f)
                    curveTo(20.0001f, 5.6201f, 19.6988f, 5.3333f, 19.3271f, 5.3333f)
                    horizontalLineTo(18.0063f)
                    curveTo(17.6188f, 5.3333f, 17.3334f, 5.6261f, 17.3334f, 5.9873f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(4.654f)
                    curveTo(16.0001f, 4.2867f, 15.7043f, 4.0f, 15.3395f, 4.0f)
                    horizontalLineTo(12.6606f)
                    curveTo(12.2877f, 4.0f, 12.0001f, 4.2928f, 12.0001f, 4.654f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(14.0001f,5.33334f), end = Offset(14.0001f,10.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.3334f, 10.6667f)
                    curveTo(8.9652f, 10.6667f, 8.6667f, 10.3682f, 8.6667f, 10.0f)
                    curveTo(8.6667f, 9.6318f, 8.9652f, 9.3333f, 9.3334f, 9.3333f)
                    curveTo(9.7016f, 9.3333f, 10.0001f, 9.6318f, 10.0001f, 10.0f)
                    curveTo(10.0001f, 10.3682f, 9.7016f, 10.6667f, 9.3334f, 10.6667f)
                    close()
                    moveTo(9.3334f, 8.0f)
                    curveTo(8.9652f, 8.0f, 8.6667f, 7.7015f, 8.6667f, 7.3333f)
                    curveTo(8.6667f, 6.9651f, 8.9652f, 6.6667f, 9.3334f, 6.6667f)
                    curveTo(9.7016f, 6.6667f, 10.0001f, 6.9651f, 10.0001f, 7.3333f)
                    curveTo(10.0001f, 7.7015f, 9.7016f, 8.0f, 9.3334f, 8.0f)
                    close()
                    moveTo(14.0001f, 10.6667f)
                    curveTo(13.6319f, 10.6667f, 13.3334f, 10.3682f, 13.3334f, 10.0f)
                    curveTo(13.3334f, 9.6318f, 13.6319f, 9.3333f, 14.0001f, 9.3333f)
                    curveTo(14.3682f, 9.3333f, 14.6667f, 9.6318f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 10.3682f, 14.3682f, 10.6667f, 14.0001f, 10.6667f)
                    close()
                    moveTo(14.0001f, 6.6667f)
                    curveTo(13.6319f, 6.6667f, 13.3334f, 6.3682f, 13.3334f, 6.0f)
                    curveTo(13.3334f, 5.6318f, 13.6319f, 5.3333f, 14.0001f, 5.3333f)
                    curveTo(14.3682f, 5.3333f, 14.6667f, 5.6318f, 14.6667f, 6.0f)
                    curveTo(14.6667f, 6.3682f, 14.3682f, 6.6667f, 14.0001f, 6.6667f)
                    close()
                    moveTo(18.6667f, 10.6667f)
                    curveTo(18.2985f, 10.6667f, 18.0001f, 10.3682f, 18.0001f, 10.0f)
                    curveTo(18.0001f, 9.6318f, 18.2985f, 9.3333f, 18.6667f, 9.3333f)
                    curveTo(19.0349f, 9.3333f, 19.3334f, 9.6318f, 19.3334f, 10.0f)
                    curveTo(19.3334f, 10.3682f, 19.0349f, 10.6667f, 18.6667f, 10.6667f)
                    close()
                    moveTo(18.6667f, 8.0f)
                    curveTo(18.2985f, 8.0f, 18.0001f, 7.7015f, 18.0001f, 7.3333f)
                    curveTo(18.0001f, 6.9651f, 18.2985f, 6.6667f, 18.6667f, 6.6667f)
                    curveTo(19.0349f, 6.6667f, 19.3334f, 6.9651f, 19.3334f, 7.3333f)
                    curveTo(19.3334f, 7.7015f, 19.0349f, 8.0f, 18.6667f, 8.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFECCE3E), 1.0f to Color(0xFFD9BC2D),
                        start = Offset(14.0f,10.6667f), end = Offset(14.0f,17.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.3334f, 13.2575f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(13.2575f)
                    curveTo(15.4435f, 13.0744f, 16.0f, 12.5805f, 16.0f, 12.0f)
                    curveTo(16.0f, 11.2636f, 15.1046f, 10.6667f, 14.0f, 10.6667f)
                    curveTo(12.8955f, 10.6667f, 12.0f, 11.2636f, 12.0f, 12.0f)
                    curveTo(12.0f, 12.5805f, 12.5566f, 13.0744f, 13.3334f, 13.2575f)
                    close()
                }
            }
        }
        .build()
        return _gi!!
    }

private var _gi: ImageVector? = null
