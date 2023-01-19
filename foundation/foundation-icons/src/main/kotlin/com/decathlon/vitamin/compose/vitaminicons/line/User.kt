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

public val LineGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6699f, 15.3343f)
                curveTo(2.6699f, 13.9194f, 3.232f, 12.5624f, 4.2325f, 11.5619f)
                curveTo(5.233f, 10.5614f, 6.59f, 9.9993f, 8.0049f, 9.9993f)
                curveTo(9.4199f, 9.9993f, 10.7768f, 10.5614f, 11.7773f, 11.5619f)
                curveTo(12.7778f, 12.5624f, 13.3399f, 13.9194f, 13.3399f, 15.3343f)
                horizontalLineTo(12.0062f)
                curveTo(12.0062f, 14.2731f, 11.5846f, 13.2554f, 10.8342f, 12.505f)
                curveTo(10.0839f, 11.7546f, 9.0661f, 11.3331f, 8.0049f, 11.3331f)
                curveTo(6.9437f, 11.3331f, 5.926f, 11.7546f, 5.1756f, 12.505f)
                curveTo(4.4252f, 13.2554f, 4.0037f, 14.2731f, 4.0037f, 15.3343f)
                horizontalLineTo(2.6699f)
                close()
                moveTo(8.0049f, 9.3325f)
                curveTo(5.7942f, 9.3325f, 4.0037f, 7.5419f, 4.0037f, 5.3312f)
                curveTo(4.0037f, 3.1205f, 5.7942f, 1.33f, 8.0049f, 1.33f)
                curveTo(10.2156f, 1.33f, 12.0062f, 3.1205f, 12.0062f, 5.3312f)
                curveTo(12.0062f, 7.5419f, 10.2156f, 9.3325f, 8.0049f, 9.3325f)
                close()
                moveTo(8.0049f, 7.9987f)
                curveTo(9.4787f, 7.9987f, 10.6724f, 6.805f, 10.6724f, 5.3312f)
                curveTo(10.6724f, 3.8574f, 9.4787f, 2.6637f, 8.0049f, 2.6637f)
                curveTo(6.5311f, 2.6637f, 5.3374f, 3.8574f, 5.3374f, 5.3312f)
                curveTo(5.3374f, 6.805f, 6.5311f, 7.9987f, 8.0049f, 7.9987f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
