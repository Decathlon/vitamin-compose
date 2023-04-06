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

public val FlagsGroup.Cy: ImageVector
    get() {
        if (_cy != null) {
            return _cy!!
        }
        _cy = Builder(name = "Cy", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
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
                path(fill = SolidColor(Color(0xFF445128)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.9648f, 12.0704f)
                    curveTo(19.2941f, 12.235f, 19.4276f, 12.6355f, 19.263f, 12.9648f)
                    curveTo(18.84f, 13.8107f, 18.0321f, 14.3924f, 17.4141f, 14.7455f)
                    curveTo(17.0938f, 14.9285f, 16.7978f, 15.0651f, 16.5816f, 15.1561f)
                    curveTo(16.4731f, 15.2018f, 16.3836f, 15.2365f, 16.3197f, 15.2602f)
                    curveTo(16.2878f, 15.2721f, 16.2622f, 15.2813f, 16.2438f, 15.2878f)
                    lineTo(16.2216f, 15.2955f)
                    lineTo(16.2148f, 15.2978f)
                    lineTo(16.2124f, 15.2986f)
                    lineTo(16.2112f, 15.299f)
                    curveTo(16.2112f, 15.299f, 16.2108f, 15.2991f, 16.0f, 14.6667f)
                }
                path(fill = SolidColor(Color(0xFF445128)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.0352f, 12.0704f)
                    curveTo(8.7059f, 12.235f, 8.5724f, 12.6355f, 8.7371f, 12.9648f)
                    curveTo(9.16f, 13.8107f, 9.9679f, 14.3924f, 10.5859f, 14.7455f)
                    curveTo(10.9062f, 14.9285f, 11.2022f, 15.0651f, 11.4184f, 15.1561f)
                    curveTo(11.5269f, 15.2018f, 11.6164f, 15.2365f, 11.6803f, 15.2602f)
                    curveTo(11.7122f, 15.2721f, 11.7378f, 15.2813f, 11.7562f, 15.2878f)
                    lineTo(11.7784f, 15.2955f)
                    lineTo(11.7852f, 15.2978f)
                    lineTo(11.7876f, 15.2986f)
                    lineTo(11.7888f, 15.299f)
                    curveTo(11.7888f, 15.299f, 11.7892f, 15.2991f, 12.0f, 14.6667f)
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(27.5f, 0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 19.5f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(0.5f)
                    close()
                }
            }
        }
        .build()
        return _cy!!
    }

private var _cy: ImageVector? = null
