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

public val FillGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.286f, 8.8047f)
                lineTo(4.7f, 10.2187f)
                lineTo(5.6427f, 9.276f)
                lineTo(4.2294f, 7.862f)
                lineTo(5.6427f, 6.448f)
                lineTo(7.5287f, 8.3333f)
                lineTo(8.4714f, 7.3907f)
                lineTo(6.5867f, 5.5047f)
                lineTo(8.0f, 4.0907f)
                lineTo(9.414f, 5.5047f)
                lineTo(10.3574f, 4.562f)
                lineTo(8.9427f, 3.148f)
                lineTo(10.8287f, 1.262f)
                curveTo(11.089f, 1.0017f, 11.511f, 1.0017f, 11.7714f, 1.262f)
                lineTo(15.0714f, 4.562f)
                curveTo(15.3316f, 4.8223f, 15.3316f, 5.2443f, 15.0714f, 5.5047f)
                lineTo(5.1714f, 15.4047f)
                curveTo(4.911f, 15.6649f, 4.489f, 15.6649f, 4.2287f, 15.4047f)
                lineTo(0.9287f, 12.1047f)
                curveTo(0.6685f, 11.8443f, 0.6685f, 11.4223f, 0.9287f, 11.162f)
                lineTo(3.286f, 8.8047f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
