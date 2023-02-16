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

public val LineGroup.Direction: ImageVector
    get() {
        if (_direction != null) {
            return _direction!!
        }
        _direction = Builder(name = "Direction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.4714f, 0.9287f)
                lineTo(15.0714f, 7.5286f)
                curveTo(15.3316f, 7.789f, 15.3316f, 8.211f, 15.0714f, 8.4713f)
                lineTo(8.4714f, 15.0713f)
                curveTo(8.211f, 15.3316f, 7.789f, 15.3316f, 7.5287f, 15.0713f)
                lineTo(0.9287f, 8.4713f)
                curveTo(0.6685f, 8.211f, 0.6685f, 7.789f, 0.9287f, 7.5286f)
                lineTo(7.5287f, 0.9287f)
                curveTo(7.789f, 0.6684f, 8.211f, 0.6684f, 8.4714f, 0.9287f)
                close()
                moveTo(8.0001f, 2.3433f)
                lineTo(2.3435f, 8.0f)
                lineTo(8.0001f, 13.6566f)
                lineTo(13.6568f, 8.0f)
                lineTo(8.0001f, 2.3433f)
                close()
                moveTo(8.6667f, 5.0f)
                verticalLineTo(6.6666f)
                horizontalLineTo(6.0f)
                curveTo(5.6318f, 6.6666f, 5.3333f, 6.9651f, 5.3333f, 7.3333f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(9.6666f)
                lineTo(11.0f, 7.3333f)
                lineTo(8.6667f, 5.0f)
                close()
            }
        }
        .build()
        return _direction!!
    }

private var _direction: ImageVector? = null
