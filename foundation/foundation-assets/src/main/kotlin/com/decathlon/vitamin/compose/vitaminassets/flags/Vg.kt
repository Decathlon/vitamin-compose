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

public val FlagsGroup.Vg: ImageVector
    get() {
        if (_vg != null) {
            return _vg!!
        }
        _vg = Builder(name = "Vg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6666f, 20.0006f, 9.3334f, 19.9515f, 0.0f, 19.9515f)
                    curveTo(0.0f, 13.301f, 0.0f, 6.6505f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(19.9515f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF008339)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3333f, 9.9757f)
                    curveTo(17.3333f, 8.8847f, 17.3333f, 7.5947f, 17.3333f, 6.6496f)
                    curveTo(17.3333f, 5.9151f, 17.9303f, 5.3204f, 18.6667f, 5.3204f)
                    horizontalLineTo(22.6667f)
                    curveTo(23.403f, 5.3204f, 24.0f, 5.9151f, 24.0f, 6.6496f)
                    curveTo(24.0f, 7.5947f, 24.0f, 8.8847f, 24.0f, 9.9757f)
                    curveTo(24.0f, 13.301f, 20.6667f, 14.6311f, 20.6667f, 14.6311f)
                    curveTo(20.6667f, 14.6311f, 17.3333f, 13.301f, 17.3333f, 9.9757f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3333f, 7.9806f)
                    curveTo(19.7015f, 7.9806f, 20.0f, 7.6828f, 20.0f, 7.3155f)
                    curveTo(20.0f, 6.9482f, 19.7015f, 6.6505f, 19.3333f, 6.6505f)
                    curveTo(18.9651f, 6.6505f, 18.6667f, 6.9482f, 18.6667f, 7.3155f)
                    curveTo(18.6667f, 7.6828f, 18.9651f, 7.9806f, 19.3333f, 7.9806f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3333f, 9.3107f)
                    curveTo(19.7015f, 9.3107f, 20.0f, 9.0129f, 20.0f, 8.6456f)
                    curveTo(20.0f, 8.2783f, 19.7015f, 7.9806f, 19.3333f, 7.9806f)
                    curveTo(18.9651f, 7.9806f, 18.6667f, 8.2783f, 18.6667f, 8.6456f)
                    curveTo(18.6667f, 9.0129f, 18.9651f, 9.3107f, 19.3333f, 9.3107f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3333f, 10.6408f)
                    curveTo(18.9651f, 10.6408f, 18.6667f, 10.343f, 18.6667f, 9.9757f)
                    curveTo(18.6667f, 9.6084f, 18.9651f, 9.3107f, 19.3333f, 9.3107f)
                    curveTo(19.7015f, 9.3107f, 20.0f, 9.6084f, 20.0f, 9.9757f)
                    curveTo(20.0f, 10.343f, 19.7015f, 10.6408f, 19.3333f, 10.6408f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3333f, 10.6408f)
                    curveTo(19.7015f, 10.6408f, 20.0f, 10.9385f, 20.0f, 11.3058f)
                    curveTo(20.0f, 11.6731f, 19.7015f, 11.9709f, 19.3333f, 11.9709f)
                    curveTo(18.9651f, 11.9709f, 18.6667f, 11.6731f, 18.6667f, 11.3058f)
                    curveTo(18.6667f, 10.9385f, 18.9651f, 10.6408f, 19.3333f, 10.6408f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.6667f, 11.3058f)
                    curveTo(22.6667f, 11.6731f, 22.3682f, 11.9709f, 22.0f, 11.9709f)
                    curveTo(21.6318f, 11.9709f, 21.3333f, 11.6731f, 21.3333f, 11.3058f)
                    curveTo(21.3333f, 10.9385f, 21.6318f, 10.6408f, 22.0f, 10.6408f)
                    curveTo(22.3682f, 10.6408f, 22.6667f, 10.9385f, 22.6667f, 11.3058f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 9.3107f)
                    curveTo(22.3682f, 9.3107f, 22.6667f, 9.6084f, 22.6667f, 9.9757f)
                    curveTo(22.6667f, 10.343f, 22.3682f, 10.6408f, 22.0f, 10.6408f)
                    curveTo(21.6318f, 10.6408f, 21.3333f, 10.343f, 21.3333f, 9.9757f)
                    curveTo(21.3333f, 9.6084f, 21.6318f, 9.3107f, 22.0f, 9.3107f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 7.9806f)
                    curveTo(21.6318f, 7.9806f, 21.3333f, 8.2783f, 21.3333f, 8.6456f)
                    curveTo(21.3333f, 9.0129f, 21.6318f, 9.3107f, 22.0f, 9.3107f)
                    curveTo(22.3682f, 9.3107f, 22.6667f, 9.0129f, 22.6667f, 8.6456f)
                    curveTo(22.6667f, 8.2783f, 22.3682f, 7.9806f, 22.0f, 7.9806f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 7.9806f)
                    curveTo(21.6318f, 7.9806f, 21.3333f, 7.6828f, 21.3333f, 7.3155f)
                    curveTo(21.3333f, 6.9482f, 21.6318f, 6.6505f, 22.0f, 6.6505f)
                    curveTo(22.3682f, 6.6505f, 22.6667f, 6.9482f, 22.6667f, 7.3155f)
                    curveTo(22.6667f, 7.6828f, 22.3682f, 7.9806f, 22.0f, 7.9806f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.6667f, 11.3058f)
                    curveTo(21.0349f, 11.3058f, 21.3333f, 10.4126f, 21.3333f, 9.3107f)
                    curveTo(21.3333f, 8.2088f, 21.0349f, 7.3155f, 20.6667f, 7.3155f)
                    curveTo(20.2985f, 7.3155f, 20.0f, 8.2088f, 20.0f, 9.3107f)
                    curveTo(20.0f, 10.4126f, 20.2985f, 11.3058f, 20.6667f, 11.3058f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD033)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.6667f, 13.301f)
                    curveTo(16.6667f, 14.5694f, 18.4879f, 15.2961f, 20.6667f, 15.2961f)
                    curveTo(22.8455f, 15.2961f, 24.6667f, 14.5694f, 24.6667f, 13.301f)
                    curveTo(24.6667f, 12.9337f, 24.3682f, 12.6359f, 24.0f, 12.6359f)
                    curveTo(23.6318f, 12.6359f, 23.3333f, 12.9337f, 23.3333f, 13.301f)
                    curveTo(23.3333f, 13.3137f, 23.1717f, 13.4661f, 22.7761f, 13.624f)
                    curveTo(22.239f, 13.8383f, 21.4824f, 13.966f, 20.6667f, 13.966f)
                    curveTo(19.8509f, 13.966f, 19.0943f, 13.8383f, 18.5572f, 13.624f)
                    curveTo(18.1616f, 13.4661f, 18.0f, 13.3137f, 18.0f, 13.301f)
                    curveTo(18.0f, 12.9337f, 17.7015f, 12.6359f, 17.3333f, 12.6359f)
                    curveTo(16.9651f, 12.6359f, 16.6667f, 12.9337f, 16.6667f, 13.301f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0006f, 0.9666f)
                    lineTo(11.4314f, 3.1162f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(6.6753f)
                    horizontalLineTo(11.4319f)
                    lineTo(14.0006f, 8.8238f)
                    verticalLineTo(9.9998f)
                    horizontalLineTo(10.8044f)
                    lineTo(8.7864f, 8.3142f)
                    verticalLineTo(9.9998f)
                    horizontalLineTo(5.215f)
                    verticalLineTo(8.3126f)
                    lineTo(3.1932f, 9.9998f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.8137f)
                    lineTo(2.5635f, 6.6753f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.1162f)
                    horizontalLineTo(2.5671f)
                    lineTo(0.0f, 0.9712f)
                    verticalLineTo(0.024f)
                    horizontalLineTo(3.4735f)
                    lineTo(5.215f, 1.4781f)
                    verticalLineTo(0.024f)
                    horizontalLineTo(8.7864f)
                    verticalLineTo(1.4809f)
                    lineTo(10.5352f, 0.024f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(0.9666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6828f, 4.1138f)
                    lineTo(13.571f, 0.024f)
                    lineTo(12.0943f, 0.0215f)
                    lineTo(7.7864f, 3.6137f)
                    verticalLineTo(0.0259f)
                    lineTo(6.215f, 0.0259f)
                    verticalLineTo(3.6139f)
                    lineTo(1.9281f, 0.0346f)
                    lineTo(0.4262f, 0.026f)
                    lineTo(5.3183f, 4.1138f)
                    horizontalLineTo(6.0E-4f)
                    verticalLineTo(5.6777f)
                    horizontalLineTo(5.3183f)
                    lineTo(0.139f, 9.998f)
                    lineTo(1.6391f, 9.9961f)
                    lineTo(6.215f, 6.1775f)
                    verticalLineTo(9.9976f)
                    horizontalLineTo(7.7864f)
                    verticalLineTo(6.1778f)
                    lineTo(12.36f, 9.998f)
                    lineTo(13.8503f, 10.0f)
                    lineTo(8.6829f, 5.6777f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(4.1138f)
                    horizontalLineTo(8.6828f)
                    close()
                }
            }
        }
        .build()
        return _vg!!
    }

private var _vg: ImageVector? = null
