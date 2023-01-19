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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0467f, 10.0947f)
                lineTo(4.6193f, 0.6667f)
                lineTo(3.6767f, 1.6093f)
                lineTo(5.0567f, 2.99f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.3233f)
                horizontalLineTo(2.6667f)
                lineTo(6.6667f, 10.3234f)
                verticalLineTo(14.99f)
                horizontalLineTo(9.3333f)
                verticalLineTo(10.3234f)
                lineTo(10.5553f, 8.4894f)
                lineTo(13.104f, 11.0374f)
                lineTo(14.0467f, 10.0947f)
                close()
                moveTo(14.0f, 4.3233f)
                verticalLineTo(2.99f)
                horizontalLineTo(8.8087f)
                lineTo(12.0567f, 6.238f)
                lineTo(13.3334f, 4.3233f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _filterOff!!
    }

private var _filterOff: ImageVector? = null
