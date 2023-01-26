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

public val FillGroup.TempHot: ImageVector
    get() {
        if (_tempHot != null) {
            return _tempHot!!
        }
        _tempHot = Builder(name = "TempHot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.255f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 3.9391f, 8.4214f, 2.9217f, 9.1716f, 2.1716f)
                curveTo(9.9217f, 1.4214f, 10.9391f, 1.0f, 12.0f, 1.0f)
                curveTo(13.0609f, 1.0f, 14.0783f, 1.4214f, 14.8284f, 2.1716f)
                curveTo(15.5786f, 2.9217f, 16.0f, 3.9391f, 16.0f, 5.0f)
                verticalLineTo(10.255f)
                curveTo(17.223f, 11.1066f, 18.1423f, 12.3262f, 18.6241f, 13.7365f)
                curveTo(19.1059f, 15.1467f, 19.125f, 16.6739f, 18.6788f, 18.0958f)
                curveTo(18.2325f, 19.5176f, 17.3441f, 20.76f, 16.1429f, 21.642f)
                curveTo(14.9416f, 22.524f, 13.4903f, 22.9996f, 12.0f, 22.9996f)
                curveTo(10.5097f, 22.9996f, 9.0584f, 22.524f, 7.8571f, 21.642f)
                curveTo(6.6559f, 20.76f, 5.7675f, 19.5176f, 5.3212f, 18.0958f)
                curveTo(4.875f, 16.6739f, 4.8941f, 15.1467f, 5.3759f, 13.7365f)
                curveTo(5.8577f, 12.3262f, 6.777f, 11.1066f, 8.0f, 10.255f)
                close()
                moveTo(11.0f, 12.126f)
                curveTo(10.0595f, 12.3717f, 9.2406f, 12.9514f, 8.6962f, 13.7567f)
                curveTo(8.1518f, 14.562f, 7.9191f, 15.5379f, 8.0416f, 16.5022f)
                curveTo(8.164f, 17.4665f, 8.6333f, 18.3533f, 9.3617f, 18.997f)
                curveTo(10.0901f, 19.6406f, 11.0279f, 19.9972f, 12.0f, 20.0f)
                curveTo(12.9743f, 20.001f, 13.9154f, 19.6463f, 14.6467f, 19.0026f)
                curveTo(15.3781f, 18.3589f, 15.8493f, 17.4705f, 15.9721f, 16.504f)
                curveTo(16.0948f, 15.5375f, 15.8606f, 14.5594f, 15.3134f, 13.7533f)
                curveTo(14.7662f, 12.9472f, 13.9436f, 12.3686f, 13.0f, 12.126f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.126f)
                close()
            }
        }
        .build()
        return _tempHot!!
    }

private var _tempHot: ImageVector? = null
