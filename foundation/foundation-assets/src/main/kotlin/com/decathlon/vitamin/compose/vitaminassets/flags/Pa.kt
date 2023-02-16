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
                path(fill = SolidColor(Color(0xFFE52448)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 9.3333f)
                    horizontalLineTo(13.3334f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1367AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.3333f, 20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1367AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 5.76f)
                    lineTo(5.0992f, 6.824f)
                    lineTo(5.6268f, 5.0045f)
                    lineTo(4.1305f, 3.8426f)
                    lineTo(6.024f, 3.7821f)
                    lineTo(6.6667f, 2.0f)
                    lineTo(7.3093f, 3.7821f)
                    lineTo(9.2028f, 3.8426f)
                    lineTo(7.7065f, 5.0045f)
                    lineTo(8.2341f, 6.824f)
                    lineTo(6.6667f, 5.76f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE52448)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.6667f, 15.76f)
                    lineTo(19.0992f, 16.824f)
                    lineTo(19.6268f, 15.0045f)
                    lineTo(18.1305f, 13.8426f)
                    lineTo(20.024f, 13.7821f)
                    lineTo(20.6667f, 12.0f)
                    lineTo(21.3093f, 13.7821f)
                    lineTo(23.2028f, 13.8426f)
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
