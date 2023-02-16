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

public val LineGroup.Calendar2: ImageVector
    get() {
        if (_calendar2 != null) {
            return _calendar2!!
        }
        _calendar2 = Builder(name = "Calendar2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0002f, 2.6667f)
                horizontalLineTo(11.3335f)
                verticalLineTo(1.3334f)
                horizontalLineTo(10.0002f)
                verticalLineTo(2.6667f)
                horizontalLineTo(6.0002f)
                verticalLineTo(1.3334f)
                horizontalLineTo(4.6668f)
                verticalLineTo(2.6667f)
                horizontalLineTo(2.0002f)
                curveTo(1.632f, 2.6667f, 1.3335f, 2.9652f, 1.3335f, 3.3334f)
                verticalLineTo(14.0f)
                curveTo(1.3335f, 14.3682f, 1.632f, 14.6667f, 2.0002f, 14.6667f)
                horizontalLineTo(14.0002f)
                curveTo(14.3684f, 14.6667f, 14.6668f, 14.3682f, 14.6668f, 14.0f)
                verticalLineTo(3.3334f)
                curveTo(14.6668f, 2.9652f, 14.3684f, 2.6667f, 14.0002f, 2.6667f)
                close()
                moveTo(5.3335f, 8.6667f)
                verticalLineTo(7.3334f)
                horizontalLineTo(4.0002f)
                verticalLineTo(8.6667f)
                horizontalLineTo(5.3335f)
                close()
                moveTo(5.3335f, 10.0f)
                verticalLineTo(11.3334f)
                horizontalLineTo(4.0002f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.3335f)
                close()
                moveTo(8.6668f, 7.3334f)
                horizontalLineTo(7.3335f)
                verticalLineTo(8.6667f)
                horizontalLineTo(8.6668f)
                verticalLineTo(7.3334f)
                close()
                moveTo(7.3335f, 10.0f)
                horizontalLineTo(8.6668f)
                verticalLineTo(11.3334f)
                horizontalLineTo(7.3335f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.0002f, 8.6667f)
                verticalLineTo(7.3334f)
                horizontalLineTo(10.6668f)
                verticalLineTo(8.6667f)
                horizontalLineTo(12.0002f)
                close()
                moveTo(12.0002f, 10.0f)
                verticalLineTo(11.3334f)
                horizontalLineTo(10.6668f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0002f)
                close()
                moveTo(6.0002f, 4.0f)
                horizontalLineTo(10.0002f)
                verticalLineTo(5.3334f)
                horizontalLineTo(11.3335f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.3335f)
                verticalLineTo(13.3267f)
                horizontalLineTo(2.6668f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.6668f)
                verticalLineTo(5.3334f)
                horizontalLineTo(6.0002f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _calendar2!!
    }

private var _calendar2: ImageVector? = null
