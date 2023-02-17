package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(13.535f)
                curveTo(10.4322f, 12.6298f, 8.4519f, 12.8905f, 7.1717f, 14.1705f)
                curveTo(5.8915f, 15.4505f, 5.6307f, 17.4308f, 6.5356f, 18.9987f)
                curveTo(7.4406f, 20.5666f, 9.2859f, 21.3312f, 11.0346f, 20.863f)
                curveTo(12.7833f, 20.3947f, 13.9996f, 18.8103f, 14.0f, 17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(12.0f, 18.1046f, 11.1045f, 19.0f, 10.0f, 19.0f)
                curveTo(8.8954f, 19.0f, 8.0f, 18.1046f, 8.0f, 17.0f)
                curveTo(8.0f, 15.8954f, 8.8954f, 15.0f, 10.0f, 15.0f)
                curveTo(11.1045f, 15.0f, 12.0f, 15.8954f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
