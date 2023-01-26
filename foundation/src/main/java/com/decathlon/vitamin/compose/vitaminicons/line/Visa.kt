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

public val LineGroup.Visa: ImageVector
    get() {
        if (_visa != null) {
            return _visa!!
        }
        _visa = Builder(name = "Visa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.502f, 8.465f)
                curveTo(17.0841f, 8.3f, 16.3573f, 8.1201f, 15.7804f, 8.12f)
                curveTo(13.8137f, 8.1202f, 12.429f, 9.1011f, 12.412f, 10.563f)
                curveTo(12.3981f, 11.6974f, 13.4282f, 12.2664f, 14.1712f, 12.6768f)
                lineTo(14.186f, 12.685f)
                curveTo(14.93f, 13.095f, 15.134f, 13.26f, 15.13f, 13.592f)
                curveTo(15.125f, 14.059f, 14.556f, 14.327f, 13.893f, 14.327f)
                curveTo(13.169f, 14.327f, 12.81f, 14.214f, 11.963f, 13.859f)
                lineTo(11.611f, 15.484f)
                curveTo(12.443f, 15.779f, 12.811f, 15.865f, 13.831f, 15.88f)
                curveTo(16.067f, 15.88f, 17.127f, 14.641f, 17.14f, 13.385f)
                curveTo(17.152f, 12.78f, 17.026f, 12.223f, 16.067f, 11.603f)
                curveTo(15.8266f, 11.4473f, 15.5881f, 11.3156f, 15.3702f, 11.1952f)
                curveTo(14.8268f, 10.8951f, 14.411f, 10.6655f, 14.411f, 10.31f)
                curveTo(14.411f, 10.004f, 14.881f, 9.685f, 15.641f, 9.672f)
                curveTo(16.164f, 9.665f, 16.786f, 9.87f, 17.164f, 10.022f)
                lineTo(17.502f, 8.465f)
                close()
                moveTo(9.086f, 8.259f)
                lineTo(7.06f, 8.257f)
                lineTo(5.029f, 13.341f)
                lineTo(4.8345f, 12.3054f)
                curveTo(4.5194f, 10.627f, 4.3179f, 9.5542f, 4.229f, 9.087f)
                curveTo(4.124f, 8.531f, 3.797f, 8.26f, 3.237f, 8.26f)
                horizontalLineTo(0.0f)
                verticalLineTo(8.465f)
                curveTo(0.792f, 8.71f, 1.357f, 8.89f, 1.696f, 9.007f)
                curveTo(2.077f, 9.138f, 2.275f, 9.415f, 2.375f, 9.811f)
                curveTo(2.8779f, 11.798f, 3.3872f, 13.7833f, 3.903f, 15.767f)
                lineTo(5.954f, 15.769f)
                lineTo(9.086f, 8.259f)
                close()
                moveTo(22.222f, 15.768f)
                lineTo(21.997f, 14.643f)
                horizontalLineTo(19.483f)
                lineTo(19.083f, 15.76f)
                lineTo(17.068f, 15.764f)
                curveTo(18.0273f, 13.4571f, 18.9886f, 11.1511f, 19.952f, 8.846f)
                curveTo(20.116f, 8.455f, 20.407f, 8.256f, 20.836f, 8.258f)
                curveTo(21.164f, 8.261f, 21.699f, 8.261f, 22.442f, 8.259f)
                lineTo(24.0f, 15.765f)
                lineTo(22.222f, 15.768f)
                close()
                moveTo(20.049f, 13.102f)
                horizontalLineTo(21.669f)
                lineTo(21.064f, 10.282f)
                lineTo(20.049f, 13.102f)
                close()
                moveTo(11.87f, 8.259f)
                lineTo(10.268f, 15.767f)
                lineTo(8.34f, 15.765f)
                lineTo(9.94f, 8.257f)
                lineTo(11.87f, 8.259f)
                close()
            }
        }
        .build()
        return _visa!!
    }

private var _visa: ImageVector? = null
