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

public val FlagsGroup.Gs: ImageVector
    get() {
        if (_gs != null) {
            return _gs!!
        }
        _gs = Builder(name = "Gs", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0f,3.05176E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF07319C), 1.0f to Color(0xFF00247E),
                        start = Offset(14.0f,3.05176E-5f), end = Offset(14.0f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(5.43229f,-1.20279f), end = Offset(5.43229f,10.5362f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.0001f, 4.3067f)
                    lineTo(-1.8021f, -0.6666f)
                    horizontalLineTo(0.8804f)
                    lineTo(5.547f, 2.6667f)
                    horizontalLineTo(6.4755f)
                    lineTo(12.6667f, -1.2028f)
                    verticalLineTo(0.3334f)
                    curveTo(12.6667f, 0.7367f, 12.4442f, 1.1688f, 12.1096f, 1.4077f)
                    lineTo(8.0f, 4.3431f)
                    verticalLineTo(5.0268f)
                    lineTo(12.183f, 8.6122f)
                    curveTo(12.7992f, 9.1403f, 12.4548f, 10.0f, 11.6667f, 10.0f)
                    curveTo(11.3398f, 10.0f, 10.9404f, 9.872f, 10.6679f, 9.6773f)
                    lineTo(6.4531f, 6.6667f)
                    horizontalLineTo(5.5246f)
                    lineTo(-0.6666f, 10.5362f)
                    verticalLineTo(8.3236f)
                    lineTo(4.0001f, 4.9903f)
                    verticalLineTo(4.3067f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.0f,3.05176E-5f), end = Offset(6.0f,9.33336f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.6667f, 4.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(0.6667f)
                    lineTo(5.3333f, 3.3334f)
                    horizontalLineTo(6.6667f)
                    lineTo(12.0f, 0.0f)
                    verticalLineTo(0.3334f)
                    curveTo(12.0f, 0.5175f, 11.8846f, 0.7491f, 11.7221f, 0.8652f)
                    lineTo(7.3333f, 4.0f)
                    verticalLineTo(5.3334f)
                    lineTo(11.7491f, 9.1183f)
                    curveTo(11.8877f, 9.2371f, 11.8454f, 9.3334f, 11.6667f, 9.3334f)
                    curveTo(11.4826f, 9.3334f, 11.218f, 9.251f, 11.0554f, 9.1348f)
                    lineTo(6.6667f, 6.0f)
                    horizontalLineTo(5.3333f)
                    lineTo(0.0f, 9.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(4.6667f, 5.3334f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(6.33333f,3.05176E-5f), end = Offset(6.33333f,10.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.3334f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(9.3395f)
                    curveTo(4.6667f, 9.7043f, 4.9521f, 10.0f, 5.3396f, 10.0f)
                    horizontalLineTo(6.6604f)
                    curveTo(7.0321f, 10.0f, 7.3333f, 9.7124f, 7.3333f, 9.3395f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(12.0127f)
                    curveTo(12.3739f, 6.0f, 12.6667f, 5.7147f, 12.6667f, 5.3271f)
                    verticalLineTo(4.0063f)
                    curveTo(12.6667f, 3.6346f, 12.3799f, 3.3334f, 12.0127f, 3.3334f)
                    horizontalLineTo(7.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(3.3334f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(6.0f,3.05176E-5f), end = Offset(6.0f,9.33336f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 4.0f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(3.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(3.3334f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(6.0f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(6.0f)
                    verticalLineTo(5.3334f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1E1E1E), 1.0f to Color(0xFF000000),
                        start = Offset(24.6666f,10.6667f), end = Offset(24.6666f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.6666f, 14.6667f)
                    curveTo(25.403f, 14.6667f, 25.9999f, 13.7713f, 25.9999f, 12.6667f)
                    curveTo(25.9999f, 11.5621f, 25.403f, 10.6667f, 24.6666f, 10.6667f)
                    curveTo(23.9302f, 10.6667f, 23.3333f, 11.5621f, 23.3333f, 12.6667f)
                    curveTo(23.3333f, 13.7713f, 23.9302f, 14.6667f, 24.6666f, 14.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(24.0f,11.3333f), end = Offset(24.0f,15.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.0f, 15.3333f)
                    curveTo(24.7363f, 15.3333f, 25.3333f, 14.4379f, 25.3333f, 13.3333f)
                    curveTo(25.3333f, 12.2288f, 24.7363f, 11.3333f, 24.0f, 11.3333f)
                    curveTo(23.2636f, 11.3333f, 22.6666f, 12.2288f, 22.6666f, 13.3333f)
                    curveTo(22.6666f, 14.4379f, 23.2636f, 15.3333f, 24.0f, 15.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFA2ADB0), 1.0f to Color(0xFF8B9497),
                        start = Offset(19.3333f,10.6667f), end = Offset(19.3333f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(19.3333f, 14.6667f)
                    curveTo(20.0697f, 14.6667f, 20.6667f, 13.7713f, 20.6667f, 12.6667f)
                    curveTo(20.6667f, 11.5621f, 20.0697f, 10.6667f, 19.3333f, 10.6667f)
                    curveTo(18.597f, 10.6667f, 18.0f, 11.5621f, 18.0f, 12.6667f)
                    curveTo(18.0f, 13.7713f, 18.597f, 14.6667f, 19.3333f, 14.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF4F4F4F), 1.0f to Color(0xFF2B2B2B),
                        start = Offset(20.0f,11.3333f), end = Offset(20.0f,15.3333f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(20.0f, 15.3333f)
                    curveTo(20.7363f, 15.3333f, 21.3333f, 14.4379f, 21.3333f, 13.3333f)
                    curveTo(21.3333f, 12.2288f, 20.7363f, 11.3333f, 20.0f, 11.3333f)
                    curveTo(19.2636f, 11.3333f, 18.6666f, 12.2288f, 18.6666f, 13.3333f)
                    curveTo(18.6666f, 14.4379f, 19.2636f, 15.3333f, 20.0f, 15.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFEC241), 1.0f to Color(0xFFFEBB2C),
                        start = Offset(22.0f,16.0f), end = Offset(22.0f,17.0625f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(22.0f, 16.6667f)
                    curveTo(23.1046f, 17.3334f, 24.0f, 17.0349f, 24.0f, 16.6667f)
                    curveTo(24.0f, 16.2985f, 23.1046f, 16.0f, 22.0f, 16.0f)
                    curveTo(20.8954f, 16.0f, 20.0f, 16.2985f, 20.0f, 16.6667f)
                    curveTo(20.0f, 17.0349f, 20.8954f, 17.3334f, 22.0f, 16.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(24.6666f,6.00003f), end = Offset(24.6666f,8.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.6666f, 8.6667f)
                    curveTo(25.403f, 8.6667f, 25.9999f, 8.0697f, 25.9999f, 7.3334f)
                    curveTo(25.9999f, 6.597f, 25.403f, 6.0f, 24.6666f, 6.0f)
                    curveTo(23.9302f, 6.0f, 23.3333f, 6.597f, 23.3333f, 7.3334f)
                    curveTo(23.3333f, 8.0697f, 23.9302f, 8.6667f, 24.6666f, 8.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFA84B14), 1.0f to Color(0xFF913F0E),
                        start = Offset(22.0f,4.66669f), end = Offset(22.0f,7.33335f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.0f, 7.3334f)
                    curveTo(22.7363f, 7.3334f, 23.3333f, 6.7364f, 23.3333f, 6.0f)
                    curveTo(23.3333f, 5.2636f, 22.7363f, 4.6667f, 22.0f, 4.6667f)
                    curveTo(21.2636f, 4.6667f, 20.6666f, 5.2636f, 20.6666f, 6.0f)
                    curveTo(20.6666f, 6.7364f, 21.2636f, 7.3334f, 22.0f, 7.3334f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFCFB063), 1.0f to Color(0xFFBEA157),
                        start = Offset(22.0f,3.66669f), end = Offset(22.0f,6.33335f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.0f, 6.3334f)
                    curveTo(22.7363f, 6.3334f, 23.3333f, 5.7364f, 23.3333f, 5.0f)
                    curveTo(23.3333f, 4.2636f, 22.7363f, 3.6667f, 22.0f, 3.6667f)
                    curveTo(21.2636f, 3.6667f, 20.6666f, 4.2636f, 20.6666f, 5.0f)
                    curveTo(20.6666f, 5.7364f, 21.2636f, 6.3334f, 22.0f, 6.3334f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(22.0f,14.0f), end = Offset(22.0f,16.6667f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.0f, 16.6667f)
                    curveTo(22.7363f, 16.6667f, 23.3333f, 16.0697f, 23.3333f, 15.3334f)
                    curveTo(23.3333f, 14.597f, 22.7363f, 14.0f, 22.0f, 14.0f)
                    curveTo(21.2636f, 14.0f, 20.6666f, 14.597f, 20.6666f, 15.3334f)
                    curveTo(20.6666f, 16.0697f, 21.2636f, 16.6667f, 22.0f, 16.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(19.3333f,6.00003f), end = Offset(19.3333f,8.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(19.3333f, 8.6667f)
                    curveTo(20.0697f, 8.6667f, 20.6667f, 8.0697f, 20.6667f, 7.3334f)
                    curveTo(20.6667f, 6.597f, 20.0697f, 6.0f, 19.3333f, 6.0f)
                    curveTo(18.597f, 6.0f, 18.0f, 6.597f, 18.0f, 7.3334f)
                    curveTo(18.0f, 8.0697f, 18.597f, 8.6667f, 19.3333f, 8.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF2D42FF), 1.0f to Color(0xFF0B24FC),
                        start = Offset(20.0f,7.33337f), end = Offset(20.0f,10.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(20.0f, 10.0f)
                    curveTo(20.7363f, 10.0f, 21.3333f, 9.4031f, 21.3333f, 8.6667f)
                    curveTo(21.3333f, 7.9303f, 20.7363f, 7.3334f, 20.0f, 7.3334f)
                    curveTo(19.2636f, 7.3334f, 18.6666f, 7.9303f, 18.6666f, 8.6667f)
                    curveTo(18.6666f, 9.4031f, 19.2636f, 10.0f, 20.0f, 10.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF2D42FF), 1.0f to Color(0xFF0B24FC),
                        start = Offset(24.0f,7.33337f), end = Offset(24.0f,10.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.0f, 10.0f)
                    curveTo(24.7363f, 10.0f, 25.3333f, 9.4031f, 25.3333f, 8.6667f)
                    curveTo(25.3333f, 7.9303f, 24.7363f, 7.3334f, 24.0f, 7.3334f)
                    curveTo(23.2636f, 7.3334f, 22.6666f, 7.9303f, 22.6666f, 8.6667f)
                    curveTo(22.6666f, 9.4031f, 23.2636f, 10.0f, 24.0f, 10.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE3DC3D), 1.0f to Color(0xFFCFC82A),
                        start = Offset(24.0f,9.33337f), end = Offset(26.6667f,10.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(25.3333f, 12.0f)
                    curveTo(26.0697f, 12.0f, 26.6667f, 11.4031f, 26.6667f, 10.6667f)
                    curveTo(26.6667f, 9.9303f, 26.0697f, 9.3334f, 25.3333f, 9.3334f)
                    curveTo(24.597f, 9.3334f, 24.0f, 9.9303f, 24.0f, 10.6667f)
                    curveTo(24.0f, 11.4031f, 24.597f, 12.0f, 25.3333f, 12.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF7F7D7D), 1.0f to Color(0xFF656263),
                        start = Offset(22.0f,6.66669f), end = Offset(22.0f,10.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(21.3333f, 10.0f)
                    lineTo(20.6666f, 10.6667f)
                    horizontalLineTo(23.3333f)
                    lineTo(22.6666f, 10.0f)
                    lineTo(23.3333f, 8.0f)
                    curveTo(23.3333f, 8.0f, 22.7363f, 6.6667f, 22.0f, 6.6667f)
                    curveTo(21.2636f, 6.6667f, 20.6666f, 8.0f, 20.6666f, 8.0f)
                    lineTo(21.3333f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5D0543)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.9999f, 8.6667f)
                    curveTo(21.9999f, 8.6667f, 22.6666f, 8.5175f, 22.6666f, 8.16f)
                    curveTo(22.6666f, 8.1493f, 21.9999f, 8.0f, 21.9999f, 8.0f)
                    curveTo(21.9999f, 8.0f, 21.3333f, 8.1493f, 21.3333f, 8.16f)
                    curveTo(21.3333f, 8.5175f, 21.9999f, 8.6667f, 21.9999f, 8.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(22.0248f,10.6667f), end = Offset(22.0248f,15.2231f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(20.0091f, 11.3413f)
                    curveTo(20.0041f, 10.9687f, 20.2877f, 10.6667f, 20.6605f, 10.6667f)
                    horizontalLineTo(23.3395f)
                    curveTo(23.7043f, 10.6667f, 24.0042f, 10.9743f, 24.0091f, 11.3413f)
                    lineTo(24.0405f, 13.6683f)
                    curveTo(24.0429f, 13.8515f, 23.9122f, 14.0875f, 23.7637f, 14.1854f)
                    lineTo(22.3037f, 15.148f)
                    curveTo(22.1484f, 15.2504f, 21.8927f, 15.2459f, 21.7475f, 15.148f)
                    lineTo(20.3199f, 14.1854f)
                    curveTo(20.168f, 14.0831f, 20.043f, 13.8568f, 20.0405f, 13.6683f)
                    lineTo(20.0091f, 11.3413f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF225DA4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.3332f, 15.3334f)
                    curveTo(24.0696f, 15.3334f, 24.6665f, 14.7364f, 24.6665f, 14.0f)
                    curveTo(24.6665f, 13.2636f, 24.0696f, 12.6667f, 23.3332f, 12.6667f)
                    curveTo(22.5968f, 12.6667f, 21.9999f, 13.2636f, 21.9999f, 14.0f)
                    curveTo(21.9999f, 14.7364f, 22.5968f, 15.3334f, 23.3332f, 15.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF225DA4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.6666f, 14.0f)
                    curveTo(21.403f, 14.0f, 21.9999f, 13.4031f, 21.9999f, 12.6667f)
                    curveTo(21.9999f, 11.9303f, 21.403f, 11.3333f, 20.6666f, 11.3333f)
                    curveTo(19.9302f, 11.3333f, 19.3333f, 11.9303f, 19.3333f, 12.6667f)
                    curveTo(19.3333f, 13.4031f, 19.9302f, 14.0f, 20.6666f, 14.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0F8012), 1.0f to Color(0xFF0B6A0D),
                        start = Offset(21.9999f,10.6667f), end = Offset(21.9999f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(19.9999f, 10.6667f)
                    horizontalLineTo(23.9999f)
                    lineTo(21.9999f, 14.6667f)
                    lineTo(19.9999f, 10.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFCF44), 1.0f to Color(0xFFFCC72E),
                        start = Offset(22.0f,11.3333f), end = Offset(22.0f,14.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.0f, 14.0f)
                    curveTo(22.7363f, 14.0f, 23.3333f, 13.4031f, 23.3333f, 12.6667f)
                    curveTo(23.3333f, 11.9303f, 22.7363f, 11.3333f, 22.0f, 11.3333f)
                    curveTo(21.2636f, 11.3333f, 20.6666f, 11.9303f, 20.6666f, 12.6667f)
                    curveTo(20.6666f, 13.4031f, 21.2636f, 14.0f, 22.0f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _gs!!
    }

private var _gs: ImageVector? = null
