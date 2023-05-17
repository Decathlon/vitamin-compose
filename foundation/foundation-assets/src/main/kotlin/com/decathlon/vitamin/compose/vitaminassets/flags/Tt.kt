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

public val FlagsGroup.Tt: ImageVector
    get() {
        if (_tt != null) {
            return _tt!!
        }
        _tt = Builder(name = "Tt", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 2.25f)
                    verticalLineTo(0.0179f)
                    lineTo(28.0f, 0.0f)
                    curveTo(28.0f, 0.0f, 28.0f, 1.1454f, 28.0f, 2.25f)
                    lineTo(28.0f, 20.0179f)
                    curveTo(28.0f, 20.0179f, 27.1046f, 20.0179f, 26.0f, 20.0179f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8954f, 20.0179f, 0.0f, 20.0179f, 0.0f, 20.0179f)
                    verticalLineTo(2.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFED233C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0179f)
                    lineTo(28.0f, 0.0f)
                    lineTo(28.0f, 20.0179f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0179f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.9636f, 20.0072f)
                    lineTo(0.0043f, 1.0606f)
                    lineTo(0.0f, 0.0179f)
                    lineTo(12.0859f, 0.0218f)
                    lineTo(28.0f, 19.0023f)
                    lineTo(28.0f, 20.0179f)
                    lineTo(15.9636f, 20.0072f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.9933f, 20.009f)
                    lineTo(1.0f, 0.0f)
                    horizontalLineTo(10.0f)
                    lineTo(26.7615f, 20.0179f)
                    lineTo(17.9933f, 20.009f)
                    close()
                }
            }
        }
        .build()
        return _tt!!
    }

private var _tt: ImageVector? = null
