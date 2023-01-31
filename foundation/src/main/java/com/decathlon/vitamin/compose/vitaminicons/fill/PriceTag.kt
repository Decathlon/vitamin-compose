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

public val FillGroup.PriceTag: ImageVector
    get() {
        if (_priceTag != null) {
            return _priceTag!!
        }
        _priceTag = Builder(name = "PriceTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9001f, 2.1f)
                lineTo(20.7991f, 3.515f)
                lineTo(22.2131f, 13.415f)
                lineTo(13.0211f, 22.607f)
                curveTo(12.8336f, 22.7945f, 12.5793f, 22.8998f, 12.3141f, 22.8998f)
                curveTo(12.0489f, 22.8998f, 11.7946f, 22.7945f, 11.6071f, 22.607f)
                lineTo(1.7071f, 12.707f)
                curveTo(1.5196f, 12.5195f, 1.4143f, 12.2652f, 1.4143f, 12.0f)
                curveTo(1.4143f, 11.7348f, 1.5196f, 11.4805f, 1.7071f, 11.293f)
                lineTo(10.9001f, 2.1f)
                close()
                moveTo(13.7281f, 10.586f)
                curveTo(13.9138f, 10.7717f, 14.1344f, 10.919f, 14.377f, 11.0194f)
                curveTo(14.6197f, 11.1199f, 14.8798f, 11.1716f, 15.1424f, 11.1716f)
                curveTo(15.4051f, 11.1715f, 15.6652f, 11.1197f, 15.9078f, 11.0192f)
                curveTo(16.1504f, 10.9186f, 16.3709f, 10.7713f, 16.5566f, 10.5855f)
                curveTo(16.7423f, 10.3998f, 16.8896f, 10.1792f, 16.99f, 9.9366f)
                curveTo(17.0905f, 9.6939f, 17.1422f, 9.4338f, 17.1421f, 9.1712f)
                curveTo(17.1421f, 8.9085f, 17.0903f, 8.6484f, 16.9898f, 8.4058f)
                curveTo(16.8892f, 8.1631f, 16.7418f, 7.9427f, 16.5561f, 7.757f)
                curveTo(16.3703f, 7.5713f, 16.1498f, 7.424f, 15.9072f, 7.3236f)
                curveTo(15.6645f, 7.2231f, 15.4044f, 7.1714f, 15.1417f, 7.1715f)
                curveTo(14.6113f, 7.1715f, 14.1026f, 7.3824f, 13.7276f, 7.7575f)
                curveTo(13.3526f, 8.1327f, 13.1419f, 8.6414f, 13.142f, 9.1719f)
                curveTo(13.1421f, 9.7023f, 13.3529f, 10.211f, 13.7281f, 10.586f)
                close()
            }
        }
        .build()
        return _priceTag!!
    }

private var _priceTag: ImageVector? = null
