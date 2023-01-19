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

public val FillGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2427f, 11.576f)
                lineTo(8.0f, 15.8187f)
                lineTo(3.7573f, 11.576f)
                curveTo(2.9182f, 10.7369f, 2.3468f, 9.6678f, 2.1153f, 8.5039f)
                curveTo(1.8838f, 7.34f, 2.0026f, 6.1336f, 2.4567f, 5.0373f)
                curveTo(2.9109f, 3.9409f, 3.6799f, 3.0038f, 4.6666f, 2.3445f)
                curveTo(5.6533f, 1.6853f, 6.8133f, 1.3334f, 8.0f, 1.3334f)
                curveTo(9.1867f, 1.3334f, 10.3467f, 1.6853f, 11.3334f, 2.3445f)
                curveTo(12.3201f, 3.0038f, 13.0891f, 3.9409f, 13.5433f, 5.0373f)
                curveTo(13.9974f, 6.1336f, 14.1162f, 7.34f, 13.8847f, 8.5039f)
                curveTo(13.6532f, 9.6678f, 13.0818f, 10.7369f, 12.2427f, 11.576f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(8.7072f, 10.0f, 9.3855f, 9.719f, 9.8856f, 9.2189f)
                curveTo(10.3857f, 8.7188f, 10.6667f, 8.0406f, 10.6667f, 7.3333f)
                curveTo(10.6667f, 6.6261f, 10.3857f, 5.9478f, 9.8856f, 5.4477f)
                curveTo(9.3855f, 4.9476f, 8.7072f, 4.6667f, 8.0f, 4.6667f)
                curveTo(7.2928f, 4.6667f, 6.6145f, 4.9476f, 6.1144f, 5.4477f)
                curveTo(5.6143f, 5.9478f, 5.3333f, 6.6261f, 5.3333f, 7.3333f)
                curveTo(5.3333f, 8.0406f, 5.6143f, 8.7188f, 6.1144f, 9.2189f)
                curveTo(6.6145f, 9.719f, 7.2928f, 10.0f, 8.0f, 10.0f)
                close()
                moveTo(8.0f, 8.6667f)
                curveTo(7.6464f, 8.6667f, 7.3072f, 8.5262f, 7.0572f, 8.2761f)
                curveTo(6.8071f, 8.0261f, 6.6667f, 7.6869f, 6.6667f, 7.3333f)
                curveTo(6.6667f, 6.9797f, 6.8071f, 6.6406f, 7.0572f, 6.3905f)
                curveTo(7.3072f, 6.1405f, 7.6464f, 6.0f, 8.0f, 6.0f)
                curveTo(8.3536f, 6.0f, 8.6928f, 6.1405f, 8.9428f, 6.3905f)
                curveTo(9.1929f, 6.6406f, 9.3333f, 6.9797f, 9.3333f, 7.3333f)
                curveTo(9.3333f, 7.6869f, 9.1929f, 8.0261f, 8.9428f, 8.2761f)
                curveTo(8.6928f, 8.5262f, 8.3536f, 8.6667f, 8.0f, 8.6667f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
