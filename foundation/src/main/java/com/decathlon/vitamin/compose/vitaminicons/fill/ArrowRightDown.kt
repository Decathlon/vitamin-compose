package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.ArrowRightDown: ImageVector
    get() {
        if (_arrowRightDown != null) {
            return _arrowRightDown!!
        }
        _arrowRightDown = Builder(name = "ArrowRightDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5901f, 16.004f)
                lineTo(5.9821f, 7.397f)
                lineTo(7.3961f, 5.983f)
                lineTo(16.0031f, 14.589f)
                verticalLineTo(7.004f)
                horizontalLineTo(18.0031f)
                verticalLineTo(18.004f)
                horizontalLineTo(7.0031f)
                verticalLineTo(16.004f)
                horizontalLineTo(14.5901f)
                close()
            }
        }
        .build()
        return _arrowRightDown!!
    }

private var _arrowRightDown: ImageVector? = null
