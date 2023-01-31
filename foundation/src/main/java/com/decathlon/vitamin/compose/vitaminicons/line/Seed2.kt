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

public val LineGroup.Seed2: ImageVector
    get() {
        if (_seed2 != null) {
            return _seed2!!
        }
        _seed2 = Builder(name = "Seed2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(9.49f, 3.0f, 12.383f, 5.554f, 12.913f, 8.895f)
                curveTo(14.088f, 7.724f, 15.71f, 7.0f, 17.5f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.5f)
                curveTo(22.0f, 13.09f, 19.09f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                curveTo(5.134f, 13.0f, 2.0f, 9.866f, 2.0f, 6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(15.015f, 9.0f, 13.0f, 11.015f, 13.0f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 14.0f, 20.0f, 11.985f, 20.0f, 9.5f)
                verticalLineTo(9.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 8.761f, 6.239f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 7.239f, 8.761f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _seed2!!
    }

private var _seed2: ImageVector? = null
