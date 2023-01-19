package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0714f, 4.562f)
                lineTo(11.7714f, 1.262f)
                curveTo(11.511f, 1.0017f, 11.089f, 1.0017f, 10.8287f, 1.262f)
                lineTo(0.9287f, 11.162f)
                curveTo(0.6685f, 11.4223f, 0.6685f, 11.8443f, 0.9287f, 12.1047f)
                lineTo(4.2287f, 15.4047f)
                curveTo(4.489f, 15.6649f, 4.911f, 15.6649f, 5.1714f, 15.4047f)
                lineTo(15.0714f, 5.5047f)
                curveTo(15.3316f, 5.2443f, 15.3316f, 4.8223f, 15.0714f, 4.562f)
                close()
                moveTo(2.3435f, 11.6333f)
                lineTo(4.2288f, 9.7473f)
                lineTo(5.1715f, 10.6913f)
                lineTo(6.1148f, 9.748f)
                lineTo(5.1715f, 8.8053f)
                lineTo(6.5861f, 7.3913f)
                lineTo(8.0001f, 8.8053f)
                lineTo(8.9428f, 7.8613f)
                lineTo(7.5288f, 6.448f)
                lineTo(8.9428f, 5.0333f)
                lineTo(9.8855f, 5.976f)
                lineTo(10.8288f, 5.0333f)
                lineTo(9.8855f, 4.0907f)
                lineTo(11.3001f, 2.6767f)
                lineTo(13.6568f, 5.0333f)
                lineTo(4.7001f, 13.99f)
                lineTo(2.3435f, 11.6333f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
