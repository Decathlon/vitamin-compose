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

public val FlagsGroup.Cna: ImageVector
    get() {
        if (_cna != null) {
            return _cna!!
        }
        _cna = Builder(name = "Cna", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth
                = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.7588f, 13.5176f)
                    curveTo(12.7023f, 13.4047f, 12.5869f, 13.3333f, 12.4607f, 13.3333f)
                    horizontalLineTo(12.1381f)
                    curveTo(12.0497f, 13.3333f, 11.9649f, 13.2982f, 11.9024f, 13.2357f)
                    lineTo(9.431f, 10.7643f)
                    curveTo(9.3685f, 10.7018f, 9.3334f, 10.617f, 9.3334f, 10.5286f)
                    verticalLineTo(9.4714f)
                    curveTo(9.3334f, 9.383f, 9.2982f, 9.2982f, 9.2357f, 9.2357f)
                    lineTo(8.0653f, 8.0653f)
                    curveTo(8.0226f, 8.0226f, 7.9923f, 7.969f, 7.9776f, 7.9104f)
                    lineTo(7.3777f, 5.5108f)
                    curveTo(7.3501f, 5.4003f, 7.2679f, 5.3115f, 7.1598f, 5.2755f)
                    lineTo(5.3558f, 4.6742f)
                    curveTo(5.3409f, 4.6692f, 5.3263f, 4.6631f, 5.3122f, 4.6561f)
                    lineTo(4.1843f, 4.0921f)
                    curveTo(4.0714f, 4.0357f, 4.0f, 3.9202f, 4.0f, 3.794f)
                    verticalLineTo(3.0f)
                    curveTo(4.0f, 2.8159f, 4.1493f, 2.6667f, 4.3334f, 2.6667f)
                    horizontalLineTo(5.1953f)
                    curveTo(5.2837f, 2.6667f, 5.3685f, 2.7018f, 5.431f, 2.7643f)
                    lineTo(5.9024f, 3.2357f)
                    curveTo(5.9649f, 3.2982f, 6.0497f, 3.3333f, 6.1381f, 3.3333f)
                    horizontalLineTo(7.1953f)
                    curveTo(7.2837f, 3.3333f, 7.3685f, 3.2982f, 7.431f, 3.2357f)
                    lineTo(7.9024f, 2.7643f)
                    curveTo(7.9649f, 2.7018f, 8.0497f, 2.6667f, 8.1381f, 2.6667f)
                    horizontalLineTo(10.588f)
                    curveTo(10.6397f, 2.6667f, 10.6908f, 2.6787f, 10.7371f, 2.7019f)
                    lineTo(11.9296f, 3.2981f)
                    curveTo(11.9759f, 3.3213f, 12.027f, 3.3333f, 12.0787f, 3.3333f)
                    horizontalLineTo(13.2547f)
                    curveTo(13.3064f, 3.3333f, 13.3574f, 3.3213f, 13.4037f, 3.2981f)
                    lineTo(14.5963f, 2.7019f)
                    curveTo(14.6426f, 2.6787f, 14.6936f, 2.6667f, 14.7454f, 2.6667f)
                    horizontalLineTo(17.0f)
                    curveTo(17.1841f, 2.6667f, 17.3333f, 2.8159f, 17.3333f, 3.0f)
                    verticalLineTo(3.6667f)
                    curveTo(17.3333f, 3.8508f, 17.1841f, 4.0f, 17.0f, 4.0f)
                    horizontalLineTo(16.3333f)
                    curveTo(16.1493f, 4.0f, 16.0f, 4.1492f, 16.0f, 4.3333f)
                    verticalLineTo(5.794f)
                    curveTo(16.0f, 5.9202f, 16.0713f, 6.0357f, 16.1843f, 6.0921f)
                    lineTo(16.8509f, 6.4255f)
                    curveTo(17.0726f, 6.5363f, 17.3333f, 6.3751f, 17.3333f, 6.1273f)
                    verticalLineTo(5.0f)
                    curveTo(17.3333f, 4.8159f, 17.4826f, 4.6667f, 17.6667f, 4.6667f)
                    horizontalLineTo(19.0f)
                    curveTo(19.1841f, 4.6667f, 19.3333f, 4.8159f, 19.3333f, 5.0f)
                    curveTo(19.3333f, 5.1841f, 19.4826f, 5.3333f, 19.6667f, 5.3333f)
                    horizontalLineTo(21.0f)
                    curveTo(21.1841f, 5.3333f, 21.3333f, 5.4826f, 21.3333f, 5.6667f)
                    verticalLineTo(6.6126f)
                    curveTo(21.3333f, 6.6484f, 21.3276f, 6.684f, 21.3162f, 6.718f)
                    lineTo(20.6916f, 8.592f)
                    curveTo(20.6752f, 8.6411f, 20.6476f, 8.6857f, 20.611f, 8.7223f)
                    lineTo(18.7049f, 10.6284f)
                    curveTo(18.6796f, 10.6538f, 18.6585f, 10.683f, 18.6425f, 10.715f)
                    lineTo(18.0352f, 11.9296f)
                    curveTo(18.0121f, 11.9759f, 18.0f, 12.0269f, 18.0f, 12.0787f)
                    verticalLineTo(13.0f)
                    curveTo(18.0f, 13.1841f, 17.8508f, 13.3333f, 17.6667f, 13.3333f)
                    horizontalLineTo(17.5394f)
                    curveTo(17.4131f, 13.3333f, 17.2977f, 13.262f, 17.2412f, 13.1491f)
                    lineTo(16.7588f, 12.1843f)
                    curveTo(16.7023f, 12.0713f, 16.5869f, 12.0f, 16.4607f, 12.0f)
                    horizontalLineTo(14.8727f)
                    curveTo(14.7464f, 12.0f, 14.631f, 12.0713f, 14.5746f, 12.1843f)
                    lineTo(14.0745f, 13.1843f)
                    curveTo(14.0276f, 13.2781f, 14.0276f, 13.3886f, 14.0745f, 13.4824f)
                    lineTo(14.5745f, 14.4824f)
                    curveTo(14.631f, 14.5953f, 14.7464f, 14.6667f, 14.8727f, 14.6667f)
                    horizontalLineTo(15.8619f)
                    curveTo(15.9503f, 14.6667f, 16.0351f, 14.7018f, 16.0976f, 14.7643f)
                    lineTo(17.2357f, 15.9024f)
                    curveTo(17.2982f, 15.9649f, 17.3333f, 16.0497f, 17.3333f, 16.1381f)
                    verticalLineTo(17.0f)
                    curveTo(17.3333f, 17.1841f, 17.1841f, 17.3333f, 17.0f, 17.3333f)
                    horizontalLineTo(16.206f)
                    curveTo(16.0798f, 17.3333f, 15.9643f, 17.262f, 15.9079f, 17.1491f)
                    lineTo(15.4255f, 16.1843f)
                    curveTo(15.369f, 16.0713f, 15.2536f, 16.0f, 15.1273f, 16.0f)
                    horizontalLineTo(14.206f)
                    curveTo(14.0798f, 16.0f, 13.9643f, 15.9287f, 13.9079f, 15.8157f)
                    lineTo(12.7588f, 13.5176f)
                    close()
                }
            }
        }
        .build()
        return _cna!!
    }

private var _cna: ImageVector? = null
