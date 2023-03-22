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

public val FlagsGroup.Kg: ImageVector
    get() {
        if (_kg != null) {
            return _kg!!
        }
        _kg = Builder(name = "Kg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
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
                path(fill = SolidColor(Color(0xFFF22A46)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFF04D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 13.3333f)
                    curveTo(15.8409f, 13.3333f, 17.3333f, 11.8409f, 17.3333f, 10.0f)
                    curveTo(17.3333f, 8.159f, 15.8409f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(12.159f, 6.6667f, 10.6667f, 8.159f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 11.8409f, 12.159f, 13.3333f, 14.0f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFF04D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.3682f, 17.1495f)
                    lineTo(14.0f, 14.7136f)
                    lineTo(15.6318f, 17.1495f)
                    lineTo(16.0451f, 14.2468f)
                    lineTo(18.5722f, 15.7334f)
                    lineTo(17.6852f, 12.9389f)
                    lineTo(20.6071f, 13.1818f)
                    lineTo(18.5954f, 11.0489f)
                    lineTo(21.3333f, 10.0f)
                    lineTo(18.5954f, 8.9511f)
                    lineTo(20.6071f, 6.8182f)
                    lineTo(17.6852f, 7.0611f)
                    lineTo(18.5722f, 4.2666f)
                    lineTo(16.0451f, 5.7532f)
                    lineTo(15.6318f, 2.8505f)
                    lineTo(14.0f, 5.2864f)
                    lineTo(12.3682f, 2.8505f)
                    lineTo(11.9548f, 5.7532f)
                    lineTo(9.4277f, 4.2666f)
                    lineTo(10.3147f, 7.0611f)
                    lineTo(7.3929f, 6.8182f)
                    lineTo(9.4046f, 8.9511f)
                    lineTo(6.6667f, 10.0f)
                    lineTo(9.4046f, 11.0489f)
                    lineTo(7.3929f, 13.1818f)
                    lineTo(10.3147f, 12.9389f)
                    lineTo(9.4277f, 15.7334f)
                    lineTo(11.9548f, 14.2468f)
                    lineTo(12.3682f, 17.1495f)
                    close()
                    moveTo(18.6667f, 10.0f)
                    curveTo(18.6667f, 12.5773f, 16.5773f, 14.6667f, 14.0f, 14.6667f)
                    curveTo(11.4227f, 14.6667f, 9.3333f, 12.5773f, 9.3333f, 10.0f)
                    curveTo(9.3333f, 7.4227f, 11.4227f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(16.5773f, 5.3333f, 18.6667f, 7.4227f, 18.6667f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _kg!!
    }

private var _kg: ImageVector? = null
