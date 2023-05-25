package com.decathlon.vitamin.compose.vitaminassets.flags

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

public val FlagsGroup.Dm: ImageVector
    get() {
        if (_dm != null) {
            return _dm!!
        }
        _dm = Builder(name = "Dm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF108753)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF108753)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6667f, 20.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFCD449)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3333f, 20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE02C42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 14.6667f)
                    curveTo(16.5773f, 14.6667f, 18.6667f, 12.5773f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 7.4227f, 16.5773f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(11.4227f, 5.3333f, 9.3333f, 7.4227f, 9.3333f, 10.0f)
                    curveTo(9.3333f, 12.5773f, 11.4227f, 14.6667f, 14.0f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E673F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 7.3333f)
                    curveTo(13.9291f, 7.3333f, 13.8591f, 7.3361f, 13.7898f, 7.3415f)
                    curveTo(13.4228f, 7.37f, 13.1021f, 7.0955f, 13.0735f, 6.7284f)
                    curveTo(13.045f, 6.3614f, 13.3195f, 6.0406f, 13.6866f, 6.0121f)
                    curveTo(13.7901f, 6.0041f, 13.8946f, 6.0f, 14.0f, 6.0f)
                    curveTo(14.1054f, 6.0f, 14.2099f, 6.0041f, 14.3134f, 6.0121f)
                    curveTo(14.6805f, 6.0406f, 14.955f, 6.3614f, 14.9265f, 6.7284f)
                    curveTo(14.8979f, 7.0955f, 14.5772f, 7.37f, 14.2102f, 7.3415f)
                    curveTo(14.1409f, 7.3361f, 14.0709f, 7.3333f, 14.0f, 7.3333f)
                    close()
                    moveTo(12.3419f, 7.0321f)
                    curveTo(12.5811f, 7.3119f, 12.5482f, 7.7327f, 12.2683f, 7.972f)
                    curveTo(12.162f, 8.0629f, 12.0629f, 8.162f, 11.972f, 8.2683f)
                    curveTo(11.7327f, 8.5482f, 11.3119f, 8.5811f, 11.0321f, 8.3419f)
                    curveTo(10.7522f, 8.1026f, 10.7193f, 7.6818f, 10.9585f, 7.4019f)
                    curveTo(11.0945f, 7.2428f, 11.2428f, 7.0945f, 11.4019f, 6.9585f)
                    curveTo(11.6818f, 6.7193f, 12.1026f, 6.7522f, 12.3419f, 7.0321f)
                    close()
                    moveTo(15.6581f, 7.0321f)
                    curveTo(15.8974f, 6.7522f, 16.3182f, 6.7193f, 16.5981f, 6.9585f)
                    curveTo(16.7572f, 7.0945f, 16.9055f, 7.2428f, 17.0415f, 7.4019f)
                    curveTo(17.2807f, 7.6818f, 17.2478f, 8.1026f, 16.968f, 8.3419f)
                    curveTo(16.6881f, 8.5811f, 16.2673f, 8.5482f, 16.028f, 8.2683f)
                    curveTo(15.9371f, 8.162f, 15.838f, 8.0629f, 15.7317f, 7.972f)
                    curveTo(15.4518f, 7.7327f, 15.4189f, 7.3119f, 15.6581f, 7.0321f)
                    close()
                    moveTo(10.7284f, 9.0736f)
                    curveTo(11.0955f, 9.1021f, 11.37f, 9.4228f, 11.3415f, 9.7899f)
                    curveTo(11.3361f, 9.8591f, 11.3333f, 9.9291f, 11.3333f, 10.0f)
                    curveTo(11.3333f, 10.0709f, 11.3361f, 10.1409f, 11.3415f, 10.2102f)
                    curveTo(11.37f, 10.5772f, 11.0955f, 10.8979f, 10.7284f, 10.9265f)
                    curveTo(10.3613f, 10.955f, 10.0406f, 10.6805f, 10.0121f, 10.3134f)
                    curveTo(10.0041f, 10.2099f, 10.0f, 10.1054f, 10.0f, 10.0f)
                    curveTo(10.0f, 9.8947f, 10.0041f, 9.7901f, 10.0121f, 9.6866f)
                    curveTo(10.0406f, 9.3195f, 10.3613f, 9.045f, 10.7284f, 9.0736f)
                    close()
                    moveTo(17.2716f, 9.0736f)
                    curveTo(17.6387f, 9.045f, 17.9594f, 9.3195f, 17.9879f, 9.6866f)
                    curveTo(17.9959f, 9.7901f, 18.0f, 9.8947f, 18.0f, 10.0f)
                    curveTo(18.0f, 10.1054f, 17.9959f, 10.2099f, 17.9879f, 10.3134f)
                    curveTo(17.9594f, 10.6805f, 17.6387f, 10.955f, 17.2716f, 10.9265f)
                    curveTo(16.9045f, 10.8979f, 16.63f, 10.5772f, 16.6585f, 10.2102f)
                    curveTo(16.6639f, 10.1409f, 16.6667f, 10.0709f, 16.6667f, 10.0f)
                    curveTo(16.6667f, 9.9291f, 16.6639f, 9.8591f, 16.6585f, 9.7899f)
                    curveTo(16.63f, 9.4228f, 16.9045f, 9.1021f, 17.2716f, 9.0736f)
                    close()
                    moveTo(11.0321f, 11.6581f)
                    curveTo(11.3119f, 11.4189f, 11.7327f, 11.4518f, 11.972f, 11.7317f)
                    curveTo(12.0629f, 11.838f, 12.162f, 11.9371f, 12.2683f, 12.028f)
                    curveTo(12.5482f, 12.2673f, 12.5811f, 12.6881f, 12.3419f, 12.9679f)
                    curveTo(12.1026f, 13.2478f, 11.6818f, 13.2807f, 11.4019f, 13.0415f)
                    curveTo(11.2428f, 12.9055f, 11.0945f, 12.7572f, 10.9585f, 12.5981f)
                    curveTo(10.7193f, 12.3182f, 10.7522f, 11.8974f, 11.0321f, 11.6581f)
                    close()
                    moveTo(16.968f, 11.6581f)
                    curveTo(17.2478f, 11.8974f, 17.2807f, 12.3182f, 17.0415f, 12.5981f)
                    curveTo(16.9055f, 12.7572f, 16.7572f, 12.9055f, 16.5981f, 13.0415f)
                    curveTo(16.3182f, 13.2807f, 15.8974f, 13.2478f, 15.6581f, 12.968f)
                    curveTo(15.4189f, 12.6881f, 15.4518f, 12.2673f, 15.7317f, 12.028f)
                    curveTo(15.838f, 11.9371f, 15.9371f, 11.838f, 16.028f, 11.7317f)
                    curveTo(16.2673f, 11.4518f, 16.6881f, 11.4189f, 16.968f, 11.6581f)
                    close()
                    moveTo(13.0735f, 13.2716f)
                    curveTo(13.1021f, 12.9045f, 13.4228f, 12.63f, 13.7898f, 12.6585f)
                    curveTo(13.8591f, 12.6639f, 13.9291f, 12.6667f, 14.0f, 12.6667f)
                    curveTo(14.0709f, 12.6667f, 14.1409f, 12.6639f, 14.2102f, 12.6585f)
                    curveTo(14.5772f, 12.63f, 14.8979f, 12.9045f, 14.9265f, 13.2716f)
                    curveTo(14.955f, 13.6387f, 14.6805f, 13.9594f, 14.3134f, 13.9879f)
                    curveTo(14.2099f, 13.9959f, 14.1054f, 14.0f, 14.0f, 14.0f)
                    curveTo(13.8946f, 14.0f, 13.7901f, 13.9959f, 13.6866f, 13.9879f)
                    curveTo(13.3195f, 13.9594f, 13.045f, 13.6387f, 13.0735f, 13.2716f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E673F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 11.3333f)
                    curveTo(14.7364f, 11.3333f, 14.6667f, 10.7364f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 9.2636f, 14.7364f, 8.6667f, 14.0f, 8.6667f)
                    curveTo(13.2636f, 8.6667f, 13.3333f, 9.2636f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 10.7364f, 13.2636f, 11.3333f, 14.0f, 11.3333f)
                    close()
                }
            }
        }
        .build()
        return _dm!!
    }

private var _dm: ImageVector? = null
