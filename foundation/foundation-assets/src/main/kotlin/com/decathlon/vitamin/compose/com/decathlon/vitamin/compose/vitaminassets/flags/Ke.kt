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

public val FlagsGroup.Ke: ImageVector
    get() {
        if (_ke != null) {
            return _ke!!
        }
        _ke = Builder(name = "Ke", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.0f, 5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF018301)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC0808)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 16.6667f)
                    curveTo(15.3333f, 16.6667f, 17.3333f, 14.0501f, 17.3333f, 10.0f)
                    curveTo(17.3333f, 5.9499f, 15.3333f, 3.3333f, 14.0f, 3.3333f)
                    curveTo(12.6667f, 3.3333f, 10.6667f, 5.9499f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 14.0501f, 12.6667f, 16.6667f, 14.0f, 16.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFBC0000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6866f, 16.4671f)
                    curveTo(15.3412f, 16.1069f, 16.0422f, 15.2715f, 16.5581f, 14.0635f)
                    curveTo(16.2055f, 12.9003f, 16.0f, 11.503f, 16.0f, 10.0f)
                    curveTo(16.0f, 8.4971f, 16.2055f, 7.0997f, 16.5581f, 5.9365f)
                    curveTo(15.854f, 4.288f, 14.8054f, 3.3333f, 14.0f, 3.3333f)
                    curveTo(13.1946f, 3.3333f, 12.1461f, 4.288f, 11.4419f, 5.9365f)
                    curveTo(11.7945f, 7.0997f, 12.0f, 8.4971f, 12.0f, 10.0f)
                    curveTo(12.0f, 11.503f, 11.7945f, 12.9003f, 11.4419f, 14.0635f)
                    curveTo(12.0004f, 15.3709f, 12.7754f, 16.2418f, 13.474f, 16.5463f)
                    curveTo(13.6563f, 16.6258f, 13.8333f, 16.6667f, 14.0f, 16.6667f)
                    curveTo(14.1007f, 16.6667f, 14.2052f, 16.6518f, 14.3123f, 16.6224f)
                    curveTo(14.4342f, 16.5891f, 14.5595f, 16.537f, 14.6866f, 16.4671f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6667f, 5.3333f)
                    curveTo(14.6667f, 6.8061f, 14.3682f, 8.0f, 14.0f, 8.0f)
                    curveTo(13.6319f, 8.0f, 13.3334f, 6.8061f, 13.3334f, 5.3333f)
                    curveTo(13.3334f, 4.5874f, 13.4099f, 3.913f, 13.5333f, 3.4291f)
                    curveTo(13.6947f, 3.3658f, 13.8515f, 3.3333f, 14.0f, 3.3333f)
                    curveTo(14.1485f, 3.3333f, 14.3054f, 3.3658f, 14.4667f, 3.4291f)
                    curveTo(14.5901f, 3.913f, 14.6667f, 4.5874f, 14.6667f, 5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.4668f, 16.5709f)
                    curveTo(14.5902f, 16.0869f, 14.6667f, 15.4125f, 14.6667f, 14.6666f)
                    curveTo(14.6667f, 13.1939f, 14.3682f, 12.0f, 14.0f, 12.0f)
                    curveTo(14.3682f, 12.0f, 14.6667f, 11.1045f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 8.8954f, 14.3682f, 8.0f, 14.0f, 8.0f)
                    curveTo(13.6319f, 8.0f, 13.3334f, 8.8954f, 13.3334f, 10.0f)
                    curveTo(13.3334f, 11.1045f, 13.6319f, 12.0f, 14.0f, 12.0f)
                    curveTo(13.6319f, 12.0f, 13.3334f, 13.1939f, 13.3334f, 14.6666f)
                    curveTo(13.3334f, 15.4125f, 13.4099f, 16.0869f, 13.5333f, 16.5709f)
                    curveTo(13.6947f, 16.6342f, 13.8515f, 16.6667f, 14.0f, 16.6667f)
                    curveTo(14.1485f, 16.6667f, 14.3054f, 16.6342f, 14.4668f, 16.5709f)
                    close()
                }
            }
        }
        .build()
        return _ke!!
    }

private var _ke: ImageVector? = null
