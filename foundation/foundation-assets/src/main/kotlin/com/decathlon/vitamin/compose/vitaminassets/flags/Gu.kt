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

public val FlagsGroup.Gu: ImageVector
    get() {
        if (_gu != null) {
            return _gu!!
        }
        _gu = Builder(name = "Gu", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE3149), 1.0f to Color(0xFFC2273D),
                        start = Offset(14.0f,0.0f), end = Offset(14.0f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF053B94), 1.0f to Color(0xFF002E7A),
                        start = Offset(14.0f,1.33334f), end = Offset(14.0f,18.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(25.6667f, 1.3333f)
                    horizontalLineTo(2.3334f)
                    curveTo(1.7811f, 1.3333f, 1.3334f, 1.7811f, 1.3334f, 2.3333f)
                    verticalLineTo(17.6667f)
                    curveTo(1.3334f, 18.219f, 1.7811f, 18.6667f, 2.3334f, 18.6667f)
                    horizontalLineTo(25.6667f)
                    curveTo(26.219f, 18.6667f, 26.6667f, 18.219f, 26.6667f, 17.6667f)
                    verticalLineTo(2.3333f)
                    curveTo(26.6667f, 1.7811f, 26.219f, 1.3333f, 25.6667f, 1.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE3149), 1.0f to Color(0xFFC2273D),
                        start = Offset(14.0f,4.0f), end = Offset(14.0f,16.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 16.0f)
                    curveTo(14.0f, 16.0f, 18.0f, 13.3137f, 18.0f, 10.0f)
                    curveTo(18.0f, 6.6863f, 14.0f, 4.0f, 14.0f, 4.0f)
                    curveTo(14.0f, 4.0f, 10.0f, 6.6863f, 10.0f, 10.0f)
                    curveTo(10.0f, 13.3137f, 14.0f, 16.0f, 14.0f, 16.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0001f,4.66666f), end = Offset(14.0001f,15.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.0001f, 15.3333f)
                    curveTo(14.0001f, 15.3333f, 17.3334f, 12.6667f, 17.3334f, 10.0f)
                    curveTo(17.3334f, 7.3333f, 14.0001f, 4.6667f, 14.0001f, 4.6667f)
                    curveTo(14.0001f, 4.6667f, 10.6667f, 7.3333f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 12.6667f, 14.0001f, 15.3333f, 14.0001f, 15.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF81C1F3), 1.0f to Color(0xFF6AB1E9),
                        start = Offset(14.0001f,3.99997f), end = Offset(14.0001f,10.6666f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3334f, 4.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(10.6666f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF27A07E), 1.0f to Color(0xFF1F9171),
                        start = Offset(14.0003f,6.66663f), end = Offset(14.0003f,10.2847f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0003f, 9.4666f)
                    lineTo(12.8247f, 10.2847f)
                    lineTo(13.2394f, 8.9138f)
                    lineTo(12.0981f, 8.0486f)
                    lineTo(13.53f, 8.0194f)
                    lineTo(14.0003f, 6.6666f)
                    lineTo(14.4705f, 8.0194f)
                    lineTo(15.9024f, 8.0486f)
                    lineTo(14.7611f, 8.9138f)
                    lineTo(15.1758f, 10.2847f)
                    lineTo(14.0003f, 9.4666f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1E8CE8), 1.0f to Color(0xFF107FDC),
                        start = Offset(14.0001f,10.6666f), end = Offset(14.0001f,16.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3334f, 10.6666f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(10.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFF048)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6667f, 12.0f)
                    curveTo(10.6667f, 12.0f, 12.7873f, 14.0f, 13.3334f, 14.0f)
                    curveTo(13.9843f, 14.0f, 13.9945f, 13.0356f, 14.6667f, 12.6666f)
                    curveTo(15.7255f, 12.0855f, 17.3334f, 12.0f, 17.3334f, 12.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(10.6667f)
                    verticalLineTo(12.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF8F5715), 1.0f to Color(0xFF7A480D),
                        start = Offset(14.6208f,8.33334f), end = Offset(14.6208f,13.0001f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.6683f, 8.6334f)
                    curveTo(13.6565f, 8.7503f, 13.6391f, 8.949f, 13.6217f, 9.1975f)
                    curveTo(13.6005f, 9.5003f, 13.5852f, 9.7989f, 13.5787f, 10.0793f)
                    curveTo(13.5641f, 10.7012f, 13.5913f, 11.1614f, 13.6837f, 11.4388f)
                    curveTo(13.7998f, 11.7871f, 14.0625f, 12.114f, 14.4262f, 12.4275f)
                    curveTo(14.7041f, 12.6671f, 14.9796f, 12.8499f, 15.1695f, 12.957f)
                    curveTo(15.3298f, 13.0475f, 15.5331f, 12.9908f, 15.6236f, 12.8305f)
                    curveTo(15.7141f, 12.6702f, 15.6574f, 12.4668f, 15.4971f, 12.3764f)
                    curveTo(15.3422f, 12.289f, 15.1006f, 12.1287f, 14.8615f, 11.9226f)
                    curveTo(14.5806f, 11.6804f, 14.3865f, 11.4389f, 14.3162f, 11.228f)
                    curveTo(14.2567f, 11.0495f, 14.2324f, 10.6385f, 14.2451f, 10.0949f)
                    curveTo(14.2515f, 9.8259f, 14.2662f, 9.5373f, 14.2867f, 9.2441f)
                    curveTo(14.3036f, 9.0029f, 14.3205f, 8.8108f, 14.3316f, 8.7f)
                    curveTo(14.35f, 8.5169f, 14.2164f, 8.3534f, 14.0333f, 8.335f)
                    curveTo(13.8501f, 8.3166f, 13.6867f, 8.4502f, 13.6683f, 8.6334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 10.0f)
                    lineTo(13.3333f, 12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(10.0f)
                    close()
                }
            }
        }
        .build()
        return _gu!!
    }

private var _gu: ImageVector? = null
