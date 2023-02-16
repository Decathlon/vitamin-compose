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

public val FillGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.9907f)
                curveTo(5.0293f, 13.9332f, 4.0898f, 13.6269f, 3.2718f, 13.1013f)
                curveTo(2.4538f, 12.5757f, 1.7847f, 11.8484f, 1.3291f, 10.9894f)
                curveTo(0.8734f, 10.1305f, 0.6464f, 9.1687f, 0.67f, 8.1967f)
                curveTo(0.6935f, 7.2246f, 0.9668f, 6.275f, 1.4635f, 5.4391f)
                curveTo(1.9603f, 4.6032f, 2.6637f, 3.9092f, 3.5062f, 3.4238f)
                curveTo(4.3487f, 2.9384f, 5.302f, 2.678f, 6.2743f, 2.6676f)
                curveTo(7.2465f, 2.6571f, 8.2051f, 2.8971f, 9.0579f, 3.3643f)
                curveTo(9.9106f, 3.8315f, 10.6288f, 4.5103f, 11.1433f, 5.3353f)
                curveTo(12.2516f, 5.3707f, 13.3041f, 5.8296f, 14.0843f, 6.6176f)
                curveTo(14.8645f, 7.4056f, 15.3129f, 8.4627f, 15.3372f, 9.5713f)
                curveTo(15.3616f, 10.6799f, 14.96f, 11.7557f, 14.2152f, 12.5771f)
                curveTo(13.4704f, 13.3986f, 12.439f, 13.9033f, 11.3333f, 13.9873f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.9907f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
