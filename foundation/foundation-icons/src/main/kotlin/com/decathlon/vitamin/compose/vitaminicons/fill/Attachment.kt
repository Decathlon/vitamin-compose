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

public val FillGroup.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 7.757f)
                lineTo(9.172f, 13.414f)
                curveTo(8.912f, 13.6651f, 8.8077f, 14.0369f, 8.8993f, 14.3865f)
                curveTo(8.9908f, 14.7361f, 9.2638f, 15.0092f, 9.6135f, 15.1007f)
                curveTo(9.9631f, 15.1922f, 10.3349f, 15.088f, 10.586f, 14.828f)
                lineTo(16.243f, 9.172f)
                curveTo(17.4146f, 8.0003f, 17.4146f, 6.1007f, 16.243f, 4.929f)
                curveTo(15.0713f, 3.7573f, 13.1716f, 3.7573f, 12.0f, 4.929f)
                lineTo(6.343f, 10.586f)
                curveTo(5.0532f, 11.8436f, 4.5397f, 13.6979f, 4.9987f, 15.4398f)
                curveTo(5.4577f, 17.1818f, 6.8183f, 18.5422f, 8.5603f, 19.0009f)
                curveTo(10.3023f, 19.4597f, 12.1565f, 18.9459f, 13.414f, 17.656f)
                lineTo(19.071f, 12.0f)
                lineTo(20.485f, 13.414f)
                lineTo(14.828f, 19.071f)
                curveTo(13.0595f, 20.8395f, 10.4819f, 21.5301f, 8.0661f, 20.8828f)
                curveTo(5.6504f, 20.2355f, 3.7634f, 18.3486f, 3.1161f, 15.9328f)
                curveTo(2.4688f, 13.5171f, 3.1595f, 10.9395f, 4.928f, 9.171f)
                lineTo(10.586f, 3.515f)
                curveTo(12.5479f, 1.6201f, 15.6664f, 1.6472f, 17.5951f, 3.5759f)
                curveTo(19.5237f, 5.5046f, 19.5508f, 8.6231f, 17.656f, 10.585f)
                lineTo(12.0f, 16.244f)
                curveTo(11.2418f, 17.0019f, 10.137f, 17.2978f, 9.1015f, 17.0203f)
                curveTo(8.066f, 16.7427f, 7.2573f, 15.9338f, 6.98f, 14.8983f)
                curveTo(6.7027f, 13.8627f, 6.9988f, 12.7579f, 7.757f, 12.0f)
                lineTo(13.414f, 6.343f)
                lineTo(14.828f, 7.757f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
