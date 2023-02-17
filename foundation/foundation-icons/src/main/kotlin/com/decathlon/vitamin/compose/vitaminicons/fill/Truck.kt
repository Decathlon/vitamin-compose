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

public val FillGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 12.056f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.965f)
                curveTo(20.8461f, 18.8343f, 20.4302f, 19.5977f, 19.7937f, 20.1499f)
                curveTo(19.1571f, 20.7022f, 18.3427f, 21.0063f, 17.5f, 21.0063f)
                curveTo(16.6573f, 21.0063f, 15.8429f, 20.7022f, 15.2063f, 20.1499f)
                curveTo(14.5698f, 19.5977f, 14.1539f, 18.8343f, 14.035f, 18.0f)
                horizontalLineTo(8.965f)
                curveTo(8.8461f, 18.8343f, 8.4302f, 19.5977f, 7.7937f, 20.1499f)
                curveTo(7.1571f, 20.7022f, 6.3427f, 21.0063f, 5.5f, 21.0063f)
                curveTo(4.6573f, 21.0063f, 3.8429f, 20.7022f, 3.2063f, 20.1499f)
                curveTo(2.5698f, 19.5977f, 2.1539f, 18.8343f, 2.035f, 18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.7348f, 1.1054f, 5.4804f, 1.2929f, 5.2929f)
                curveTo(1.4804f, 5.1054f, 1.7348f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.2652f, 5.0f, 16.5196f, 5.1054f, 16.7071f, 5.2929f)
                curveTo(16.8946f, 5.4804f, 17.0f, 5.7348f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.715f)
                lineTo(18.992f, 10.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
