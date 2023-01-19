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

public val FillGroup.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3334f, 2.662f)
                curveTo(1.3346f, 2.4869f, 1.4046f, 2.3193f, 1.5284f, 2.1955f)
                curveTo(1.6521f, 2.0716f, 1.8196f, 2.0014f, 1.9947f, 2.0f)
                horizontalLineTo(14.0054f)
                curveTo(14.3707f, 2.0f, 14.6667f, 2.2967f, 14.6667f, 2.662f)
                verticalLineTo(13.338f)
                curveTo(14.6655f, 13.5131f, 14.5954f, 13.6807f, 14.4717f, 13.8045f)
                curveTo(14.348f, 13.9284f, 14.1805f, 13.9986f, 14.0054f, 14.0f)
                horizontalLineTo(1.9947f)
                curveTo(1.8192f, 13.9998f, 1.651f, 13.93f, 1.527f, 13.8059f)
                curveTo(1.403f, 13.6817f, 1.3334f, 13.5135f, 1.3334f, 13.338f)
                verticalLineTo(2.662f)
                close()
                moveTo(2.6667f, 3.3333f)
                verticalLineTo(4.6667f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(12.0f, 3.3333f)
                verticalLineTo(4.6667f)
                horizontalLineTo(13.3334f)
                verticalLineTo(3.3333f)
                horizontalLineTo(12.0f)
                close()
                moveTo(2.6667f, 6.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(12.0f, 6.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(13.3334f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(2.6667f, 8.6667f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.6667f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(12.0f, 8.6667f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.3334f)
                verticalLineTo(8.6667f)
                horizontalLineTo(12.0f)
                close()
                moveTo(2.6667f, 11.3333f)
                verticalLineTo(12.6667f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.3333f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(12.0f, 11.3333f)
                verticalLineTo(12.6667f)
                horizontalLineTo(13.3334f)
                verticalLineTo(11.3333f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
