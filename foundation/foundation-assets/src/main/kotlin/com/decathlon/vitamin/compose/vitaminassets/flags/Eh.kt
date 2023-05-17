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

public val FlagsGroup.Eh: ImageVector
    get() {
        if (_eh != null) {
            return _eh!!
        }
        _eh = Builder(name = "Eh", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF20934F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.9999f, 13.3333f)
                    horizontalLineTo(-1.0E-4f)
                    lineTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    lineTo(27.9999f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 6.6667f)
                    horizontalLineTo(0.0f)
                    lineTo(-1.0E-4f, 13.3333f)
                    horizontalLineTo(27.9999f)
                    lineTo(28.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B42)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.1805f, 10.3099f)
                    lineTo(17.6463f, 10.6906f)
                    lineTo(17.8434f, 10.065f)
                    lineTo(17.3163f, 9.6747f)
                    lineTo(17.9722f, 9.6688f)
                    lineTo(18.1805f, 9.0468f)
                    lineTo(18.3888f, 9.6688f)
                    lineTo(19.0447f, 9.6747f)
                    lineTo(18.5175f, 10.065f)
                    lineTo(18.7146f, 10.6906f)
                    lineTo(18.1805f, 10.3099f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE62539)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.2984f, 11.4486f)
                    curveTo(17.948f, 11.7906f, 17.4773f, 12.0f, 16.9597f, 12.0f)
                    curveTo(15.8774f, 12.0f, 15.0f, 11.0846f, 15.0f, 9.9555f)
                    curveTo(15.0f, 8.8263f, 15.8774f, 7.911f, 16.9597f, 7.911f)
                    curveTo(17.4773f, 7.911f, 17.948f, 8.1203f, 18.2984f, 8.4623f)
                    curveTo(18.0568f, 8.3474f, 17.7836f, 8.2827f, 17.4943f, 8.2827f)
                    curveTo(16.5104f, 8.2827f, 15.7128f, 9.0316f, 15.7128f, 9.9555f)
                    curveTo(15.7128f, 10.8793f, 16.5104f, 11.6283f, 17.4943f, 11.6283f)
                    curveTo(17.7836f, 11.6283f, 18.0568f, 11.5635f, 18.2984f, 11.4486f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE62539)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(13.3334f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _eh!!
    }

private var _eh: ImageVector? = null
