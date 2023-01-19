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

public val FillGroup.Alert: ImageVector
    get() {
        if (_alert != null) {
            return _alert!!
        }
        _alert = Builder(name = "Alert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2647f, 2.3333f)
                lineTo(14.6154f, 13.3333f)
                curveTo(14.6739f, 13.4346f, 14.7047f, 13.5496f, 14.7047f, 13.6666f)
                curveTo(14.7047f, 13.7837f, 14.6739f, 13.8986f, 14.6154f, 14.0f)
                curveTo(14.5569f, 14.1013f, 14.4727f, 14.1855f, 14.3714f, 14.244f)
                curveTo(14.27f, 14.3025f, 14.155f, 14.3333f, 14.038f, 14.3333f)
                horizontalLineTo(1.3367f)
                curveTo(1.2197f, 14.3333f, 1.1047f, 14.3025f, 1.0034f, 14.244f)
                curveTo(0.902f, 14.1855f, 0.8179f, 14.1013f, 0.7594f, 14.0f)
                curveTo(0.7008f, 13.8986f, 0.67f, 13.7837f, 0.67f, 13.6666f)
                curveTo(0.67f, 13.5496f, 0.7008f, 13.4346f, 0.7594f, 13.3333f)
                lineTo(7.11f, 2.3333f)
                curveTo(7.1685f, 2.232f, 7.2527f, 2.1478f, 7.354f, 2.0893f)
                curveTo(7.4554f, 2.0308f, 7.5703f, 2.0f, 7.6874f, 2.0f)
                curveTo(7.8044f, 2.0f, 7.9193f, 2.0308f, 8.0207f, 2.0893f)
                curveTo(8.122f, 2.1478f, 8.2062f, 2.232f, 8.2647f, 2.3333f)
                close()
                moveTo(7.0207f, 11.0f)
                verticalLineTo(12.3333f)
                horizontalLineTo(8.354f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0207f)
                close()
                moveTo(7.0207f, 6.3333f)
                verticalLineTo(9.6666f)
                horizontalLineTo(8.354f)
                verticalLineTo(6.3333f)
                horizontalLineTo(7.0207f)
                close()
            }
        }
        .build()
        return _alert!!
    }

private var _alert: ImageVector? = null
