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

public val FlagsGroup.Io: ImageVector
    get() {
        if (_io != null) {
            return _io!!
        }
        _io = Builder(name = "Io", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0001f,3.05176E-5f), end = Offset(14.0001f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF07319C), 1.0f to Color(0xFF00247E),
                        start = Offset(14.0049f,-0.00299072f), end = Offset(14.0049f,19.997f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0049f, -0.003f)
                    horizontalLineTo(0.0049f)
                    verticalLineTo(19.997f)
                    horizontalLineTo(28.0049f)
                    verticalLineTo(-0.003f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.43242f,-1.20276f), end = Offset(5.43242f,10.5362f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0002f, 4.3067f)
                    lineTo(-1.802f, -0.6666f)
                    horizontalLineTo(0.8805f)
                    lineTo(5.5472f, 2.6667f)
                    horizontalLineTo(6.4756f)
                    lineTo(12.6668f, -1.2028f)
                    verticalLineTo(0.3334f)
                    curveTo(12.6668f, 0.7368f, 12.4443f, 1.1688f, 12.1097f, 1.4078f)
                    lineTo(8.0002f, 4.3432f)
                    verticalLineTo(5.0268f)
                    lineTo(12.1831f, 8.6122f)
                    curveTo(12.7993f, 9.1403f, 12.4549f, 10.0001f, 11.6668f, 10.0001f)
                    curveTo(11.3399f, 10.0001f, 10.9405f, 9.872f, 10.6681f, 9.6774f)
                    lineTo(6.4532f, 6.6667f)
                    horizontalLineTo(5.5247f)
                    lineTo(-0.6665f, 10.5362f)
                    verticalLineTo(8.3237f)
                    lineTo(4.0002f, 4.9903f)
                    verticalLineTo(4.3067f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.00006f,3.05176E-5f), end = Offset(6.00006f,9.33336f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6667f, 4.0f)
                    lineTo(1.0E-4f, 0.0f)
                    horizontalLineTo(0.6667f)
                    lineTo(5.3334f, 3.3334f)
                    horizontalLineTo(6.6667f)
                    lineTo(12.0001f, 0.0f)
                    verticalLineTo(0.3334f)
                    curveTo(12.0001f, 0.5175f, 11.8847f, 0.7491f, 11.7221f, 0.8652f)
                    lineTo(7.3334f, 4.0f)
                    verticalLineTo(5.3334f)
                    lineTo(11.7492f, 9.1183f)
                    curveTo(11.8877f, 9.2371f, 11.8454f, 9.3334f, 11.6667f, 9.3334f)
                    curveTo(11.4826f, 9.3334f, 11.218f, 9.251f, 11.0554f, 9.1348f)
                    lineTo(6.6667f, 6.0f)
                    horizontalLineTo(5.3334f)
                    lineTo(1.0E-4f, 9.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(4.6667f, 5.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.33339f,3.05176E-5f), end = Offset(6.33339f,10.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 3.3334f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(9.3395f)
                    curveTo(4.6667f, 9.7043f, 4.9521f, 10.0f, 5.3396f, 10.0f)
                    horizontalLineTo(6.6605f)
                    curveTo(7.0321f, 10.0f, 7.3334f, 9.7124f, 7.3334f, 9.3395f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0128f)
                    curveTo(12.3739f, 6.0f, 12.6667f, 5.7147f, 12.6667f, 5.3271f)
                    verticalLineTo(4.0063f)
                    curveTo(12.6667f, 3.6346f, 12.38f, 3.3334f, 12.0128f, 3.3334f)
                    horizontalLineTo(7.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(3.3334f)
                    horizontalLineTo(1.0E-4f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.00006f,3.05176E-5f), end = Offset(6.00006f,9.33336f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 4.0f)
                    horizontalLineTo(5.3334f)
                    verticalLineTo(3.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(3.3334f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(6.0f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(5.3334f)
                    verticalLineTo(6.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.5636f, 9.3304f)
                    lineTo(-0.914f, 9.8229f)
                    lineTo(-1.5465f, 10.0338f)
                    lineTo(-1.1248f, 11.2987f)
                    lineTo(-0.4924f, 11.0878f)
                    lineTo(2.2576f, 10.1712f)
                    curveTo(2.4612f, 10.1033f, 2.8807f, 10.1027f, 3.086f, 10.1712f)
                    lineTo(5.836f, 11.0878f)
                    curveTo(6.3126f, 11.2467f, 7.028f, 11.2477f, 7.5076f, 11.0878f)
                    lineTo(10.2576f, 10.1712f)
                    curveTo(10.4612f, 10.1033f, 10.8807f, 10.1027f, 11.086f, 10.1712f)
                    lineTo(13.836f, 11.0878f)
                    curveTo(14.3126f, 11.2467f, 15.028f, 11.2477f, 15.5076f, 11.0878f)
                    lineTo(18.2576f, 10.1712f)
                    curveTo(18.4612f, 10.1033f, 18.8807f, 10.1027f, 19.086f, 10.1712f)
                    lineTo(21.836f, 11.0878f)
                    curveTo(22.3126f, 11.2467f, 23.028f, 11.2477f, 23.5076f, 11.0878f)
                    lineTo(26.2576f, 10.1712f)
                    curveTo(26.4612f, 10.1033f, 26.8807f, 10.1027f, 27.086f, 10.1712f)
                    lineTo(29.836f, 11.0878f)
                    curveTo(30.3172f, 11.2482f, 30.3172f, 11.2482f, 30.461f, 11.2962f)
                    lineTo(31.0935f, 11.507f)
                    lineTo(31.5151f, 10.2421f)
                    lineTo(30.8826f, 10.0313f)
                    lineTo(30.2576f, 9.8229f)
                    lineTo(27.5076f, 8.9063f)
                    curveTo(27.028f, 8.7464f, 26.3126f, 8.7474f, 25.836f, 8.9063f)
                    lineTo(23.086f, 9.8229f)
                    curveTo(22.8807f, 9.8914f, 22.4612f, 9.8908f, 22.2576f, 9.8229f)
                    lineTo(19.5076f, 8.9063f)
                    curveTo(19.028f, 8.7464f, 18.3126f, 8.7474f, 17.836f, 8.9063f)
                    lineTo(15.086f, 9.8229f)
                    curveTo(14.8807f, 9.8914f, 14.4612f, 9.8908f, 14.2576f, 9.8229f)
                    lineTo(12.0052f, 9.0721f)
                    verticalLineTo(9.3304f)
                    horizontalLineTo(8.5636f)
                    lineTo(7.086f, 9.8229f)
                    curveTo(6.8807f, 9.8914f, 6.4612f, 9.8908f, 6.2576f, 9.8229f)
                    lineTo(4.78f, 9.3304f)
                    horizontalLineTo(0.5636f)
                    close()
                    moveTo(12.0052f, 7.1442f)
                    lineTo(13.836f, 7.7545f)
                    curveTo(14.3126f, 7.9134f, 15.028f, 7.9144f, 15.5076f, 7.7545f)
                    lineTo(18.2576f, 6.8379f)
                    curveTo(18.4612f, 6.77f, 18.8807f, 6.7694f, 19.086f, 6.8379f)
                    lineTo(21.836f, 7.7545f)
                    curveTo(22.3126f, 7.9134f, 23.028f, 7.9144f, 23.5076f, 7.7545f)
                    lineTo(26.2576f, 6.8379f)
                    curveTo(26.4612f, 6.77f, 26.8807f, 6.7694f, 27.086f, 6.8379f)
                    lineTo(29.836f, 7.7545f)
                    lineTo(30.461f, 7.9629f)
                    lineTo(31.0935f, 8.1737f)
                    lineTo(31.5151f, 6.9088f)
                    lineTo(30.8826f, 6.6979f)
                    lineTo(30.2576f, 6.4896f)
                    lineTo(27.5076f, 5.5729f)
                    curveTo(27.028f, 5.4131f, 26.3126f, 5.4141f, 25.836f, 5.5729f)
                    lineTo(23.086f, 6.4896f)
                    curveTo(22.8807f, 6.5581f, 22.4612f, 6.5574f, 22.2576f, 6.4896f)
                    lineTo(19.5076f, 5.5729f)
                    curveTo(19.028f, 5.4131f, 18.3126f, 5.4141f, 17.836f, 5.5729f)
                    lineTo(15.086f, 6.4896f)
                    curveTo(14.8807f, 6.5581f, 14.4612f, 6.5574f, 14.2576f, 6.4896f)
                    lineTo(12.0052f, 5.7388f)
                    verticalLineTo(7.1442f)
                    close()
                    moveTo(0.0052f, 7.5887f)
                    lineTo(-0.4924f, 7.7545f)
                    lineTo(-1.1248f, 7.9653f)
                    lineTo(-1.5465f, 6.7004f)
                    lineTo(-0.914f, 6.4896f)
                    lineTo(0.0052f, 6.1832f)
                    verticalLineTo(7.5887f)
                    close()
                    moveTo(12.0052f, 3.8109f)
                    lineTo(13.836f, 4.4212f)
                    curveTo(14.3126f, 4.58f, 15.028f, 4.5811f, 15.5076f, 4.4212f)
                    lineTo(18.2576f, 3.5045f)
                    curveTo(18.4612f, 3.4367f, 18.8807f, 3.4361f, 19.086f, 3.5045f)
                    lineTo(21.836f, 4.4212f)
                    curveTo(22.3126f, 4.58f, 23.028f, 4.5811f, 23.5076f, 4.4212f)
                    lineTo(26.2576f, 3.5045f)
                    curveTo(26.4612f, 3.4367f, 26.8807f, 3.4361f, 27.086f, 3.5045f)
                    lineTo(29.836f, 4.4212f)
                    curveTo(30.3172f, 4.5816f, 30.3172f, 4.5816f, 30.461f, 4.6295f)
                    lineTo(31.0935f, 4.8403f)
                    lineTo(31.5151f, 3.5754f)
                    lineTo(30.8826f, 3.3646f)
                    curveTo(30.7388f, 3.3167f, 30.7388f, 3.3167f, 30.2576f, 3.1563f)
                    lineTo(27.5076f, 2.2396f)
                    curveTo(27.028f, 2.0797f, 26.3126f, 2.0807f, 25.836f, 2.2396f)
                    lineTo(23.086f, 3.1563f)
                    curveTo(22.8807f, 3.2247f, 22.4612f, 3.2241f, 22.2576f, 3.1563f)
                    lineTo(19.5076f, 2.2396f)
                    curveTo(19.028f, 2.0797f, 18.3126f, 2.0807f, 17.836f, 2.2396f)
                    lineTo(15.086f, 3.1563f)
                    curveTo(14.8807f, 3.2247f, 14.4612f, 3.2241f, 14.2576f, 3.1563f)
                    lineTo(12.0052f, 2.4054f)
                    verticalLineTo(3.8109f)
                    close()
                    moveTo(0.0052f, 4.2553f)
                    lineTo(-0.4924f, 4.4212f)
                    lineTo(-1.1248f, 4.632f)
                    lineTo(-1.5465f, 3.3671f)
                    lineTo(-0.914f, 3.1563f)
                    lineTo(0.0052f, 2.8499f)
                    verticalLineTo(4.2553f)
                    close()
                    moveTo(12.0052f, 0.4776f)
                    lineTo(13.836f, 1.0878f)
                    curveTo(14.3126f, 1.2467f, 15.028f, 1.2477f, 15.5076f, 1.0878f)
                    lineTo(18.2576f, 0.1712f)
                    curveTo(18.4612f, 0.1033f, 18.8807f, 0.1027f, 19.086f, 0.1712f)
                    lineTo(21.836f, 1.0878f)
                    curveTo(22.3126f, 1.2467f, 23.028f, 1.2477f, 23.5076f, 1.0878f)
                    lineTo(26.2576f, 0.1712f)
                    curveTo(26.4612f, 0.1033f, 26.8807f, 0.1027f, 27.086f, 0.1712f)
                    lineTo(29.836f, 1.0878f)
                    lineTo(30.461f, 1.2962f)
                    lineTo(31.0935f, 1.507f)
                    lineTo(31.5151f, 0.2421f)
                    lineTo(30.8826f, 0.0313f)
                    curveTo(30.7388f, -0.0167f, 30.7388f, -0.0167f, 30.2576f, -0.1771f)
                    lineTo(27.5076f, -1.0937f)
                    curveTo(27.028f, -1.2536f, 26.3126f, -1.2526f, 25.836f, -1.0937f)
                    lineTo(23.086f, -0.1771f)
                    curveTo(22.8807f, -0.1086f, 22.4612f, -0.1092f, 22.2576f, -0.1771f)
                    lineTo(19.5076f, -1.0937f)
                    curveTo(19.028f, -1.2536f, 18.3126f, -1.2526f, 17.836f, -1.0937f)
                    lineTo(15.086f, -0.1771f)
                    curveTo(14.8807f, -0.1086f, 14.4612f, -0.1092f, 14.2576f, -0.1771f)
                    lineTo(11.5076f, -1.0937f)
                    curveTo(11.028f, -1.2536f, 10.3126f, -1.2526f, 9.836f, -1.0937f)
                    lineTo(7.086f, -0.1771f)
                    curveTo(6.8807f, -0.1086f, 6.4612f, -0.1092f, 6.2576f, -0.1771f)
                    lineTo(3.5076f, -1.0937f)
                    curveTo(3.028f, -1.2536f, 2.3126f, -1.2526f, 1.836f, -1.0937f)
                    lineTo(-0.914f, -0.1771f)
                    lineTo(-1.5465f, 0.0338f)
                    lineTo(-1.1248f, 1.2987f)
                    lineTo(-0.4924f, 1.0878f)
                    lineTo(0.0052f, 0.922f)
                    verticalLineTo(-0.0029f)
                    horizontalLineTo(12.0052f)
                    verticalLineTo(0.4776f)
                    close()
                    moveTo(30.8826f, 20.0313f)
                    lineTo(31.5151f, 20.2421f)
                    lineTo(31.0935f, 21.507f)
                    lineTo(30.461f, 21.2962f)
                    lineTo(29.836f, 21.0879f)
                    lineTo(27.086f, 20.1712f)
                    curveTo(26.8807f, 20.1027f, 26.4612f, 20.1033f, 26.2576f, 20.1712f)
                    lineTo(23.5076f, 21.0879f)
                    curveTo(23.028f, 21.2477f, 22.3126f, 21.2467f, 21.836f, 21.0879f)
                    lineTo(19.086f, 20.1712f)
                    curveTo(18.8807f, 20.1027f, 18.4612f, 20.1033f, 18.2576f, 20.1712f)
                    lineTo(15.5076f, 21.0879f)
                    curveTo(15.028f, 21.2477f, 14.3126f, 21.2467f, 13.836f, 21.0879f)
                    lineTo(11.086f, 20.1712f)
                    curveTo(10.8807f, 20.1027f, 10.4612f, 20.1033f, 10.2576f, 20.1712f)
                    lineTo(7.5076f, 21.0879f)
                    curveTo(7.028f, 21.2477f, 6.3126f, 21.2467f, 5.836f, 21.0879f)
                    lineTo(3.086f, 20.1712f)
                    curveTo(2.8807f, 20.1027f, 2.4612f, 20.1033f, 2.2576f, 20.1712f)
                    lineTo(-0.4924f, 21.0879f)
                    lineTo(-1.1248f, 21.2987f)
                    lineTo(-1.5465f, 20.0338f)
                    lineTo(-0.914f, 19.8229f)
                    lineTo(1.836f, 18.9063f)
                    curveTo(2.3126f, 18.7474f, 3.028f, 18.7464f, 3.5076f, 18.9063f)
                    lineTo(6.2576f, 19.8229f)
                    curveTo(6.4612f, 19.8908f, 6.8807f, 19.8914f, 7.086f, 19.8229f)
                    lineTo(9.836f, 18.9063f)
                    curveTo(10.3126f, 18.7474f, 11.028f, 18.7464f, 11.5076f, 18.9063f)
                    lineTo(14.2576f, 19.8229f)
                    curveTo(14.4612f, 19.8908f, 14.8807f, 19.8914f, 15.086f, 19.8229f)
                    lineTo(17.836f, 18.9063f)
                    curveTo(18.3126f, 18.7474f, 19.028f, 18.7464f, 19.5076f, 18.9063f)
                    lineTo(22.2576f, 19.8229f)
                    curveTo(22.4612f, 19.8908f, 22.8807f, 19.8914f, 23.086f, 19.8229f)
                    lineTo(25.836f, 18.9063f)
                    curveTo(26.3126f, 18.7474f, 27.028f, 18.7464f, 27.5076f, 18.9063f)
                    lineTo(30.2576f, 19.8229f)
                    lineTo(30.8826f, 20.0313f)
                    close()
                    moveTo(30.8826f, 16.6979f)
                    lineTo(31.5151f, 16.9088f)
                    lineTo(31.0935f, 18.1737f)
                    lineTo(30.461f, 17.9628f)
                    curveTo(30.3172f, 17.9149f, 30.3172f, 17.9149f, 29.836f, 17.7545f)
                    lineTo(27.086f, 16.8378f)
                    curveTo(26.8807f, 16.7694f, 26.4612f, 16.77f, 26.2576f, 16.8378f)
                    lineTo(23.5076f, 17.7545f)
                    curveTo(23.028f, 17.9144f, 22.3126f, 17.9134f, 21.836f, 17.7545f)
                    lineTo(19.086f, 16.8378f)
                    curveTo(18.8807f, 16.7694f, 18.4612f, 16.77f, 18.2576f, 16.8378f)
                    lineTo(15.5076f, 17.7545f)
                    curveTo(15.028f, 17.9144f, 14.3126f, 17.9134f, 13.836f, 17.7545f)
                    lineTo(11.086f, 16.8378f)
                    curveTo(10.8807f, 16.7694f, 10.4612f, 16.77f, 10.2576f, 16.8378f)
                    lineTo(7.5076f, 17.7545f)
                    curveTo(7.028f, 17.9144f, 6.3126f, 17.9134f, 5.836f, 17.7545f)
                    lineTo(3.086f, 16.8378f)
                    curveTo(2.8807f, 16.7694f, 2.4612f, 16.77f, 2.2576f, 16.8378f)
                    lineTo(-0.4924f, 17.7545f)
                    lineTo(-1.1248f, 17.9653f)
                    lineTo(-1.5465f, 16.7004f)
                    lineTo(-0.914f, 16.4896f)
                    lineTo(1.836f, 15.5729f)
                    curveTo(2.3126f, 15.4141f, 3.028f, 15.4131f, 3.5076f, 15.5729f)
                    lineTo(6.2576f, 16.4896f)
                    curveTo(6.4612f, 16.5574f, 6.8807f, 16.558f, 7.086f, 16.4896f)
                    lineTo(9.836f, 15.5729f)
                    curveTo(10.3126f, 15.4141f, 11.028f, 15.4131f, 11.5076f, 15.5729f)
                    lineTo(14.2576f, 16.4896f)
                    curveTo(14.4612f, 16.5574f, 14.8807f, 16.558f, 15.086f, 16.4896f)
                    lineTo(17.836f, 15.5729f)
                    curveTo(18.3126f, 15.4141f, 19.028f, 15.4131f, 19.5076f, 15.5729f)
                    lineTo(22.2576f, 16.4896f)
                    curveTo(22.4612f, 16.5574f, 22.8807f, 16.558f, 23.086f, 16.4896f)
                    lineTo(25.836f, 15.5729f)
                    curveTo(26.3126f, 15.4141f, 27.028f, 15.4131f, 27.5076f, 15.5729f)
                    lineTo(30.2576f, 16.4896f)
                    curveTo(30.7388f, 16.65f, 30.7388f, 16.65f, 30.8826f, 16.6979f)
                    close()
                    moveTo(30.8826f, 13.3646f)
                    lineTo(31.5151f, 13.5754f)
                    lineTo(31.0935f, 14.8403f)
                    lineTo(30.461f, 14.6295f)
                    curveTo(30.3172f, 14.5816f, 30.3172f, 14.5816f, 29.836f, 14.4212f)
                    lineTo(27.086f, 13.5045f)
                    curveTo(26.8807f, 13.4361f, 26.4612f, 13.4367f, 26.2576f, 13.5045f)
                    lineTo(23.5076f, 14.4212f)
                    curveTo(23.028f, 14.5811f, 22.3126f, 14.58f, 21.836f, 14.4212f)
                    lineTo(19.086f, 13.5045f)
                    curveTo(18.8807f, 13.4361f, 18.4612f, 13.4367f, 18.2576f, 13.5045f)
                    lineTo(15.5076f, 14.4212f)
                    curveTo(15.028f, 14.5811f, 14.3126f, 14.58f, 13.836f, 14.4212f)
                    lineTo(11.086f, 13.5045f)
                    curveTo(10.8807f, 13.4361f, 10.4612f, 13.4367f, 10.2576f, 13.5045f)
                    lineTo(7.5076f, 14.4212f)
                    curveTo(7.028f, 14.5811f, 6.3126f, 14.58f, 5.836f, 14.4212f)
                    lineTo(3.086f, 13.5045f)
                    curveTo(2.8807f, 13.4361f, 2.4612f, 13.4367f, 2.2576f, 13.5045f)
                    lineTo(-0.4924f, 14.4212f)
                    lineTo(-1.1248f, 14.632f)
                    lineTo(-1.5465f, 13.3671f)
                    lineTo(-0.914f, 13.1563f)
                    lineTo(1.836f, 12.2396f)
                    curveTo(2.3126f, 12.0807f, 3.028f, 12.0797f, 3.5076f, 12.2396f)
                    lineTo(6.2576f, 13.1563f)
                    curveTo(6.4612f, 13.2241f, 6.8807f, 13.2247f, 7.086f, 13.1563f)
                    lineTo(9.836f, 12.2396f)
                    curveTo(10.3126f, 12.0807f, 11.028f, 12.0797f, 11.5076f, 12.2396f)
                    lineTo(14.2576f, 13.1563f)
                    curveTo(14.4612f, 13.2241f, 14.8807f, 13.2247f, 15.086f, 13.1563f)
                    lineTo(17.836f, 12.2396f)
                    curveTo(18.3126f, 12.0807f, 19.028f, 12.0797f, 19.5076f, 12.2396f)
                    lineTo(22.2576f, 13.1563f)
                    curveTo(22.4612f, 13.2241f, 22.8807f, 13.2247f, 23.086f, 13.1563f)
                    lineTo(25.836f, 12.2396f)
                    curveTo(26.3126f, 12.0807f, 27.028f, 12.0797f, 27.5076f, 12.2396f)
                    lineTo(30.2576f, 13.1563f)
                    curveTo(30.7388f, 13.3167f, 30.7388f, 13.3167f, 30.8826f, 13.3646f)
                    close()
                }
            }
        }
        .build()
        return _io!!
    }

private var _io: ImageVector? = null
