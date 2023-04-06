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

public val FlagsGroup.Cas: ImageVector
    get() {
        if (_cas != null) {
            return _cas!!
        }
        _cas = Builder(name = "Cas", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth
                = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.4824f, 8.3685f)
                    curveTo(5.4001f, 8.5332f, 5.4668f, 8.7334f, 5.6315f, 8.8157f)
                    lineTo(7.7019f, 9.8509f)
                    curveTo(7.8665f, 9.9333f, 7.9333f, 10.1335f, 7.8509f, 10.2981f)
                    lineTo(7.4824f, 11.0352f)
                    curveTo(7.4001f, 11.1999f, 7.1999f, 11.2666f, 7.0352f, 11.1843f)
                    lineTo(6.0704f, 10.7019f)
                    curveTo(6.0241f, 10.6787f, 5.9731f, 10.6667f, 5.9213f, 10.6667f)
                    horizontalLineTo(4.3334f)
                    curveTo(4.1493f, 10.6667f, 4.0f, 10.8159f, 4.0f, 11.0f)
                    verticalLineTo(11.7597f)
                    curveTo(4.0f, 11.9032f, 4.0918f, 12.0306f, 4.2279f, 12.076f)
                    lineTo(5.4883f, 12.4961f)
                    curveTo(5.7234f, 12.5745f, 5.7939f, 12.8728f, 5.6186f, 13.048f)
                    lineTo(5.431f, 13.2357f)
                    curveTo(5.3685f, 13.2982f, 5.3334f, 13.383f, 5.3334f, 13.4714f)
                    verticalLineTo(13.9459f)
                    curveTo(5.3334f, 13.9817f, 5.3391f, 14.0173f, 5.3505f, 14.0513f)
                    lineTo(5.9564f, 15.869f)
                    curveTo(5.9843f, 15.9529f, 6.0444f, 16.0222f, 6.1235f, 16.0617f)
                    lineTo(7.1185f, 16.5592f)
                    curveTo(7.2468f, 16.6234f, 7.4018f, 16.5982f, 7.5032f, 16.4968f)
                    lineTo(9.0063f, 14.9937f)
                    curveTo(9.1672f, 14.8328f, 9.1232f, 14.5616f, 8.9197f, 14.4598f)
                    lineTo(8.1843f, 14.0921f)
                    curveTo(8.0714f, 14.0357f, 8.0f, 13.9202f, 8.0f, 13.794f)
                    verticalLineTo(13.7603f)
                    curveTo(8.0f, 13.5434f, 8.2038f, 13.3843f, 8.4142f, 13.4369f)
                    lineTo(10.4142f, 13.9369f)
                    curveTo(10.5626f, 13.974f, 10.6667f, 14.1073f, 10.6667f, 14.2603f)
                    verticalLineTo(15.2324f)
                    curveTo(10.6667f, 15.2982f, 10.6862f, 15.3626f, 10.7227f, 15.4173f)
                    lineTo(11.9011f, 17.1849f)
                    curveTo(11.9629f, 17.2776f, 12.067f, 17.3333f, 12.1784f, 17.3333f)
                    horizontalLineTo(12.441f)
                    curveTo(12.5773f, 17.3333f, 12.6999f, 17.2503f, 12.7505f, 17.1238f)
                    lineTo(13.7243f, 14.6892f)
                    curveTo(13.8312f, 14.4221f, 14.2034f, 14.4067f, 14.332f, 14.6639f)
                    lineTo(14.6425f, 15.285f)
                    curveTo(14.6585f, 15.317f, 14.6796f, 15.3462f, 14.7049f, 15.3716f)
                    lineTo(15.9618f, 16.6284f)
                    curveTo(15.9871f, 16.6538f, 16.0164f, 16.6748f, 16.0484f, 16.6909f)
                    lineTo(16.851f, 17.0921f)
                    curveTo(17.0726f, 17.2029f, 17.3334f, 17.0418f, 17.3334f, 16.794f)
                    verticalLineTo(16.1381f)
                    curveTo(17.3334f, 16.0497f, 17.2982f, 15.9649f, 17.2357f, 15.9024f)
                    lineTo(16.9024f, 15.569f)
                    curveTo(16.7722f, 15.4389f, 16.7722f, 15.2278f, 16.9024f, 15.0976f)
                    lineTo(17.2357f, 14.7643f)
                    curveTo(17.2982f, 14.7018f, 17.383f, 14.6667f, 17.4714f, 14.6667f)
                    horizontalLineTo(18.588f)
                    curveTo(18.6397f, 14.6667f, 18.6908f, 14.6546f, 18.7371f, 14.6315f)
                    lineTo(19.8158f, 14.0921f)
                    curveTo(19.9287f, 14.0357f, 20.0f, 13.9202f, 20.0f, 13.794f)
                    verticalLineTo(12.8047f)
                    curveTo(20.0f, 12.7163f, 19.9649f, 12.6315f, 19.9024f, 12.569f)
                    lineTo(19.5691f, 12.2357f)
                    curveTo(19.4389f, 12.1055f, 19.4389f, 11.8945f, 19.5691f, 11.7643f)
                    lineTo(20.3397f, 10.9937f)
                    curveTo(20.5005f, 10.8328f, 20.7718f, 10.8768f, 20.8735f, 11.0803f)
                    lineTo(21.251f, 11.8352f)
                    curveTo(21.3015f, 11.9362f, 21.4047f, 12.0f, 21.5176f, 12.0f)
                    curveTo(21.7393f, 12.0f, 21.8834f, 11.7668f, 21.7843f, 11.5685f)
                    lineTo(21.4824f, 10.9648f)
                    curveTo(21.4001f, 10.8001f, 21.4668f, 10.5999f, 21.6315f, 10.5176f)
                    lineTo(22.3685f, 10.1491f)
                    curveTo(22.5332f, 10.0667f, 22.5999f, 9.8665f, 22.5176f, 9.7019f)
                    lineTo(22.0618f, 8.7902f)
                    curveTo(22.0222f, 8.7111f, 21.9529f, 8.651f, 21.869f, 8.623f)
                    lineTo(20.5117f, 8.1706f)
                    curveTo(20.2766f, 8.0922f, 20.2062f, 7.7938f, 20.3814f, 7.6186f)
                    lineTo(21.2357f, 6.7643f)
                    curveTo(21.2982f, 6.7018f, 21.383f, 6.6667f, 21.4714f, 6.6667f)
                    horizontalLineTo(23.1273f)
                    curveTo(23.2536f, 6.6667f, 23.369f, 6.5953f, 23.4255f, 6.4824f)
                    lineTo(23.7816f, 5.7702f)
                    curveTo(23.8866f, 5.5602f, 23.7474f, 5.3104f, 23.5136f, 5.2891f)
                    lineTo(17.3754f, 4.7311f)
                    curveTo(17.094f, 4.7055f, 16.9701f, 4.3633f, 17.1699f, 4.1634f)
                    lineTo(17.2357f, 4.0976f)
                    curveTo(17.2982f, 4.0351f, 17.3334f, 3.9503f, 17.3334f, 3.8619f)
                    verticalLineTo(3.0f)
                    curveTo(17.3334f, 2.8159f, 17.1841f, 2.6667f, 17.0f, 2.6667f)
                    horizontalLineTo(14.1381f)
                    curveTo(14.0497f, 2.6667f, 13.9649f, 2.7018f, 13.9024f, 2.7643f)
                    lineTo(12.0653f, 4.6014f)
                    curveTo(12.0226f, 4.6441f, 11.9691f, 4.6744f, 11.9104f, 4.6891f)
                    lineTo(6.7863f, 5.9701f)
                    curveTo(6.7091f, 5.9894f, 6.6276f, 5.9804f, 6.5564f, 5.9448f)
                    lineTo(6.0531f, 5.6932f)
                    curveTo(5.7875f, 5.5604f, 5.4939f, 5.8151f, 5.5878f, 6.0968f)
                    lineTo(5.9564f, 7.2024f)
                    curveTo(5.9843f, 7.2862f, 5.9778f, 7.3778f, 5.9383f, 7.4568f)
                    lineTo(5.4824f, 8.3685f)
                    close()
                    moveTo(10.0f, 10.6667f)
                    curveTo(10.3682f, 10.6667f, 10.6667f, 10.3682f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 9.6318f, 10.3682f, 9.3333f, 10.0f, 9.3333f)
                    curveTo(9.6318f, 9.3333f, 9.3334f, 9.6318f, 9.3334f, 10.0f)
                    curveTo(9.3334f, 10.3682f, 9.6318f, 10.6667f, 10.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6667f, 16.6667f)
                    curveTo(14.6667f, 17.0349f, 14.3682f, 17.3333f, 14.0f, 17.3333f)
                    curveTo(13.6318f, 17.3333f, 13.3334f, 17.0349f, 13.3334f, 16.6667f)
                    curveTo(13.3334f, 16.2985f, 13.6318f, 16.0f, 14.0f, 16.0f)
                    curveTo(14.3682f, 16.0f, 14.6667f, 16.2985f, 14.6667f, 16.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.6667f, 12.6667f)
                    verticalLineTo(13.3333f)
                    lineTo(21.9024f, 14.0976f)
                    curveTo(21.6924f, 14.3076f, 21.8411f, 14.6667f, 22.1381f, 14.6667f)
                    horizontalLineTo(22.4607f)
                    curveTo(22.5869f, 14.6667f, 22.7024f, 14.5953f, 22.7588f, 14.4824f)
                    lineTo(23.3334f, 13.3333f)
                    lineTo(22.6667f, 12.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.6667f, 12.6667f)
                    lineTo(23.0352f, 12.4824f)
                    curveTo(23.2756f, 12.3622f, 23.19f, 12.0f, 22.9213f, 12.0f)
                    curveTo(22.7807f, 12.0f, 22.6667f, 12.114f, 22.6667f, 12.2546f)
                    verticalLineTo(12.6667f)
                    close()
                }
            }
        }
        .build()
        return _cas!!
    }

private var _cas: ImageVector? = null
