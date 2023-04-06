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

public val FlagsGroup.Gs: ImageVector
    get() {
        if (_gs != null) {
            return _gs!!
        }
        _gs = Builder(name = "Gs", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
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
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E1E1E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.6667f, 14.6667f)
                    curveTo(25.4031f, 14.6667f, 26.0001f, 13.7712f, 26.0001f, 12.6667f)
                    curveTo(26.0001f, 11.5621f, 25.4031f, 10.6667f, 24.6667f, 10.6667f)
                    curveTo(23.9303f, 10.6667f, 23.3334f, 11.5621f, 23.3334f, 12.6667f)
                    curveTo(23.3334f, 13.7712f, 23.9303f, 14.6667f, 24.6667f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0001f, 15.3333f)
                    curveTo(24.7365f, 15.3333f, 25.3334f, 14.4379f, 25.3334f, 13.3333f)
                    curveTo(25.3334f, 12.2287f, 24.7365f, 11.3333f, 24.0001f, 11.3333f)
                    curveTo(23.2637f, 11.3333f, 22.6667f, 12.2287f, 22.6667f, 13.3333f)
                    curveTo(22.6667f, 14.4379f, 23.2637f, 15.3333f, 24.0001f, 15.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA2ADB0)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3334f, 14.6667f)
                    curveTo(20.0698f, 14.6667f, 20.6667f, 13.7712f, 20.6667f, 12.6667f)
                    curveTo(20.6667f, 11.5621f, 20.0698f, 10.6667f, 19.3334f, 10.6667f)
                    curveTo(18.597f, 10.6667f, 18.0001f, 11.5621f, 18.0001f, 12.6667f)
                    curveTo(18.0001f, 13.7712f, 18.597f, 14.6667f, 19.3334f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF4F4F4F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0001f, 15.3333f)
                    curveTo(20.7364f, 15.3333f, 21.3334f, 14.4379f, 21.3334f, 13.3333f)
                    curveTo(21.3334f, 12.2287f, 20.7364f, 11.3333f, 20.0001f, 11.3333f)
                    curveTo(19.2637f, 11.3333f, 18.6667f, 12.2287f, 18.6667f, 13.3333f)
                    curveTo(18.6667f, 14.4379f, 19.2637f, 15.3333f, 20.0001f, 15.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFEC241)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(22.0f, 16.6667f)
                    curveTo(23.1046f, 17.3333f, 24.0f, 17.0349f, 24.0f, 16.6667f)
                    curveTo(24.0f, 16.2985f, 23.1046f, 16.0f, 22.0f, 16.0f)
                    curveTo(20.8954f, 16.0f, 20.0f, 16.2985f, 20.0f, 16.6667f)
                    curveTo(20.0f, 17.0349f, 20.8954f, 17.3333f, 22.0f, 16.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.6667f, 8.6667f)
                    curveTo(25.4031f, 8.6667f, 26.0f, 8.0697f, 26.0f, 7.3333f)
                    curveTo(26.0f, 6.597f, 25.4031f, 6.0f, 24.6667f, 6.0f)
                    curveTo(23.9303f, 6.0f, 23.3333f, 6.597f, 23.3333f, 7.3333f)
                    curveTo(23.3333f, 8.0697f, 23.9303f, 8.6667f, 24.6667f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA84B14)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 7.3333f)
                    curveTo(22.7364f, 7.3333f, 23.3333f, 6.7364f, 23.3333f, 6.0f)
                    curveTo(23.3333f, 5.2636f, 22.7364f, 4.6667f, 22.0f, 4.6667f)
                    curveTo(21.2636f, 4.6667f, 20.6667f, 5.2636f, 20.6667f, 6.0f)
                    curveTo(20.6667f, 6.7364f, 21.2636f, 7.3333f, 22.0f, 7.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCFB063)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 6.3333f)
                    curveTo(22.7364f, 6.3333f, 23.3333f, 5.7364f, 23.3333f, 5.0f)
                    curveTo(23.3333f, 4.2636f, 22.7364f, 3.6667f, 22.0f, 3.6667f)
                    curveTo(21.2636f, 3.6667f, 20.6667f, 4.2636f, 20.6667f, 5.0f)
                    curveTo(20.6667f, 5.7364f, 21.2636f, 6.3333f, 22.0f, 6.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 16.6667f)
                    curveTo(22.7364f, 16.6667f, 23.3333f, 16.0697f, 23.3333f, 15.3333f)
                    curveTo(23.3333f, 14.597f, 22.7364f, 14.0f, 22.0f, 14.0f)
                    curveTo(21.2636f, 14.0f, 20.6667f, 14.597f, 20.6667f, 15.3333f)
                    curveTo(20.6667f, 16.0697f, 21.2636f, 16.6667f, 22.0f, 16.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3333f, 8.6667f)
                    curveTo(20.0697f, 8.6667f, 20.6667f, 8.0697f, 20.6667f, 7.3333f)
                    curveTo(20.6667f, 6.597f, 20.0697f, 6.0f, 19.3333f, 6.0f)
                    curveTo(18.597f, 6.0f, 18.0f, 6.597f, 18.0f, 7.3333f)
                    curveTo(18.0f, 8.0697f, 18.597f, 8.6667f, 19.3333f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2D42FF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 10.0f)
                    curveTo(20.7364f, 10.0f, 21.3333f, 9.4031f, 21.3333f, 8.6667f)
                    curveTo(21.3333f, 7.9303f, 20.7364f, 7.3333f, 20.0f, 7.3333f)
                    curveTo(19.2636f, 7.3333f, 18.6667f, 7.9303f, 18.6667f, 8.6667f)
                    curveTo(18.6667f, 9.4031f, 19.2636f, 10.0f, 20.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2D42FF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 10.0f)
                    curveTo(24.7364f, 10.0f, 25.3333f, 9.4031f, 25.3333f, 8.6667f)
                    curveTo(25.3333f, 7.9303f, 24.7364f, 7.3333f, 24.0f, 7.3333f)
                    curveTo(23.2636f, 7.3333f, 22.6667f, 7.9303f, 22.6667f, 8.6667f)
                    curveTo(22.6667f, 9.4031f, 23.2636f, 10.0f, 24.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE3DC3D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(25.3333f, 12.0f)
                    curveTo(26.0697f, 12.0f, 26.6667f, 11.4031f, 26.6667f, 10.6667f)
                    curveTo(26.6667f, 9.9303f, 26.0697f, 9.3333f, 25.3333f, 9.3333f)
                    curveTo(24.597f, 9.3333f, 24.0f, 9.9303f, 24.0f, 10.6667f)
                    curveTo(24.0f, 11.4031f, 24.597f, 12.0f, 25.3333f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF7F7D7D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.3333f, 10.0f)
                    lineTo(20.6667f, 10.6667f)
                    horizontalLineTo(23.3333f)
                    lineTo(22.6667f, 10.0f)
                    lineTo(23.3333f, 8.0f)
                    curveTo(23.3333f, 8.0f, 22.7364f, 6.6667f, 22.0f, 6.6667f)
                    curveTo(21.2636f, 6.6667f, 20.6667f, 8.0f, 20.6667f, 8.0f)
                    lineTo(21.3333f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5D0543)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(22.0f, 8.6667f)
                    curveTo(22.0f, 8.6667f, 22.6667f, 8.5174f, 22.6667f, 8.16f)
                    curveTo(22.6667f, 8.1493f, 22.0f, 8.0f, 22.0f, 8.0f)
                    curveTo(22.0f, 8.0f, 21.3333f, 8.1493f, 21.3333f, 8.16f)
                    curveTo(21.3333f, 8.5174f, 22.0f, 8.6667f, 22.0f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0092f, 11.3412f)
                    curveTo(20.0042f, 10.9687f, 20.2878f, 10.6667f, 20.6607f, 10.6667f)
                    horizontalLineTo(23.3396f)
                    curveTo(23.7044f, 10.6667f, 24.0043f, 10.9743f, 24.0092f, 11.3412f)
                    lineTo(24.0406f, 13.6682f)
                    curveTo(24.0431f, 13.8514f, 23.9124f, 14.0875f, 23.7639f, 14.1854f)
                    lineTo(22.3038f, 15.1479f)
                    curveTo(22.1485f, 15.2503f, 21.8929f, 15.2458f, 21.7476f, 15.1479f)
                    lineTo(20.32f, 14.1854f)
                    curveTo(20.1682f, 14.083f, 20.0431f, 13.8568f, 20.0406f, 13.6682f)
                    lineTo(20.0092f, 11.3412f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF225DA4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.3333f, 15.3333f)
                    curveTo(24.0697f, 15.3333f, 24.6667f, 14.7364f, 24.6667f, 14.0f)
                    curveTo(24.6667f, 13.2636f, 24.0698f, 12.6667f, 23.3334f, 12.6667f)
                    curveTo(22.597f, 12.6667f, 22.0f, 13.2636f, 22.0f, 14.0f)
                    curveTo(22.0f, 14.7364f, 22.597f, 15.3333f, 23.3333f, 15.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF225DA4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.6667f, 14.0f)
                    curveTo(21.4031f, 14.0f, 22.0001f, 13.403f, 22.0001f, 12.6666f)
                    curveTo(22.0001f, 11.9303f, 21.4031f, 11.3333f, 20.6667f, 11.3333f)
                    curveTo(19.9304f, 11.3333f, 19.3334f, 11.9303f, 19.3334f, 12.6666f)
                    curveTo(19.3334f, 13.403f, 19.9304f, 14.0f, 20.6667f, 14.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F8012)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0001f, 10.6666f)
                    lineTo(24.0f, 10.6667f)
                    lineTo(22.0001f, 14.6666f)
                    lineTo(20.0001f, 10.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCF44)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 14.0f)
                    curveTo(22.7364f, 14.0f, 23.3334f, 13.403f, 23.3334f, 12.6667f)
                    curveTo(23.3334f, 11.9303f, 22.7365f, 11.3333f, 22.0001f, 11.3333f)
                    curveTo(21.2637f, 11.3333f, 20.6667f, 11.9303f, 20.6667f, 12.6667f)
                    curveTo(20.6667f, 13.403f, 21.2636f, 14.0f, 22.0f, 14.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0006f, 0.9474f)
                    lineTo(11.4314f, 3.1023f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(6.67f)
                    horizontalLineTo(11.4319f)
                    lineTo(14.0006f, 8.8238f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(10.8044f)
                    lineTo(8.7864f, 8.3129f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(5.215f)
                    verticalLineTo(8.3113f)
                    lineTo(3.1932f, 10.0026f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.8136f)
                    lineTo(2.5635f, 6.67f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.1023f)
                    horizontalLineTo(2.5671f)
                    lineTo(0.0f, 0.952f)
                    verticalLineTo(0.0026f)
                    horizontalLineTo(3.4735f)
                    lineTo(5.215f, 1.4601f)
                    verticalLineTo(0.0026f)
                    horizontalLineTo(8.7864f)
                    verticalLineTo(1.463f)
                    lineTo(10.5352f, 0.0026f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(0.9474f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6828f, 4.1023f)
                    lineTo(13.571f, 0.0026f)
                    lineTo(12.0943f, 0.0f)
                    lineTo(7.7864f, 3.601f)
                    verticalLineTo(0.0045f)
                    lineTo(6.215f, 0.0045f)
                    verticalLineTo(3.6011f)
                    lineTo(1.9281f, 0.0131f)
                    lineTo(0.4262f, 0.0045f)
                    lineTo(5.3183f, 4.1023f)
                    horizontalLineTo(6.0E-4f)
                    verticalLineTo(5.67f)
                    horizontalLineTo(5.3183f)
                    lineTo(0.139f, 10.0008f)
                    lineTo(1.6391f, 9.9989f)
                    lineTo(6.215f, 6.171f)
                    verticalLineTo(10.0004f)
                    horizontalLineTo(7.7864f)
                    verticalLineTo(6.1713f)
                    lineTo(12.36f, 10.0008f)
                    lineTo(13.8503f, 10.0028f)
                    lineTo(8.6829f, 5.67f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(4.1023f)
                    horizontalLineTo(8.6828f)
                    close()
                }
            }
        }
        .build()
        return _gs!!
    }

private var _gs: ImageVector? = null
