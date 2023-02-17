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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.607f, 6.843f)
                lineTo(17.657f, 1.893f)
                curveTo(17.2665f, 1.5026f, 16.6335f, 1.5026f, 16.243f, 1.893f)
                lineTo(1.393f, 16.743f)
                curveTo(1.0026f, 17.1335f, 1.0026f, 17.7665f, 1.393f, 18.157f)
                lineTo(6.343f, 23.107f)
                curveTo(6.7335f, 23.4974f, 7.3665f, 23.4974f, 7.757f, 23.107f)
                lineTo(22.607f, 8.257f)
                curveTo(22.9974f, 7.8665f, 22.9974f, 7.2335f, 22.607f, 6.843f)
                close()
                moveTo(3.515f, 17.45f)
                lineTo(6.343f, 14.621f)
                verticalLineTo(14.622f)
                lineTo(7.757f, 16.037f)
                lineTo(9.172f, 14.622f)
                lineTo(7.757f, 13.208f)
                lineTo(9.879f, 11.087f)
                lineTo(12.0f, 13.208f)
                lineTo(13.414f, 11.792f)
                lineTo(11.293f, 9.672f)
                lineTo(13.414f, 7.55f)
                lineTo(14.828f, 8.964f)
                lineTo(16.243f, 7.55f)
                lineTo(14.828f, 6.136f)
                lineTo(16.95f, 4.015f)
                lineTo(20.485f, 7.55f)
                lineTo(7.05f, 20.985f)
                lineTo(3.515f, 17.45f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
