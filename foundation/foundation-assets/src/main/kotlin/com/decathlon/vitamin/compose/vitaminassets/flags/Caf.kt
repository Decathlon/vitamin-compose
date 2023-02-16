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

public val FlagsGroup.Caf: ImageVector
    get() {
        if (_caf != null) {
            return _caf!!
        }
        _caf = Builder(name = "Caf", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth
                = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0282f, 5.5025f)
                    curveTo(8.0105f, 5.3963f, 8.0452f, 5.2881f, 8.1213f, 5.212f)
                    lineTo(10.569f, 2.7643f)
                    curveTo(10.6315f, 2.7018f, 10.7163f, 2.6667f, 10.8047f, 2.6667f)
                    horizontalLineTo(12.4607f)
                    curveTo(12.5869f, 2.6667f, 12.7023f, 2.738f, 12.7588f, 2.8509f)
                    lineTo(13.2412f, 3.8157f)
                    curveTo(13.2977f, 3.9287f, 13.4131f, 4.0f, 13.5393f, 4.0f)
                    horizontalLineTo(15.794f)
                    curveTo(15.9202f, 4.0f, 16.0357f, 4.0713f, 16.0921f, 4.1842f)
                    lineTo(17.9079f, 7.8157f)
                    curveTo(17.9643f, 7.9287f, 18.0798f, 8.0f, 18.206f, 8.0f)
                    horizontalLineTo(19.3333f)
                    curveTo(19.608f, 8.0f, 19.7648f, 8.3136f, 19.6f, 8.5333f)
                    lineTo(18.018f, 10.6426f)
                    curveTo(18.006f, 10.6586f, 17.9955f, 10.6757f, 17.9866f, 10.6935f)
                    lineTo(17.3685f, 11.9296f)
                    curveTo(17.3454f, 11.9759f, 17.3333f, 12.0269f, 17.3333f, 12.0787f)
                    verticalLineTo(13.2546f)
                    curveTo(17.3333f, 13.3064f, 17.3213f, 13.3574f, 17.2981f, 13.4037f)
                    lineTo(16.6667f, 14.6667f)
                    lineTo(16.0f, 16.0f)
                    lineTo(15.4255f, 17.1491f)
                    curveTo(15.369f, 17.262f, 15.2536f, 17.3333f, 15.1273f, 17.3333f)
                    horizontalLineTo(14.206f)
                    curveTo(14.0798f, 17.3333f, 13.9643f, 17.262f, 13.9079f, 17.1491f)
                    lineTo(13.3685f, 16.0704f)
                    curveTo(13.3454f, 16.0241f, 13.3333f, 15.973f, 13.3333f, 15.9213f)
                    verticalLineTo(12.1381f)
                    curveTo(13.3333f, 12.0497f, 13.2982f, 11.9649f, 13.2357f, 11.9024f)
                    lineTo(12.7223f, 11.389f)
                    curveTo(12.6857f, 11.3524f, 12.6581f, 11.3078f, 12.6418f, 11.2587f)
                    lineTo(12.076f, 9.5612f)
                    curveTo(12.0306f, 9.4251f, 11.9032f, 9.3333f, 11.7597f, 9.3333f)
                    horizontalLineTo(8.949f)
                    curveTo(8.7861f, 9.3333f, 8.647f, 9.2155f, 8.6202f, 9.0548f)
                    lineTo(8.0282f, 5.5025f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.6667f, 13.6667f)
                    curveTo(18.6667f, 13.4826f, 18.8159f, 13.3333f, 19.0f, 13.3333f)
                    horizontalLineTo(19.6667f)
                    curveTo(19.8508f, 13.3333f, 20.0f, 13.4826f, 20.0f, 13.6667f)
                    verticalLineTo(14.588f)
                    curveTo(20.0f, 14.6397f, 19.988f, 14.6908f, 19.9648f, 14.7371f)
                    lineTo(19.4255f, 15.8157f)
                    curveTo(19.369f, 15.9287f, 19.2536f, 16.0f, 19.1273f, 16.0f)
                    horizontalLineTo(19.0f)
                    curveTo(18.8159f, 16.0f, 18.6667f, 15.8508f, 18.6667f, 15.6667f)
                    verticalLineTo(13.6667f)
                    close()
                }
            }
        }
        .build()
        return _caf!!
    }

private var _caf: ImageVector? = null
