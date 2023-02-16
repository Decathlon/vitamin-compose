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

public val LineGroup.ArrowRightDown: ImageVector
    get() {
        if (_arrowRightDown != null) {
            return _arrowRightDown!!
        }
        _arrowRightDown = Builder(name = "ArrowRightDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7267f, 10.6694f)
                lineTo(3.988f, 4.9314f)
                lineTo(4.9307f, 3.9887f)
                lineTo(10.6687f, 9.726f)
                verticalLineTo(4.6694f)
                horizontalLineTo(12.002f)
                verticalLineTo(12.0027f)
                horizontalLineTo(4.6687f)
                verticalLineTo(10.6694f)
                horizontalLineTo(9.7267f)
                close()
            }
        }
        .build()
        return _arrowRightDown!!
    }

private var _arrowRightDown: ImageVector? = null
