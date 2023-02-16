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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6193f, 0.6667f)
                lineTo(14.0467f, 10.0947f)
                lineTo(13.104f, 11.0374f)
                lineTo(10.5553f, 8.4894f)
                lineTo(10.0f, 9.3233f)
                verticalLineTo(14.99f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.3233f)
                lineTo(2.6667f, 4.3233f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.99f)
                horizontalLineTo(5.0567f)
                lineTo(3.6767f, 1.6093f)
                lineTo(4.6193f, 0.6667f)
                close()
                moveTo(6.39f, 4.3233f)
                horizontalLineTo(4.2693f)
                lineTo(7.3333f, 8.9193f)
                verticalLineTo(13.6567f)
                horizontalLineTo(8.6666f)
                verticalLineTo(8.9193f)
                lineTo(9.5947f, 7.528f)
                lineTo(6.39f, 4.3233f)
                close()
                moveTo(14.0f, 4.3233f)
                verticalLineTo(2.99f)
                horizontalLineTo(8.8087f)
                lineTo(10.142f, 4.3233f)
                horizontalLineTo(11.7307f)
                lineTo(11.0954f, 5.276f)
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
