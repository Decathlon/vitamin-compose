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

public val FillGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0427f, 5.0067f)
                curveTo(3.1739f, 2.7541f, 5.4794f, 1.3326f, 8.0f, 1.3333f)
                curveTo(9.7967f, 1.3333f, 11.306f, 1.9933f, 12.46f, 3.07f)
                lineTo(10.5487f, 4.982f)
                curveTo(9.8574f, 4.3213f, 8.9787f, 3.9847f, 8.0f, 3.9847f)
                curveTo(6.2634f, 3.9847f, 4.7934f, 5.158f, 4.27f, 6.7333f)
                curveTo(4.1367f, 7.1333f, 4.0607f, 7.56f, 4.0607f, 8.0f)
                curveTo(4.0607f, 8.44f, 4.1367f, 8.8667f, 4.27f, 9.2667f)
                curveTo(4.794f, 10.8427f, 6.2634f, 12.0153f, 8.0f, 12.0153f)
                curveTo(8.8967f, 12.0153f, 9.66f, 11.7787f, 10.2574f, 11.3787f)
                curveTo(10.9572f, 10.9179f, 11.438f, 10.191f, 11.588f, 9.3667f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.788f)
                horizontalLineTo(14.2787f)
                curveTo(14.3574f, 7.224f, 14.4f, 7.6787f, 14.4f, 8.1513f)
                curveTo(14.4f, 10.182f, 13.6734f, 11.8913f, 12.412f, 13.0513f)
                curveTo(11.3094f, 14.07f, 9.8f, 14.6667f, 8.0f, 14.6667f)
                curveTo(6.2317f, 14.6674f, 4.5356f, 13.9652f, 3.2852f, 12.7148f)
                curveTo(2.0348f, 11.4644f, 1.3327f, 9.7683f, 1.3334f, 8.0f)
                curveTo(1.3334f, 6.924f, 1.5907f, 5.9067f, 2.0427f, 5.0067f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
