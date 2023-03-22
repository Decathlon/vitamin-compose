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

public val FillGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.535f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                curveTo(13.9996f, 18.8103f, 12.7833f, 20.3947f, 11.0346f, 20.863f)
                curveTo(9.2859f, 21.3312f, 7.4406f, 20.5666f, 6.5356f, 18.9987f)
                curveTo(5.6307f, 17.4308f, 5.8915f, 15.4505f, 7.1717f, 14.1705f)
                curveTo(8.4519f, 12.8905f, 10.4322f, 12.6298f, 12.0f, 13.535f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
