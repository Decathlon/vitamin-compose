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

public val LineGroup.Seed1: ImageVector
    get() {
        if (_seed1 != null) {
            return _seed1!!
        }
        _seed1 = Builder(name = "Seed1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 7.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.5f)
                curveTo(9.0791f, 5.0f, 6.2739f, 7.644f, 6.019f, 11.0f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.5f)
                curveTo(14.0898f, 14.0f, 17.0f, 11.09f, 17.0f, 7.5f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineTo(12.5f)
                curveTo(10.0151f, 7.0f, 8.0f, 9.015f, 8.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.5f)
                curveTo(12.9849f, 12.0f, 15.0f, 9.985f, 15.0f, 7.5f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _seed1!!
    }

private var _seed1: ImageVector? = null
