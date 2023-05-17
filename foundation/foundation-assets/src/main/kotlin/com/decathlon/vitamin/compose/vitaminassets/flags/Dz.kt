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

public val FlagsGroup.Dz: ImageVector
    get() {
        if (_dz != null) {
            return _dz!!
        }
        _dz = Builder(name = "Dz", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, -1.0E-4f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF048345)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3333f, 11.04f)
                    lineTo(15.7659f, 12.1574f)
                    lineTo(16.3442f, 10.3214f)
                    lineTo(14.7972f, 9.176f)
                    lineTo(16.722f, 9.1586f)
                    lineTo(17.3333f, 7.3333f)
                    lineTo(17.9446f, 9.1586f)
                    lineTo(19.8695f, 9.176f)
                    lineTo(18.3224f, 10.3214f)
                    lineTo(18.9008f, 12.1574f)
                    lineTo(17.3333f, 11.04f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.68f, 14.3813f)
                    curveTo(16.6519f, 15.3853f, 15.2702f, 16.0f, 13.7509f, 16.0f)
                    curveTo(10.5748f, 16.0f, 8.0f, 13.3137f, 8.0f, 10.0f)
                    curveTo(8.0f, 6.6863f, 10.5748f, 4.0f, 13.7509f, 4.0f)
                    curveTo(15.2702f, 4.0f, 16.6519f, 4.6147f, 17.68f, 5.6187f)
                    curveTo(16.9709f, 5.2811f, 16.1688f, 5.0909f, 15.3193f, 5.0909f)
                    curveTo(12.4319f, 5.0909f, 10.0912f, 7.2888f, 10.0912f, 10.0f)
                    curveTo(10.0912f, 12.7112f, 12.4319f, 14.9091f, 15.3193f, 14.9091f)
                    curveTo(16.1688f, 14.9091f, 16.9709f, 14.7189f, 17.68f, 14.3813f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.5f, 0.5f)
                    lineTo(14.6689f, 0.5f)
                    verticalLineTo(-0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    lineTo(14.6689f, 20.0f)
                    verticalLineTo(19.5f)
                    lineTo(27.5f, 19.5f)
                    verticalLineTo(0.5f)
                    close()
                }
            }
        }
        .build()
        return _dz!!
    }

private var _dz: ImageVector? = null
