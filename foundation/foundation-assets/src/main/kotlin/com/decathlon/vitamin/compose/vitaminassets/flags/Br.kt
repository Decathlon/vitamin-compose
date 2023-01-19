package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Br: ImageVector
    get() {
        if (_br != null) {
            return _br!!
        }
        _br = Builder(name = "Br", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF05AB41)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDD216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.5315f, 10.5597f)
                    curveTo(3.1255f, 10.297f, 3.1255f, 9.703f, 3.5315f, 9.4403f)
                    lineTo(13.6377f, 2.901f)
                    curveTo(13.8581f, 2.7584f, 14.1416f, 2.7584f, 14.362f, 2.901f)
                    lineTo(24.4682f, 9.4403f)
                    curveTo(24.8742f, 9.703f, 24.8742f, 10.297f, 24.4682f, 10.5597f)
                    lineTo(14.362f, 17.099f)
                    curveTo(14.1416f, 17.2416f, 13.8581f, 17.2416f, 13.6377f, 17.099f)
                    lineTo(3.5315f, 10.5597f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF053087)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0002f, 14.6666f)
                    curveTo(16.5775f, 14.6666f, 18.6668f, 12.5773f, 18.6668f, 10.0f)
                    curveTo(18.6668f, 7.4226f, 16.5775f, 5.3333f, 14.0002f, 5.3333f)
                    curveTo(11.4228f, 5.3333f, 9.3335f, 7.4226f, 9.3335f, 10.0f)
                    curveTo(9.3335f, 12.5773f, 11.4228f, 14.6666f, 14.0002f, 14.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 1.33333f, strokeLineCap = Square, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(8.7799f, 8.7802f)
                    curveTo(9.5126f, 8.1869f, 11.8769f, 8.749f, 14.084f, 9.3377f)
                    curveTo(16.291f, 9.9264f, 18.5929f, 11.1604f, 19.179f, 11.8842f)
                }
            }
        }
        .build()
        return _br!!
    }

private var _br: ImageVector? = null
