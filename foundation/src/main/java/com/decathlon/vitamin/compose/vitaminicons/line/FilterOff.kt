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

public val LineGroup.FilterOff: ImageVector
    get() {
        if (_filterOff != null) {
            return _filterOff!!
        }
        _filterOff = Builder(name = "FilterOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.929f, 1.0f)
                lineTo(21.07f, 15.142f)
                lineTo(19.656f, 16.556f)
                lineTo(15.833f, 12.734f)
                lineTo(15.0f, 13.985f)
                verticalLineTo(22.485f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.985f)
                lineTo(4.0f, 6.485f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.485f)
                horizontalLineTo(7.585f)
                lineTo(5.515f, 2.414f)
                lineTo(6.929f, 1.0f)
                close()
                moveTo(9.585f, 6.485f)
                horizontalLineTo(6.404f)
                lineTo(11.0f, 13.379f)
                verticalLineTo(20.485f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.379f)
                lineTo(14.392f, 11.292f)
                lineTo(9.585f, 6.485f)
                close()
                moveTo(21.0f, 6.485f)
                verticalLineTo(4.485f)
                horizontalLineTo(13.213f)
                lineTo(15.213f, 6.485f)
                horizontalLineTo(17.596f)
                lineTo(16.643f, 7.914f)
                lineTo(18.085f, 9.357f)
                lineTo(20.0f, 6.485f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _filterOff!!
    }

private var _filterOff: ImageVector? = null
