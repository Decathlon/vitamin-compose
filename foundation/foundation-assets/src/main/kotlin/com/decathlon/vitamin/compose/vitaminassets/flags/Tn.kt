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

public val FlagsGroup.Tn: ImageVector
    get() {
        if (_tn != null) {
            return _tn!!
        }
        _tn = Builder(name = "Tn", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 2.0f)
                    curveTo(0.0f, 0.8954f, 0.8954f, 0.0f, 2.0f, 0.0f)
                    horizontalLineTo(26.0f)
                    curveTo(27.1046f, 0.0f, 28.0f, 0.8954f, 28.0f, 2.0f)
                    verticalLineTo(18.0f)
                    curveTo(28.0f, 19.1046f, 27.1046f, 20.0f, 26.0f, 20.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8954f, 20.0f, 0.0f, 19.1046f, 0.0f, 18.0f)
                    verticalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE92434)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.0f, 10.0f)
                    curveTo(20.0f, 13.3137f, 17.3137f, 16.0f, 14.0f, 16.0f)
                    curveTo(10.6863f, 16.0f, 8.0f, 13.3137f, 8.0f, 10.0f)
                    curveTo(8.0f, 6.6863f, 10.6863f, 4.0f, 14.0f, 4.0f)
                    curveTo(17.3137f, 4.0f, 20.0f, 6.6863f, 20.0f, 10.0f)
                    close()
                    moveTo(12.0f, 10.0f)
                    curveTo(12.0f, 12.2165f, 13.6642f, 14.0444f, 15.8112f, 14.3022f)
                    curveTo(15.2544f, 14.5369f, 14.6424f, 14.6666f, 14.0002f, 14.6666f)
                    curveTo(11.4228f, 14.6666f, 9.3335f, 12.5773f, 9.3335f, 10.0f)
                    curveTo(9.3335f, 7.4226f, 11.4228f, 5.3333f, 14.0002f, 5.3333f)
                    curveTo(14.6424f, 5.3333f, 15.2544f, 5.4631f, 15.8113f, 5.6978f)
                    curveTo(13.6642f, 5.9556f, 12.0f, 7.7835f, 12.0f, 10.0f)
                    close()
                    moveTo(15.1296f, 12.6551f)
                    lineTo(16.3544f, 11.1701f)
                    lineTo(18.1576f, 11.8437f)
                    lineTo(17.1238f, 10.22f)
                    lineTo(18.3217f, 8.7132f)
                    lineTo(16.4579f, 9.1946f)
                    lineTo(15.395f, 7.5897f)
                    lineTo(15.277f, 9.5111f)
                    lineTo(13.4222f, 10.026f)
                    lineTo(15.213f, 10.732f)
                    lineTo(15.1296f, 12.6551f)
                    close()
                }
            }
        }
        .build()
        return _tn!!
    }

private var _tn: ImageVector? = null
