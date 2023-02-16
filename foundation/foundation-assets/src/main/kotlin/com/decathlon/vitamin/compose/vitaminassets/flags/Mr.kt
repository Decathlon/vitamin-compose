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

public val FlagsGroup.Mr: ImageVector
    get() {
        if (_mr != null) {
            return _mr!!
        }
        _mr = Builder(name = "Mr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF108B4D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC941)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.8134f, 7.7333f)
                    curveTo(19.862f, 8.0408f, 19.8872f, 8.356f, 19.8872f, 8.6771f)
                    curveTo(19.8872f, 11.9908f, 17.2009f, 14.6771f, 13.8872f, 14.6771f)
                    curveTo(10.5735f, 14.6771f, 7.8872f, 11.9908f, 7.8872f, 8.6771f)
                    curveTo(7.8872f, 8.356f, 7.9124f, 8.0408f, 7.961f, 7.7333f)
                    curveTo(8.4137f, 10.5987f, 10.8946f, 12.7896f, 13.8872f, 12.7896f)
                    curveTo(16.8798f, 12.7896f, 19.3607f, 10.5987f, 19.8134f, 7.7333f)
                    close()
                    moveTo(13.9998f, 8.5641f)
                    lineTo(12.3517f, 9.739f)
                    lineTo(12.9598f, 7.8085f)
                    lineTo(11.3331f, 6.6041f)
                    lineTo(13.357f, 6.5859f)
                    lineTo(13.9998f, 4.6667f)
                    lineTo(14.6425f, 6.5859f)
                    lineTo(16.6664f, 6.6041f)
                    lineTo(15.0398f, 7.8085f)
                    lineTo(15.6479f, 9.739f)
                    lineTo(13.9998f, 8.5641f)
                    close()
                }
            }
        }
        .build()
        return _mr!!
    }

private var _mr: ImageVector? = null
