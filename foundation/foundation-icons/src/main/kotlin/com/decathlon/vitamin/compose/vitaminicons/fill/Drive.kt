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

public val FillGroup.Drive: ImageVector
    get() {
        if (_drive != null) {
            return _drive!!
        }
        _drive = Builder(name = "Drive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.6787f, 2.0966f)
                lineTo(9.6393f, 8.96f)
                horizontalLineTo(14.2814f)
                lineTo(10.3214f, 2.0966f)
                horizontalLineTo(5.6787f)
                close()
                moveTo(5.2934f, 2.764f)
                lineTo(7.6147f, 6.784f)
                lineTo(3.6547f, 13.646f)
                lineTo(1.3334f, 9.6267f)
                lineTo(5.2934f, 2.764f)
                close()
                moveTo(6.7441f, 9.6266f)
                horizontalLineTo(14.6668f)
                lineTo(12.3455f, 13.646f)
                horizontalLineTo(4.4234f)
                lineTo(6.7441f, 9.6266f)
                close()
            }
        }
        .build()
        return _drive!!
    }

private var _drive: ImageVector? = null
