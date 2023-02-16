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

public val FillGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6668f, 11.3334f)
                horizontalLineTo(11.3335f)
                verticalLineTo(14.6667f)
                horizontalLineTo(4.6668f)
                verticalLineTo(11.3334f)
                close()
                moveTo(12.6668f, 13.3334f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.3335f)
                verticalLineTo(13.3334f)
                horizontalLineTo(2.0002f)
                curveTo(1.8233f, 13.3334f, 1.6538f, 13.2631f, 1.5288f, 13.1381f)
                curveTo(1.4037f, 13.0131f, 1.3335f, 12.8435f, 1.3335f, 12.6667f)
                verticalLineTo(6.0f)
                curveTo(1.3335f, 5.8232f, 1.4037f, 5.6537f, 1.5288f, 5.5286f)
                curveTo(1.6538f, 5.4036f, 1.8233f, 5.3334f, 2.0002f, 5.3334f)
                horizontalLineTo(14.0002f)
                curveTo(14.177f, 5.3334f, 14.3465f, 5.4036f, 14.4716f, 5.5286f)
                curveTo(14.5966f, 5.6537f, 14.6668f, 5.8232f, 14.6668f, 6.0f)
                verticalLineTo(12.6667f)
                curveTo(14.6668f, 12.8435f, 14.5966f, 13.0131f, 14.4716f, 13.1381f)
                curveTo(14.3465f, 13.2631f, 14.177f, 13.3334f, 14.0002f, 13.3334f)
                horizontalLineTo(12.6668f)
                close()
                moveTo(3.3335f, 6.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.3335f)
                verticalLineTo(6.6667f)
                horizontalLineTo(3.3335f)
                close()
                moveTo(4.6668f, 1.3334f)
                horizontalLineTo(11.3335f)
                curveTo(11.5103f, 1.3334f, 11.6799f, 1.4036f, 11.8049f, 1.5286f)
                curveTo(11.9299f, 1.6537f, 12.0002f, 1.8232f, 12.0002f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0002f)
                verticalLineTo(2.0f)
                curveTo(4.0002f, 1.8232f, 4.0704f, 1.6537f, 4.1954f, 1.5286f)
                curveTo(4.3204f, 1.4036f, 4.49f, 1.3334f, 4.6668f, 1.3334f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
