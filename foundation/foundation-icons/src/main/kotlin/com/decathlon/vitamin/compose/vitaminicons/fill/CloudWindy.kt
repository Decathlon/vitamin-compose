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

public val FillGroup.CloudWindy: ImageVector
    get() {
        if (_cloudWindy != null) {
            return _cloudWindy!!
        }
        _cloudWindy = Builder(name = "CloudWindy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3333f, 12.0f)
                verticalLineTo(9.3379f)
                horizontalLineTo(1.3826f)
                curveTo(0.8915f, 8.0848f, 0.8924f, 6.6922f, 1.3851f, 5.4396f)
                curveTo(1.8778f, 4.187f, 2.8259f, 3.1671f, 4.0392f, 2.5844f)
                curveTo(5.2525f, 2.0016f, 6.6413f, 1.8992f, 7.927f, 2.2976f)
                curveTo(9.2126f, 2.696f, 10.3001f, 3.5659f, 10.9713f, 4.7326f)
                curveTo(11.4728f, 4.6361f, 11.989f, 4.6455f, 12.4867f, 4.7601f)
                curveTo(12.9844f, 4.8748f, 13.4526f, 5.0921f, 13.8615f, 5.3982f)
                curveTo(14.2703f, 5.7043f, 14.6107f, 6.0924f, 14.8608f, 6.5377f)
                curveTo(15.1109f, 6.983f, 15.2652f, 7.4756f, 15.3138f, 7.9841f)
                curveTo(15.3625f, 8.4925f, 15.3044f, 9.0054f, 15.1432f, 9.4901f)
                curveTo(14.9821f, 9.9747f, 14.7215f, 10.4203f, 14.3781f, 10.7984f)
                curveTo(14.0348f, 11.1765f, 13.6162f, 11.4787f, 13.1493f, 11.6856f)
                curveTo(12.6823f, 11.8925f, 12.1773f, 11.9996f, 11.6666f, 12.0f)
                horizontalLineTo(9.3339f)
                horizontalLineTo(9.3333f)
                close()
                moveTo(3.9999f, 13.3333f)
                horizontalLineTo(10.6666f)
                verticalLineTo(14.6666f)
                horizontalLineTo(3.9999f)
                verticalLineTo(13.3333f)
                close()
                moveTo(1.3333f, 10.6666f)
                horizontalLineTo(7.9999f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.3333f)
                verticalLineTo(10.6666f)
                close()
            }
        }
        .build()
        return _cloudWindy!!
    }

private var _cloudWindy: ImageVector? = null
