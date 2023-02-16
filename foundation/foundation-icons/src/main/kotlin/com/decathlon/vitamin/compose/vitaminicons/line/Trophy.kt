package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5698f, 11.292f)
                verticalLineTo(12.6667f)
                horizontalLineTo(11.4186f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.5814f)
                verticalLineTo(12.6667f)
                horizontalLineTo(7.4302f)
                verticalLineTo(11.292f)
                curveTo(6.3287f, 11.1295f, 5.3157f, 10.5022f, 4.5814f, 9.5278f)
                curveTo(3.8471f, 8.5535f, 3.4419f, 7.2991f, 3.4419f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.5581f)
                verticalLineTo(6.0f)
                curveTo(12.5581f, 7.2991f, 12.1529f, 8.5535f, 11.4186f, 9.5278f)
                curveTo(10.6843f, 10.5022f, 9.6713f, 11.1295f, 8.5698f, 11.292f)
                close()
                moveTo(4.5814f, 3.3333f)
                verticalLineTo(6.0f)
                curveTo(4.5814f, 7.0609f, 4.9416f, 8.0783f, 5.5827f, 8.8284f)
                curveTo(6.2238f, 9.5786f, 7.0933f, 10.0f, 8.0f, 10.0f)
                curveTo(8.9067f, 10.0f, 9.7762f, 9.5786f, 10.4173f, 8.8284f)
                curveTo(11.0584f, 8.0783f, 11.4186f, 7.0609f, 11.4186f, 6.0f)
                verticalLineTo(3.3333f)
                horizontalLineTo(4.5814f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 3.5f)
                horizontalLineTo(2.7902f)
                lineTo(2.7907f, 4.5f)
                horizontalLineTo(1.993f)
                curveTo(2.0456f, 5.2658f, 2.2167f, 5.6938f, 2.3739f, 5.9186f)
                curveTo(2.5547f, 6.1772f, 2.71f, 6.1677f, 2.7218f, 6.166f)
                lineTo(2.8596f, 7.156f)
                curveTo(2.4372f, 7.2177f, 1.9414f, 7.0181f, 1.5796f, 6.5006f)
                curveTo(1.2255f, 5.9941f, 1.0f, 5.1941f, 1.0f, 4.0f)
                verticalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 3.5f)
                horizontalLineTo(13.2098f)
                lineTo(13.2093f, 4.5f)
                horizontalLineTo(14.007f)
                curveTo(13.9544f, 5.2658f, 13.7833f, 5.6938f, 13.6261f, 5.9186f)
                curveTo(13.4453f, 6.1772f, 13.29f, 6.1677f, 13.2782f, 6.166f)
                lineTo(13.1404f, 7.156f)
                curveTo(13.5627f, 7.2177f, 14.0586f, 7.0181f, 14.4204f, 6.5006f)
                curveTo(14.7745f, 5.9941f, 15.0f, 5.1941f, 15.0f, 4.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
