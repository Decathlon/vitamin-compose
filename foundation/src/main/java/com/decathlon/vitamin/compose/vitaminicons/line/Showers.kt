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

public val LineGroup.Showers: ImageVector
    get() {
        if (_showers != null) {
            return _showers!!
        }
        _showers = Builder(name = "Showers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.93f)
                curveTo(3.8934f, 16.2902f, 2.9562f, 15.3945f, 2.2669f, 14.318f)
                curveTo(1.5776f, 13.2416f, 1.1564f, 12.0156f, 1.0383f, 10.7428f)
                curveTo(0.9203f, 9.47f, 1.109f, 8.1875f, 1.5886f, 7.0026f)
                curveTo(2.0682f, 5.8177f, 2.8247f, 4.765f, 3.7948f, 3.9327f)
                curveTo(4.7649f, 3.1003f, 5.9204f, 2.5126f, 7.1643f, 2.2186f)
                curveTo(8.4083f, 1.9246f, 9.7046f, 1.933f, 10.9447f, 2.2431f)
                curveTo(12.1848f, 2.5531f, 13.3325f, 3.1558f, 14.2917f, 4.0007f)
                curveTo(15.251f, 4.8456f, 15.9938f, 5.908f, 16.458f, 7.0989f)
                curveTo(17.8533f, 6.8231f, 19.3012f, 7.0986f, 20.4978f, 7.8675f)
                curveTo(21.6944f, 8.6363f, 22.5466f, 9.8389f, 22.8755f, 11.2226f)
                curveTo(23.2044f, 12.6064f, 22.9845f, 14.0637f, 22.2619f, 15.2888f)
                curveTo(21.5393f, 16.5139f, 20.3702f, 17.4114f, 19.0f, 17.793f)
                verticalLineTo(15.663f)
                curveTo(19.4622f, 15.4436f, 19.8707f, 15.1257f, 20.1967f, 14.7315f)
                curveTo(20.5227f, 14.3372f, 20.7584f, 13.8763f, 20.8871f, 13.3812f)
                curveTo(21.0157f, 12.8861f, 21.0343f, 12.3688f, 20.9415f, 11.8657f)
                curveTo(20.8486f, 11.3626f, 20.6466f, 10.886f, 20.3497f, 10.4694f)
                curveTo(20.0528f, 10.0528f, 19.6681f, 9.7064f, 19.2229f, 9.4545f)
                curveTo(18.7776f, 9.2027f, 18.2825f, 9.0514f, 17.7725f, 9.0115f)
                curveTo(17.2625f, 8.9716f, 16.7499f, 9.044f, 16.2709f, 9.2236f)
                curveTo(15.7919f, 9.4032f, 15.3581f, 9.6856f, 15.0f, 10.051f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.9991f, 14.7497f, 8.0142f, 14.2718f, 7.1348f)
                curveTo(13.7939f, 6.2554f, 13.1036f, 5.5096f, 12.2638f, 4.9651f)
                curveTo(11.4239f, 4.4207f, 10.4613f, 4.095f, 9.4634f, 4.0177f)
                curveTo(8.4656f, 3.9404f, 7.4642f, 4.114f, 6.5506f, 4.5226f)
                curveTo(5.6369f, 4.9311f, 4.84f, 5.5618f, 4.2324f, 6.3571f)
                curveTo(3.6247f, 7.1523f, 3.2257f, 8.087f, 3.0716f, 9.0759f)
                curveTo(2.9174f, 10.0648f, 3.0131f, 11.0766f, 3.35f, 12.019f)
                curveTo(3.6868f, 12.9615f, 4.254f, 13.8047f, 5.0f, 14.472f)
                verticalLineTo(16.93f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _showers!!
    }

private var _showers: ImageVector? = null
