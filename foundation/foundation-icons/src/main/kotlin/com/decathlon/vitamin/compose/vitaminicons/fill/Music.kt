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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9999f, 9.0233f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.3333f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.3333f)
                verticalLineTo(11.3333f)
                curveTo(9.333f, 12.5402f, 8.5222f, 13.5965f, 7.3564f, 13.9087f)
                curveTo(6.1905f, 14.2208f, 4.9604f, 13.7111f, 4.3571f, 12.6658f)
                curveTo(3.7537f, 11.6205f, 3.9276f, 10.3004f, 4.7811f, 9.447f)
                curveTo(5.6345f, 8.5937f, 6.9547f, 8.4199f, 7.9999f, 9.0233f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
