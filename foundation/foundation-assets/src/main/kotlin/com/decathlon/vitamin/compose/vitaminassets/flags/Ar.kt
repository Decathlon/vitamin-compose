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

public val FlagsGroup.Ar: ImageVector
    get() {
        if (_ar != null) {
            return _ar!!
        }
        _ar = Builder(name = "Ar", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    curveTo(9.3334f, 0.0f, 18.6667f, 1.0E-4f, 28.0001f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF88BBE8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.0E-4f, 6.6667f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    lineTo(1.0E-4f, 0.0f)
                    lineTo(1.0E-4f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF88BBE8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF4B32E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0001f, 12.0f)
                    curveTo(15.1046f, 12.0f, 16.0001f, 11.1046f, 16.0001f, 10.0f)
                    curveTo(16.0001f, 8.8954f, 15.1046f, 8.0f, 14.0001f, 8.0f)
                    curveTo(12.8955f, 8.0f, 12.0001f, 8.8954f, 12.0001f, 10.0f)
                    curveTo(12.0001f, 11.1046f, 12.8955f, 12.0f, 14.0001f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDB7A2C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.6667f, 10.0f)
                    curveTo(16.6667f, 11.4728f, 15.4728f, 12.6667f, 14.0001f, 12.6667f)
                    curveTo(12.5273f, 12.6667f, 11.3334f, 11.4728f, 11.3334f, 10.0f)
                    curveTo(11.3334f, 8.5273f, 12.5273f, 7.3334f, 14.0001f, 7.3334f)
                    curveTo(15.4728f, 7.3334f, 16.6667f, 8.5273f, 16.6667f, 10.0f)
                    close()
                    moveTo(16.0001f, 10.0f)
                    curveTo(16.0001f, 11.1046f, 15.1046f, 12.0f, 14.0001f, 12.0f)
                    curveTo(12.8955f, 12.0f, 12.0001f, 11.1046f, 12.0001f, 10.0f)
                    curveTo(12.0001f, 8.8954f, 12.8955f, 8.0f, 14.0001f, 8.0f)
                    curveTo(15.1046f, 8.0f, 16.0001f, 8.8954f, 16.0001f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _ar!!
    }

private var _ar: ImageVector? = null
