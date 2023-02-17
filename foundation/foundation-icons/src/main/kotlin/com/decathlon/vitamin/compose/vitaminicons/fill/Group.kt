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

public val FillGroup.Group: ImageVector
    get() {
        if (_group != null) {
            return _group!!
        }
        _group = Builder(name = "Group", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 19.8783f, 2.8428f, 17.8434f, 4.3432f, 16.3431f)
                curveTo(5.8434f, 14.8429f, 7.8783f, 14.0f, 10.0f, 14.0f)
                curveTo(12.1217f, 14.0f, 14.1566f, 14.8429f, 15.6569f, 16.3431f)
                curveTo(17.1571f, 17.8434f, 18.0f, 19.8783f, 18.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(17.363f, 15.233f)
                curveTo(18.8926f, 15.6261f, 20.2593f, 16.4918f, 21.2683f, 17.7068f)
                curveTo(22.2774f, 18.9218f, 22.8774f, 20.4242f, 22.983f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 19.39f, 19.0f, 17.014f, 17.363f, 15.233f)
                close()
                moveTo(15.34f, 12.957f)
                curveTo(16.178f, 12.2075f, 16.8482f, 11.2893f, 17.3066f, 10.2627f)
                curveTo(17.765f, 9.2362f, 18.0013f, 8.1243f, 18.0f, 7.0f)
                curveTo(18.0021f, 5.6335f, 17.6526f, 4.2894f, 16.985f, 3.097f)
                curveTo(18.1176f, 3.3246f, 19.1365f, 3.9374f, 19.8685f, 4.8312f)
                curveTo(20.6004f, 5.725f, 21.0002f, 6.8447f, 21.0f, 8.0f)
                curveTo(21.0003f, 8.7125f, 20.8482f, 9.4168f, 20.5541f, 10.0657f)
                curveTo(20.26f, 10.7146f, 19.8305f, 11.2931f, 19.2946f, 11.7625f)
                curveTo(18.7586f, 12.2319f, 18.1285f, 12.5814f, 17.4464f, 12.7874f)
                curveTo(16.7644f, 12.9934f, 16.0462f, 13.0512f, 15.34f, 12.957f)
                close()
            }
        }
        .build()
        return _group!!
    }

private var _group: ImageVector? = null
