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

public val LineGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 19.0f, 2.4804f, 18.8946f, 2.2929f, 18.7071f)
                curveTo(2.1054f, 18.5196f, 2.0f, 18.2652f, 2.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 7.7348f, 2.1054f, 7.4804f, 2.2929f, 7.2929f)
                curveTo(2.4804f, 7.1054f, 2.7348f, 7.0f, 3.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                curveTo(6.0f, 2.7348f, 6.1054f, 2.4804f, 6.2929f, 2.2929f)
                curveTo(6.4804f, 2.1054f, 6.7348f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.2652f, 2.0f, 17.5196f, 2.1054f, 17.7071f, 2.2929f)
                curveTo(17.8946f, 2.4804f, 18.0f, 2.7348f, 18.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 7.0f, 21.5196f, 7.1054f, 21.7071f, 7.2929f)
                curveTo(21.8946f, 7.4804f, 22.0f, 7.7348f, 22.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.2652f, 21.8946f, 18.5196f, 21.7071f, 18.7071f)
                curveTo(21.5196f, 18.8946f, 21.2652f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                curveTo(18.0f, 21.2652f, 17.8946f, 21.5196f, 17.7071f, 21.7071f)
                curveTo(17.5196f, 21.8946f, 17.2652f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7348f, 22.0f, 6.4804f, 21.8946f, 6.2929f, 21.7071f)
                curveTo(6.1054f, 21.5196f, 6.0f, 21.2652f, 6.0f, 21.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 15.7348f, 6.1054f, 15.4804f, 6.2929f, 15.2929f)
                curveTo(6.4804f, 15.1054f, 6.7348f, 15.0f, 7.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(17.2652f, 15.0f, 17.5196f, 15.1054f, 17.7071f, 15.2929f)
                curveTo(17.8946f, 15.4804f, 18.0f, 15.7348f, 18.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
