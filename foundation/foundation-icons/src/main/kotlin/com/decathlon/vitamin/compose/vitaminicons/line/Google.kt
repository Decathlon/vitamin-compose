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

public val LineGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.3333f)
                horizontalLineTo(13.6887f)
                curveTo(13.718f, 7.59f, 13.7333f, 7.8533f, 13.7333f, 8.1227f)
                curveTo(13.7333f, 9.9453f, 13.08f, 11.48f, 11.948f, 12.5227f)
                curveTo(10.958f, 13.4367f, 9.6027f, 13.9727f, 7.9867f, 13.9727f)
                curveTo(6.3988f, 13.9734f, 4.8758f, 13.343f, 3.7529f, 12.2202f)
                curveTo(2.6301f, 11.0975f, 1.9995f, 9.5745f, 2.0f, 7.9867f)
                curveTo(1.9993f, 6.3987f, 2.6298f, 4.8755f, 3.7527f, 3.7527f)
                curveTo(4.8755f, 2.6298f, 6.3987f, 1.9993f, 7.9867f, 2.0f)
                curveTo(9.6f, 2.0f, 10.9553f, 2.5933f, 11.992f, 3.5593f)
                lineTo(11.0173f, 4.5333f)
                curveTo(10.2453f, 3.7873f, 9.202f, 3.3333f, 8.0f, 3.3333f)
                curveTo(6.3328f, 3.3333f, 4.7922f, 4.2228f, 3.9585f, 5.6667f)
                curveTo(3.1249f, 7.1105f, 3.1249f, 8.8895f, 3.9585f, 10.3333f)
                curveTo(4.7922f, 11.7772f, 6.3328f, 12.6667f, 8.0f, 12.6667f)
                curveTo(10.3507f, 12.6667f, 12.096f, 10.928f, 12.3847f, 8.6667f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.3333f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
