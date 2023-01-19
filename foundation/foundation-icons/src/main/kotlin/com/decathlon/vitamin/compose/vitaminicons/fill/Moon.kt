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

public val FillGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5866f, 1.346f)
                curveTo(7.0953f, 1.8037f, 6.7013f, 2.3557f, 6.4281f, 2.969f)
                curveTo(6.1548f, 3.5824f, 6.0078f, 4.2444f, 5.996f, 4.9158f)
                curveTo(5.9841f, 5.5872f, 6.1076f, 6.254f, 6.3591f, 6.8766f)
                curveTo(6.6106f, 7.4992f, 6.9849f, 8.0647f, 7.4597f, 8.5395f)
                curveTo(7.9345f, 9.0143f, 8.5f, 9.3886f, 9.1226f, 9.6401f)
                curveTo(9.7452f, 9.8916f, 10.4121f, 10.0151f, 11.0834f, 10.0032f)
                curveTo(11.7548f, 9.9914f, 12.4168f, 9.8444f, 13.0302f, 9.5711f)
                curveTo(13.6435f, 9.2979f, 14.1955f, 8.9039f, 14.6533f, 8.4126f)
                curveTo(14.4413f, 11.9026f, 11.5439f, 14.6666f, 8.0006f, 14.6666f)
                curveTo(4.3179f, 14.6666f, 1.3333f, 11.6819f, 1.3333f, 7.9999f)
                curveTo(1.3333f, 4.4566f, 4.0972f, 1.5593f, 7.5866f, 1.346f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
