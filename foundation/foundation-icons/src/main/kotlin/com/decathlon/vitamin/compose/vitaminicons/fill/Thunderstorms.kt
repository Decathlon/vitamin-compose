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

public val FillGroup.Thunderstorms: ImageVector
    get() {
        if (_thunderstorms != null) {
            return _thunderstorms!!
        }
        _thunderstorms = Builder(name = "Thunderstorms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9879f, 18.0f)
                lineTo(18.2039f, 16.42f)
                curveTo(18.3748f, 16.198f, 18.4802f, 15.9325f, 18.5079f, 15.6537f)
                curveTo(18.5357f, 15.3749f, 18.4848f, 15.0938f, 18.3611f, 14.8424f)
                curveTo(18.2373f, 14.5911f, 18.0456f, 14.3794f, 17.8077f, 14.2313f)
                curveTo(17.5697f, 14.0833f, 17.2951f, 14.0049f, 17.0149f, 14.005f)
                horizontalLineTo(14.9999f)
                verticalLineTo(10.029f)
                curveTo(15.0001f, 9.7155f, 14.902f, 9.4099f, 14.7196f, 9.155f)
                curveTo(14.5371f, 8.9001f, 14.2793f, 8.7088f, 13.9825f, 8.6079f)
                curveTo(13.6857f, 8.5071f, 13.3647f, 8.5017f, 13.0647f, 8.5927f)
                curveTo(12.7647f, 8.6837f, 12.5008f, 8.8663f, 12.3099f, 9.115f)
                lineTo(5.9449f, 17.396f)
                curveTo(4.2344f, 16.6882f, 2.8222f, 15.4093f, 1.9489f, 13.777f)
                curveTo(1.0756f, 12.1448f, 0.7952f, 10.2603f, 1.1555f, 8.4445f)
                curveTo(1.5158f, 6.6288f, 2.4945f, 4.9941f, 3.9248f, 3.819f)
                curveTo(5.3552f, 2.6439f, 7.1487f, 2.001f, 8.9999f, 2.0f)
                curveTo(10.612f, 1.9999f, 12.1865f, 2.4866f, 13.5172f, 3.3965f)
                curveTo(14.848f, 4.3063f, 15.873f, 5.5968f, 16.4579f, 7.099f)
                curveTo(17.2103f, 6.9543f, 17.9845f, 6.9684f, 18.7311f, 7.1403f)
                curveTo(19.4777f, 7.3123f, 20.1801f, 7.6383f, 20.7934f, 8.0975f)
                curveTo(21.4067f, 8.5567f, 21.9172f, 9.139f, 22.2923f, 9.807f)
                curveTo(22.6675f, 10.475f, 22.8989f, 11.214f, 22.9718f, 11.9767f)
                curveTo(23.0447f, 12.7393f, 22.9575f, 13.5088f, 22.7157f, 14.2358f)
                curveTo(22.4739f, 14.9627f, 22.0829f, 15.6312f, 21.5677f, 16.1983f)
                curveTo(21.0526f, 16.7653f, 20.4246f, 17.2185f, 19.7241f, 17.5288f)
                curveTo(19.0236f, 17.8391f, 18.2661f, 17.9996f, 17.4999f, 18.0f)
                horizontalLineTo(16.9879f)
                close()
                moveTo(12.9999f, 16.005f)
                horizontalLineTo(15.9999f)
                lineTo(10.9999f, 22.505f)
                verticalLineTo(18.005f)
                horizontalLineTo(7.9999f)
                lineTo(12.9999f, 11.5f)
                verticalLineTo(16.005f)
                close()
            }
        }
        .build()
        return _thunderstorms!!
    }

private var _thunderstorms: ImageVector? = null
