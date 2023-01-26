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

public val FillGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.2652f, 4.8946f, 21.5196f, 4.7071f, 21.7071f)
                curveTo(4.5196f, 21.8946f, 4.2652f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 22.0f, 2.4804f, 21.8946f, 2.2929f, 21.7071f)
                curveTo(2.1054f, 21.5196f, 2.0f, 21.2652f, 2.0f, 21.0f)
                verticalLineTo(12.0f)
                lineTo(4.513f, 5.298f)
                curveTo(4.6559f, 4.9167f, 4.9119f, 4.5881f, 5.2466f, 4.3562f)
                curveTo(5.5813f, 4.1242f, 5.9788f, 3.9999f, 6.386f, 4.0f)
                horizontalLineTo(17.614f)
                curveTo(18.0212f, 3.9999f, 18.4187f, 4.1242f, 18.7534f, 4.3562f)
                curveTo(19.0881f, 4.5881f, 19.3441f, 4.9167f, 19.487f, 5.298f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.2652f, 21.8946f, 21.5196f, 21.7071f, 21.7071f)
                curveTo(21.5196f, 21.8946f, 21.2652f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.7348f, 22.0f, 19.4804f, 21.8946f, 19.2929f, 21.7071f)
                curveTo(19.1054f, 21.5196f, 19.0f, 21.2652f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.136f, 12.0f)
                horizontalLineTo(19.864f)
                lineTo(17.614f, 6.0f)
                horizontalLineTo(6.386f)
                lineTo(4.136f, 12.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(6.8978f, 17.0f, 7.2794f, 16.842f, 7.5607f, 16.5607f)
                curveTo(7.842f, 16.2794f, 8.0f, 15.8978f, 8.0f, 15.5f)
                curveTo(8.0f, 15.1022f, 7.842f, 14.7206f, 7.5607f, 14.4393f)
                curveTo(7.2794f, 14.158f, 6.8978f, 14.0f, 6.5f, 14.0f)
                curveTo(6.1022f, 14.0f, 5.7206f, 14.158f, 5.4393f, 14.4393f)
                curveTo(5.158f, 14.7206f, 5.0f, 15.1022f, 5.0f, 15.5f)
                curveTo(5.0f, 15.8978f, 5.158f, 16.2794f, 5.4393f, 16.5607f)
                curveTo(5.7206f, 16.842f, 6.1022f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(17.8978f, 17.0f, 18.2794f, 16.842f, 18.5607f, 16.5607f)
                curveTo(18.842f, 16.2794f, 19.0f, 15.8978f, 19.0f, 15.5f)
                curveTo(19.0f, 15.1022f, 18.842f, 14.7206f, 18.5607f, 14.4393f)
                curveTo(18.2794f, 14.158f, 17.8978f, 14.0f, 17.5f, 14.0f)
                curveTo(17.1022f, 14.0f, 16.7206f, 14.158f, 16.4393f, 14.4393f)
                curveTo(16.158f, 14.7206f, 16.0f, 15.1022f, 16.0f, 15.5f)
                curveTo(16.0f, 15.8978f, 16.158f, 16.2794f, 16.4393f, 16.5607f)
                curveTo(16.7206f, 16.842f, 17.1022f, 17.0f, 17.5f, 17.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
