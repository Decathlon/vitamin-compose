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

public val FlagsGroup.Ss: ImageVector
    get() {
        if (_ss != null) {
            return _ss!!
        }
        _ss = Builder(name = "Ss", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,5.33333f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE22A32), 1.0f to Color(0xFFD61C24),
                        start = Offset(14.0002f,6.66667f), end = Offset(14.0002f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 6.6667f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0002f,5.33333f), end = Offset(14.0002f,6.66666f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 5.3333f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF2CA244), 1.0f to Color(0xFF218736),
                        start = Offset(14.0002f,14.6667f), end = Offset(14.0002f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 14.6667f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0002f,13.3333f), end = Offset(14.0002f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0002f, 13.3333f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF185AC6), 1.0f to Color(0xFF104CAD),
                        start = Offset(6.66667f,0.0f), end = Offset(6.66667f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(13.3333f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFDE14A), 1.0f to Color(0xFFFCDC34),
                        start = Offset(4.52384f,7.33333f), end = Offset(4.52384f,12.3563f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(5.1153f, 10.6493f)
                    lineTo(4.2039f, 12.3563f)
                    lineTo(3.9313f, 10.4405f)
                    lineTo(2.0262f, 10.1012f)
                    lineTo(3.764f, 9.25f)
                    lineTo(3.4979f, 7.3333f)
                    lineTo(4.8445f, 8.723f)
                    lineTo(6.5852f, 7.8777f)
                    lineTo(5.6797f, 9.5878f)
                    lineTo(7.0215f, 10.982f)
                    lineTo(5.1153f, 10.6493f)
                    close()
                }
            }
        }
        .build()
        return _ss!!
    }

private var _ss: ImageVector? = null
