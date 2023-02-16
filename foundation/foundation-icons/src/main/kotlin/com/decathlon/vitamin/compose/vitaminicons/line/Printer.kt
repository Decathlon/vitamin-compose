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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0002f, 12.6667f)
                horizontalLineTo(2.0002f)
                curveTo(1.8233f, 12.6667f, 1.6538f, 12.5965f, 1.5288f, 12.4714f)
                curveTo(1.4037f, 12.3464f, 1.3335f, 12.1769f, 1.3335f, 12.0f)
                verticalLineTo(5.3334f)
                curveTo(1.3335f, 5.1566f, 1.4037f, 4.987f, 1.5288f, 4.862f)
                curveTo(1.6538f, 4.7369f, 1.8233f, 4.6667f, 2.0002f, 4.6667f)
                horizontalLineTo(4.0002f)
                verticalLineTo(2.0f)
                curveTo(4.0002f, 1.8232f, 4.0704f, 1.6537f, 4.1954f, 1.5286f)
                curveTo(4.3204f, 1.4036f, 4.49f, 1.3334f, 4.6668f, 1.3334f)
                horizontalLineTo(11.3335f)
                curveTo(11.5103f, 1.3334f, 11.6799f, 1.4036f, 11.8049f, 1.5286f)
                curveTo(11.9299f, 1.6537f, 12.0002f, 1.8232f, 12.0002f, 2.0f)
                verticalLineTo(4.6667f)
                horizontalLineTo(14.0002f)
                curveTo(14.177f, 4.6667f, 14.3465f, 4.7369f, 14.4716f, 4.862f)
                curveTo(14.5966f, 4.987f, 14.6668f, 5.1566f, 14.6668f, 5.3334f)
                verticalLineTo(12.0f)
                curveTo(14.6668f, 12.1769f, 14.5966f, 12.3464f, 14.4716f, 12.4714f)
                curveTo(14.3465f, 12.5965f, 14.177f, 12.6667f, 14.0002f, 12.6667f)
                horizontalLineTo(12.0002f)
                verticalLineTo(14.0f)
                curveTo(12.0002f, 14.1769f, 11.9299f, 14.3464f, 11.8049f, 14.4714f)
                curveTo(11.6799f, 14.5965f, 11.5103f, 14.6667f, 11.3335f, 14.6667f)
                horizontalLineTo(4.6668f)
                curveTo(4.49f, 14.6667f, 4.3204f, 14.5965f, 4.1954f, 14.4714f)
                curveTo(4.0704f, 14.3464f, 4.0002f, 14.1769f, 4.0002f, 14.0f)
                verticalLineTo(12.6667f)
                close()
                moveTo(4.0002f, 11.3334f)
                verticalLineTo(10.6667f)
                curveTo(4.0002f, 10.4899f, 4.0704f, 10.3203f, 4.1954f, 10.1953f)
                curveTo(4.3204f, 10.0703f, 4.49f, 10.0f, 4.6668f, 10.0f)
                horizontalLineTo(11.3335f)
                curveTo(11.5103f, 10.0f, 11.6799f, 10.0703f, 11.8049f, 10.1953f)
                curveTo(11.9299f, 10.3203f, 12.0002f, 10.4899f, 12.0002f, 10.6667f)
                verticalLineTo(11.3334f)
                horizontalLineTo(13.3335f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.6668f)
                verticalLineTo(11.3334f)
                horizontalLineTo(4.0002f)
                close()
                moveTo(5.3335f, 2.6667f)
                verticalLineTo(4.6667f)
                horizontalLineTo(10.6668f)
                verticalLineTo(2.6667f)
                horizontalLineTo(5.3335f)
                close()
                moveTo(5.3335f, 11.3334f)
                verticalLineTo(13.3334f)
                horizontalLineTo(10.6668f)
                verticalLineTo(11.3334f)
                horizontalLineTo(5.3335f)
                close()
                moveTo(3.3335f, 6.6667f)
                horizontalLineTo(5.3335f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.3335f)
                verticalLineTo(6.6667f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
