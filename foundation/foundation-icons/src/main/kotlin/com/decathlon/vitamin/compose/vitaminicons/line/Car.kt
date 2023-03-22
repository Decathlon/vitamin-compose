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

public val LineGroup.Car: ImageVector
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
                verticalLineTo(11.0f)
                lineTo(4.48f, 5.212f)
                curveTo(4.6343f, 4.852f, 4.891f, 4.5452f, 5.2181f, 4.3298f)
                curveTo(5.5451f, 4.1143f, 5.9283f, 3.9997f, 6.32f, 4.0f)
                horizontalLineTo(17.68f)
                curveTo(18.0713f, 4.0f, 18.4541f, 4.1149f, 18.7808f, 4.3303f)
                curveTo(19.1075f, 4.5458f, 19.3638f, 4.8523f, 19.518f, 5.212f)
                lineTo(22.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.2652f, 21.8946f, 21.5196f, 21.7071f, 21.7071f)
                curveTo(21.5196f, 21.8946f, 21.2652f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.7348f, 22.0f, 19.4804f, 21.8946f, 19.2929f, 21.7071f)
                curveTo(19.1054f, 21.5196f, 19.0f, 21.2652f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(4.176f, 11.0f)
                horizontalLineTo(19.824f)
                lineTo(17.681f, 6.0f)
                horizontalLineTo(6.32f)
                lineTo(4.177f, 11.0f)
                horizontalLineTo(4.176f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(6.1022f, 17.0f, 5.7206f, 16.842f, 5.4393f, 16.5607f)
                curveTo(5.158f, 16.2794f, 5.0f, 15.8978f, 5.0f, 15.5f)
                curveTo(5.0f, 15.1022f, 5.158f, 14.7206f, 5.4393f, 14.4393f)
                curveTo(5.7206f, 14.158f, 6.1022f, 14.0f, 6.5f, 14.0f)
                curveTo(6.8978f, 14.0f, 7.2794f, 14.158f, 7.5607f, 14.4393f)
                curveTo(7.842f, 14.7206f, 8.0f, 15.1022f, 8.0f, 15.5f)
                curveTo(8.0f, 15.8978f, 7.842f, 16.2794f, 7.5607f, 16.5607f)
                curveTo(7.2794f, 16.842f, 6.8978f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(17.1022f, 17.0f, 16.7206f, 16.842f, 16.4393f, 16.5607f)
                curveTo(16.158f, 16.2794f, 16.0f, 15.8978f, 16.0f, 15.5f)
                curveTo(16.0f, 15.1022f, 16.158f, 14.7206f, 16.4393f, 14.4393f)
                curveTo(16.7206f, 14.158f, 17.1022f, 14.0f, 17.5f, 14.0f)
                curveTo(17.8978f, 14.0f, 18.2794f, 14.158f, 18.5607f, 14.4393f)
                curveTo(18.842f, 14.7206f, 19.0f, 15.1022f, 19.0f, 15.5f)
                curveTo(19.0f, 15.8978f, 18.842f, 16.2794f, 18.5607f, 16.5607f)
                curveTo(18.2794f, 16.842f, 17.8978f, 17.0f, 17.5f, 17.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
