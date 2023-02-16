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

public val FlagsGroup.Fm: ImageVector
    get() {
        if (_fm != null) {
            return _fm!!
        }
        _fm = Builder(name = "Fm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF95CEF5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.4325f, 6.824f)
                    lineTo(14.0f, 5.76f)
                    lineTo(15.5674f, 6.824f)
                    lineTo(15.0398f, 5.0045f)
                    lineTo(16.5361f, 3.8426f)
                    lineTo(14.6426f, 3.7821f)
                    lineTo(14.0f, 2.0f)
                    lineTo(13.3573f, 3.7821f)
                    lineTo(11.4638f, 3.8426f)
                    lineTo(12.9602f, 5.0045f)
                    lineTo(12.4325f, 6.824f)
                    close()
                    moveTo(12.4325f, 17.4907f)
                    lineTo(14.0f, 16.4267f)
                    lineTo(15.5674f, 17.4907f)
                    lineTo(15.0398f, 15.6712f)
                    lineTo(16.5361f, 14.5093f)
                    lineTo(14.6426f, 14.4488f)
                    lineTo(14.0f, 12.6667f)
                    lineTo(13.3573f, 14.4488f)
                    lineTo(11.4638f, 14.5093f)
                    lineTo(12.9602f, 15.6712f)
                    lineTo(12.4325f, 17.4907f)
                    close()
                    moveTo(19.3333f, 11.0933f)
                    lineTo(17.7659f, 12.1574f)
                    lineTo(18.2935f, 10.3379f)
                    lineTo(16.7972f, 9.176f)
                    lineTo(18.6907f, 9.1155f)
                    lineTo(19.3333f, 7.3333f)
                    lineTo(19.976f, 9.1155f)
                    lineTo(21.8695f, 9.176f)
                    lineTo(20.3731f, 10.3379f)
                    lineTo(20.9007f, 12.1574f)
                    lineTo(19.3333f, 11.0933f)
                    close()
                    moveTo(7.0992f, 12.1574f)
                    lineTo(8.6666f, 11.0933f)
                    lineTo(10.2341f, 12.1574f)
                    lineTo(9.7065f, 10.3379f)
                    lineTo(11.2028f, 9.176f)
                    lineTo(9.3093f, 9.1155f)
                    lineTo(8.6666f, 7.3333f)
                    lineTo(8.024f, 9.1155f)
                    lineTo(6.1305f, 9.176f)
                    lineTo(7.6268f, 10.3379f)
                    lineTo(7.0992f, 12.1574f)
                    close()
                }
            }
        }
        .build()
        return _fm!!
    }

private var _fm: ImageVector? = null
