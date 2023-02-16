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

public val FillGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7747f, 3.7706f)
                curveTo(14.2657f, 3.9958f, 13.726f, 4.1436f, 13.1734f, 4.2093f)
                curveTo(13.7559f, 3.8609f, 14.1918f, 3.3127f, 14.4f, 2.6667f)
                curveTo(13.8534f, 2.992f, 13.254f, 3.22f, 12.6294f, 3.3433f)
                curveTo(11.7666f, 2.4202f, 10.3909f, 2.1927f, 9.2769f, 2.7889f)
                curveTo(8.1629f, 3.3852f, 7.5891f, 4.6561f, 7.8787f, 5.886f)
                curveTo(5.6367f, 5.7736f, 3.5479f, 4.7147f, 2.132f, 2.9727f)
                curveTo(1.8842f, 3.3983f, 1.754f, 3.8821f, 1.7547f, 4.3747f)
                curveTo(1.7547f, 5.3413f, 2.2467f, 6.1953f, 2.9947f, 6.6953f)
                curveTo(2.552f, 6.6814f, 2.1191f, 6.5618f, 1.732f, 6.3467f)
                verticalLineTo(6.3813f)
                curveTo(1.7323f, 7.7087f, 2.6677f, 8.8521f, 3.9687f, 9.1153f)
                curveTo(3.5578f, 9.2267f, 3.1269f, 9.2431f, 2.7087f, 9.1633f)
                curveTo(3.0735f, 10.2994f, 4.1203f, 11.0778f, 5.3134f, 11.1f)
                curveTo(4.1453f, 12.0173f, 2.6605f, 12.4327f, 1.186f, 12.2547f)
                curveTo(2.4605f, 13.0743f, 3.9441f, 13.5094f, 5.4594f, 13.508f)
                curveTo(10.588f, 13.508f, 13.3927f, 9.2593f, 13.3927f, 5.5746f)
                curveTo(13.3927f, 5.4546f, 13.3894f, 5.3333f, 13.384f, 5.2147f)
                curveTo(13.9299f, 4.8201f, 14.4004f, 4.3307f, 14.7747f, 3.7706f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
