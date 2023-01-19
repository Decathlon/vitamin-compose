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

public val LineGroup.Alert: ImageVector
    get() {
        if (_alert != null) {
            return _alert!!
        }
        _alert = Builder(name = "Alert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.612f, 13.3333f)
                lineTo(8.2613f, 2.3333f)
                curveTo(8.1422f, 2.127f, 7.9222f, 2.0f, 7.684f, 2.0f)
                curveTo(7.4458f, 2.0f, 7.2258f, 2.127f, 7.1067f, 2.3333f)
                lineTo(0.756f, 13.3333f)
                curveTo(0.6369f, 13.5396f, 0.6369f, 13.7937f, 0.756f, 14.0f)
                curveTo(0.8751f, 14.2062f, 1.0952f, 14.3333f, 1.3333f, 14.3333f)
                horizontalLineTo(14.0347f)
                curveTo(14.2728f, 14.3333f, 14.4929f, 14.2062f, 14.612f, 14.0f)
                curveTo(14.7311f, 13.7937f, 14.7311f, 13.5396f, 14.612f, 13.3333f)
                close()
                moveTo(12.88f, 13.0f)
                horizontalLineTo(2.488f)
                lineTo(7.684f, 4.0f)
                lineTo(12.88f, 13.0f)
                close()
                moveTo(7.0174f, 11.0f)
                horizontalLineTo(8.3507f)
                verticalLineTo(12.3333f)
                horizontalLineTo(7.0174f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.3507f, 6.3333f)
                horizontalLineTo(7.0174f)
                verticalLineTo(9.6666f)
                horizontalLineTo(8.3507f)
                verticalLineTo(6.3333f)
                close()
            }
        }
        .build()
        return _alert!!
    }

private var _alert: ImageVector? = null
