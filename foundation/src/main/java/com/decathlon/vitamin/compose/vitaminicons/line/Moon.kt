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

public val LineGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                curveTo(9.9998f, 8.3906f, 10.4138f, 9.7498f, 11.1892f, 10.9042f)
                curveTo(11.9646f, 12.0586f, 13.0663f, 12.9559f, 14.3538f, 13.4816f)
                curveTo(15.6412f, 14.0073f, 17.0561f, 14.1376f, 18.4179f, 13.8559f)
                curveTo(19.7797f, 13.5742f, 21.0268f, 12.8933f, 22.0f, 11.9f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(12.1f)
                curveTo(11.434f, 2.6511f, 10.9051f, 3.429f, 10.5445f, 4.2877f)
                curveTo(10.1838f, 5.1464f, 9.9987f, 6.0686f, 10.0f, 7.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(3.9993f, 13.785f, 4.5955f, 15.5189f, 5.6939f, 16.926f)
                curveTo(6.7923f, 18.333f, 8.3296f, 19.3323f, 10.0614f, 19.7648f)
                curveTo(11.7932f, 20.1974f, 13.6199f, 20.0383f, 15.2508f, 19.313f)
                curveTo(16.8818f, 18.5876f, 18.2233f, 17.3377f, 19.062f, 15.762f)
                curveTo(17.5694f, 16.1136f, 16.0118f, 16.0781f, 14.5368f, 15.6587f)
                curveTo(13.0619f, 15.2394f, 11.7185f, 14.4501f, 10.6342f, 13.3658f)
                curveTo(9.5499f, 12.2815f, 8.7606f, 10.9381f, 8.3413f, 9.4632f)
                curveTo(7.9219f, 7.9882f, 7.8864f, 6.4306f, 8.238f, 4.938f)
                curveTo(6.9576f, 5.6201f, 5.8868f, 6.6377f, 5.1403f, 7.8816f)
                curveTo(4.3937f, 9.1256f, 3.9996f, 10.5492f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
