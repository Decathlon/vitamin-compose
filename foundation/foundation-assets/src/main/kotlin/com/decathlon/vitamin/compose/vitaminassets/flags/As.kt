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

public val FlagsGroup.As: ImageVector
    get() {
        if (_as != null) {
            return _as!!
        }
        _as = Builder(name = "As", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,3.05176E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF071585), 1.0f to Color(0xFF000B64),
                        start = Offset(14.0f,3.05176E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFD32636), 1.0f to Color(0xFFBA1827),
                        start = Offset(14.6667f,-0.666656f), end = Offset(14.6667f,20.6667f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(29.3333f, 20.6667f)
                    lineTo(0.0f, 10.0f)
                    lineTo(29.3333f, -0.6667f)
                    verticalLineTo(20.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(15.9507f,1.23694f), end = Offset(15.9507f,18.7631f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9999f, 1.2369f)
                    lineTo(3.9015f, 10.0f)
                    lineTo(27.9999f, 18.7631f)
                    verticalLineTo(1.2369f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFAB5423), 1.0f to Color(0xFF5A3719),
                        start = Offset(22.0054f,4.00003f), end = Offset(20.8368f,10.5017f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(21.3333f, 9.3847f)
                    curveTo(21.1753f, 9.2268f, 20.2589f, 9.5923f, 20.2589f, 9.5923f)
                    lineTo(18.6666f, 8.0f)
                    curveTo(18.6666f, 8.0f, 18.5844f, 7.116f, 19.3333f, 6.6667f)
                    curveTo(19.8996f, 6.3269f, 20.9606f, 6.4531f, 21.9986f, 6.0f)
                    curveTo(23.6613f, 5.2744f, 25.3333f, 4.0f, 25.3333f, 4.0f)
                    lineTo(24.2639f, 6.9408f)
                    curveTo(24.2639f, 6.9408f, 25.4888f, 7.5724f, 25.3333f, 8.0f)
                    curveTo(25.2882f, 8.124f, 24.0925f, 8.5128f, 23.9999f, 8.6667f)
                    curveTo(23.824f, 8.9591f, 24.6986f, 9.0478f, 24.4263f, 9.3847f)
                    curveTo(23.6436f, 10.3533f, 22.6666f, 11.3334f, 22.6666f, 11.3334f)
                    lineTo(21.3333f, 10.6667f)
                    curveTo(21.3333f, 10.6667f, 21.5335f, 9.5849f, 21.3333f, 9.3847f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC322)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 11.3334f)
                    curveTo(18.7363f, 11.3334f, 19.3333f, 10.7364f, 19.3333f, 10.0f)
                    curveTo(19.3333f, 9.2636f, 18.7363f, 8.6667f, 18.0f, 8.6667f)
                    curveTo(17.2636f, 8.6667f, 16.6666f, 9.2636f, 16.6666f, 10.0f)
                    curveTo(16.6666f, 10.7364f, 17.2636f, 11.3334f, 18.0f, 11.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC322)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.6667f, 12.0f)
                    horizontalLineTo(23.3333f)
                    curveTo(23.7015f, 12.0f, 24.0f, 11.7015f, 24.0f, 11.3334f)
                    curveTo(24.0f, 10.9652f, 23.7015f, 10.6667f, 23.3333f, 10.6667f)
                    horizontalLineTo(16.6667f)
                    curveTo(16.2985f, 10.6667f, 16.0f, 10.9652f, 16.0f, 11.3334f)
                    curveTo(16.0f, 11.7015f, 16.2985f, 12.0f, 16.6667f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC322)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9293f, 13.9461f)
                    lineTo(23.596f, 11.9461f)
                    curveTo(23.9344f, 11.8011f, 24.0912f, 11.4092f, 23.9461f, 11.0708f)
                    curveTo(23.8011f, 10.7323f, 23.4092f, 10.5756f, 23.0708f, 10.7206f)
                    lineTo(18.4041f, 12.7206f)
                    curveTo(18.0657f, 12.8656f, 17.9089f, 13.2576f, 18.054f, 13.596f)
                    curveTo(18.199f, 13.9344f, 18.5909f, 14.0912f, 18.9293f, 13.9461f)
                    close()
                }
            }
        }
        .build()
        return _as!!
    }

private var _as: ImageVector? = null
