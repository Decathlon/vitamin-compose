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

public val FillGroup.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3699f, 2.094f)
                curveTo(8.4222f, 1.4134f, 3.7306f, 4.4865f, 2.3777f, 9.2941f)
                curveTo(1.0249f, 14.1017f, 3.4253f, 19.1705f, 8.0019f, 21.17f)
                curveTo(7.9421f, 20.4018f, 7.997f, 19.629f, 8.1649f, 18.877f)
                curveTo(8.3499f, 18.038f, 9.4609f, 13.414f, 9.4609f, 13.414f)
                curveTo(9.2397f, 12.9181f, 9.1291f, 12.38f, 9.1369f, 11.837f)
                curveTo(9.1369f, 10.352f, 9.9939f, 9.244f, 11.0599f, 9.244f)
                curveTo(11.4474f, 9.2383f, 11.8182f, 9.4015f, 12.0759f, 9.691f)
                curveTo(12.3335f, 9.9805f, 12.4525f, 10.3678f, 12.4019f, 10.752f)
                curveTo(12.4019f, 11.652f, 11.8239f, 13.014f, 11.5219f, 14.292f)
                curveTo(11.4009f, 14.7673f, 11.5129f, 15.2719f, 11.8237f, 15.6513f)
                curveTo(12.1345f, 16.0308f, 12.6071f, 16.24f, 13.0969f, 16.215f)
                curveTo(14.9949f, 16.215f, 16.2669f, 13.784f, 16.2669f, 10.914f)
                curveTo(16.2669f, 8.714f, 14.8099f, 7.066f, 12.1239f, 7.066f)
                curveTo(10.8253f, 7.0155f, 9.5627f, 7.4998f, 8.631f, 8.4059f)
                curveTo(7.6992f, 9.3119f, 7.1798f, 10.5604f, 7.1939f, 11.86f)
                curveTo(7.1653f, 12.5733f, 7.3954f, 13.273f, 7.8419f, 13.83f)
                curveTo(8.0133f, 13.9579f, 8.0794f, 14.1839f, 8.0039f, 14.384f)
                curveTo(7.9579f, 14.568f, 7.8419f, 15.007f, 7.7959f, 15.168f)
                curveTo(7.7765f, 15.2787f, 7.7057f, 15.3736f, 7.6051f, 15.4238f)
                curveTo(7.5044f, 15.4739f, 7.386f, 15.4732f, 7.2859f, 15.422f)
                curveTo(5.9019f, 14.868f, 5.2499f, 13.345f, 5.2499f, 11.606f)
                curveTo(5.2499f, 8.759f, 7.6339f, 5.351f, 12.4039f, 5.351f)
                curveTo(16.1999f, 5.351f, 18.7239f, 8.128f, 18.7239f, 11.098f)
                curveTo(18.7239f, 15.007f, 16.5469f, 17.946f, 13.3299f, 17.946f)
                curveTo(12.3528f, 17.9772f, 11.4273f, 17.5073f, 10.8759f, 16.7f)
                curveTo(10.8759f, 16.7f, 10.2979f, 19.016f, 10.1839f, 19.454f)
                curveTo(9.9512f, 20.2107f, 9.6078f, 20.9288f, 9.1649f, 21.585f)
                curveTo(10.0879f, 21.865f, 11.0469f, 22.005f, 12.0109f, 22.001f)
                curveTo(14.6639f, 22.0031f, 17.2087f, 20.9497f, 19.084f, 19.0731f)
                curveTo(20.9593f, 17.1965f, 22.0109f, 14.651f, 22.0069f, 11.998f)
                curveTo(22.0043f, 7.0042f, 18.3188f, 2.7775f, 13.3719f, 2.095f)
                lineTo(13.3699f, 2.094f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
