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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 23.0f)
                curveTo(4.0f, 20.8783f, 4.8429f, 18.8434f, 6.3432f, 17.3431f)
                curveTo(7.8434f, 15.8429f, 9.8783f, 15.0f, 12.0f, 15.0f)
                curveTo(14.1217f, 15.0f, 16.1566f, 15.8429f, 17.6569f, 17.3431f)
                curveTo(19.1571f, 18.8434f, 20.0f, 20.8783f, 20.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 21.4087f, 17.3679f, 19.8826f, 16.2426f, 18.7574f)
                curveTo(15.1174f, 17.6321f, 13.5913f, 17.0f, 12.0f, 17.0f)
                curveTo(10.4087f, 17.0f, 8.8826f, 17.6321f, 7.7574f, 18.7574f)
                curveTo(6.6321f, 19.8826f, 6.0f, 21.4087f, 6.0f, 23.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(8.685f, 14.0f, 6.0f, 11.315f, 6.0f, 8.0f)
                curveTo(6.0f, 4.685f, 8.685f, 2.0f, 12.0f, 2.0f)
                curveTo(15.315f, 2.0f, 18.0f, 4.685f, 18.0f, 8.0f)
                curveTo(18.0f, 11.315f, 15.315f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(14.21f, 12.0f, 16.0f, 10.21f, 16.0f, 8.0f)
                curveTo(16.0f, 5.79f, 14.21f, 4.0f, 12.0f, 4.0f)
                curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f)
                curveTo(8.0f, 10.21f, 9.79f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
