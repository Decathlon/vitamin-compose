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

public val LineGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0001f, 2.0f)
                curveTo(7.4696f, 2.0f, 6.9609f, 2.2107f, 6.5859f, 2.5858f)
                curveTo(6.2108f, 2.9609f, 6.0001f, 3.4696f, 6.0001f, 4.0f)
                verticalLineTo(6.6667f)
                curveTo(6.0001f, 7.1971f, 6.2108f, 7.7058f, 6.5859f, 8.0809f)
                curveTo(6.9609f, 8.456f, 7.4696f, 8.6667f, 8.0001f, 8.6667f)
                curveTo(8.5305f, 8.6667f, 9.0392f, 8.456f, 9.4143f, 8.0809f)
                curveTo(9.7894f, 7.7058f, 10.0001f, 7.1971f, 10.0001f, 6.6667f)
                verticalLineTo(4.0f)
                curveTo(10.0001f, 3.4696f, 9.7894f, 2.9609f, 9.4143f, 2.5858f)
                curveTo(9.0392f, 2.2107f, 8.5305f, 2.0f, 8.0001f, 2.0f)
                close()
                moveTo(8.0001f, 0.6667f)
                curveTo(8.4378f, 0.6667f, 8.8713f, 0.7529f, 9.2757f, 0.9204f)
                curveTo(9.6801f, 1.0879f, 10.0476f, 1.3335f, 10.3571f, 1.643f)
                curveTo(10.6666f, 1.9525f, 10.9122f, 2.32f, 11.0797f, 2.7244f)
                curveTo(11.2472f, 3.1288f, 11.3334f, 3.5623f, 11.3334f, 4.0f)
                verticalLineTo(6.6667f)
                curveTo(11.3334f, 7.5507f, 10.9822f, 8.3986f, 10.3571f, 9.0237f)
                curveTo(9.732f, 9.6488f, 8.8841f, 10.0f, 8.0001f, 10.0f)
                curveTo(7.116f, 10.0f, 6.2682f, 9.6488f, 5.6431f, 9.0237f)
                curveTo(5.0179f, 8.3986f, 4.6667f, 7.5507f, 4.6667f, 6.6667f)
                verticalLineTo(4.0f)
                curveTo(4.6667f, 3.116f, 5.0179f, 2.2681f, 5.6431f, 1.643f)
                curveTo(6.2682f, 1.0179f, 7.116f, 0.6667f, 8.0001f, 0.6667f)
                close()
                moveTo(2.0367f, 7.3334f)
                horizontalLineTo(3.3801f)
                curveTo(3.5416f, 8.4432f, 4.0973f, 9.4578f, 4.9456f, 10.1915f)
                curveTo(5.7938f, 10.9253f, 6.8779f, 11.3291f, 7.9994f, 11.3291f)
                curveTo(9.121f, 11.3291f, 10.205f, 10.9253f, 11.0533f, 10.1915f)
                curveTo(11.9015f, 9.4578f, 12.4572f, 8.4432f, 12.6187f, 7.3334f)
                horizontalLineTo(13.9627f)
                curveTo(13.8112f, 8.6858f, 13.2045f, 9.9466f, 12.2422f, 10.909f)
                curveTo(11.2799f, 11.8714f, 10.0192f, 12.4783f, 8.6667f, 12.63f)
                verticalLineTo(15.3334f)
                horizontalLineTo(7.3334f)
                verticalLineTo(12.63f)
                curveTo(5.9808f, 12.4784f, 4.7199f, 11.8716f, 3.7575f, 10.9092f)
                curveTo(2.7951f, 9.9468f, 2.1883f, 8.6859f, 2.0367f, 7.3334f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
