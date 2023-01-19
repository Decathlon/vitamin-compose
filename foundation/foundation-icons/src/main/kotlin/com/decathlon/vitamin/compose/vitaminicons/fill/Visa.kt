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

public val FillGroup.Visa: ImageVector
    get() {
        if (_visa != null) {
            return _visa!!
        }
        _visa = Builder(name = "Visa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.6667f, 2.6667f)
                horizontalLineTo(15.3334f)
                verticalLineTo(4.0f)
                horizontalLineTo(0.6667f)
                verticalLineTo(2.6667f)
                close()
                moveTo(0.6667f, 12.0f)
                horizontalLineTo(15.3334f)
                verticalLineTo(13.3333f)
                horizontalLineTo(0.6667f)
                verticalLineTo(12.0f)
                close()
                moveTo(13.0814f, 9.9427f)
                lineTo(12.9654f, 9.3627f)
                horizontalLineTo(11.6661f)
                lineTo(11.4594f, 9.938f)
                lineTo(10.4181f, 9.94f)
                curveTo(11.0881f, 8.336f, 11.5847f, 7.1467f, 11.9087f, 6.3747f)
                curveTo(11.9934f, 6.1727f, 12.1441f, 6.07f, 12.3654f, 6.0713f)
                curveTo(12.5347f, 6.0727f, 12.8114f, 6.0727f, 13.1954f, 6.0713f)
                lineTo(14.0001f, 9.9413f)
                lineTo(13.0814f, 9.9433f)
                verticalLineTo(9.9427f)
                close()
                moveTo(11.9587f, 8.568f)
                horizontalLineTo(12.7961f)
                lineTo(12.4827f, 7.1147f)
                lineTo(11.9587f, 8.568f)
                close()
                moveTo(5.2481f, 6.0707f)
                lineTo(6.2948f, 6.072f)
                lineTo(4.6768f, 9.9427f)
                lineTo(3.6168f, 9.942f)
                curveTo(3.2587f, 8.562f, 2.9954f, 7.538f, 2.8274f, 6.872f)
                curveTo(2.7761f, 6.6673f, 2.6741f, 6.5247f, 2.4767f, 6.4573f)
                curveTo(2.3014f, 6.3973f, 2.0094f, 6.304f, 1.6001f, 6.178f)
                verticalLineTo(6.0713f)
                horizontalLineTo(3.2727f)
                curveTo(3.5621f, 6.0713f, 3.7308f, 6.2113f, 3.7854f, 6.498f)
                lineTo(4.1988f, 8.6907f)
                lineTo(5.2481f, 6.0707f)
                close()
                moveTo(7.7327f, 6.072f)
                lineTo(6.9061f, 9.942f)
                lineTo(5.9094f, 9.9407f)
                lineTo(6.7361f, 6.0707f)
                lineTo(7.7327f, 6.072f)
                close()
                moveTo(9.7541f, 6.0f)
                curveTo(10.0514f, 6.0f, 10.4274f, 6.092f, 10.6434f, 6.178f)
                lineTo(10.4687f, 6.9807f)
                curveTo(10.2734f, 6.902f, 9.9521f, 6.796f, 9.6821f, 6.8007f)
                curveTo(9.2887f, 6.8067f, 9.0461f, 6.9713f, 9.0461f, 7.1293f)
                curveTo(9.0461f, 7.3853f, 9.4674f, 7.5147f, 9.9021f, 7.7953f)
                curveTo(10.3974f, 8.1153f, 10.4621f, 8.402f, 10.4561f, 8.714f)
                curveTo(10.4494f, 9.3613f, 9.9021f, 10.0f, 8.7467f, 10.0f)
                curveTo(8.2194f, 9.992f, 8.0294f, 9.948f, 7.6001f, 9.796f)
                lineTo(7.7814f, 8.9587f)
                curveTo(8.2188f, 9.1413f, 8.4047f, 9.1993f, 8.7781f, 9.1993f)
                curveTo(9.1214f, 9.1993f, 9.4154f, 9.0613f, 9.4181f, 8.8207f)
                curveTo(9.4194f, 8.6493f, 9.3147f, 8.5647f, 8.9301f, 8.3527f)
                curveTo(8.5454f, 8.1413f, 8.0068f, 7.8487f, 8.0134f, 7.2593f)
                curveTo(8.0221f, 6.506f, 8.7381f, 6.0f, 9.7534f, 6.0f)
                horizontalLineTo(9.7541f)
                close()
            }
        }
        .build()
        return _visa!!
    }

private var _visa: ImageVector? = null
