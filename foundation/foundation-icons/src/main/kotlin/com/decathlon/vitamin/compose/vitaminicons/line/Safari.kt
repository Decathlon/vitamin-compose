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

public val LineGroup.Safari: ImageVector
    get() {
        if (_safari != null) {
            return _safari!!
        }
        _safari = Builder(name = "Safari", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.812f, 6.503f)
                lineTo(13.414f, 13.414f)
                lineTo(6.503f, 17.812f)
                curveTo(7.7369f, 18.9821f, 9.3126f, 19.727f, 11.0f, 19.938f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.938f)
                curveTo(14.424f, 19.7606f, 15.7737f, 19.2016f, 16.906f, 18.32f)
                lineTo(15.536f, 16.95f)
                lineTo(16.95f, 15.536f)
                lineTo(18.32f, 16.906f)
                curveTo(19.2016f, 15.7737f, 19.7606f, 14.424f, 19.938f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.727f, 9.3126f, 18.9821f, 7.7369f, 17.812f, 6.503f)
                close()
                moveTo(17.497f, 6.188f)
                curveTo(16.2631f, 5.0179f, 14.6874f, 4.273f, 13.0f, 4.062f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.062f)
                curveTo(9.5759f, 4.2394f, 8.2263f, 4.7984f, 7.094f, 5.68f)
                lineTo(8.464f, 7.05f)
                lineTo(7.05f, 8.464f)
                lineTo(5.68f, 7.094f)
                curveTo(4.7984f, 8.2263f, 4.2394f, 9.5759f, 4.062f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.062f)
                curveTo(4.273f, 14.6874f, 5.0179f, 16.2631f, 6.188f, 17.497f)
                lineTo(10.586f, 10.586f)
                lineTo(17.497f, 6.188f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _safari!!
    }

private var _safari: ImageVector? = null
