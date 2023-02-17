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

public val FillGroup.Music2: ImageVector
    get() {
        if (_music2 != null) {
            return _music2!!
        }
        _music2 = Builder(name = "Music2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(19.9996f, 18.8103f, 18.7833f, 20.3947f, 17.0346f, 20.863f)
                curveTo(15.2859f, 21.3312f, 13.4406f, 20.5666f, 12.5356f, 18.9987f)
                curveTo(11.6307f, 17.4308f, 11.8915f, 15.4505f, 13.1717f, 14.1705f)
                curveTo(14.4519f, 12.8905f, 16.4322f, 12.6298f, 18.0f, 13.535f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                curveTo(8.9996f, 18.8103f, 7.7833f, 20.3947f, 6.0346f, 20.863f)
                curveTo(4.2859f, 21.3312f, 2.4406f, 20.5666f, 1.5357f, 18.9987f)
                curveTo(0.6307f, 17.4308f, 0.8915f, 15.4505f, 2.1717f, 14.1705f)
                curveTo(3.4519f, 12.8905f, 5.4322f, 12.6298f, 7.0f, 13.535f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _music2!!
    }

private var _music2: ImageVector? = null
