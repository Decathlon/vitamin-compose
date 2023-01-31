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

public val LineGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.235f, 6.453f)
                curveTo(4.96f, 7.7763f, 4.1795f, 9.4981f, 4.0246f, 11.3292f)
                curveTo(3.8696f, 13.1602f, 4.3498f, 14.9887f, 5.3843f, 16.5074f)
                curveTo(6.4187f, 18.0261f, 7.9445f, 19.1424f, 9.7051f, 19.6686f)
                curveTo(11.4657f, 20.1948f, 13.3538f, 20.0989f, 15.052f, 19.397f)
                curveTo(15.167f, 18.647f, 14.915f, 17.927f, 14.812f, 17.675f)
                curveTo(14.582f, 17.115f, 13.824f, 16.158f, 12.559f, 14.831f)
                curveTo(12.221f, 14.476f, 12.243f, 14.203f, 12.364f, 13.394f)
                lineTo(12.377f, 13.303f)
                curveTo(12.459f, 12.749f, 12.597f, 12.421f, 14.462f, 12.125f)
                curveTo(15.41f, 11.975f, 15.659f, 12.353f, 16.004f, 12.878f)
                lineTo(16.12f, 13.05f)
                curveTo(16.448f, 13.53f, 16.691f, 13.64f, 17.058f, 13.806f)
                curveTo(17.223f, 13.881f, 17.428f, 13.976f, 17.703f, 14.131f)
                curveTo(18.355f, 14.504f, 18.355f, 14.925f, 18.355f, 15.847f)
                verticalLineTo(15.952f)
                curveTo(18.355f, 16.343f, 18.317f, 16.687f, 18.257f, 16.986f)
                curveTo(19.0244f, 16.0229f, 19.5591f, 14.8957f, 19.8196f, 13.6922f)
                curveTo(20.0801f, 12.4886f, 20.0593f, 11.2412f, 19.7588f, 10.047f)
                curveTo(19.4584f, 8.8528f, 18.8863f, 7.7441f, 18.0873f, 6.8071f)
                curveTo(17.2883f, 5.8702f, 16.2838f, 5.1303f, 15.152f, 4.645f)
                curveTo(14.599f, 5.018f, 13.84f, 5.547f, 13.575f, 5.91f)
                curveTo(13.44f, 6.095f, 13.248f, 7.042f, 12.625f, 7.12f)
                curveTo(12.463f, 7.14f, 12.244f, 7.126f, 12.012f, 7.111f)
                curveTo(11.39f, 7.071f, 10.54f, 7.016f, 10.268f, 7.755f)
                curveTo(10.095f, 8.223f, 10.065f, 9.495f, 10.624f, 10.155f)
                curveTo(10.714f, 10.26f, 10.731f, 10.455f, 10.67f, 10.674f)
                curveTo(10.59f, 10.961f, 10.429f, 11.136f, 10.378f, 11.172f)
                curveTo(10.282f, 11.116f, 10.09f, 10.893f, 9.959f, 10.742f)
                curveTo(9.646f, 10.377f, 9.254f, 9.922f, 8.748f, 9.782f)
                curveTo(8.564f, 9.731f, 8.362f, 9.689f, 8.165f, 9.647f)
                curveTo(7.616f, 9.532f, 6.995f, 9.401f, 6.85f, 9.093f)
                curveTo(6.744f, 8.867f, 6.745f, 8.556f, 6.745f, 8.228f)
                curveTo(6.745f, 7.811f, 6.745f, 7.34f, 6.541f, 6.883f)
                curveTo(6.4701f, 6.7199f, 6.3658f, 6.5734f, 6.235f, 6.453f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
