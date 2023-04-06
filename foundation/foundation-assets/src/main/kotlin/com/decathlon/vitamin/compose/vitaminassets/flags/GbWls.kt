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

public val FlagsGroup.GbWls: ImageVector
    get() {
        if (_gbWls != null) {
            return _gbWls!!
        }
        _gbWls = Builder(name = "GbWls", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF3ACC55)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 9.3333f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 9.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE91C44)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.755f, 15.1945f)
                    lineTo(12.4033f, 14.9136f)
                    lineTo(11.127f, 14.3117f)
                    lineTo(12.0f, 13.8224f)
                    curveTo(12.0f, 13.8224f, 13.4714f, 15.0648f, 13.4714f, 14.6667f)
                    curveTo(13.4714f, 14.2388f, 14.8556f, 14.4259f, 14.8001f, 13.8224f)
                    curveTo(14.7243f, 12.9966f, 13.2683f, 13.7619f, 13.0083f, 12.7297f)
                    curveTo(12.8631f, 12.1531f, 12.4033f, 12.2266f, 12.4033f, 12.2266f)
                    lineTo(10.9372f, 12.7297f)
                    lineTo(10.207f, 13.8224f)
                    lineTo(9.8444f, 12.7297f)
                    curveTo(9.8444f, 12.7297f, 8.9885f, 13.4253f, 8.7038f, 13.8224f)
                    curveTo(8.3995f, 14.2469f, 8.0773f, 15.1945f, 8.0773f, 15.1945f)
                    lineTo(9.5728f, 15.8195f)
                    lineTo(7.3919f, 15.4352f)
                    lineTo(5.8006f, 15.8195f)
                    lineTo(4.8237f, 16.0911f)
                    lineTo(5.2528f, 15.6405f)
                    lineTo(4.3778f, 15.1945f)
                    lineTo(5.2528f, 14.6667f)
                    lineTo(4.8237f, 14.3117f)
                    lineTo(6.7144f, 14.6667f)
                    curveTo(6.7144f, 14.6667f, 7.4053f, 14.5972f, 7.6665f, 14.3117f)
                    curveTo(7.9959f, 13.9515f, 8.2546f, 12.7297f, 8.2546f, 12.7297f)
                    lineTo(7.3919f, 12.2266f)
                    lineTo(6.7144f, 13.4551f)
                    curveTo(6.7144f, 13.4551f, 6.2469f, 12.2929f, 5.8006f, 11.6416f)
                    curveTo(5.4681f, 11.1564f, 4.3778f, 10.0456f, 4.3778f, 10.0456f)
                    lineTo(2.9717f, 10.785f)
                    lineTo(3.7557f, 9.2217f)
                    curveTo(3.7557f, 9.2217f, 4.3778f, 8.6784f, 3.9826f, 8.1213f)
                    curveTo(3.5874f, 7.5641f, 3.2555f, 6.3171f, 3.2555f, 6.3171f)
                    curveTo(3.2555f, 6.3171f, 4.0795f, 7.7456f, 4.3778f, 7.6351f)
                    curveTo(4.7998f, 7.4788f, 3.8517f, 6.1755f, 4.3778f, 5.9435f)
                    curveTo(4.7563f, 5.7766f, 4.8237f, 7.4375f, 4.8237f, 7.4375f)
                    lineTo(5.2528f, 6.6226f)
                    verticalLineTo(7.6351f)
                    curveTo(5.2528f, 7.6351f, 5.0036f, 8.8451f, 5.4271f, 9.5641f)
                    curveTo(5.8505f, 10.2831f, 7.1079f, 10.785f, 7.1079f, 10.785f)
                    curveTo(7.1079f, 10.785f, 6.7809f, 10.0636f, 7.1079f, 8.6784f)
                    curveTo(7.3292f, 7.7409f, 8.1166f, 6.1413f, 8.4862f, 5.6287f)
                    curveTo(8.6814f, 5.3579f, 6.9243f, 6.6226f, 6.9243f, 6.6226f)
                    verticalLineTo(5.6287f)
                    lineTo(5.2528f, 5.4574f)
                    lineTo(4.8237f, 5.9435f)
                    lineTo(3.7557f, 4.1917f)
                    lineTo(5.0846f, 4.86f)
                    horizontalLineTo(7.1079f)
                    lineTo(6.7144f, 4.3769f)
                    horizontalLineTo(5.0846f)
                    curveTo(5.0846f, 4.3769f, 5.4271f, 3.6716f, 7.1079f, 3.6716f)
                    lineTo(7.9027f, 3.1315f)
                    curveTo(7.9027f, 3.1315f, 8.9893f, 3.1625f, 9.6008f, 3.1858f)
                    curveTo(10.1455f, 3.2065f, 11.127f, 2.5156f, 11.127f, 2.5156f)
                    lineTo(11.4032f, 3.1858f)
                    lineTo(10.755f, 4.1917f)
                    lineTo(11.4032f, 4.86f)
                    lineTo(11.127f, 5.2721f)
                    lineTo(11.6022f, 5.9435f)
                    horizontalLineTo(10.755f)
                    lineTo(11.4032f, 6.9883f)
                    lineTo(10.755f, 6.6226f)
                    lineTo(11.127f, 7.6351f)
                    lineTo(10.755f, 8.6784f)
                    lineTo(12.4033f, 8.1213f)
                    curveTo(12.4033f, 8.1213f, 12.4033f, 6.6226f, 13.0083f, 5.9435f)
                    curveTo(14.8558f, 4.0485f, 17.8683f, 2.5156f, 17.8683f, 2.5156f)
                    curveTo(17.8683f, 2.5156f, 17.7087f, 3.8921f, 18.1545f, 4.0f)
                    curveTo(18.8016f, 4.1567f, 21.6279f, 2.8661f, 21.6279f, 2.8661f)
                    curveTo(21.6279f, 2.8661f, 19.9299f, 4.6938f, 20.2775f, 4.86f)
                    curveTo(20.4648f, 4.9496f, 20.776f, 5.2721f, 20.776f, 5.2721f)
                    curveTo(20.776f, 5.2721f, 19.3083f, 6.4719f, 19.063f, 6.9883f)
                    curveTo(18.8177f, 7.5046f, 19.4225f, 8.1213f, 19.4225f, 8.1213f)
                    curveTo(19.4225f, 8.1213f, 18.1545f, 8.1213f, 17.5226f, 8.6784f)
                    curveTo(19.4225f, 8.6784f, 20.9766f, 9.5789f, 21.8965f, 8.9145f)
                    curveTo(22.5129f, 8.4693f, 19.6892f, 8.7472f, 20.0599f, 7.6351f)
                    curveTo(20.1974f, 7.2224f, 20.5568f, 6.7446f, 21.3796f, 6.6226f)
                    curveTo(22.2023f, 6.5005f, 22.4938f, 6.9883f, 22.4938f, 6.9883f)
                    lineTo(22.9367f, 6.3171f)
                    horizontalLineTo(21.6279f)
                    lineTo(24.0f, 4.0f)
                    lineTo(24.3089f, 6.9883f)
                    lineTo(23.5063f, 6.3171f)
                    lineTo(23.1466f, 7.4375f)
                    curveTo(24.0f, 10.0456f, 20.0599f, 10.5999f, 20.0599f, 10.5999f)
                    lineTo(22.4938f, 12.2266f)
                    lineTo(21.6279f, 12.4751f)
                    lineTo(21.3796f, 14.9136f)
                    lineTo(22.4938f, 15.8195f)
                    lineTo(21.0291f, 15.4352f)
                    lineTo(18.1545f, 16.0911f)
                    lineTo(18.7264f, 15.1945f)
                    lineTo(17.5226f, 15.4352f)
                    lineTo(18.3267f, 14.6667f)
                    lineTo(17.5226f, 14.3117f)
                    lineTo(18.5505f, 14.0262f)
                    lineTo(19.8454f, 14.9136f)
                    curveTo(19.8454f, 14.9136f, 20.4859f, 14.0844f, 20.5568f, 13.6434f)
                    curveTo(20.6299f, 13.1887f, 20.2775f, 12.2266f, 20.2775f, 12.2266f)
                    curveTo(20.2775f, 12.2266f, 18.3699f, 12.1865f, 17.6969f, 12.0197f)
                    curveTo(17.024f, 11.8529f, 16.6353f, 11.3237f, 16.6353f, 11.3237f)
                    lineTo(15.8713f, 12.2266f)
                    curveTo(15.8713f, 12.2266f, 18.5335f, 13.2241f, 17.8683f, 13.6434f)
                    curveTo(17.7139f, 13.7407f, 16.9517f, 13.4551f, 16.9517f, 13.4551f)
                    curveTo(16.9517f, 13.4551f, 15.6398f, 14.989f, 14.8001f, 15.1945f)
                    curveTo(14.418f, 15.288f, 15.8713f, 15.8195f, 15.8713f, 15.8195f)
                    curveTo(15.8713f, 15.8195f, 14.6303f, 15.6229f, 14.0f, 15.4352f)
                    curveTo(13.3399f, 15.2387f, 11.4032f, 15.8195f, 11.4032f, 15.8195f)
                    lineTo(10.755f, 15.1945f)
                    close()
                    moveTo(21.4487f, 8.0702f)
                    curveTo(21.6328f, 8.0702f, 21.7821f, 7.9209f, 21.7821f, 7.7368f)
                    curveTo(21.7821f, 7.5527f, 21.6328f, 7.4035f, 21.4487f, 7.4035f)
                    curveTo(21.2646f, 7.4035f, 21.1154f, 7.5527f, 21.1154f, 7.7368f)
                    curveTo(21.1154f, 7.9209f, 21.2646f, 8.0702f, 21.4487f, 8.0702f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    verticalLineTo(9.3218f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(0.5f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 9.3218f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(28.0f)
                    close()
                }
            }
        }
        .build()
        return _gbWls!!
    }

private var _gbWls: ImageVector? = null
