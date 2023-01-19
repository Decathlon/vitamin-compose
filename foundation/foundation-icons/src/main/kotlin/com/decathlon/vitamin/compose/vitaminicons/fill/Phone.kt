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

public val FillGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.9467f)
                verticalLineTo(13.304f)
                curveTo(14.0001f, 13.4728f, 13.9361f, 13.6353f, 13.8211f, 13.7588f)
                curveTo(13.706f, 13.8823f, 13.5484f, 13.9575f, 13.38f, 13.9693f)
                curveTo(13.0887f, 13.9893f, 12.8507f, 14.0f, 12.6667f, 14.0f)
                curveTo(6.7753f, 14.0f, 2.0f, 9.2247f, 2.0f, 3.3333f)
                curveTo(2.0f, 3.1493f, 2.01f, 2.9113f, 2.0307f, 2.62f)
                curveTo(2.0425f, 2.4516f, 2.1177f, 2.294f, 2.2412f, 2.1789f)
                curveTo(2.3647f, 2.0639f, 2.5272f, 1.9999f, 2.696f, 2.0f)
                horizontalLineTo(5.0533f)
                curveTo(5.136f, 1.9999f, 5.2158f, 2.0306f, 5.2772f, 2.086f)
                curveTo(5.3385f, 2.1414f, 5.3771f, 2.2177f, 5.3853f, 2.3f)
                curveTo(5.4007f, 2.4533f, 5.4147f, 2.5753f, 5.428f, 2.668f)
                curveTo(5.5605f, 3.5926f, 5.832f, 4.4919f, 6.2333f, 5.3353f)
                curveTo(6.2967f, 5.4687f, 6.2553f, 5.628f, 6.1353f, 5.7133f)
                lineTo(4.6967f, 6.7413f)
                curveTo(5.5763f, 8.791f, 7.2097f, 10.4244f, 9.2593f, 11.304f)
                lineTo(10.286f, 9.868f)
                curveTo(10.328f, 9.8093f, 10.3892f, 9.7673f, 10.459f, 9.7491f)
                curveTo(10.5288f, 9.731f, 10.6028f, 9.7379f, 10.668f, 9.7687f)
                curveTo(11.5113f, 10.1692f, 12.4104f, 10.4401f, 13.3347f, 10.572f)
                curveTo(13.4273f, 10.5853f, 13.5493f, 10.6f, 13.7013f, 10.6147f)
                curveTo(13.7835f, 10.6231f, 13.8596f, 10.6617f, 13.9149f, 10.7231f)
                curveTo(13.9702f, 10.7844f, 14.0008f, 10.8641f, 14.0007f, 10.9467f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
