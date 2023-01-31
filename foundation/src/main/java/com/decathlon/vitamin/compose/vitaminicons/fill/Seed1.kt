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

public val FillGroup.Seed1: ImageVector
    get() {
        if (_seed1 != null) {
            return _seed1!!
        }
        _seed1 = Builder(name = "Seed1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 11.09f, 14.09f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                lineTo(6.019f, 11.0f)
                curveTo(6.274f, 7.644f, 9.079f, 5.0f, 12.5f, 5.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _seed1!!
    }

private var _seed1: ImageVector? = null
