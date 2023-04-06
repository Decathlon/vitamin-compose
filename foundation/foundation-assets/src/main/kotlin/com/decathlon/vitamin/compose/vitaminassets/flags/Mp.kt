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

public val FlagsGroup.Mp: ImageVector
    get() {
        if (_mp != null) {
            return _mp!!
        }
        _mp = Builder(name = "Mp", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF1E8BD6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 16.6667f)
                    curveTo(17.6819f, 16.6667f, 20.6667f, 13.6819f, 20.6667f, 10.0f)
                    curveTo(20.6667f, 6.3181f, 17.6819f, 3.3333f, 14.0f, 3.3333f)
                    curveTo(10.3181f, 3.3333f, 7.3333f, 6.3181f, 7.3333f, 10.0f)
                    curveTo(7.3333f, 13.6819f, 10.3181f, 16.6667f, 14.0f, 16.6667f)
                    close()
                    moveTo(14.0f, 15.3333f)
                    curveTo(11.0545f, 15.3333f, 8.6667f, 12.9455f, 8.6667f, 10.0f)
                    curveTo(8.6667f, 7.0545f, 11.0545f, 4.6667f, 14.0f, 4.6667f)
                    curveTo(16.9455f, 4.6667f, 19.3333f, 7.0545f, 19.3333f, 10.0f)
                    curveTo(19.3333f, 12.9455f, 16.9455f, 15.3333f, 14.0f, 15.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA9A7A9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.9171f, 7.996f)
                    curveTo(11.963f, 7.2618f, 12.5904f, 6.6667f, 13.3321f, 6.6667f)
                    horizontalLineTo(14.6683f)
                    curveTo(15.4039f, 6.6667f, 16.0379f, 7.2707f, 16.0833f, 7.996f)
                    lineTo(16.5838f, 16.004f)
                    curveTo(16.6297f, 16.7382f, 16.0757f, 17.3333f, 15.321f, 17.3333f)
                    horizontalLineTo(12.6794f)
                    curveTo(11.9361f, 17.3333f, 11.3713f, 16.7293f, 11.4166f, 16.004f)
                    lineTo(11.9171f, 7.996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0001f, 12.6867f)
                    lineTo(11.2571f, 14.6421f)
                    lineTo(12.2692f, 11.4291f)
                    lineTo(9.5618f, 9.4246f)
                    lineTo(12.9303f, 9.3943f)
                    lineTo(14.0001f, 6.2f)
                    lineTo(15.0699f, 9.3943f)
                    lineTo(18.4384f, 9.4246f)
                    lineTo(15.731f, 11.4291f)
                    lineTo(16.7431f, 14.6421f)
                    lineTo(14.0001f, 12.6867f)
                    close()
                }
            }
        }
        .build()
        return _mp!!
    }

private var _mp: ImageVector? = null
