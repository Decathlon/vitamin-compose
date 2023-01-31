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

public val FillGroup.MoonCloudy: ImageVector
    get() {
        if (_moonCloudy != null) {
            return _moonCloudy!!
        }
        _moonCloudy = Builder(name = "MoonCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6701f, 5.0071f)
                curveTo(9.3264f, 3.6187f, 10.421f, 2.4847f, 11.7854f, 1.7797f)
                curveTo(13.1497f, 1.0748f, 14.708f, 0.8381f, 16.2201f, 1.1061f)
                curveTo(15.9623f, 1.8959f, 15.9283f, 2.7418f, 16.1217f, 3.5498f)
                curveTo(16.3152f, 4.3578f, 16.7286f, 5.0965f, 17.3161f, 5.6841f)
                curveTo(17.9036f, 6.2716f, 18.6423f, 6.685f, 19.4503f, 6.8784f)
                curveTo(20.2584f, 7.0719f, 21.1042f, 7.0378f, 21.8941f, 6.7801f)
                curveTo(21.9641f, 7.1761f, 22.0001f, 7.5841f, 22.0001f, 8.0001f)
                curveTo(22.0018f, 9.1795f, 21.7042f, 10.34f, 21.1351f, 11.3731f)
                curveTo(21.9735f, 12.1117f, 22.5671f, 13.0881f, 22.8368f, 14.1725f)
                curveTo(23.1065f, 15.2568f, 23.0396f, 16.3976f, 22.6449f, 17.4429f)
                curveTo(22.2502f, 18.4882f, 21.5464f, 19.3886f, 20.6274f, 20.024f)
                curveTo(19.7083f, 20.6595f, 18.6175f, 20.9999f, 17.5001f, 21.0001f)
                horizontalLineTo(9.0001f)
                curveTo(6.9077f, 20.9989f, 4.8991f, 20.178f, 3.4048f, 18.7134f)
                curveTo(1.9105f, 17.2488f, 1.0495f, 15.257f, 1.0063f, 13.1651f)
                curveTo(0.9632f, 11.0732f, 1.7413f, 9.0476f, 3.1739f, 7.5226f)
                curveTo(4.6065f, 5.9976f, 6.5795f, 5.0946f, 8.6701f, 5.0071f)
                close()
                moveTo(10.8471f, 5.2141f)
                curveTo(12.1073f, 5.5144f, 13.276f, 6.1157f, 14.253f, 6.9664f)
                curveTo(15.2301f, 7.8172f, 15.9863f, 8.8921f, 16.4571f, 10.0991f)
                curveTo(17.4476f, 9.9092f, 18.4712f, 9.9939f, 19.4171f, 10.3441f)
                curveTo(19.6431f, 9.9191f, 19.8101f, 9.4591f, 19.9051f, 8.9741f)
                curveTo(18.3928f, 8.8347f, 16.9771f, 8.1704f, 15.9035f, 7.0963f)
                curveTo(14.8298f, 6.0223f, 14.1659f, 4.6063f, 14.0271f, 3.0941f)
                curveTo(12.7283f, 3.3521f, 11.5848f, 4.1144f, 10.8471f, 5.2141f)
                close()
            }
        }
        .build()
        return _moonCloudy!!
    }

private var _moonCloudy: ImageVector? = null
