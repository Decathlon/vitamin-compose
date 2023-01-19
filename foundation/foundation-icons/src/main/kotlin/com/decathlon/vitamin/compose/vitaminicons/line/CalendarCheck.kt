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

public val LineGroup.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0002f, 2.6667f)
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
                horizontalLineTo(11.3335f)
                verticalLineTo(1.3334f)
                horizontalLineTo(10.0002f)
                verticalLineTo(2.6667f)
                horizontalLineTo(6.0002f)
                close()
                moveTo(2.667f, 7.3334f)
                horizontalLineTo(13.3337f)
                verticalLineTo(13.3334f)
                horizontalLineTo(2.667f)
                verticalLineTo(7.3334f)
                close()
                moveTo(10.0242f, 8.0907f)
                lineTo(10.0245f, 8.091f)
                lineTo(7.6675f, 10.448f)
                lineTo(6.2535f, 9.0334f)
                lineTo(5.3095f, 9.976f)
                lineTo(7.6669f, 12.3334f)
                lineTo(10.9669f, 9.0334f)
                lineTo(10.0245f, 8.091f)
                lineTo(10.0249f, 8.0907f)
                horizontalLineTo(10.0242f)
                close()
                moveTo(2.667f, 4.0f)
                horizontalLineTo(4.667f)
                verticalLineTo(4.6667f)
                horizontalLineTo(6.0003f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0003f)
                verticalLineTo(4.6667f)
                horizontalLineTo(11.3337f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.3337f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.667f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
