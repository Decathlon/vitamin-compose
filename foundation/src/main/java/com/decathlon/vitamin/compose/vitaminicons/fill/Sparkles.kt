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

public val FillGroup.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 2.0f)
                lineTo(18.1897f, 4.1897f)
                lineTo(16.0f, 5.0f)
                lineTo(18.1897f, 5.8103f)
                lineTo(19.0f, 8.0f)
                lineTo(19.8103f, 5.8103f)
                lineTo(22.0f, 5.0f)
                lineTo(19.8103f, 4.1897f)
                lineTo(19.0f, 2.0f)
                close()
                moveTo(12.7958f, 9.2042f)
                lineTo(10.5f, 3.0f)
                lineTo(8.2042f, 9.2042f)
                lineTo(2.0f, 11.5f)
                lineTo(8.2042f, 13.7958f)
                lineTo(10.5f, 20.0f)
                lineTo(12.7958f, 13.7958f)
                lineTo(19.0f, 11.5f)
                lineTo(12.7958f, 9.2042f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(19.0804f, 16.9196f)
                lineTo(22.0f, 18.0f)
                lineTo(19.0804f, 19.0804f)
                lineTo(18.0f, 22.0f)
                lineTo(16.9196f, 19.0804f)
                lineTo(14.0f, 18.0f)
                lineTo(16.9196f, 16.9196f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
