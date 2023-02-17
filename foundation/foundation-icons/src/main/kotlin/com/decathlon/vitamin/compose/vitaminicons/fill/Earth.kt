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

public val FillGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(18.355f, 15.952f)
                verticalLineTo(15.847f)
                curveTo(18.355f, 14.925f, 18.355f, 14.504f, 17.703f, 14.131f)
                curveTo(17.4934f, 14.0122f, 17.2782f, 13.9037f, 17.058f, 13.806f)
                curveTo(16.691f, 13.639f, 16.448f, 13.53f, 16.12f, 13.05f)
                curveTo(16.0808f, 12.993f, 16.0422f, 12.9357f, 16.004f, 12.878f)
                curveTo(15.659f, 12.353f, 15.41f, 11.975f, 14.462f, 12.125f)
                curveTo(12.597f, 12.421f, 12.459f, 12.749f, 12.377f, 13.303f)
                lineTo(12.364f, 13.394f)
                curveTo(12.243f, 14.204f, 12.221f, 14.476f, 12.559f, 14.831f)
                curveTo(13.824f, 16.158f, 14.582f, 17.115f, 14.812f, 17.675f)
                curveTo(14.924f, 17.948f, 15.212f, 18.775f, 15.014f, 19.593f)
                curveTo(16.2278f, 19.1095f, 17.3083f, 18.3425f, 18.165f, 17.356f)
                curveTo(18.275f, 16.982f, 18.355f, 16.516f, 18.355f, 15.952f)
                close()
                moveTo(12.0f, 3.833f)
                curveTo(9.683f, 3.833f, 7.59f, 4.799f, 6.104f, 6.349f)
                curveTo(6.281f, 6.472f, 6.435f, 6.645f, 6.541f, 6.883f)
                curveTo(6.745f, 7.34f, 6.745f, 7.811f, 6.745f, 8.228f)
                curveTo(6.745f, 8.556f, 6.745f, 8.868f, 6.85f, 9.093f)
                curveTo(6.994f, 9.401f, 7.616f, 9.533f, 8.165f, 9.647f)
                curveTo(8.362f, 9.689f, 8.564f, 9.731f, 8.748f, 9.782f)
                curveTo(9.254f, 9.922f, 9.646f, 10.377f, 9.959f, 10.742f)
                curveTo(10.089f, 10.893f, 10.282f, 11.116f, 10.379f, 11.172f)
                curveTo(10.429f, 11.136f, 10.59f, 10.961f, 10.669f, 10.674f)
                curveTo(10.731f, 10.454f, 10.713f, 10.26f, 10.624f, 10.154f)
                curveTo(10.064f, 9.494f, 10.095f, 8.224f, 10.268f, 7.755f)
                curveTo(10.54f, 7.016f, 11.39f, 7.071f, 12.012f, 7.111f)
                curveTo(12.244f, 7.126f, 12.462f, 7.141f, 12.626f, 7.12f)
                curveTo(13.248f, 7.042f, 13.44f, 6.095f, 13.575f, 5.91f)
                curveTo(13.867f, 5.51f, 14.761f, 4.907f, 15.315f, 4.535f)
                curveTo(14.2715f, 4.071f, 13.142f, 3.8318f, 12.0f, 3.833f)
                close()
            }
        }
        .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
