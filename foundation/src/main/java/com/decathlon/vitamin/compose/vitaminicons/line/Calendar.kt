package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 4.0f, 21.5196f, 4.1054f, 21.7071f, 4.2929f)
                curveTo(21.8946f, 4.4804f, 22.0f, 4.7348f, 22.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.2652f, 21.8946f, 21.5196f, 21.7071f, 21.7071f)
                curveTo(21.5196f, 21.8946f, 21.2652f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 22.0f, 2.4804f, 21.8946f, 2.2929f, 21.7071f)
                curveTo(2.1054f, 21.5196f, 2.0f, 21.2652f, 2.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 4.7348f, 2.1054f, 4.4804f, 2.2929f, 4.2929f)
                curveTo(2.4804f, 4.1054f, 2.7348f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(20.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
