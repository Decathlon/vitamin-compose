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

public val FillGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.828f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.828f)
                lineTo(13.192f, 18.364f)
                lineTo(11.778f, 19.778f)
                lineTo(4.0f, 12.0f)
                lineTo(11.778f, 4.222f)
                lineTo(13.192f, 5.636f)
                lineTo(7.828f, 11.0f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
