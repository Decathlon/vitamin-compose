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

public val FlagsGroup.Lk: ImageVector
    get() {
        if (_lk != null) {
            return _lk!!
        }
        _lk = Builder(name = "Lk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFFFBF19)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA52531)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6665f, 1.3333f)
                    horizontalLineTo(25.3332f)
                    curveTo(26.0696f, 1.3333f, 26.6665f, 1.9303f, 26.6665f, 2.6667f)
                    verticalLineTo(17.3333f)
                    curveTo(26.6665f, 18.0697f, 26.0696f, 18.6666f, 25.3332f, 18.6666f)
                    horizontalLineTo(10.6665f)
                    verticalLineTo(1.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF03664F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.3335f, 2.6667f)
                    curveTo(1.3335f, 1.9303f, 1.9304f, 1.3333f, 2.6668f, 1.3333f)
                    horizontalLineTo(5.3335f)
                    verticalLineTo(18.6666f)
                    horizontalLineTo(2.6668f)
                    curveTo(1.9304f, 18.6666f, 1.3335f, 18.0697f, 1.3335f, 17.3333f)
                    verticalLineTo(2.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF6816)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0002f, 1.3333f)
                    lineTo(8.6668f, 1.3333f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 9.3335f, 2.0f)
                    lineTo(9.3335f, 17.9999f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 8.6668f, 18.6666f)
                    lineTo(6.0002f, 18.6666f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 5.3335f, 17.9999f)
                    lineTo(5.3335f, 2.0f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 6.0002f, 1.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFBF18)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3333f, 3.3333f)
                    curveTo(13.3333f, 3.7015f, 13.0349f, 4.0f, 12.6667f, 4.0f)
                    curveTo(12.2985f, 4.0f, 12.0f, 3.7015f, 12.0f, 3.3333f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(12.6667f)
                    curveTo(13.0349f, 2.6667f, 13.3333f, 2.9651f, 13.3333f, 3.3333f)
                    close()
                    moveTo(24.0002f, 3.3333f)
                    curveTo(24.0002f, 3.7015f, 24.2986f, 4.0f, 24.6668f, 4.0f)
                    curveTo(25.035f, 4.0f, 25.3335f, 3.7015f, 25.3335f, 3.3333f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(24.6668f)
                    curveTo(24.2986f, 2.6667f, 24.0002f, 2.9651f, 24.0002f, 3.3333f)
                    close()
                    moveTo(24.6668f, 16.0f)
                    curveTo(24.2986f, 16.0f, 24.0002f, 16.2985f, 24.0002f, 16.6667f)
                    curveTo(24.0002f, 17.0349f, 24.2986f, 17.3333f, 24.6668f, 17.3333f)
                    horizontalLineTo(25.3335f)
                    verticalLineTo(16.6667f)
                    curveTo(25.3335f, 16.2985f, 25.035f, 16.0f, 24.6668f, 16.0f)
                    close()
                    moveTo(13.3333f, 16.6667f)
                    curveTo(13.3333f, 16.2985f, 13.0349f, 16.0f, 12.6667f, 16.0f)
                    curveTo(12.2985f, 16.0f, 12.0f, 16.2985f, 12.0f, 16.6667f)
                    verticalLineTo(17.3333f)
                    horizontalLineTo(12.6667f)
                    curveTo(13.0349f, 17.3333f, 13.3333f, 17.0348f, 13.3333f, 16.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFBF18)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.9999f, 12.5736f)
                    curveTo(15.9999f, 12.2568f, 15.7431f, 12.0f, 15.4263f, 12.0f)
                    curveTo(15.3646f, 12.0f, 15.3035f, 11.9902f, 15.2455f, 11.9694f)
                    curveTo(14.8597f, 11.8316f, 13.3332f, 11.2491f, 13.3332f, 10.6667f)
                    curveTo(13.3332f, 10.3018f, 13.5329f, 9.937f, 13.7137f, 9.6814f)
                    curveTo(13.8711f, 9.4589f, 13.9297f, 9.1697f, 13.8331f, 8.9148f)
                    curveTo(13.6065f, 8.3169f, 13.2396f, 7.2284f, 13.3332f, 6.6667f)
                    curveTo(13.3831f, 6.3675f, 13.5822f, 6.1056f, 13.812f, 5.8949f)
                    curveTo(14.1677f, 5.5688f, 14.6665f, 5.877f, 14.6665f, 6.3595f)
                    verticalLineTo(8.9213f)
                    curveTo(14.6665f, 9.1738f, 14.8092f, 9.4047f, 15.0351f, 9.5176f)
                    lineTo(15.7116f, 9.8559f)
                    curveTo(15.8837f, 9.9419f, 16.0917f, 9.9082f, 16.2278f, 9.7721f)
                    curveTo(16.4436f, 9.5562f, 16.3846f, 9.1924f, 16.1116f, 9.0559f)
                    lineTo(15.3332f, 8.6667f)
                    verticalLineTo(8.0f)
                    curveTo(15.6653f, 8.0f, 15.771f, 7.5523f, 15.474f, 7.4037f)
                    lineTo(15.3332f, 7.3334f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(16.3904f)
                    curveTo(16.5672f, 6.6667f, 16.7368f, 6.5964f, 16.8618f, 6.4714f)
                    lineTo(17.1379f, 6.1953f)
                    curveTo(17.263f, 6.0703f, 17.4325f, 6.0f, 17.6093f, 6.0f)
                    horizontalLineTo(18.2545f)
                    curveTo(18.507f, 6.0f, 18.7379f, 6.1427f, 18.8508f, 6.3685f)
                    lineTo(19.2097f, 7.0864f)
                    curveTo(19.2888f, 7.2445f, 19.3018f, 7.4276f, 19.2459f, 7.5953f)
                    lineTo(18.959f, 8.4559f)
                    curveTo(18.8151f, 8.8876f, 19.1364f, 9.3334f, 19.5915f, 9.3334f)
                    horizontalLineTo(21.7831f)
                    curveTo(21.9219f, 9.3334f, 22.055f, 9.2782f, 22.1531f, 9.1801f)
                    curveTo(22.4057f, 8.9275f, 22.3366f, 8.5017f, 22.0171f, 8.342f)
                    lineTo(21.474f, 8.0704f)
                    curveTo(21.3814f, 8.0241f, 21.2793f, 8.0f, 21.1758f, 8.0f)
                    horizontalLineTo(20.6665f)
                    curveTo(20.2983f, 8.0f, 19.9999f, 7.7015f, 19.9999f, 7.3334f)
                    verticalLineTo(6.9428f)
                    curveTo(19.9999f, 6.766f, 20.0701f, 6.5964f, 20.1951f, 6.4714f)
                    lineTo(20.6665f, 6.0f)
                    verticalLineTo(6.6667f)
                    curveTo(20.6665f, 7.0349f, 20.965f, 7.3334f, 21.3332f, 7.3334f)
                    horizontalLineTo(22.2545f)
                    curveTo(22.507f, 7.3334f, 22.7379f, 7.476f, 22.8508f, 7.7019f)
                    lineTo(23.2797f, 8.5597f)
                    curveTo(23.3151f, 8.6305f, 23.3376f, 8.7066f, 23.3448f, 8.7853f)
                    curveTo(23.3755f, 9.1209f, 23.4486f, 10.0897f, 23.3332f, 10.6667f)
                    curveTo(23.2397f, 11.1342f, 22.9779f, 11.5669f, 22.8116f, 11.8061f)
                    curveTo(22.7222f, 11.9347f, 22.6665f, 12.0858f, 22.6665f, 12.2424f)
                    verticalLineTo(14.1574f)
                    curveTo(22.6665f, 14.4387f, 22.4385f, 14.6667f, 22.1572f, 14.6667f)
                    curveTo(21.7786f, 14.6667f, 21.5324f, 14.2683f, 21.7017f, 13.9296f)
                    lineTo(21.9295f, 13.4741f)
                    curveTo(21.9738f, 13.3855f, 21.9738f, 13.2812f, 21.9295f, 13.1926f)
                    lineTo(21.898f, 13.1296f)
                    curveTo(21.7573f, 12.8482f, 21.3332f, 12.9484f, 21.3332f, 13.263f)
                    curveTo(21.3332f, 13.3093f, 21.3224f, 13.3549f, 21.3017f, 13.3963f)
                    lineTo(20.8313f, 14.3371f)
                    curveTo(20.7303f, 14.5391f, 20.5239f, 14.6667f, 20.298f, 14.6667f)
                    curveTo(19.8547f, 14.6667f, 19.5664f, 14.2002f, 19.7647f, 13.8037f)
                    lineTo(19.9295f, 13.4741f)
                    curveTo(19.9758f, 13.3815f, 19.9999f, 13.2795f, 19.9999f, 13.176f)
                    verticalLineTo(12.6667f)
                    curveTo(19.9999f, 12.2985f, 19.7014f, 12.0f, 19.3332f, 12.0f)
                    horizontalLineTo(17.9999f)
                    curveTo(17.6317f, 12.0f, 17.3332f, 12.2985f, 17.3332f, 12.6667f)
                    verticalLineTo(13.176f)
                    curveTo(17.3332f, 13.2795f, 17.3091f, 13.3815f, 17.2628f, 13.4741f)
                    lineTo(16.8313f, 14.3371f)
                    curveTo(16.7303f, 14.5391f, 16.5239f, 14.6667f, 16.298f, 14.6667f)
                    curveTo(15.8547f, 14.6667f, 15.5664f, 14.2002f, 15.7647f, 13.8037f)
                    lineTo(15.9295f, 13.4741f)
                    curveTo(15.9758f, 13.3815f, 15.9999f, 13.2795f, 15.9999f, 13.176f)
                    verticalLineTo(12.5736f)
                    close()
                }
            }
        }
        .build()
        return _lk!!
    }

private var _lk: ImageVector? = null
