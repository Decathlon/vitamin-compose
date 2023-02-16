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

public val FillGroup.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3034f, 12.6667f)
                lineTo(1.3334f, 15.0f)
                verticalLineTo(2.6667f)
                curveTo(1.3334f, 2.4899f, 1.4036f, 2.3203f, 1.5286f, 2.1953f)
                curveTo(1.6537f, 2.0702f, 1.8232f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.1769f, 2.0f, 14.3464f, 2.0702f, 14.4714f, 2.1953f)
                curveTo(14.5965f, 2.3203f, 14.6667f, 2.4899f, 14.6667f, 2.6667f)
                verticalLineTo(12.0f)
                curveTo(14.6667f, 12.1768f, 14.5965f, 12.3464f, 14.4714f, 12.4714f)
                curveTo(14.3464f, 12.5964f, 14.1769f, 12.6667f, 14.0f, 12.6667f)
                horizontalLineTo(4.3034f)
                close()
                moveTo(4.6667f, 6.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.6667f)
                horizontalLineTo(4.6667f)
                close()
                moveTo(7.3334f, 6.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(6.6667f)
                horizontalLineTo(7.3334f)
                close()
                moveTo(10.0f, 6.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.3334f)
                verticalLineTo(6.6667f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
