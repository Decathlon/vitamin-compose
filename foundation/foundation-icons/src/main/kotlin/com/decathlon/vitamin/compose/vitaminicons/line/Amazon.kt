package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Amazon: ImageVector
    get() {
        if (_amazon != null) {
            return _amazon!!
        }
        _amazon = Builder(name = "Amazon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 17.004f)
                curveTo(12.897f, 17.004f, 14.518f, 16.239f, 15.625f, 14.62f)
                lineTo(15.626f, 14.621f)
                curveTo(16.054f, 15.694f, 16.284f, 16.091f, 16.807f, 16.743f)
                lineTo(18.367f, 15.492f)
                curveTo(17.969f, 14.996f, 17.839f, 14.771f, 17.483f, 13.879f)
                curveTo(17.163f, 13.078f, 17.0f, 10.971f, 17.0f, 8.322f)
                curveTo(17.0f, 5.478f, 15.103f, 3.3f, 12.5f, 3.3f)
                curveTo(10.193f, 3.3f, 8.442f, 4.604f, 7.555f, 7.174f)
                lineTo(9.445f, 7.826f)
                curveTo(10.06f, 6.047f, 11.063f, 5.3f, 12.5f, 5.3f)
                curveTo(13.932f, 5.3f, 15.0f, 6.526f, 15.0f, 8.322f)
                verticalLineTo(8.537f)
                lineTo(14.862f, 8.547f)
                curveTo(13.565f, 8.643f, 13.316f, 8.664f, 12.715f, 8.737f)
                curveTo(9.347f, 9.15f, 7.322f, 10.272f, 7.007f, 12.88f)
                curveTo(6.724f, 15.231f, 8.696f, 17.004f, 11.0f, 17.004f)
                close()
                moveTo(20.728f, 20.105f)
                curveTo(20.515f, 20.626f, 20.986f, 20.745f, 21.257f, 20.545f)
                curveTo(22.218f, 19.834f, 22.782f, 17.796f, 22.417f, 17.266f)
                curveTo(22.252f, 17.028f, 20.897f, 16.839f, 19.747f, 17.183f)
                curveTo(19.4354f, 17.2769f, 19.1415f, 17.4215f, 18.877f, 17.611f)
                curveTo(18.675f, 17.754f, 18.764f, 18.064f, 18.968f, 18.051f)
                curveTo(19.0771f, 18.0438f, 19.1767f, 18.0316f, 19.2806f, 18.0187f)
                curveTo(19.4671f, 17.9957f, 19.6676f, 17.971f, 19.963f, 17.971f)
                curveTo(20.523f, 17.971f, 20.78f, 18.098f, 20.99f, 18.353f)
                curveTo(21.275f, 18.697f, 20.993f, 19.457f, 20.728f, 20.105f)
                close()
                moveTo(20.075f, 19.461f)
                curveTo(19.8153f, 19.7122f, 19.5379f, 19.9445f, 19.245f, 20.156f)
                curveTo(17.123f, 21.772f, 14.375f, 22.616f, 11.987f, 22.616f)
                curveTo(8.144f, 22.616f, 4.707f, 20.823f, 2.099f, 17.821f)
                curveTo(1.876f, 17.591f, 2.061f, 17.255f, 2.322f, 17.437f)
                curveTo(5.132f, 19.514f, 8.61f, 20.77f, 12.211f, 20.77f)
                curveTo(14.476f, 20.77f, 16.919f, 20.233f, 19.246f, 19.077f)
                curveTo(19.326f, 19.0394f, 19.4109f, 18.9951f, 19.4955f, 18.9509f)
                curveTo(19.5822f, 18.9056f, 19.6685f, 18.8604f, 19.749f, 18.823f)
                curveTo(20.116f, 18.613f, 20.439f, 19.129f, 20.075f, 19.461f)
                close()
                moveTo(12.958f, 10.722f)
                curveTo(13.514f, 10.654f, 13.752f, 10.635f, 15.01f, 10.541f)
                horizontalLineTo(15.022f)
                curveTo(14.517f, 13.776f, 13.039f, 15.004f, 11.0f, 15.004f)
                curveTo(9.803f, 15.004f, 8.867f, 14.163f, 8.993f, 13.12f)
                curveTo(9.161f, 11.725f, 10.406f, 11.035f, 12.958f, 10.722f)
                close()
            }
        }
        .build()
        return _amazon!!
    }

private var _amazon: ImageVector? = null
