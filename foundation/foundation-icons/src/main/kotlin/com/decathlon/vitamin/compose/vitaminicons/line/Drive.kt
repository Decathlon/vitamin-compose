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

public val LineGroup.Drive: ImageVector
    get() {
        if (_drive != null) {
            return _drive!!
        }
        _drive = Builder(name = "Drive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.097f, 6.15f)
                lineTo(4.31f, 14.443f)
                lineTo(6.065f, 17.475f)
                lineTo(10.85f, 9.185f)
                lineTo(9.097f, 6.15f)
                close()
                moveTo(7.797f, 18.474f)
                horizontalLineTo(17.365f)
                lineTo(19.116f, 15.44f)
                horizontalLineTo(9.55f)
                lineTo(7.798f, 18.474f)
                horizontalLineTo(7.797f)
                close()
                moveTo(19.111f, 13.44f)
                lineTo(14.325f, 5.15f)
                horizontalLineTo(10.83f)
                lineTo(15.617f, 13.44f)
                horizontalLineTo(19.112f)
                horizontalLineTo(19.111f)
                close()
                moveTo(8.52f, 3.15f)
                horizontalLineTo(15.48f)
                lineTo(22.0f, 14.444f)
                lineTo(18.52f, 20.474f)
                horizontalLineTo(5.49f)
                lineTo(2.0f, 14.444f)
                lineTo(8.52f, 3.15f)
                close()
                moveTo(12.005f, 11.186f)
                lineTo(10.703f, 13.44f)
                horizontalLineTo(13.306f)
                lineTo(12.005f, 11.186f)
                close()
            }
        }
        .build()
        return _drive!!
    }

private var _drive: ImageVector? = null
