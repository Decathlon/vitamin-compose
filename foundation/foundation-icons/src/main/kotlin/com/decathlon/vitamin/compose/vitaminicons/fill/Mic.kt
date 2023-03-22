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

public val FillGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 1.0f)
                curveTo(12.6565f, 1.0f, 13.3067f, 1.1293f, 13.9133f, 1.3806f)
                curveTo(14.52f, 1.6319f, 15.0712f, 2.0002f, 15.5355f, 2.4645f)
                curveTo(15.9998f, 2.9288f, 16.3681f, 3.4799f, 16.6193f, 4.0866f)
                curveTo(16.8706f, 4.6932f, 16.9999f, 5.3434f, 16.9999f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(16.9999f, 11.3261f, 16.4731f, 12.5979f, 15.5355f, 13.5355f)
                curveTo(14.5978f, 14.4732f, 13.326f, 15.0f, 11.9999f, 15.0f)
                curveTo(10.6738f, 15.0f, 9.4021f, 14.4732f, 8.4644f, 13.5355f)
                curveTo(7.5267f, 12.5979f, 6.9999f, 11.3261f, 6.9999f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(6.9999f, 4.6739f, 7.5267f, 3.4021f, 8.4644f, 2.4645f)
                curveTo(9.4021f, 1.5268f, 10.6738f, 1.0f, 11.9999f, 1.0f)
                close()
                moveTo(3.0549f, 11.0f)
                horizontalLineTo(5.0699f)
                curveTo(5.3122f, 12.6648f, 6.1458f, 14.1867f, 7.4182f, 15.2873f)
                curveTo(8.6905f, 16.3879f, 10.3166f, 16.9936f, 11.9989f, 16.9936f)
                curveTo(13.6813f, 16.9936f, 15.3073f, 16.3879f, 16.5797f, 15.2873f)
                curveTo(17.8521f, 14.1867f, 18.6856f, 12.6648f, 18.9279f, 11.0f)
                horizontalLineTo(20.9439f)
                curveTo(20.7166f, 13.0287f, 19.8066f, 14.9199f, 18.3631f, 16.3635f)
                curveTo(16.9197f, 17.8071f, 15.0286f, 18.7174f, 12.9999f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.9999f)
                verticalLineTo(18.945f)
                curveTo(8.9711f, 18.7176f, 7.0797f, 17.8074f, 5.6361f, 16.3638f)
                curveTo(4.1925f, 14.9202f, 3.2823f, 13.0289f, 3.0549f, 11.0f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
