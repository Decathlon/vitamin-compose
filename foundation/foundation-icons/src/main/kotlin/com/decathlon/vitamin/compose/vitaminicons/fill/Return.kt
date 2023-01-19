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

public val FillGroup.Return: ImageVector
    get() {
        if (_return != null) {
            return _return!!
        }
        _return = Builder(name = "Return", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9966f, 1.33f)
                curveTo(1.6285f, 1.33f, 1.3301f, 1.6284f, 1.3301f, 1.9965f)
                verticalLineTo(13.9935f)
                curveTo(1.3301f, 14.3616f, 1.6285f, 14.66f, 1.9966f, 14.66f)
                horizontalLineTo(13.9936f)
                curveTo(14.3617f, 14.66f, 14.6601f, 14.3616f, 14.6601f, 13.9935f)
                verticalLineTo(1.9965f)
                curveTo(14.6601f, 1.6284f, 14.3617f, 1.33f, 13.9936f, 1.33f)
                horizontalLineTo(1.9966f)
                close()
                moveTo(7.7999f, 4.4673f)
                lineTo(6.9381f, 5.329f)
                horizontalLineTo(8.6616f)
                curveTo(9.4716f, 5.329f, 10.303f, 5.6005f, 10.9401f, 6.1732f)
                curveTo(11.5889f, 6.7566f, 11.9941f, 7.6158f, 11.9941f, 8.6957f)
                curveTo(11.9941f, 9.7774f, 11.5871f, 10.6245f, 10.9305f, 11.1925f)
                curveTo(10.2887f, 11.7476f, 9.4584f, 11.994f, 8.6616f, 11.994f)
                horizontalLineTo(5.3291f)
                verticalLineTo(10.661f)
                horizontalLineTo(8.6616f)
                curveTo(9.1977f, 10.661f, 9.7004f, 10.4939f, 10.0584f, 10.1843f)
                curveTo(10.4015f, 9.8875f, 10.6611f, 9.4187f, 10.6611f, 8.6957f)
                curveTo(10.6611f, 7.9709f, 10.3998f, 7.48f, 10.0488f, 7.1645f)
                curveTo(9.6861f, 6.8383f, 9.1846f, 6.662f, 8.6616f, 6.662f)
                horizontalLineTo(6.9381f)
                lineTo(7.7999f, 7.5237f)
                lineTo(6.8573f, 8.4663f)
                lineTo(4.3865f, 5.9955f)
                lineTo(6.8573f, 3.5247f)
                lineTo(7.7999f, 4.4673f)
                close()
            }
        }
        .build()
        return _return!!
    }

private var _return: ImageVector? = null
