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

public val FlagsGroup.Bb: ImageVector
    get() {
        if (_bb != null) {
            return _bb!!
        }
        _bb = Builder(name = "Bb", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = linearGradient(0.0f to Color(0xFF1132C7), 1.0f to Color(0xFF0522A5),
                        start = Offset(0.0f,0.0f), end = Offset(0.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF08379D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3334f, 0.0f)
                    horizontalLineToRelative(14.6667f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF08379D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCC50)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3334f, 20.0f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.3334f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.7456f, 6.4135f)
                    curveTo(13.8794f, 6.2168f, 14.1702f, 6.2195f, 14.3003f, 6.4187f)
                    lineTo(14.9965f, 7.4844f)
                    curveTo(15.1413f, 7.7061f, 14.9822f, 8.0f, 14.7174f, 8.0f)
                    horizontalLineTo(14.7017f)
                    curveTo(14.5044f, 8.0f, 14.3504f, 8.1703f, 14.37f, 8.3665f)
                    lineTo(14.6366f, 11.0332f)
                    curveTo(14.6537f, 11.2036f, 14.7971f, 11.3333f, 14.9683f, 11.3333f)
                    horizontalLineTo(15.1963f)
                    curveTo(15.2841f, 11.3333f, 15.3683f, 11.2987f, 15.4307f, 11.237f)
                    lineTo(15.9011f, 10.7717f)
                    curveTo(15.9644f, 10.7091f, 16.0f, 10.6237f, 16.0f, 10.5347f)
                    verticalLineTo(9.4714f)
                    curveTo(16.0f, 9.383f, 15.9649f, 9.2982f, 15.9024f, 9.2357f)
                    lineTo(15.7147f, 9.048f)
                    curveTo(15.5395f, 8.8728f, 15.6099f, 8.5745f, 15.845f, 8.4961f)
                    lineTo(16.798f, 8.1784f)
                    curveTo(17.0387f, 8.0982f, 17.2771f, 8.3055f, 17.2313f, 8.5549f)
                    lineTo(16.7397f, 11.2277f)
                    curveTo(16.7271f, 11.2964f, 16.6932f, 11.3594f, 16.6429f, 11.4077f)
                    lineTo(15.4301f, 12.5736f)
                    curveTo(15.368f, 12.6333f, 15.2852f, 12.6667f, 15.1991f, 12.6667f)
                    horizontalLineTo(15.0f)
                    curveTo(14.8159f, 12.6667f, 14.6667f, 12.8159f, 14.6667f, 13.0f)
                    verticalLineTo(13.6667f)
                    curveTo(14.6667f, 13.8508f, 14.5174f, 14.0f, 14.3333f, 14.0f)
                    horizontalLineTo(13.6667f)
                    curveTo(13.4826f, 14.0f, 13.3333f, 13.8508f, 13.3333f, 13.6667f)
                    verticalLineTo(13.0f)
                    curveTo(13.3333f, 12.8159f, 13.1841f, 12.6667f, 13.0f, 12.6667f)
                    horizontalLineTo(12.8047f)
                    curveTo(12.7163f, 12.6667f, 12.6315f, 12.6315f, 12.569f, 12.569f)
                    lineTo(11.4047f, 11.4047f)
                    curveTo(11.3582f, 11.3582f, 11.3264f, 11.2989f, 11.3135f, 11.2344f)
                    lineTo(10.7793f, 8.5632f)
                    curveTo(10.7291f, 8.3123f, 10.9688f, 8.1007f, 11.2116f, 8.1816f)
                    lineTo(12.155f, 8.4961f)
                    curveTo(12.3901f, 8.5745f, 12.4605f, 8.8728f, 12.2853f, 9.048f)
                    lineTo(12.0976f, 9.2357f)
                    curveTo(12.0351f, 9.2982f, 12.0f, 9.383f, 12.0f, 9.4714f)
                    verticalLineTo(10.5347f)
                    curveTo(12.0f, 10.6237f, 12.0356f, 10.7091f, 12.0989f, 10.7717f)
                    lineTo(12.5693f, 11.237f)
                    curveTo(12.6317f, 11.2987f, 12.7159f, 11.3333f, 12.8037f, 11.3333f)
                    horizontalLineTo(13.0317f)
                    curveTo(13.2029f, 11.3333f, 13.3463f, 11.2036f, 13.3633f, 11.0332f)
                    lineTo(13.63f, 8.3665f)
                    curveTo(13.6496f, 8.1703f, 13.4948f, 8.0f, 13.2976f, 8.0f)
                    curveTo(13.03f, 8.0f, 12.8703f, 7.7005f, 13.0208f, 7.4792f)
                    lineTo(13.7456f, 6.4135f)
                    close()
                }
            }
        }
        .build()
        return _bb!!
    }

private var _bb: ImageVector? = null
