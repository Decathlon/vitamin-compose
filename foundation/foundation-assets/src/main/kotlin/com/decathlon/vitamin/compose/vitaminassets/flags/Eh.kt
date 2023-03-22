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

public val FlagsGroup.Eh: ImageVector
    get() {
        if (_eh != null) {
            return _eh!!
        }
        _eh = Builder(name = "Eh", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFF20934F), 1.0f to Color(0xFF197940),
                        start = Offset(13.9999f,13.3333f), end = Offset(13.9999f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9999f, 13.3333f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,6.66667f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9999f,6.66666f), end = Offset(13.9999f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9999f, 6.6667f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.1804f, 10.3098f)
                    lineTo(17.6463f, 10.6906f)
                    lineTo(17.8434f, 10.065f)
                    lineTo(17.3162f, 9.6747f)
                    lineTo(17.9721f, 9.6688f)
                    lineTo(18.1804f, 9.0468f)
                    lineTo(18.3887f, 9.6688f)
                    lineTo(19.0446f, 9.6747f)
                    lineTo(18.5174f, 10.065f)
                    lineTo(18.7145f, 10.6906f)
                    lineTo(18.1804f, 10.3098f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.2983f, 11.4486f)
                    curveTo(17.948f, 11.7906f, 17.4773f, 12.0f, 16.9596f, 12.0f)
                    curveTo(15.8774f, 12.0f, 15.0f, 11.0846f, 15.0f, 9.9555f)
                    curveTo(15.0f, 8.8263f, 15.8774f, 7.911f, 16.9596f, 7.911f)
                    curveTo(17.4773f, 7.911f, 17.948f, 8.1203f, 18.2983f, 8.4623f)
                    curveTo(18.0568f, 8.3474f, 17.7836f, 8.2827f, 17.4943f, 8.2827f)
                    curveTo(16.5104f, 8.2827f, 15.7128f, 9.0316f, 15.7128f, 9.9555f)
                    curveTo(15.7128f, 10.8793f, 16.5104f, 11.6283f, 17.4943f, 11.6283f)
                    curveTo(17.7836f, 11.6283f, 18.0568f, 11.5635f, 18.2983f, 11.4486f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE62539), 1.0f to Color(0xFFCA1A2C),
                        start = Offset(6.66667f,0.0f), end = Offset(6.66667f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(13.3333f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _eh!!
    }

private var _eh: ImageVector? = null
