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

public val FlagsGroup.Tc: ImageVector
    get() {
        if (_tc != null) {
            return _tc!!
        }
        _tc = Builder(name = "Tc", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3335f, 10.0f)
                    curveTo(17.3335f, 8.9062f, 17.3335f, 7.6131f, 17.3335f, 6.6658f)
                    curveTo(17.3335f, 5.9294f, 17.9305f, 5.3333f, 18.6668f, 5.3333f)
                    horizontalLineTo(22.6668f)
                    curveTo(23.4032f, 5.3333f, 24.0002f, 5.9294f, 24.0002f, 6.6658f)
                    curveTo(24.0002f, 7.6131f, 24.0002f, 8.9062f, 24.0002f, 10.0f)
                    curveTo(24.0002f, 13.3333f, 20.6668f, 14.6666f, 20.6668f, 14.6666f)
                    curveTo(20.6668f, 14.6666f, 17.3335f, 13.3333f, 17.3335f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.0002f, 10.0f)
                    curveTo(18.0002f, 11.4187f, 18.7025f, 12.4185f, 19.4461f, 13.0878f)
                    curveTo(19.8185f, 13.4229f, 20.1931f, 13.6667f, 20.4747f, 13.8262f)
                    curveTo(20.5457f, 13.8664f, 20.6103f, 13.901f, 20.6668f, 13.9302f)
                    curveTo(20.7234f, 13.901f, 20.788f, 13.8664f, 20.859f, 13.8262f)
                    curveTo(21.1406f, 13.6667f, 21.5152f, 13.4229f, 21.8875f, 13.0878f)
                    curveTo(22.6312f, 12.4185f, 23.3335f, 11.4187f, 23.3335f, 10.0f)
                    verticalLineTo(6.6658f)
                    curveTo(23.3335f, 6.2982f, 23.0356f, 6.0f, 22.6668f, 6.0f)
                    horizontalLineTo(18.6668f)
                    curveTo(18.2981f, 6.0f, 18.0002f, 6.2982f, 18.0002f, 6.6658f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(17.3335f, 6.6658f)
                    verticalLineTo(10.0f)
                    curveTo(17.3335f, 13.3333f, 20.6668f, 14.6666f, 20.6668f, 14.6666f)
                    curveTo(20.6668f, 14.6666f, 24.0002f, 13.3333f, 24.0002f, 10.0f)
                    verticalLineTo(6.6658f)
                    curveTo(24.0002f, 5.9294f, 23.4032f, 5.3333f, 22.6668f, 5.3333f)
                    horizontalLineTo(18.6668f)
                    curveTo(17.9305f, 5.3333f, 17.3335f, 5.9294f, 17.3335f, 6.6658f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFBA5B1F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(22.0002f, 9.3333f)
                    curveTo(22.3684f, 9.3333f, 22.6668f, 8.7364f, 22.6668f, 8.0f)
                    curveTo(22.6668f, 7.2636f, 22.3684f, 6.6666f, 22.0002f, 6.6666f)
                    curveTo(21.632f, 6.6666f, 21.3335f, 7.2636f, 21.3335f, 8.0f)
                    curveTo(21.3335f, 8.7364f, 21.632f, 9.3333f, 22.0002f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF9F3E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.5385f, 9.2931f)
                    curveTo(19.8845f, 9.1672f, 19.9608f, 8.5041f, 19.709f, 7.8122f)
                    curveTo(19.4571f, 7.1202f, 18.9724f, 6.6613f, 18.6265f, 6.7873f)
                    curveTo(18.2805f, 6.9132f, 18.2042f, 7.5762f, 18.456f, 8.2682f)
                    curveTo(18.7079f, 8.9601f, 19.1925f, 9.419f, 19.5385f, 9.2931f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF937F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.0519f, 9.2708f)
                    curveTo(19.3856f, 9.4264f, 19.9084f, 9.0115f, 20.2196f, 8.3442f)
                    curveTo(20.5308f, 7.6768f, 20.5126f, 7.0096f, 20.1789f, 6.854f)
                    curveTo(19.8452f, 6.6984f, 19.3224f, 7.1133f, 19.0112f, 7.7807f)
                    curveTo(18.7f, 8.4481f, 18.7182f, 9.1152f, 19.0519f, 9.2708f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF01A827)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0f, 10.6666f)
                    lineTo(20.6667f, 9.3333f)
                    lineTo(21.3333f, 10.6666f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(10.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0006f, 0.9449f)
                    lineTo(11.4314f, 3.0997f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(6.6674f)
                    horizontalLineTo(11.4319f)
                    lineTo(14.0006f, 8.8212f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(10.8044f)
                    lineTo(8.7864f, 8.3103f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(5.215f)
                    verticalLineTo(8.3088f)
                    lineTo(3.1932f, 10.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.811f)
                    lineTo(2.5635f, 6.6674f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0997f)
                    horizontalLineTo(2.5671f)
                    lineTo(0.0f, 0.9495f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.4735f)
                    lineTo(5.215f, 1.4576f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(8.7864f)
                    verticalLineTo(1.4605f)
                    lineTo(10.5352f, 0.0f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(0.9449f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6822f, 4.1023f)
                    lineTo(13.5704f, 0.0026f)
                    lineTo(12.0937f, 0.0f)
                    lineTo(7.7858f, 3.601f)
                    verticalLineTo(0.0045f)
                    lineTo(6.2144f, 0.0045f)
                    verticalLineTo(3.6011f)
                    lineTo(1.9275f, 0.0131f)
                    lineTo(0.4255f, 0.0045f)
                    lineTo(5.3177f, 4.1023f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.67f)
                    horizontalLineTo(5.3176f)
                    lineTo(0.1384f, 10.0008f)
                    lineTo(1.6385f, 9.9989f)
                    lineTo(6.2144f, 6.171f)
                    verticalLineTo(10.0004f)
                    horizontalLineTo(7.7858f)
                    verticalLineTo(6.1713f)
                    lineTo(12.3594f, 10.0008f)
                    lineTo(13.8497f, 10.0028f)
                    lineTo(8.6823f, 5.67f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(4.1023f)
                    horizontalLineTo(8.6822f)
                    close()
                }
            }
        }
        .build()
        return _tc!!
    }

private var _tc: ImageVector? = null
