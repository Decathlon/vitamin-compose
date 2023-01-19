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

public val LineGroup.ListSettings: ImageVector
    get() {
        if (_listSettings != null) {
            return _listSettings!!
        }
        _listSettings = Builder(name = "ListSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3334f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.3334f)
                horizontalLineTo(1.3334f)
                verticalLineTo(12.0f)
                close()
                moveTo(1.3334f, 7.3334f)
                horizontalLineTo(7.3334f)
                verticalLineTo(8.6667f)
                horizontalLineTo(1.3334f)
                verticalLineTo(7.3334f)
                close()
                moveTo(1.3334f, 2.6667f)
                horizontalLineTo(14.6667f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(2.6667f)
                close()
                moveTo(13.7827f, 8.6833f)
                lineTo(14.5534f, 8.4227f)
                lineTo(15.22f, 9.5773f)
                lineTo(14.6094f, 10.114f)
                curveTo(14.6862f, 10.4785f, 14.6862f, 10.8549f, 14.6094f, 11.2194f)
                lineTo(15.22f, 11.756f)
                lineTo(14.5534f, 12.9107f)
                lineTo(13.7827f, 12.65f)
                curveTo(13.5094f, 12.8967f, 13.184f, 13.0867f, 12.826f, 13.2034f)
                lineTo(12.6667f, 14.0f)
                horizontalLineTo(11.3334f)
                lineTo(11.1734f, 13.2027f)
                curveTo(10.8195f, 13.0871f, 10.4939f, 12.8986f, 10.2174f, 12.6494f)
                lineTo(9.4467f, 12.9107f)
                lineTo(8.78f, 11.756f)
                lineTo(9.3907f, 11.2194f)
                curveTo(9.3138f, 10.8549f, 9.3138f, 10.4785f, 9.3907f, 10.114f)
                lineTo(8.78f, 9.5773f)
                lineTo(9.4467f, 8.4227f)
                lineTo(10.2174f, 8.6833f)
                curveTo(10.4907f, 8.4367f, 10.816f, 8.2467f, 11.174f, 8.13f)
                lineTo(11.3334f, 7.3334f)
                horizontalLineTo(12.6667f)
                lineTo(12.8267f, 8.1307f)
                curveTo(13.184f, 8.2467f, 13.5094f, 8.4374f, 13.7827f, 8.684f)
                verticalLineTo(8.6833f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(12.3537f, 12.0f, 12.6928f, 11.8595f, 12.9428f, 11.6095f)
                curveTo(13.1929f, 11.3594f, 13.3334f, 11.0203f, 13.3334f, 10.6667f)
                curveTo(13.3334f, 10.3131f, 13.1929f, 9.9739f, 12.9428f, 9.7239f)
                curveTo(12.6928f, 9.4738f, 12.3537f, 9.3334f, 12.0f, 9.3334f)
                curveTo(11.6464f, 9.3334f, 11.3073f, 9.4738f, 11.0572f, 9.7239f)
                curveTo(10.8072f, 9.9739f, 10.6667f, 10.3131f, 10.6667f, 10.6667f)
                curveTo(10.6667f, 11.0203f, 10.8072f, 11.3594f, 11.0572f, 11.6095f)
                curveTo(11.3073f, 11.8595f, 11.6464f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _listSettings!!
    }

private var _listSettings: ImageVector? = null
