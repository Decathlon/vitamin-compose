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

public val LineGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.986f, 2.5996f)
                curveTo(7.7659f, 3.0877f, 6.9572f, 4.2594f, 6.9334f, 5.5733f)
                curveTo(6.8903f, 5.5674f, 6.8503f, 5.563f, 6.8108f, 5.558f)
                curveTo(6.5254f, 5.5222f, 6.2968f, 5.4935f, 5.6187f, 5.2153f)
                curveTo(4.4587f, 4.7393f, 3.314f, 3.842f, 2.1854f, 2.524f)
                curveTo(-0.1463f, 8.1377f, 3.2236f, 10.3326f, 4.2684f, 11.0132f)
                curveTo(4.3011f, 11.0345f, 4.3315f, 11.0543f, 4.3594f, 11.0726f)
                curveTo(3.2727f, 11.868f, 1.3927f, 12.07f, 0.9301f, 12.106f)
                curveTo(1.8381f, 13.054f, 5.0061f, 13.768f, 7.1847f, 13.3333f)
                curveTo(10.3621f, 12.6993f, 13.4934f, 10.222f, 13.4934f, 5.1273f)
                curveTo(13.9694f, 4.4746f, 14.0794f, 4.0f, 14.3027f, 2.9067f)
                curveTo(13.5408f, 3.3684f, 13.1347f, 3.3545f, 12.7413f, 3.3411f)
                curveTo(12.669f, 3.3386f, 12.597f, 3.3361f, 12.5234f, 3.3366f)
                curveTo(11.5998f, 2.4018f, 10.2061f, 2.1114f, 8.986f, 2.5996f)
                close()
                moveTo(8.2667f, 5.598f)
                curveTo(8.286f, 4.5441f, 9.1459f, 3.6998f, 10.2f, 3.7f)
                curveTo(11.4854f, 3.7f, 12.16f, 4.8087f, 12.16f, 5.1273f)
                curveTo(12.16f, 9.0313f, 10.0687f, 11.398f, 6.9234f, 12.026f)
                curveTo(6.426f, 12.1247f, 5.8267f, 12.1527f, 5.1954f, 12.1133f)
                lineTo(6.2567f, 11.338f)
                curveTo(6.364f, 11.2599f, 6.4255f, 11.1336f, 6.421f, 11.001f)
                curveTo(6.4164f, 10.8683f, 6.3464f, 10.7466f, 6.234f, 10.676f)
                lineTo(5.0694f, 9.944f)
                curveTo(3.194f, 8.7647f, 2.4154f, 7.236f, 2.814f, 5.0293f)
                curveTo(4.0727f, 6.078f, 5.3847f, 6.7087f, 6.754f, 6.8953f)
                lineTo(7.7947f, 7.0367f)
                curveTo(7.9077f, 7.0519f, 8.0219f, 7.0181f, 8.1085f, 6.9439f)
                curveTo(8.1951f, 6.8697f, 8.2458f, 6.762f, 8.248f, 6.648f)
                lineTo(8.2667f, 5.598f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
