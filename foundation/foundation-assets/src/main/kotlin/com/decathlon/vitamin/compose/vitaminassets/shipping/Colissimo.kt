package com.decathlon.vitamin.compose.vitaminassets.shipping

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.ShippingGroup

public val ShippingGroup.Colissimo: ImageVector
    get() {
        if (_colissimo != null) {
            return _colissimo!!
        }
        _colissimo = Builder(name = "Colissimo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFEC8308)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3366f, 10.9409f)
                curveTo(15.2565f, 10.9874f, 15.1291f, 10.9828f, 15.0513f, 10.9362f)
                lineTo(14.5868f, 10.6639f)
                curveTo(14.549f, 10.6406f, 14.5137f, 10.6034f, 14.4877f, 10.5592f)
                curveTo(14.4854f, 10.5568f, 14.4854f, 10.5545f, 14.483f, 10.5522f)
                curveTo(14.4524f, 10.5056f, 14.4359f, 10.4544f, 14.4359f, 10.4079f)
                lineTo(14.4241f, 9.8749f)
                curveTo(14.4217f, 9.7841f, 14.4807f, 9.6747f, 14.5608f, 9.6281f)
                lineTo(20.1352f, 6.4231f)
                lineTo(12.3136f, 2.2127f)
                curveTo(12.2264f, 2.1661f, 12.1132f, 2.1428f, 12.0f, 2.1428f)
                curveTo(11.8868f, 2.1428f, 11.7713f, 2.1661f, 11.6864f, 2.2127f)
                lineTo(3.8625f, 6.4208f)
                lineTo(12.6273f, 11.4576f)
                curveTo(12.7074f, 11.5018f, 12.7711f, 11.6065f, 12.7711f, 11.6996f)
                verticalLineTo(19.0476f)
                curveTo(12.7711f, 19.1407f, 12.7051f, 19.2455f, 12.6225f, 19.2897f)
                lineTo(12.1509f, 19.5481f)
                curveTo(12.1108f, 19.569f, 12.0613f, 19.5806f, 12.0094f, 19.5806f)
                curveTo(12.0071f, 19.5806f, 12.0024f, 19.5806f, 12.0f, 19.5806f)
                curveTo(11.9434f, 19.583f, 11.8915f, 19.5713f, 11.8491f, 19.5481f)
                lineTo(11.3751f, 19.2874f)
                curveTo(11.295f, 19.2455f, 11.2289f, 19.1384f, 11.2289f, 19.0453f)
                verticalLineTo(12.4957f)
                curveTo(11.2242f, 12.4468f, 11.1889f, 12.3886f, 11.1511f, 12.3676f)
                lineTo(3.4286f, 7.9314f)
                verticalLineTo(16.6224f)
                curveTo(3.4286f, 16.8179f, 3.5677f, 17.0576f, 3.7375f, 17.1554f)
                lineTo(11.6911f, 21.7848f)
                curveTo(11.776f, 21.8337f, 11.8892f, 21.8593f, 12.0f, 21.857f)
                curveTo(12.1108f, 21.857f, 12.224f, 21.8337f, 12.3089f, 21.7848f)
                lineTo(20.2625f, 17.1554f)
                curveTo(20.4323f, 17.0553f, 20.5714f, 16.8179f, 20.5714f, 16.6224f)
                verticalLineTo(7.9314f)
                lineTo(15.3366f, 10.9409f)
                close()
            }
        }
        .build()
        return _colissimo!!
    }

private var _colissimo: ImageVector? = null
