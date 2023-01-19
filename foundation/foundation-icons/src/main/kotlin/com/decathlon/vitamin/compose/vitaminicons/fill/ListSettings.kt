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

public val FillGroup.ListSettings: ImageVector
    get() {
        if (_listSettings != null) {
            return _listSettings!!
        }
        _listSettings = Builder(name = "ListSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3333f, 12.0f)
                horizontalLineTo(5.9999f)
                verticalLineTo(13.3334f)
                horizontalLineTo(1.3333f)
                verticalLineTo(12.0f)
                close()
                moveTo(1.3333f, 7.3334f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6667f)
                horizontalLineTo(1.3333f)
                verticalLineTo(7.3334f)
                close()
                moveTo(1.3333f, 2.6667f)
                horizontalLineTo(14.6666f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.3333f)
                verticalLineTo(2.6667f)
                close()
                moveTo(13.7826f, 8.6833f)
                lineTo(14.5533f, 8.4227f)
                lineTo(15.2199f, 9.5773f)
                lineTo(14.6093f, 10.114f)
                curveTo(14.6861f, 10.4785f, 14.6861f, 10.8549f, 14.6093f, 11.2194f)
                lineTo(15.2199f, 11.756f)
                lineTo(14.5533f, 12.9107f)
                lineTo(13.7826f, 12.65f)
                curveTo(13.5093f, 12.8967f, 13.1839f, 13.0867f, 12.8259f, 13.2034f)
                lineTo(12.6666f, 14.0f)
                horizontalLineTo(11.3333f)
                lineTo(11.1733f, 13.2027f)
                curveTo(10.8194f, 13.0871f, 10.4938f, 12.8986f, 10.2173f, 12.6494f)
                lineTo(9.4466f, 12.9107f)
                lineTo(8.7799f, 11.756f)
                lineTo(9.3906f, 11.2194f)
                curveTo(9.3137f, 10.8549f, 9.3137f, 10.4785f, 9.3906f, 10.114f)
                lineTo(8.7799f, 9.5773f)
                lineTo(9.4466f, 8.4227f)
                lineTo(10.2173f, 8.6833f)
                curveTo(10.4906f, 8.4367f, 10.8159f, 8.2467f, 11.1739f, 8.13f)
                lineTo(11.3333f, 7.3334f)
                horizontalLineTo(12.6666f)
                lineTo(12.8266f, 8.1307f)
                curveTo(13.1839f, 8.2467f, 13.5093f, 8.4374f, 13.7826f, 8.684f)
                verticalLineTo(8.6833f)
                close()
                moveTo(11.9999f, 11.3334f)
                curveTo(12.1767f, 11.3334f, 12.3463f, 11.2631f, 12.4713f, 11.1381f)
                curveTo(12.5963f, 11.0131f, 12.6666f, 10.8435f, 12.6666f, 10.6667f)
                curveTo(12.6666f, 10.4899f, 12.5963f, 10.3203f, 12.4713f, 10.1953f)
                curveTo(12.3463f, 10.0703f, 12.1767f, 10.0f, 11.9999f, 10.0f)
                curveTo(11.8231f, 10.0f, 11.6535f, 10.0703f, 11.5285f, 10.1953f)
                curveTo(11.4035f, 10.3203f, 11.3333f, 10.4899f, 11.3333f, 10.6667f)
                curveTo(11.3333f, 10.8435f, 11.4035f, 11.0131f, 11.5285f, 11.1381f)
                curveTo(11.6535f, 11.2631f, 11.8231f, 11.3334f, 11.9999f, 11.3334f)
                close()
            }
        }
        .build()
        return _listSettings!!
    }

private var _listSettings: ImageVector? = null
