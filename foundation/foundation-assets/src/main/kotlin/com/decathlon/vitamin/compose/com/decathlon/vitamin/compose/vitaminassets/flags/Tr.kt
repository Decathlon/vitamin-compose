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

public val FlagsGroup.Tr: ImageVector
    get() {
        if (_tr != null) {
            return _tr!!
        }
        _tr = Builder(name = "Tr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                    moveTo(19.0209f, 10.7684f)
                    lineTo(17.796f, 12.2533f)
                    lineTo(17.8795f, 10.3302f)
                    lineTo(16.0887f, 9.6242f)
                    lineTo(17.9435f, 9.1093f)
                    lineTo(18.0615f, 7.188f)
                    lineTo(19.1244f, 8.7929f)
                    lineTo(20.9881f, 8.3114f)
                    lineTo(19.7903f, 9.8182f)
                    lineTo(20.8241f, 11.442f)
                    lineTo(19.0209f, 10.7684f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.4028f, 13.6838f)
                    curveTo(16.3049f, 15.0934f, 14.5916f, 16.0f, 12.6665f, 16.0f)
                    curveTo(9.3528f, 16.0f, 6.6665f, 13.3137f, 6.6665f, 10.0f)
                    curveTo(6.6665f, 6.6863f, 9.3528f, 4.0f, 12.6665f, 4.0f)
                    curveTo(14.5916f, 4.0f, 16.3049f, 4.9066f, 17.4028f, 6.3161f)
                    curveTo(16.5555f, 5.7002f, 15.4902f, 5.3333f, 14.333f, 5.3333f)
                    curveTo(11.5716f, 5.3333f, 9.333f, 7.4226f, 9.333f, 10.0f)
                    curveTo(9.333f, 12.5773f, 11.5716f, 14.6666f, 14.333f, 14.6666f)
                    curveTo(15.4902f, 14.6666f, 16.5556f, 14.2997f, 17.4028f, 13.6838f)
                    close()
                }
            }
        }
        .build()
        return _tr!!
    }

private var _tr: ImageVector? = null
