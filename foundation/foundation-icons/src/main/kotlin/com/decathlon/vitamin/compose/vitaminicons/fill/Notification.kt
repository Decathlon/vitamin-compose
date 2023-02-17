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

public val FillGroup.Notification: ImageVector
    get() {
        if (_notification != null) {
            return _notification!!
        }
        _notification = Builder(name = "Notification", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.031f)
                curveTo(21.0f, 5.043f, 16.97f, 1.0f, 12.0f, 1.0f)
                curveTo(7.03f, 1.0f, 3.0f, 5.043f, 3.0f, 10.031f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(12.0f, 22.5f)
                curveTo(13.3807f, 22.5f, 14.5f, 21.3807f, 14.5f, 20.0f)
                horizontalLineTo(9.5f)
                curveTo(9.5f, 21.3807f, 10.6193f, 22.5f, 12.0f, 22.5f)
                close()
            }
        }
        .build()
        return _notification!!
    }

private var _notification: ImageVector? = null
