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
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(2.0f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.674f, 13.025f)
                lineTo(21.83f, 12.634f)
                lineTo(22.83f, 14.366f)
                lineTo(21.914f, 15.171f)
                curveTo(22.0293f, 15.7177f, 22.0293f, 16.2823f, 21.914f, 16.829f)
                lineTo(22.83f, 17.634f)
                lineTo(21.83f, 19.366f)
                lineTo(20.674f, 18.975f)
                curveTo(20.264f, 19.345f, 19.776f, 19.63f, 19.239f, 19.805f)
                lineTo(19.0f, 21.0f)
                horizontalLineTo(17.0f)
                lineTo(16.76f, 19.804f)
                curveTo(16.2293f, 19.6306f, 15.7408f, 19.3478f, 15.326f, 18.974f)
                lineTo(14.17f, 19.366f)
                lineTo(13.17f, 17.634f)
                lineTo(14.086f, 16.829f)
                curveTo(13.9707f, 16.2823f, 13.9707f, 15.7177f, 14.086f, 15.171f)
                lineTo(13.17f, 14.366f)
                lineTo(14.17f, 12.634f)
                lineTo(15.326f, 13.025f)
                curveTo(15.736f, 12.655f, 16.224f, 12.37f, 16.761f, 12.195f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(19.0f)
                lineTo(19.24f, 12.196f)
                curveTo(19.776f, 12.37f, 20.264f, 12.656f, 20.674f, 13.026f)
                verticalLineTo(13.025f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(18.2652f, 17.0f, 18.5196f, 16.8946f, 18.7071f, 16.7071f)
                curveTo(18.8946f, 16.5196f, 19.0f, 16.2652f, 19.0f, 16.0f)
                curveTo(19.0f, 15.7348f, 18.8946f, 15.4804f, 18.7071f, 15.2929f)
                curveTo(18.5196f, 15.1054f, 18.2652f, 15.0f, 18.0f, 15.0f)
                curveTo(17.7348f, 15.0f, 17.4804f, 15.1054f, 17.2929f, 15.2929f)
                curveTo(17.1054f, 15.4804f, 17.0f, 15.7348f, 17.0f, 16.0f)
                curveTo(17.0f, 16.2652f, 17.1054f, 16.5196f, 17.2929f, 16.7071f)
                curveTo(17.4804f, 16.8946f, 17.7348f, 17.0f, 18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _listSettings!!
    }

private var _listSettings: ImageVector? = null
