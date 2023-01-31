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

public val FillGroup.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.586f)
                lineTo(16.95f, 5.636f)
                lineTo(18.364f, 7.05f)
                lineTo(13.414f, 12.0f)
                lineTo(18.364f, 16.95f)
                lineTo(16.95f, 18.364f)
                lineTo(12.0f, 13.414f)
                lineTo(7.05f, 18.364f)
                lineTo(5.636f, 16.95f)
                lineTo(10.586f, 12.0f)
                lineTo(5.636f, 7.05f)
                lineTo(7.05f, 5.636f)
                lineTo(12.0f, 10.586f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
