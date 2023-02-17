package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.045f, 2.208f)
                curveTo(12.6958f, 1.9264f, 11.303f, 1.9271f, 9.9541f, 2.21f)
                verticalLineTo(2.211f)
                curveTo(9.7716f, 3.4119f, 9.0525f, 4.4645f, 8.0f, 5.071f)
                curveTo(6.9478f, 5.6795f, 5.6757f, 5.7755f, 4.5441f, 5.332f)
                curveTo(3.6262f, 6.3601f, 2.9297f, 7.5661f, 2.498f, 8.875f)
                curveTo(3.4482f, 9.6334f, 4.001f, 10.7833f, 4.0001f, 11.999f)
                curveTo(4.0009f, 13.2136f, 3.4489f, 14.3626f, 2.5001f, 15.121f)
                curveTo(2.929f, 16.4313f, 3.6246f, 17.6386f, 4.543f, 18.667f)
                curveTo(5.6749f, 18.2228f, 6.9474f, 18.3185f, 8.0f, 18.927f)
                curveTo(9.0541f, 19.5343f, 9.7738f, 20.589f, 9.9551f, 21.792f)
                curveTo(11.3044f, 22.0729f, 12.6973f, 22.0715f, 14.046f, 21.788f)
                curveTo(14.2285f, 20.5871f, 14.9476f, 19.5345f, 16.0f, 18.928f)
                curveTo(17.0523f, 18.3195f, 18.3244f, 18.2234f, 19.456f, 18.667f)
                curveTo(20.3739f, 17.6389f, 21.0704f, 16.4328f, 21.502f, 15.124f)
                curveTo(20.586f, 14.391f, 20.0f, 13.264f, 20.0f, 12.0f)
                curveTo(19.9986f, 10.7846f, 20.5507f, 9.6348f, 21.5f, 8.876f)
                curveTo(21.0709f, 7.566f, 20.3753f, 6.359f, 19.457f, 5.331f)
                curveTo(18.3251f, 5.7748f, 17.0525f, 5.6788f, 16.0f, 5.07f)
                curveTo(14.9467f, 4.4633f, 14.2271f, 3.4098f, 14.045f, 2.208f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.6568f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3432f, 15.0f, 9.0f, 13.6568f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3432f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
