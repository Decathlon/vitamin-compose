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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3334f, 2.0f)
                verticalLineTo(11.3333f)
                curveTo(13.3331f, 12.5402f, 12.5223f, 13.5965f, 11.3564f, 13.9087f)
                curveTo(10.1906f, 14.2208f, 8.9605f, 13.7111f, 8.3571f, 12.6658f)
                curveTo(7.7538f, 11.6205f, 7.9277f, 10.3004f, 8.7812f, 9.447f)
                curveTo(9.6346f, 8.5937f, 10.9548f, 8.4199f, 12.0f, 9.0233f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.3333f)
                curveTo(5.9998f, 12.5402f, 5.1889f, 13.5965f, 4.0231f, 13.9087f)
                curveTo(2.8573f, 14.2208f, 1.6271f, 13.7111f, 1.0238f, 12.6658f)
                curveTo(0.4205f, 11.6205f, 0.5944f, 10.3004f, 1.4478f, 9.447f)
                curveTo(2.3013f, 8.5937f, 3.6215f, 8.4199f, 4.6667f, 9.0233f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.3334f)
                close()
            }
        }
        .build()
        return _music2!!
    }

private var _music2: ImageVector? = null
