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

public val LineGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 6.0f)
                curveTo(10.3431f, 6.0f, 9.0f, 4.6568f, 9.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.5523f, 2.4477f, 12.0f, 3.0f, 12.0f)
                lineTo(4.999f, 11.999f)
                lineTo(5.0f, 20.0f)
                curveTo(5.0f, 20.5523f, 5.4477f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 21.0f, 19.0f, 20.5523f, 19.0f, 20.0f)
                lineTo(18.999f, 12.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 12.0f, 22.0f, 11.5523f, 22.0f, 11.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 4.6568f, 13.6569f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(16.583f, 4.999f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.999f)
                lineTo(16.999f, 10.0f)
                lineTo(17.0f, 19.0f)
                horizontalLineTo(6.999f)
                verticalLineTo(9.999f)
                lineTo(4.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.416f)
                lineTo(7.434f, 5.04f)
                curveTo(8.239f, 6.8408f, 10.0274f, 8.0002f, 12.0f, 8.0f)
                lineTo(12.216f, 7.995f)
                curveTo(14.1086f, 7.9132f, 15.7925f, 6.7692f, 16.566f, 5.04f)
                lineTo(16.583f, 4.999f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
