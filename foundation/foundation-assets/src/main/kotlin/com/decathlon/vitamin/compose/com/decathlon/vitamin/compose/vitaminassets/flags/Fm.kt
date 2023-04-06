package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, -1.0E-4f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF95CEF5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.4326f, 6.824f)
                    lineTo(14.0f, 5.76f)
                    lineTo(15.5674f, 6.824f)
                    lineTo(15.0398f, 5.0045f)
                    lineTo(16.5362f, 3.8426f)
                    lineTo(14.6426f, 3.7821f)
                    lineTo(14.0f, 2.0f)
                    lineTo(13.3574f, 3.7821f)
                    lineTo(11.4639f, 3.8426f)
                    lineTo(12.9602f, 5.0045f)
                    lineTo(12.4326f, 6.824f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.4326f, 17.4907f)
                    lineTo(14.0f, 16.4267f)
                    lineTo(15.5674f, 17.4907f)
                    lineTo(15.0398f, 15.6712f)
                    lineTo(16.5362f, 14.5093f)
                    lineTo(14.6426f, 14.4488f)
                    lineTo(14.0f, 12.6667f)
                    lineTo(13.3574f, 14.4488f)
                    lineTo(11.4639f, 14.5093f)
                    lineTo(12.9602f, 15.6712f)
                    lineTo(12.4326f, 17.4907f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3333f, 11.0933f)
                    lineTo(17.7659f, 12.1574f)
                    lineTo(18.2935f, 10.3379f)
                    lineTo(16.7972f, 9.176f)
                    lineTo(18.6907f, 9.1155f)
                    lineTo(19.3333f, 7.3333f)
                    lineTo(19.976f, 9.1155f)
                    lineTo(21.8695f, 9.176f)
                    lineTo(20.3732f, 10.3379f)
                    lineTo(20.9008f, 12.1574f)
                    lineTo(19.3333f, 11.0933f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0992f, 12.1574f)
                    lineTo(8.6667f, 11.0933f)
                    lineTo(10.2341f, 12.1574f)
                    lineTo(9.7065f, 10.3379f)
                    lineTo(11.2028f, 9.176f)
                    lineTo(9.3093f, 9.1155f)
                    lineTo(8.6667f, 7.3333f)
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
