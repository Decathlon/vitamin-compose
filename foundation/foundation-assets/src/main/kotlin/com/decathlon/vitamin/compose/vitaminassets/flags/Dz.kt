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
                path(fill = SolidColor(Color(0xFF048345)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(14.6667f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3333f, 11.04f)
                    lineTo(15.7659f, 12.1574f)
                    lineTo(16.3442f, 10.3214f)
                    lineTo(14.7971f, 9.176f)
                    lineTo(16.722f, 9.1586f)
                    lineTo(17.3333f, 7.3333f)
                    lineTo(17.9446f, 9.1586f)
                    lineTo(19.8694f, 9.176f)
                    lineTo(18.3224f, 10.3214f)
                    lineTo(18.9007f, 12.1574f)
                    lineTo(17.3333f, 11.04f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
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
            }
        }
        .build()
        return _dz!!
    }

private var _dz: ImageVector? = null
