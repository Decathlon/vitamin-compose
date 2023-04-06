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

public val FlagsGroup.Eg: ImageVector
    get() {
        if (_eg != null) {
            return _eg!!
        }
        _eg = Builder(name = "Eg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3334f, 0.0f, 18.6667f, -0.0f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3334f, 3.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE41D33)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3334f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFC6A846)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.3072f, 10.1051f)
                    lineTo(11.588f, 8.6667f)
                    horizontalLineTo(11.3334f)
                    lineTo(11.3334f, 10.7544f)
                    lineTo(12.3072f, 10.1051f)
                    close()
                    moveTo(12.6667f, 10.6667f)
                    lineTo(11.7032f, 11.3091f)
                    curveTo(11.2601f, 11.6044f, 10.6667f, 11.2868f, 10.6667f, 10.7544f)
                    verticalLineTo(8.6667f)
                    curveTo(10.6667f, 8.2985f, 10.9652f, 8.0f, 11.3334f, 8.0f)
                    horizontalLineTo(11.794f)
                    curveTo(11.9203f, 8.0f, 12.0357f, 8.0714f, 12.0922f, 8.1843f)
                    lineTo(12.6667f, 9.3334f)
                    curveTo(12.6667f, 9.3334f, 12.8415f, 9.0153f, 13.0903f, 8.6898f)
                    curveTo(13.3508f, 8.3489f, 13.6927f, 8.0f, 14.0f, 8.0f)
                    curveTo(14.3346f, 8.0f, 14.6692f, 8.3358f, 14.9195f, 8.6704f)
                    curveTo(15.1679f, 9.0025f, 15.3334f, 9.3334f, 15.3334f, 9.3334f)
                    lineTo(15.9079f, 8.1843f)
                    curveTo(15.9644f, 8.0714f, 16.0798f, 8.0f, 16.2061f, 8.0f)
                    horizontalLineTo(16.6667f)
                    curveTo(17.0349f, 8.0f, 17.3334f, 8.2985f, 17.3334f, 8.6667f)
                    verticalLineTo(10.7544f)
                    curveTo(17.3334f, 11.2868f, 16.7399f, 11.6044f, 16.2969f, 11.3091f)
                    lineTo(15.3334f, 10.6667f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(11.3334f)
                    curveTo(14.6667f, 11.7016f, 14.3682f, 12.0f, 14.0f, 12.0f)
                    curveTo(13.6319f, 12.0f, 13.3334f, 11.7016f, 13.3334f, 11.3334f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(12.6667f)
                    close()
                    moveTo(14.9214f, 10.0f)
                    horizontalLineTo(13.0611f)
                    curveTo(13.1324f, 9.8704f, 13.2013f, 9.7391f, 13.2757f, 9.6112f)
                    curveTo(13.2938f, 9.58f, 13.3212f, 9.5339f, 13.356f, 9.4781f)
                    curveTo(13.4265f, 9.3653f, 13.5239f, 9.2185f, 13.6351f, 9.075f)
                    curveTo(13.7493f, 8.9275f, 13.8618f, 8.8047f, 13.9597f, 8.7249f)
                    curveTo(13.9809f, 8.7076f, 13.9984f, 8.6947f, 14.0124f, 8.6852f)
                    curveTo(14.0279f, 8.6949f, 14.0481f, 8.7089f, 14.0732f, 8.7289f)
                    curveTo(14.1682f, 8.805f, 14.2755f, 8.9229f, 14.3834f, 9.0667f)
                    curveTo(14.4884f, 9.2067f, 14.5784f, 9.3503f, 14.6429f, 9.4609f)
                    curveTo(14.6748f, 9.5156f, 14.6995f, 9.5605f, 14.7158f, 9.5909f)
                    curveTo(14.7878f, 9.7253f, 14.8531f, 9.8636f, 14.9214f, 10.0f)
                    close()
                    moveTo(15.6929f, 10.1051f)
                    lineTo(16.6667f, 10.7544f)
                    lineTo(16.6667f, 8.6667f)
                    horizontalLineTo(16.4121f)
                    lineTo(15.6929f, 10.1051f)
                    close()
                }
            }
        }
        .build()
        return _eg!!
    }

private var _eg: ImageVector? = null
