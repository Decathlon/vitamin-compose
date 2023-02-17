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

public val FillGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(10.4087f, 18.0f, 8.8826f, 17.3679f, 7.7574f, 16.2426f)
                curveTo(6.6321f, 15.1174f, 6.0f, 13.5913f, 6.0f, 12.0f)
                curveTo(6.0f, 10.4087f, 6.6321f, 8.8826f, 7.7574f, 7.7574f)
                curveTo(8.8826f, 6.6321f, 10.4087f, 6.0f, 12.0f, 6.0f)
                curveTo(13.5913f, 6.0f, 15.1174f, 6.6321f, 16.2426f, 7.7574f)
                curveTo(17.3679f, 8.8826f, 18.0f, 10.4087f, 18.0f, 12.0f)
                curveTo(18.0f, 13.5913f, 17.3679f, 15.1174f, 16.2426f, 16.2426f)
                curveTo(15.1174f, 17.3679f, 13.5913f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(3.515f, 4.929f)
                lineTo(4.929f, 3.515f)
                lineTo(7.05f, 5.636f)
                lineTo(5.636f, 7.05f)
                lineTo(3.515f, 4.93f)
                verticalLineTo(4.929f)
                close()
                moveTo(16.95f, 18.364f)
                lineTo(18.364f, 16.95f)
                lineTo(20.485f, 19.071f)
                lineTo(19.071f, 20.485f)
                lineTo(16.95f, 18.364f)
                close()
                moveTo(19.071f, 3.514f)
                lineTo(20.485f, 4.929f)
                lineTo(18.364f, 7.05f)
                lineTo(16.95f, 5.636f)
                lineTo(19.071f, 3.515f)
                verticalLineTo(3.514f)
                close()
                moveTo(5.636f, 16.95f)
                lineTo(7.05f, 18.364f)
                lineTo(4.929f, 20.485f)
                lineTo(3.515f, 19.071f)
                lineTo(5.636f, 16.95f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
