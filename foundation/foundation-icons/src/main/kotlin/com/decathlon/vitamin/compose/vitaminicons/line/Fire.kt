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

public val LineGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(13.9891f, 23.0f, 15.8968f, 22.2098f, 17.3033f, 20.8033f)
                curveTo(18.7098f, 19.3968f, 19.5f, 17.4891f, 19.5f, 15.5f)
                curveTo(19.5f, 14.634f, 19.27f, 13.803f, 19.0f, 13.03f)
                curveTo(17.333f, 14.677f, 16.067f, 15.5f, 15.2f, 15.5f)
                curveTo(19.195f, 8.5f, 17.0f, 5.5f, 11.0f, 1.5f)
                curveTo(11.5f, 6.5f, 8.204f, 8.774f, 6.862f, 10.037f)
                curveTo(5.7673f, 11.0667f, 5.0072f, 12.4015f, 4.6803f, 13.8683f)
                curveTo(4.3533f, 15.3352f, 4.4746f, 16.8664f, 5.0283f, 18.2635f)
                curveTo(5.5821f, 19.6606f, 6.5428f, 20.8592f, 7.7859f, 21.7037f)
                curveTo(9.029f, 22.5483f, 10.4971f, 22.9999f, 12.0f, 23.0f)
                close()
                moveTo(12.71f, 5.235f)
                curveTo(15.951f, 7.985f, 15.967f, 10.122f, 13.463f, 14.509f)
                curveTo(12.702f, 15.842f, 13.665f, 17.5f, 15.2f, 17.5f)
                curveTo(15.888f, 17.5f, 16.584f, 17.3f, 17.319f, 16.905f)
                curveTo(17.1011f, 17.728f, 16.6952f, 18.4892f, 16.1331f, 19.1286f)
                curveTo(15.5711f, 19.768f, 14.8683f, 20.2682f, 14.08f, 20.5899f)
                curveTo(13.2918f, 20.9115f, 12.4397f, 21.0458f, 11.5907f, 20.9821f)
                curveTo(10.7418f, 20.9184f, 9.9192f, 20.6585f, 9.1878f, 20.2229f)
                curveTo(8.4563f, 19.7873f, 7.836f, 19.1878f, 7.3757f, 18.4717f)
                curveTo(6.9153f, 17.7556f, 6.6274f, 16.9424f, 6.5348f, 16.0961f)
                curveTo(6.4421f, 15.2498f, 6.5472f, 14.3936f, 6.8417f, 13.5948f)
                curveTo(7.1362f, 12.7961f, 7.6121f, 12.0766f, 8.232f, 11.493f)
                curveTo(8.358f, 11.375f, 8.997f, 10.808f, 9.025f, 10.783f)
                curveTo(9.449f, 10.403f, 9.798f, 10.066f, 10.143f, 9.697f)
                curveTo(11.373f, 8.379f, 12.257f, 6.917f, 12.709f, 5.235f)
                horizontalLineTo(12.71f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
