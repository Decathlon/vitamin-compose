package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.ShareIos: ImageVector
    get() {
        if (_shareIos != null) {
            return _shareIos!!
        }
        _shareIos = Builder(name = "ShareIos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0104f)
                curveTo(12.4978f, 15.0104f, 12.8908f, 14.6125f, 12.8908f, 14.1453f)
                verticalLineTo(5.5554f)
                lineTo(12.821f, 4.2751f)
                lineTo(13.3275f, 4.9239f)
                lineTo(14.4716f, 6.135f)
                curveTo(14.6288f, 6.308f, 14.8472f, 6.3945f, 15.0655f, 6.3945f)
                curveTo(15.4935f, 6.3945f, 15.8515f, 6.083f, 15.8515f, 5.6419f)
                curveTo(15.8515f, 5.417f, 15.7642f, 5.2439f, 15.607f, 5.0882f)
                lineTo(12.69f, 2.3114f)
                curveTo(12.4541f, 2.0865f, 12.2358f, 2.0f, 12.0f, 2.0f)
                curveTo(11.7642f, 2.0f, 11.5371f, 2.0865f, 11.31f, 2.3114f)
                lineTo(8.393f, 5.0882f)
                curveTo(8.2271f, 5.2439f, 8.1397f, 5.417f, 8.1397f, 5.6419f)
                curveTo(8.1397f, 6.083f, 8.4978f, 6.3945f, 8.9258f, 6.3945f)
                curveTo(9.1441f, 6.3945f, 9.3712f, 6.308f, 9.5197f, 6.135f)
                lineTo(10.6725f, 4.9239f)
                lineTo(11.179f, 4.2751f)
                lineTo(11.1004f, 5.5554f)
                verticalLineTo(14.1453f)
                curveTo(11.1004f, 14.6125f, 11.5022f, 15.0104f, 12.0f, 15.0104f)
                close()
                moveTo(6.9607f, 22.0f)
                horizontalLineTo(17.0393f)
                curveTo(18.9782f, 22.0f, 20.0f, 20.9879f, 20.0f, 19.0934f)
                verticalLineTo(10.6678f)
                curveTo(20.0f, 8.7734f, 18.9782f, 7.7613f, 17.0393f, 7.7613f)
                horizontalLineTo(14.7249f)
                verticalLineTo(9.6903f)
                horizontalLineTo(16.8734f)
                curveTo(17.6332f, 9.6903f, 18.0524f, 10.0796f, 18.0524f, 10.8668f)
                verticalLineTo(18.8945f)
                curveTo(18.0524f, 19.6903f, 17.6332f, 20.0709f, 16.8734f, 20.0709f)
                horizontalLineTo(7.1266f)
                curveTo(6.3581f, 20.0709f, 5.9476f, 19.6903f, 5.9476f, 18.8945f)
                verticalLineTo(10.8668f)
                curveTo(5.9476f, 10.0796f, 6.3581f, 9.6903f, 7.1266f, 9.6903f)
                horizontalLineTo(9.3013f)
                verticalLineTo(7.7613f)
                horizontalLineTo(6.9607f)
                curveTo(5.0306f, 7.7613f, 4.0f, 8.7734f, 4.0f, 10.6678f)
                verticalLineTo(19.0934f)
                curveTo(4.0f, 20.9965f, 5.0306f, 22.0f, 6.9607f, 22.0f)
                close()
            }
        }
        .build()
        return _shareIos!!
    }

private var _shareIos: ImageVector? = null
