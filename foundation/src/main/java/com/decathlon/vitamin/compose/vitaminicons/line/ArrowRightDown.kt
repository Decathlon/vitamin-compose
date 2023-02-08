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
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 16.004f)
                lineTo(5.982f, 7.397f)
                lineTo(7.396f, 5.983f)
                lineTo(16.003f, 14.589f)
                verticalLineTo(7.004f)
                horizontalLineTo(18.003f)
                verticalLineTo(18.004f)
                horizontalLineTo(7.003f)
                verticalLineTo(16.004f)
                horizontalLineTo(14.59f)
                close()
            }
        }
        .build()
        return _arrowRightDown!!
    }

private var _arrowRightDown: ImageVector? = null
