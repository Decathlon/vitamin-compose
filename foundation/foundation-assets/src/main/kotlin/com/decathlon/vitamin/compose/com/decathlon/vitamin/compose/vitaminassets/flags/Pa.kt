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

public val FlagsGroup.Pa: ImageVector
    get() {
        if (_pa != null) {
            return _pa!!
        }
        _pa = Builder(name = "Pa", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3334f, 0.0f, 18.6667f, -0.0f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, 3.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE52448)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 9.3333f)
                    horizontalLineTo(13.3334f)
                    verticalLineTo(0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1367AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3334f, 20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3334f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1367AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 5.76f)
                    lineTo(5.0993f, 6.824f)
                    lineTo(5.6269f, 5.0045f)
                    lineTo(4.1306f, 3.8426f)
                    lineTo(6.0241f, 3.7821f)
                    lineTo(6.6667f, 2.0f)
                    lineTo(7.3094f, 3.7821f)
                    lineTo(9.2029f, 3.8426f)
                    lineTo(7.7065f, 5.0045f)
                    lineTo(8.2341f, 6.824f)
                    lineTo(6.6667f, 5.76f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE52448)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.6667f, 15.76f)
                    lineTo(19.0993f, 16.824f)
                    lineTo(19.6269f, 15.0045f)
                    lineTo(18.1306f, 13.8426f)
                    lineTo(20.0241f, 13.7821f)
                    lineTo(20.6667f, 12.0f)
                    lineTo(21.3094f, 13.7821f)
                    lineTo(23.2029f, 13.8426f)
                    lineTo(21.7065f, 15.0045f)
                    lineTo(22.2341f, 16.824f)
                    lineTo(20.6667f, 15.76f)
                    close()
                }
            }
        }
        .build()
        return _pa!!
    }

private var _pa: ImageVector? = null
