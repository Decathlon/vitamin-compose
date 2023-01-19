package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.TempCold: ImageVector
    get() {
        if (_tempCold != null) {
            return _tempCold!!
        }
        _tempCold = Builder(name = "TempCold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3334f, 3.3333f)
                curveTo(5.3334f, 2.626f, 5.6143f, 1.9478f, 6.1144f, 1.4477f)
                curveTo(6.6145f, 0.9476f, 7.2928f, 0.6666f, 8.0f, 0.6666f)
                curveTo(8.7073f, 0.6666f, 9.3856f, 0.9476f, 9.8857f, 1.4477f)
                curveTo(10.3858f, 1.9478f, 10.6667f, 2.626f, 10.6667f, 3.3333f)
                verticalLineTo(6.8366f)
                curveTo(11.482f, 7.4043f, 12.0949f, 8.2175f, 12.4161f, 9.1576f)
                curveTo(12.7373f, 10.0978f, 12.7501f, 11.1159f, 12.4526f, 12.0638f)
                curveTo(12.155f, 13.0117f, 11.5628f, 13.8399f, 10.762f, 14.4279f)
                curveTo(9.9611f, 15.0159f, 8.9936f, 15.333f, 8.0f, 15.333f)
                curveTo(7.0065f, 15.333f, 6.0389f, 15.0159f, 5.2381f, 14.4279f)
                curveTo(4.4373f, 13.8399f, 3.845f, 13.0117f, 3.5475f, 12.0638f)
                curveTo(3.25f, 11.1159f, 3.2628f, 10.0978f, 3.584f, 9.1576f)
                curveTo(3.9052f, 8.2175f, 4.5181f, 7.4043f, 5.3334f, 6.8366f)
                verticalLineTo(3.3333f)
                close()
                moveTo(6.096f, 7.93f)
                curveTo(5.5135f, 8.3354f, 5.0755f, 8.9161f, 4.8459f, 9.5877f)
                curveTo(4.6164f, 10.2592f, 4.6071f, 10.9866f, 4.8195f, 11.6637f)
                curveTo(5.032f, 12.3409f, 5.455f, 12.9326f, 6.0271f, 13.3527f)
                curveTo(6.5991f, 13.7728f, 7.2903f, 13.9993f, 8.0f, 13.9993f)
                curveTo(8.7098f, 13.9993f, 9.401f, 13.7728f, 9.973f, 13.3527f)
                curveTo(10.5451f, 12.9326f, 10.9681f, 12.3409f, 11.1805f, 11.6637f)
                curveTo(11.393f, 10.9866f, 11.3837f, 10.2592f, 11.1541f, 9.5877f)
                curveTo(10.9245f, 8.9161f, 10.4866f, 8.3354f, 9.904f, 7.93f)
                lineTo(9.3334f, 7.532f)
                verticalLineTo(3.3333f)
                curveTo(9.3334f, 2.9797f, 9.1929f, 2.6405f, 8.9429f, 2.3905f)
                curveTo(8.6928f, 2.1404f, 8.3537f, 2.0f, 8.0f, 2.0f)
                curveTo(7.6464f, 2.0f, 7.3073f, 2.1404f, 7.0572f, 2.3905f)
                curveTo(6.8072f, 2.6405f, 6.6667f, 2.9797f, 6.6667f, 3.3333f)
                verticalLineTo(7.532f)
                lineTo(6.096f, 7.93f)
                close()
                moveTo(5.3334f, 10.6666f)
                horizontalLineTo(10.6667f)
                curveTo(10.6667f, 11.3739f, 10.3858f, 12.0521f, 9.8857f, 12.5522f)
                curveTo(9.3856f, 13.0523f, 8.7073f, 13.3333f, 8.0f, 13.3333f)
                curveTo(7.2928f, 13.3333f, 6.6145f, 13.0523f, 6.1144f, 12.5522f)
                curveTo(5.6143f, 12.0521f, 5.3334f, 11.3739f, 5.3334f, 10.6666f)
                close()
            }
        }
        .build()
        return _tempCold!!
    }

private var _tempCold: ImageVector? = null
