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

public val LineGroup.ArrowUpDown: ImageVector
    get() {
        if (_arrowUpDown != null) {
            return _arrowUpDown!!
        }
        _arrowUpDown = Builder(name = "ArrowUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.9907f, 6.2427f)
                lineTo(7.9334f, 5.3f)
                lineTo(4.6334f, 2.0f)
                lineTo(1.3334f, 5.3f)
                lineTo(2.2767f, 6.2427f)
                lineTo(3.9667f, 4.552f)
                verticalLineTo(13.3333f)
                horizontalLineTo(5.3f)
                verticalLineTo(4.552f)
                lineTo(6.9907f, 6.2427f)
                close()
                moveTo(11.3f, 14.0f)
                lineTo(14.6f, 10.7f)
                lineTo(13.6574f, 9.7573f)
                lineTo(11.9667f, 11.448f)
                verticalLineTo(2.6667f)
                horizontalLineTo(10.6334f)
                lineTo(10.634f, 11.448f)
                lineTo(8.9427f, 9.7573f)
                lineTo(8.0f, 10.7f)
                lineTo(11.3f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
