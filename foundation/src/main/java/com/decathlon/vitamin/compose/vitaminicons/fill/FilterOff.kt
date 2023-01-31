package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.FilterOff: ImageVector
    get() {
        if (_filterOff != null) {
            return _filterOff!!
        }
        _filterOff = Builder(name = "FilterOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.07f, 15.142f)
                lineTo(6.929f, 1.0f)
                lineTo(5.515f, 2.414f)
                lineTo(7.585f, 4.485f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.485f)
                horizontalLineTo(4.0f)
                lineTo(10.0f, 15.485f)
                verticalLineTo(22.485f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.485f)
                lineTo(15.833f, 12.734f)
                lineTo(19.656f, 16.556f)
                lineTo(21.07f, 15.142f)
                close()
                moveTo(21.0f, 6.485f)
                verticalLineTo(4.485f)
                horizontalLineTo(13.213f)
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
