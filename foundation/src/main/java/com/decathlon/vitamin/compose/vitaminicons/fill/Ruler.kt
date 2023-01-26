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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 13.207f)
                lineTo(7.05f, 15.328f)
                lineTo(8.464f, 13.914f)
                lineTo(6.344f, 11.793f)
                lineTo(8.464f, 9.672f)
                lineTo(11.293f, 12.5f)
                lineTo(12.707f, 11.086f)
                lineTo(9.88f, 8.257f)
                lineTo(12.0f, 6.136f)
                lineTo(14.121f, 8.257f)
                lineTo(15.536f, 6.843f)
                lineTo(13.414f, 4.722f)
                lineTo(16.243f, 1.893f)
                curveTo(16.6335f, 1.5026f, 17.2665f, 1.5026f, 17.657f, 1.893f)
                lineTo(22.607f, 6.843f)
                curveTo(22.9974f, 7.2335f, 22.9974f, 7.8665f, 22.607f, 8.257f)
                lineTo(7.757f, 23.107f)
                curveTo(7.3665f, 23.4974f, 6.7335f, 23.4974f, 6.343f, 23.107f)
                lineTo(1.393f, 18.157f)
                curveTo(1.0026f, 17.7665f, 1.0026f, 17.1335f, 1.393f, 16.743f)
                lineTo(4.929f, 13.207f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
