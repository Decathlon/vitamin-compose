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

public val FillGroup.Rainy: ImageVector
    get() {
        if (_rainy != null) {
            return _rainy!!
        }
        _rainy = Builder(name = "Rainy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8601f, 18.0f)
                lineTo(12.7071f, 14.847f)
                curveTo(12.5196f, 14.6596f, 12.2653f, 14.5543f, 12.0001f, 14.5543f)
                curveTo(11.7349f, 14.5543f, 11.4806f, 14.6596f, 11.2931f, 14.847f)
                lineTo(8.1801f, 17.96f)
                curveTo(6.8136f, 17.8189f, 5.5064f, 17.3283f, 4.3845f, 16.5355f)
                curveTo(3.2626f, 15.7427f, 2.3637f, 14.6743f, 1.7744f, 13.4333f)
                curveTo(1.1852f, 12.1924f, 0.9253f, 10.8206f, 1.02f, 9.45f)
                curveTo(1.1147f, 8.0795f, 1.5606f, 6.7565f, 2.3149f, 5.6083f)
                curveTo(3.0692f, 4.4601f, 4.1064f, 3.5255f, 5.3267f, 2.8944f)
                curveTo(6.547f, 2.2634f, 7.9092f, 1.9572f, 9.2821f, 2.0053f)
                curveTo(10.6551f, 2.0534f, 11.9925f, 2.4542f, 13.1656f, 3.1691f)
                curveTo(14.3387f, 3.884f, 15.308f, 4.8889f, 15.9801f, 6.087f)
                curveTo(16.799f, 5.9461f, 17.6382f, 5.9767f, 18.4446f, 6.177f)
                curveTo(19.251f, 6.3773f, 20.007f, 6.7429f, 20.6647f, 7.2507f)
                curveTo(21.3224f, 7.7585f, 21.8675f, 8.3973f, 22.2654f, 9.1267f)
                curveTo(22.6633f, 9.8562f, 22.9054f, 10.6603f, 22.9763f, 11.4882f)
                curveTo(23.0472f, 12.3161f, 22.9453f, 13.1497f, 22.6772f, 13.9361f)
                curveTo(22.4091f, 14.7226f, 21.9805f, 15.4448f, 21.4187f, 16.057f)
                curveTo(20.8569f, 16.6691f, 20.174f, 17.158f, 19.4134f, 17.4924f)
                curveTo(18.6528f, 17.8269f, 17.831f, 17.9998f, 17.0001f, 18.0f)
                horizontalLineTo(15.8611f)
                horizontalLineTo(15.8601f)
                close()
                moveTo(10.2321f, 18.732f)
                lineTo(12.0001f, 16.964f)
                lineTo(13.7681f, 18.732f)
                curveTo(14.1177f, 19.0817f, 14.3557f, 19.5272f, 14.4521f, 20.0121f)
                curveTo(14.5485f, 20.497f, 14.499f, 20.9997f, 14.3097f, 21.4564f)
                curveTo(14.1205f, 21.9132f, 13.8001f, 22.3036f, 13.3889f, 22.5783f)
                curveTo(12.9778f, 22.853f, 12.4945f, 22.9996f, 12.0001f, 22.9996f)
                curveTo(11.5057f, 22.9996f, 11.0223f, 22.853f, 10.6112f, 22.5783f)
                curveTo(10.2001f, 22.3036f, 9.8797f, 21.9132f, 9.6905f, 21.4564f)
                curveTo(9.5012f, 20.9997f, 9.4517f, 20.497f, 9.5481f, 20.0121f)
                curveTo(9.6445f, 19.5272f, 9.8825f, 19.0817f, 10.2321f, 18.732f)
                close()
            }
        }
        .build()
        return _rainy!!
    }

private var _rainy: ImageVector? = null
