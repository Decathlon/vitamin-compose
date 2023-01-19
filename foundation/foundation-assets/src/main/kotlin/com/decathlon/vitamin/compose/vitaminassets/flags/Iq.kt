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

public val FlagsGroup.Iq: ImageVector
    get() {
        if (_iq != null) {
            return _iq!!
        }
        _iq = Builder(name = "Iq", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFDF1E35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F7A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.6667f, 8.5393f)
                    curveTo(18.6667f, 8.2915f, 18.9275f, 8.1304f, 19.1491f, 8.2412f)
                    lineTo(19.8158f, 8.5745f)
                    curveTo(19.9287f, 8.631f, 20.0f, 8.7464f, 20.0f, 8.8727f)
                    verticalLineTo(11.6667f)
                    curveTo(20.0f, 11.8508f, 19.8508f, 12.0f, 19.6667f, 12.0f)
                    horizontalLineTo(19.0f)
                    curveTo(18.8159f, 12.0f, 18.6667f, 11.8508f, 18.6667f, 11.6667f)
                    verticalLineTo(8.5393f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F7A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6667f, 8.5393f)
                    curveTo(10.6667f, 8.2915f, 10.9275f, 8.1304f, 11.1491f, 8.2412f)
                    lineTo(11.8158f, 8.5745f)
                    curveTo(11.9287f, 8.631f, 12.0f, 8.7464f, 12.0f, 8.8727f)
                    verticalLineTo(11.6667f)
                    curveTo(12.0f, 11.8508f, 11.8508f, 12.0f, 11.6667f, 12.0f)
                    horizontalLineTo(11.0f)
                    curveTo(10.8159f, 12.0f, 10.6667f, 11.8508f, 10.6667f, 11.6667f)
                    verticalLineTo(8.5393f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F7A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 8.8727f)
                    curveTo(16.0f, 8.7464f, 16.0713f, 8.631f, 16.1843f, 8.5745f)
                    lineTo(16.8509f, 8.2412f)
                    curveTo(17.0726f, 8.1304f, 17.3333f, 8.2915f, 17.3333f, 8.5393f)
                    verticalLineTo(11.6667f)
                    curveTo(17.3333f, 11.8508f, 17.1841f, 12.0f, 17.0f, 12.0f)
                    horizontalLineTo(16.3333f)
                    curveTo(16.1492f, 12.0f, 16.0f, 11.8508f, 16.0f, 11.6667f)
                    verticalLineTo(8.8727f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F7A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3333f, 10.206f)
                    curveTo(13.3333f, 10.0798f, 13.4046f, 9.9643f, 13.5176f, 9.9079f)
                    lineTo(14.1842f, 9.5745f)
                    curveTo(14.4059f, 9.4637f, 14.6666f, 9.6249f, 14.6666f, 9.8727f)
                    verticalLineTo(10.7264f)
                    horizontalLineTo(16.6666f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.6666f)
                    horizontalLineTo(13.6666f)
                    curveTo(13.4826f, 12.0f, 13.3333f, 11.8508f, 13.3333f, 11.6667f)
                    verticalLineTo(10.206f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0F7A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 10.206f)
                    curveTo(8.0f, 10.0798f, 8.0713f, 9.9643f, 8.1843f, 9.9079f)
                    lineTo(8.8509f, 9.5745f)
                    curveTo(9.0726f, 9.4637f, 9.3333f, 9.6249f, 9.3333f, 9.8727f)
                    verticalLineTo(10.7264f)
                    horizontalLineTo(11.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(9.3333f)
                    horizontalLineTo(8.3333f)
                    curveTo(8.1492f, 12.0f, 8.0f, 11.8508f, 8.0f, 11.6667f)
                    verticalLineTo(10.206f)
                    close()
                }
            }
        }
        .build()
        return _iq!!
    }

private var _iq: ImageVector? = null
