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

public val FlagsGroup.Kr: ImageVector
    get() {
        if (_kr != null) {
            return _kr!!
        }
        _kr = Builder(name = "Kr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFE01B41)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 14.6667f)
                    curveTo(16.5773f, 14.6667f, 18.6667f, 12.5773f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 7.4227f, 16.5773f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(11.4227f, 5.3333f, 9.3333f, 7.4227f, 9.3333f, 10.0f)
                    curveTo(9.3333f, 12.5773f, 11.4227f, 14.6667f, 14.0f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E4B9C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3334f, 10.6667f)
                    curveTo(10.6667f, 11.9167f, 12.6667f, 12.6667f, 14.0f, 10.6667f)
                    curveTo(15.3333f, 8.6667f, 18.0f, 8.6667f, 18.6667f, 10.6667f)
                    curveTo(19.3333f, 12.6667f, 18.6667f, 14.6667f, 18.6667f, 14.6667f)
                    horizontalLineTo(9.3334f)
                    curveTo(9.3334f, 14.6667f, 8.0f, 9.4167f, 9.3334f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, fillAlpha = 0.75f,
                        strokeAlpha = 0.75f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(6.1731f, 3.5566f)
                    curveTo(6.2651f, 3.3972f, 6.469f, 3.3426f, 6.6284f, 3.4346f)
                    lineTo(7.2058f, 3.7679f)
                    curveTo(7.3652f, 3.86f, 7.4198f, 4.0638f, 7.3278f, 4.2233f)
                    lineTo(5.6611f, 7.11f)
                    curveTo(5.5691f, 7.2695f, 5.3652f, 7.3241f, 5.2058f, 7.232f)
                    lineTo(4.6284f, 6.8987f)
                    curveTo(4.469f, 6.8067f, 4.4144f, 6.6028f, 4.5064f, 6.4434f)
                    lineTo(6.1731f, 3.5566f)
                    close()
                    moveTo(20.7942f, 3.7679f)
                    curveTo(20.6348f, 3.86f, 20.5802f, 4.0638f, 20.6722f, 4.2233f)
                    lineTo(22.3389f, 7.11f)
                    curveTo(22.4309f, 7.2695f, 22.6348f, 7.3241f, 22.7942f, 7.232f)
                    lineTo(23.3716f, 6.8987f)
                    curveTo(23.531f, 6.8067f, 23.5856f, 6.6028f, 23.4936f, 6.4434f)
                    lineTo(21.8269f, 3.5566f)
                    curveTo(21.7349f, 3.3972f, 21.531f, 3.3426f, 21.3716f, 3.4346f)
                    lineTo(20.7942f, 3.7679f)
                    close()
                    moveTo(19.0622f, 4.7679f)
                    curveTo(18.9027f, 4.86f, 18.8481f, 5.0638f, 18.9402f, 5.2233f)
                    lineTo(20.6068f, 8.11f)
                    curveTo(20.6989f, 8.2695f, 20.9027f, 8.3241f, 21.0622f, 8.232f)
                    lineTo(21.6395f, 7.8987f)
                    curveTo(21.799f, 7.8067f, 21.8536f, 7.6028f, 21.7615f, 7.4434f)
                    lineTo(20.0949f, 4.5566f)
                    curveTo(20.0028f, 4.3972f, 19.799f, 4.3426f, 19.6395f, 4.4346f)
                    lineTo(19.0622f, 4.7679f)
                    close()
                    moveTo(4.5064f, 13.5566f)
                    curveTo(4.4144f, 13.3972f, 4.469f, 13.1933f, 4.6284f, 13.1013f)
                    lineTo(5.2058f, 12.7679f)
                    curveTo(5.3652f, 12.6759f, 5.5691f, 12.7305f, 5.6611f, 12.8899f)
                    lineTo(7.3278f, 15.7767f)
                    curveTo(7.4198f, 15.9361f, 7.3652f, 16.14f, 7.2058f, 16.232f)
                    lineTo(6.6284f, 16.5654f)
                    curveTo(6.469f, 16.6574f, 6.2651f, 16.6028f, 6.1731f, 16.4434f)
                    lineTo(4.5064f, 13.5566f)
                    close()
                    moveTo(6.3605f, 12.1013f)
                    curveTo(6.201f, 12.1933f, 6.1464f, 12.3972f, 6.2385f, 12.5566f)
                    lineTo(7.9051f, 15.4434f)
                    curveTo(7.9972f, 15.6028f, 8.201f, 15.6574f, 8.3605f, 15.5654f)
                    lineTo(8.9378f, 15.232f)
                    curveTo(9.0972f, 15.14f, 9.1519f, 14.9361f, 9.0598f, 14.7767f)
                    lineTo(7.3932f, 11.8899f)
                    curveTo(7.3011f, 11.7305f, 7.0972f, 11.6759f, 6.9378f, 11.7679f)
                    lineTo(6.3605f, 12.1013f)
                    close()
                    moveTo(20.6068f, 11.8899f)
                    curveTo(20.6989f, 11.7305f, 20.9027f, 11.6759f, 21.0622f, 11.7679f)
                    lineTo(21.6395f, 12.1013f)
                    curveTo(21.799f, 12.1933f, 21.8536f, 12.3972f, 21.7615f, 12.5566f)
                    lineTo(20.0949f, 15.4434f)
                    curveTo(20.0028f, 15.6028f, 19.799f, 15.6574f, 19.6395f, 15.5654f)
                    lineTo(19.0622f, 15.232f)
                    curveTo(18.9027f, 15.14f, 18.8481f, 14.9361f, 18.9402f, 14.7767f)
                    lineTo(20.6068f, 11.8899f)
                    close()
                    moveTo(22.7942f, 12.7679f)
                    curveTo(22.6348f, 12.6759f, 22.4309f, 12.7305f, 22.3389f, 12.8899f)
                    lineTo(20.6722f, 15.7767f)
                    curveTo(20.5802f, 15.9361f, 20.6348f, 16.14f, 20.7942f, 16.232f)
                    lineTo(21.3716f, 16.5654f)
                    curveTo(21.531f, 16.6574f, 21.7349f, 16.6028f, 21.8269f, 16.4434f)
                    lineTo(23.4936f, 13.5566f)
                    curveTo(23.5856f, 13.3972f, 23.531f, 13.1933f, 23.3716f, 13.1013f)
                    lineTo(22.7942f, 12.7679f)
                    close()
                    moveTo(8.3605f, 4.4346f)
                    curveTo(8.201f, 4.3426f, 7.9972f, 4.3972f, 7.9051f, 4.5566f)
                    lineTo(6.2385f, 7.4434f)
                    curveTo(6.1464f, 7.6028f, 6.201f, 7.8067f, 6.3605f, 7.8987f)
                    lineTo(6.9378f, 8.232f)
                    curveTo(7.0972f, 8.3241f, 7.3011f, 8.2695f, 7.3932f, 8.11f)
                    lineTo(9.0598f, 5.2233f)
                    curveTo(9.1519f, 5.0638f, 9.0972f, 4.86f, 8.9378f, 4.7679f)
                    lineTo(8.3605f, 4.4346f)
                    close()
                }
            }
        }
        .build()
        return _kr!!
    }

private var _kr: ImageVector? = null
