package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val FlagsGroup.Coc: ImageVector
    get() {
        if (_coc != null) {
            return _coc!!
        }
        _coc = Builder(name = "Coc", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth
                = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, -2.0E-4f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.4443f, 3.3333f)
                    curveTo(13.3721f, 3.3333f, 13.302f, 3.3568f, 13.2443f, 3.4f)
                    lineTo(10.7203f, 5.293f)
                    curveTo(10.6848f, 5.3196f, 10.6443f, 5.3389f, 10.6012f, 5.3497f)
                    lineTo(8.0353f, 5.9911f)
                    curveTo(8.0117f, 5.997f, 7.9888f, 6.0055f, 7.9671f, 6.0164f)
                    lineTo(5.4325f, 7.2837f)
                    curveTo(5.368f, 7.3159f, 5.3157f, 7.3682f, 5.2835f, 7.4327f)
                    lineTo(4.0863f, 9.827f)
                    curveTo(4.0328f, 9.934f, 4.0408f, 10.0614f, 4.1071f, 10.161f)
                    lineTo(5.2772f, 11.916f)
                    curveTo(5.3137f, 11.9708f, 5.3331f, 12.0351f, 5.3331f, 12.1009f)
                    verticalLineTo(13.8619f)
                    curveTo(5.3331f, 13.9504f, 5.3683f, 14.0351f, 5.4308f, 14.0977f)
                    lineTo(6.4966f, 15.1635f)
                    curveTo(6.598f, 15.2649f, 6.753f, 15.2901f, 6.8814f, 15.2259f)
                    lineTo(10.5961f, 13.3685f)
                    curveTo(10.6424f, 13.3454f, 10.6934f, 13.3334f, 10.7452f, 13.3334f)
                    horizontalLineTo(13.2125f)
                    curveTo(13.2904f, 13.3334f, 13.3659f, 13.3607f, 13.4259f, 13.4106f)
                    lineTo(17.2404f, 16.5894f)
                    curveTo(17.3003f, 16.6394f, 17.3758f, 16.6667f, 17.4538f, 16.6667f)
                    horizontalLineTo(19.8214f)
                    curveTo(19.9329f, 16.6667f, 20.0369f, 16.611f, 20.0988f, 16.5183f)
                    lineTo(22.6105f, 12.7507f)
                    curveTo(22.647f, 12.6959f, 22.6665f, 12.6316f, 22.6665f, 12.5658f)
                    verticalLineTo(10.1009f)
                    curveTo(22.6665f, 10.0351f, 22.647f, 9.9708f, 22.6105f, 9.916f)
                    lineTo(19.9998f, 6.0f)
                    lineTo(18.0969f, 2.8285f)
                    curveTo(18.0367f, 2.7281f, 17.9282f, 2.6667f, 17.8111f, 2.6667f)
                    horizontalLineTo(17.3925f)
                    curveTo(17.1246f, 2.6667f, 16.9904f, 2.9906f, 17.1799f, 3.1801f)
                    curveTo(17.2714f, 3.2716f, 17.2941f, 3.4114f, 17.2362f, 3.5272f)
                    lineTo(16.7586f, 4.4824f)
                    curveTo(16.7021f, 4.5953f, 16.5867f, 4.6667f, 16.4605f, 4.6667f)
                    horizontalLineTo(14.8725f)
                    curveTo(14.7462f, 4.6667f, 14.6308f, 4.5953f, 14.5743f, 4.4824f)
                    lineTo(14.0919f, 3.5176f)
                    curveTo(14.0355f, 3.4047f, 13.9201f, 3.3333f, 13.7938f, 3.3333f)
                    horizontalLineTo(13.4443f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3332f, 17.3333f)
                    horizontalLineTo(17.9998f)
                    lineTo(18.4308f, 17.7643f)
                    curveTo(18.561f, 17.8945f, 18.772f, 17.8945f, 18.9022f, 17.7643f)
                    lineTo(19.3332f, 17.3333f)
                    close()
                }
            }
        }
        .build()
        return _coc!!
    }

private var _coc: ImageVector? = null
