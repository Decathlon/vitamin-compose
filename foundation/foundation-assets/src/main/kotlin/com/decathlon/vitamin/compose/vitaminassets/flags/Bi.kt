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

public val FlagsGroup.Bi: ImageVector
    get() {
        if (_bi != null) {
            return _bi!!
        }
        _bi = Builder(name = "Bi", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(27.9998f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE4233B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    lineTo(28.0f, 20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF34CD4E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(12.0f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF34CD4E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 0.0f)
                    lineTo(16.0f, 10.0f)
                    lineTo(28.0f, 20.0f)
                    lineTo(28.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.9621f, 6.3938f)
                    curveTo(16.1563f, 5.7312f, 15.1246f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(12.8754f, 5.3333f, 11.8437f, 5.7312f, 11.0379f, 6.3938f)
                    lineTo(1.5f, 0.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.0f, 2.0f)
                    lineTo(9.5458f, 8.6039f)
                    curveTo(9.4077f, 9.0447f, 9.3333f, 9.5137f, 9.3333f, 10.0f)
                    curveTo(9.3333f, 10.4863f, 9.4077f, 10.9553f, 9.5458f, 11.3961f)
                    lineTo(0.0f, 18.0f)
                    lineTo(0.0f, 20.0f)
                    lineTo(1.5f, 20.0f)
                    lineTo(11.0379f, 13.6063f)
                    curveTo(11.8437f, 14.2688f, 12.8754f, 14.6667f, 14.0f, 14.6667f)
                    curveTo(15.1246f, 14.6667f, 16.1563f, 14.2688f, 16.9621f, 13.6063f)
                    lineTo(26.5f, 20.0f)
                    lineTo(28.0f, 20.0f)
                    lineTo(28.0f, 18.0f)
                    lineTo(18.4542f, 11.3961f)
                    curveTo(18.5923f, 10.9553f, 18.6667f, 10.4863f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 9.5137f, 18.5923f, 9.0447f, 18.4542f, 8.6039f)
                    lineTo(28.0f, 2.0f)
                    lineTo(28.0f, 0.0f)
                    lineTo(26.5f, 0.0f)
                    lineTo(16.9621f, 6.3938f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF2239)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9998f, 8.6667f)
                    lineTo(13.057f, 8.9428f)
                    lineTo(13.3332f, 8.0f)
                    lineTo(13.057f, 7.0572f)
                    lineTo(13.9998f, 7.3334f)
                    lineTo(14.9426f, 7.0572f)
                    lineTo(14.6665f, 8.0f)
                    lineTo(14.9426f, 8.9428f)
                    lineTo(13.9998f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF2239)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 12.0f)
                    lineTo(11.057f, 12.2761f)
                    lineTo(11.3332f, 11.3333f)
                    lineTo(11.057f, 10.3905f)
                    lineTo(11.9998f, 10.6667f)
                    lineTo(12.9426f, 10.3905f)
                    lineTo(12.6665f, 11.3333f)
                    lineTo(12.9426f, 12.2761f)
                    lineTo(11.9998f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF2239)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.057f, 12.2761f)
                    lineTo(15.9998f, 12.0f)
                    lineTo(16.9426f, 12.2761f)
                    lineTo(16.6665f, 11.3333f)
                    lineTo(16.9426f, 10.3905f)
                    lineTo(15.9998f, 10.6667f)
                    lineTo(15.057f, 10.3905f)
                    lineTo(15.3332f, 11.3333f)
                    lineTo(15.057f, 12.2761f)
                    close()
                }
            }
        }
        .build()
        return _bi!!
    }

private var _bi: ImageVector? = null
