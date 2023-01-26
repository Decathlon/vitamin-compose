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

public val FillGroup.CloudWindy: ImageVector
    get() {
        if (_cloudWindy != null) {
            return _cloudWindy!!
        }
        _cloudWindy = Builder(name = "CloudWindy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(14.007f)
                horizontalLineTo(2.074f)
                curveTo(1.3373f, 12.1273f, 1.3386f, 10.0384f, 2.0777f, 8.1596f)
                curveTo(2.8168f, 6.2807f, 4.2389f, 4.7508f, 6.0589f, 3.8767f)
                curveTo(7.8789f, 3.0025f, 9.9621f, 2.8489f, 11.8906f, 3.4465f)
                curveTo(13.8191f, 4.0442f, 15.4503f, 5.3489f, 16.457f, 7.0991f)
                curveTo(17.2093f, 6.9543f, 17.9836f, 6.9684f, 18.7301f, 7.1403f)
                curveTo(19.4767f, 7.3122f, 20.1791f, 7.6382f, 20.7923f, 8.0974f)
                curveTo(21.4055f, 8.5565f, 21.9161f, 9.1388f, 22.2913f, 9.8067f)
                curveTo(22.6664f, 10.4746f, 22.8979f, 11.2136f, 22.9709f, 11.9762f)
                curveTo(23.0438f, 12.7388f, 22.9567f, 13.5083f, 22.715f, 14.2352f)
                curveTo(22.4733f, 14.9622f, 22.0824f, 15.6306f, 21.5673f, 16.1978f)
                curveTo(21.0523f, 16.7649f, 20.4244f, 17.2181f, 19.724f, 17.5285f)
                curveTo(19.0236f, 17.8389f, 18.2661f, 17.9995f, 17.5f, 18.0f)
                horizontalLineTo(14.001f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cloudWindy!!
    }

private var _cloudWindy: ImageVector? = null
