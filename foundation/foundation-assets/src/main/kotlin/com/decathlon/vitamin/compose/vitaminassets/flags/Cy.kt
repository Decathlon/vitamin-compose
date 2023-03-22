package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Cy: ImageVector
    get() {
        if (_cy != null) {
            return _cy!!
        }
        _cy = Builder(name = "Cy", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF5F5F5)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 0.25f)
                    lineTo(26.0f, 0.25f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 27.75f, 2.0f)
                    lineTo(27.75f, 18.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 26.0f, 19.75f)
                    lineTo(2.0f, 19.75f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 0.25f, 18.0f)
                    lineTo(0.25f, 2.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 0.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE7832C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0002f, 3.3333f)
                    curveTo(20.3633f, 3.1518f, 20.7318f, 3.5693f, 20.5066f, 3.907f)
                    lineTo(20.0674f, 4.5658f)
                    curveTo(20.023f, 4.6324f, 19.9659f, 4.6895f, 19.8993f, 4.7339f)
                    lineTo(18.0551f, 5.9634f)
                    curveTo(18.0186f, 5.9878f, 17.9845f, 6.0157f, 17.9535f, 6.0467f)
                    lineTo(17.8049f, 6.1953f)
                    curveTo(17.5446f, 6.4556f, 17.5446f, 6.8777f, 17.8049f, 7.1381f)
                    lineTo(18.1954f, 7.5286f)
                    curveTo(18.4558f, 7.789f, 18.4558f, 8.2111f, 18.1954f, 8.4714f)
                    lineTo(17.6733f, 8.9936f)
                    curveTo(17.4704f, 9.1965f, 17.1604f, 9.2468f, 16.9037f, 9.1185f)
                    lineTo(16.5964f, 8.9648f)
                    curveTo(16.2671f, 8.8002f, 15.8667f, 8.9337f, 15.702f, 9.263f)
                    lineTo(15.457f, 9.753f)
                    curveTo(15.3779f, 9.9112f, 15.2393f, 10.0314f, 15.0715f, 10.0873f)
                    lineTo(13.4361f, 10.6325f)
                    curveTo(13.3682f, 10.6551f, 13.297f, 10.6667f, 13.2253f, 10.6667f)
                    horizontalLineTo(12.4122f)
                    curveTo(12.1597f, 10.6667f, 11.9288f, 10.8094f, 11.8159f, 11.0352f)
                    lineTo(11.6316f, 11.4037f)
                    curveTo(11.467f, 11.7331f, 11.0665f, 11.8665f, 10.7372f, 11.7019f)
                    lineTo(8.7636f, 10.7151f)
                    curveTo(8.6995f, 10.683f, 8.641f, 10.6409f, 8.5903f, 10.5902f)
                    lineTo(7.5288f, 9.5286f)
                    curveTo(7.4037f, 9.4036f, 7.3335f, 9.234f, 7.3335f, 9.0572f)
                    verticalLineTo(8.4714f)
                    curveTo(7.3335f, 8.2111f, 7.5445f, 8.0f, 7.8049f, 8.0f)
                    curveTo(7.9299f, 8.0f, 8.0498f, 7.9503f, 8.1382f, 7.8619f)
                    lineTo(9.1382f, 6.8619f)
                    curveTo(9.2633f, 6.7369f, 9.4328f, 6.6667f, 9.6096f, 6.6667f)
                    horizontalLineTo(10.1863f)
                    curveTo(10.4733f, 6.6667f, 10.728f, 6.4831f, 10.8188f, 6.2108f)
                    lineTo(11.1474f, 5.225f)
                    curveTo(11.2537f, 4.9061f, 11.5809f, 4.7162f, 11.9106f, 4.7821f)
                    lineTo(14.5198f, 5.3039f)
                    curveTo(14.6166f, 5.3233f, 14.7165f, 5.3209f, 14.8123f, 5.297f)
                    lineTo(17.2625f, 4.6844f)
                    curveTo(17.3097f, 4.6726f, 17.3554f, 4.6557f, 17.399f, 4.634f)
                    lineTo(18.6668f, 4.0f)
                    lineTo(20.0002f, 3.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF445128)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0002f, 16.0f)
                    curveTo(14.3684f, 16.0f, 14.6668f, 15.7015f, 14.6668f, 15.3334f)
                    curveTo(14.6668f, 14.9652f, 14.3684f, 14.6667f, 14.0002f, 14.6667f)
                    curveTo(13.632f, 14.6667f, 13.3335f, 14.9652f, 13.3335f, 15.3334f)
                    curveTo(13.3335f, 15.7015f, 13.632f, 16.0f, 14.0002f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF445128)),
                        fillAlpha = 0.75f, strokeAlpha = 0.75f, strokeLineWidth = 1.33333f,
                        strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 14.6667f)
                    curveTo(16.0f, 14.6667f, 18.0f, 14.0f, 18.6667f, 12.6667f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF445128)),
                        fillAlpha = 0.75f, strokeAlpha = 0.75f, strokeLineWidth = 1.33333f,
                        strokeLineCap = Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 14.6667f)
                    curveTo(12.0f, 14.6667f, 10.0f, 14.0f, 9.3333f, 12.6667f)
                }
            }
        }
        .build()
        return _cy!!
    }

private var _cy: ImageVector? = null
