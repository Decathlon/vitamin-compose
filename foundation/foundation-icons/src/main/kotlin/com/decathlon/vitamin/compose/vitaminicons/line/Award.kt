package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3332f, 10.1634f)
                verticalLineTo(14.7447f)
                curveTo(11.3332f, 14.8037f, 11.3175f, 14.8616f, 11.2879f, 14.9126f)
                curveTo(11.2582f, 14.9635f, 11.2155f, 15.0057f, 11.1642f, 15.0348f)
                curveTo(11.1129f, 15.0638f, 11.0548f, 15.0788f, 10.9958f, 15.0781f)
                curveTo(10.9368f, 15.0774f, 10.8791f, 15.061f, 10.8285f, 15.0307f)
                lineTo(7.9998f, 13.3334f)
                lineTo(5.1712f, 15.0307f)
                curveTo(5.1205f, 15.061f, 5.0627f, 15.0774f, 5.0037f, 15.0781f)
                curveTo(4.9447f, 15.0788f, 4.8865f, 15.0638f, 4.8352f, 15.0346f)
                curveTo(4.7839f, 15.0054f, 4.7412f, 14.9632f, 4.7116f, 14.9121f)
                curveTo(4.6819f, 14.8611f, 4.6664f, 14.8031f, 4.6665f, 14.744f)
                verticalLineTo(10.164f)
                curveTo(3.8039f, 9.4734f, 3.1772f, 8.5319f, 2.8728f, 7.4697f)
                curveTo(2.5684f, 6.4075f, 2.6015f, 5.2769f, 2.9675f, 4.2343f)
                curveTo(3.3335f, 3.1917f, 4.0142f, 2.2885f, 4.9157f, 1.6495f)
                curveTo(5.8172f, 1.0106f, 6.8949f, 0.6674f, 7.9998f, 0.6674f)
                curveTo(9.1048f, 0.6674f, 10.1825f, 1.0106f, 11.084f, 1.6495f)
                curveTo(11.9855f, 2.2885f, 12.6662f, 3.1917f, 13.0322f, 4.2343f)
                curveTo(13.3981f, 5.2769f, 13.4312f, 6.4075f, 13.1269f, 7.4697f)
                curveTo(12.8225f, 8.5319f, 12.1957f, 9.4734f, 11.3332f, 10.164f)
                verticalLineTo(10.1634f)
                close()
                moveTo(5.9998f, 10.9454f)
                verticalLineTo(12.9787f)
                lineTo(7.9998f, 11.7787f)
                lineTo(9.9998f, 12.9787f)
                verticalLineTo(10.9454f)
                curveTo(9.3644f, 11.2024f, 8.6853f, 11.3341f, 7.9998f, 11.3334f)
                curveTo(7.3144f, 11.3341f, 6.6353f, 11.2024f, 5.9998f, 10.9454f)
                close()
                moveTo(7.9998f, 10.0f)
                curveTo(9.0607f, 10.0f, 10.0781f, 9.5786f, 10.8283f, 8.8285f)
                curveTo(11.5784f, 8.0783f, 11.9998f, 7.0609f, 11.9998f, 6.0f)
                curveTo(11.9998f, 4.9392f, 11.5784f, 3.9217f, 10.8283f, 3.1716f)
                curveTo(10.0781f, 2.4214f, 9.0607f, 2.0f, 7.9998f, 2.0f)
                curveTo(6.939f, 2.0f, 5.9216f, 2.4214f, 5.1714f, 3.1716f)
                curveTo(4.4213f, 3.9217f, 3.9998f, 4.9392f, 3.9998f, 6.0f)
                curveTo(3.9998f, 7.0609f, 4.4213f, 8.0783f, 5.1714f, 8.8285f)
                curveTo(5.9216f, 9.5786f, 6.939f, 10.0f, 7.9998f, 10.0f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
