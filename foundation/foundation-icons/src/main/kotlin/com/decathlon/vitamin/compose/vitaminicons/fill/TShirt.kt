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

public val FillGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveTo(14.3682f, 2.0f, 14.6667f, 2.2985f, 14.6667f, 2.6667f)
                verticalLineTo(7.3333f)
                curveTo(14.6667f, 7.7015f, 14.3682f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(12.666f)
                lineTo(12.6667f, 13.3333f)
                curveTo(12.6667f, 13.7015f, 12.3682f, 14.0f, 12.0f, 14.0f)
                horizontalLineTo(4.0f)
                curveTo(3.6319f, 14.0f, 3.3334f, 13.7015f, 3.3334f, 13.3333f)
                lineTo(3.3327f, 7.9993f)
                lineTo(2.0f, 8.0f)
                curveTo(1.6319f, 8.0f, 1.3334f, 7.7015f, 1.3334f, 7.3333f)
                verticalLineTo(2.6667f)
                curveTo(1.3334f, 2.2985f, 1.6319f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 3.1046f, 6.8955f, 4.0f, 8.0f, 4.0f)
                curveTo(9.1046f, 4.0f, 10.0f, 3.1046f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
