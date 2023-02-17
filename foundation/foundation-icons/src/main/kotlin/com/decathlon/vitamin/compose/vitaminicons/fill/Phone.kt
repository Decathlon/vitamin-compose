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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.42f)
                verticalLineTo(19.956f)
                curveTo(21.0001f, 20.2092f, 20.9042f, 20.453f, 20.7316f, 20.6382f)
                curveTo(20.559f, 20.8234f, 20.3226f, 20.9363f, 20.07f, 20.954f)
                curveTo(19.633f, 20.984f, 19.276f, 21.0f, 19.0f, 21.0f)
                curveTo(10.163f, 21.0f, 3.0f, 13.837f, 3.0f, 5.0f)
                curveTo(3.0f, 4.724f, 3.015f, 4.367f, 3.046f, 3.93f)
                curveTo(3.0637f, 3.6774f, 3.1766f, 3.441f, 3.3618f, 3.2684f)
                curveTo(3.547f, 3.0958f, 3.7908f, 2.9999f, 4.044f, 3.0f)
                horizontalLineTo(7.58f)
                curveTo(7.704f, 2.9999f, 7.8237f, 3.0459f, 7.9157f, 3.129f)
                curveTo(8.0078f, 3.2122f, 8.0656f, 3.3266f, 8.078f, 3.45f)
                curveTo(8.101f, 3.68f, 8.122f, 3.863f, 8.142f, 4.002f)
                curveTo(8.3407f, 5.3889f, 8.748f, 6.7378f, 9.35f, 8.003f)
                curveTo(9.445f, 8.203f, 9.383f, 8.442f, 9.203f, 8.57f)
                lineTo(7.045f, 10.112f)
                curveTo(8.3645f, 13.1865f, 10.8145f, 15.6365f, 13.889f, 16.956f)
                lineTo(15.429f, 14.802f)
                curveTo(15.4919f, 14.714f, 15.5838f, 14.6509f, 15.6885f, 14.6237f)
                curveTo(15.7932f, 14.5964f, 15.9042f, 14.6068f, 16.002f, 14.653f)
                curveTo(17.267f, 15.2539f, 18.6156f, 15.6601f, 20.002f, 15.858f)
                curveTo(20.141f, 15.878f, 20.324f, 15.9f, 20.552f, 15.922f)
                curveTo(20.6752f, 15.9346f, 20.7894f, 15.9926f, 20.8724f, 16.0846f)
                curveTo(20.9553f, 16.1766f, 21.0012f, 16.2961f, 21.001f, 16.42f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
