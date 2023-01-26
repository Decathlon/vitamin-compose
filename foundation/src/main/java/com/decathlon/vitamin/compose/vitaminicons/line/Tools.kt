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

public val LineGroup.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.33f, 3.271f)
                curveTo(5.9971f, 3.0329f, 6.7206f, 3.0029f, 7.4051f, 3.1848f)
                curveTo(8.0896f, 3.3666f, 8.7028f, 3.7519f, 9.1637f, 4.2896f)
                curveTo(9.6246f, 4.8273f, 9.9115f, 5.4922f, 9.9866f, 6.1965f)
                curveTo(10.0616f, 6.9007f, 9.9213f, 7.6112f, 9.584f, 8.234f)
                lineTo(20.293f, 18.944f)
                lineTo(18.879f, 20.358f)
                lineTo(8.169f, 9.648f)
                curveTo(7.5461f, 9.9839f, 6.836f, 10.1231f, 6.1324f, 10.0475f)
                curveTo(5.4287f, 9.9718f, 4.7645f, 9.6847f, 4.2272f, 9.224f)
                curveTo(3.69f, 8.7633f, 3.3049f, 8.1506f, 3.1228f, 7.4667f)
                curveTo(2.9407f, 6.7828f, 2.9701f, 6.0598f, 3.207f, 5.393f)
                lineTo(5.444f, 7.63f)
                curveTo(5.5824f, 7.7732f, 5.7479f, 7.8875f, 5.9309f, 7.9661f)
                curveTo(6.1139f, 8.0447f, 6.3108f, 8.0861f, 6.5099f, 8.0878f)
                curveTo(6.7091f, 8.0896f, 6.9066f, 8.0516f, 7.091f, 7.9762f)
                curveTo(7.2753f, 7.9008f, 7.4428f, 7.7894f, 7.5836f, 7.6486f)
                curveTo(7.7245f, 7.5077f, 7.8358f, 7.3402f, 7.9113f, 7.1559f)
                curveTo(7.9867f, 6.9715f, 8.0246f, 6.774f, 8.0229f, 6.5749f)
                curveTo(8.0212f, 6.3757f, 7.9798f, 6.1789f, 7.9012f, 5.9959f)
                curveTo(7.8226f, 5.8128f, 7.7083f, 5.6473f, 7.565f, 5.509f)
                lineTo(5.329f, 3.27f)
                lineTo(5.33f, 3.271f)
                close()
                moveTo(15.697f, 5.155f)
                lineTo(18.879f, 3.387f)
                lineTo(20.293f, 4.801f)
                lineTo(18.525f, 7.983f)
                lineTo(16.757f, 8.337f)
                lineTo(14.637f, 10.458f)
                lineTo(13.222f, 9.044f)
                lineTo(15.343f, 6.923f)
                lineTo(15.697f, 5.155f)
                close()
                moveTo(8.979f, 13.287f)
                lineTo(10.393f, 14.701f)
                lineTo(5.09f, 20.004f)
                curveTo(4.9097f, 20.1848f, 4.6671f, 20.2898f, 4.4119f, 20.2974f)
                curveTo(4.1566f, 20.305f, 3.9081f, 20.2148f, 3.7173f, 20.0451f)
                curveTo(3.5266f, 19.8754f, 3.4079f, 19.6391f, 3.3857f, 19.3847f)
                curveTo(3.3635f, 19.1304f, 3.4395f, 18.8771f, 3.598f, 18.677f)
                lineTo(3.676f, 18.59f)
                lineTo(8.979f, 13.287f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
