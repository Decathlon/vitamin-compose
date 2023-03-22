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

public val LineGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.947f, 22.208f)
                lineTo(12.0f, 18.26f)
                lineTo(19.053f, 22.208f)
                lineTo(17.478f, 14.28f)
                lineTo(23.413f, 8.792f)
                lineTo(15.386f, 7.84f)
                lineTo(12.0f, 0.5f)
                lineTo(8.614f, 7.84f)
                lineTo(0.587f, 8.792f)
                lineTo(6.522f, 14.28f)
                lineTo(4.947f, 22.208f)
                close()
                moveTo(16.247f, 18.345f)
                lineTo(12.0f, 15.968f)
                lineTo(7.753f, 18.345f)
                lineTo(8.702f, 13.572f)
                lineTo(5.129f, 10.267f)
                lineTo(9.962f, 9.695f)
                lineTo(12.0f, 5.275f)
                lineTo(14.038f, 9.694f)
                lineTo(18.871f, 10.267f)
                lineTo(15.298f, 13.572f)
                lineTo(16.247f, 18.345f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
