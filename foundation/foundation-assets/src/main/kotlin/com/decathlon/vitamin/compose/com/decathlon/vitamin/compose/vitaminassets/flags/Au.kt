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

public val FlagsGroup.Au: ImageVector
    get() {
        if (_au != null) {
            return _au!!
        }
        _au = Builder(name = "Au", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0028f)
                    lineTo(28.0f, 0.0028f)
                    curveTo(28.0f, 6.6695f, 28.0f, 13.3361f, 28.0f, 20.0028f)
                    curveTo(18.6667f, 20.0028f, 9.3333f, 20.0028f, 0.0f, 20.0028f)
                    curveTo(0.0f, 13.3361f, 0.0f, 6.6695f, 0.0f, 0.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0A17A7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0028f)
                    lineTo(28.0f, 0.0028f)
                    verticalLineTo(20.0028f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 16.3361f)
                    lineTo(4.8244f, 16.9542f)
                    lineTo(5.0489f, 15.6452f)
                    lineTo(4.0979f, 14.7181f)
                    lineTo(5.4122f, 14.5271f)
                    lineTo(6.0f, 13.3361f)
                    lineTo(6.5878f, 14.5271f)
                    lineTo(7.9021f, 14.7181f)
                    lineTo(6.9511f, 15.6452f)
                    lineTo(7.1756f, 16.9542f)
                    lineTo(6.0f, 16.3361f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.9998f, 17.3361f)
                    lineTo(19.057f, 17.6123f)
                    lineTo(19.3332f, 16.6695f)
                    lineTo(19.057f, 15.7266f)
                    lineTo(19.9998f, 16.0028f)
                    lineTo(20.9426f, 15.7266f)
                    lineTo(20.6665f, 16.6695f)
                    lineTo(20.9426f, 17.6123f)
                    lineTo(19.9998f, 17.3361f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.9998f, 4.6695f)
                    lineTo(19.057f, 4.9456f)
                    lineTo(19.3332f, 4.0028f)
                    lineTo(19.057f, 3.06f)
                    lineTo(19.9998f, 3.3362f)
                    lineTo(20.9426f, 3.06f)
                    lineTo(20.6665f, 4.0028f)
                    lineTo(20.9426f, 4.9456f)
                    lineTo(19.9998f, 4.6695f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(23.9998f, 8.6695f)
                    lineTo(23.057f, 8.9456f)
                    lineTo(23.3332f, 8.0028f)
                    lineTo(23.057f, 7.06f)
                    lineTo(23.9998f, 7.3362f)
                    lineTo(24.9426f, 7.06f)
                    lineTo(24.6665f, 8.0028f)
                    lineTo(24.9426f, 8.9456f)
                    lineTo(23.9998f, 8.6695f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.9998f, 10.0028f)
                    lineTo(15.057f, 10.2789f)
                    lineTo(15.3332f, 9.3361f)
                    lineTo(15.057f, 8.3933f)
                    lineTo(15.9998f, 8.6695f)
                    lineTo(16.9426f, 8.3933f)
                    lineTo(16.6665f, 9.3361f)
                    lineTo(16.9426f, 10.2789f)
                    lineTo(15.9998f, 10.0028f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(22.0002f, 11.6695f)
                    lineTo(21.5288f, 11.8076f)
                    lineTo(21.6668f, 11.3362f)
                    lineTo(21.5288f, 10.8648f)
                    lineTo(22.0002f, 11.0028f)
                    lineTo(22.4716f, 10.8648f)
                    lineTo(22.3335f, 11.3362f)
                    lineTo(22.4716f, 11.8076f)
                    lineTo(22.0002f, 11.6695f)
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
                    verticalLineTo(0.0028f)
                    lineTo(3.4735f, 0.0026f)
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
        return _au!!
    }

private var _au: ImageVector? = null
