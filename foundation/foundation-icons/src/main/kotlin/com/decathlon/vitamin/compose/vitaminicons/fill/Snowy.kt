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

public val FillGroup.Snowy: ImageVector
    get() {
        if (_snowy != null) {
            return _snowy!!
        }
        _snowy = Builder(name = "Snowy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.018f, 11.62f)
                curveTo(2.8683f, 11.1585f, 1.915f, 10.3113f, 1.3217f, 9.2236f)
                curveTo(0.7284f, 8.136f, 0.5321f, 6.8758f, 0.7665f, 5.6593f)
                curveTo(1.0009f, 4.4427f, 1.6514f, 3.3457f, 2.6063f, 2.5564f)
                curveTo(3.5613f, 1.767f, 4.7611f, 1.3347f, 6.0f, 1.3334f)
                curveTo(7.0747f, 1.3333f, 8.1244f, 1.6578f, 9.0116f, 2.2644f)
                curveTo(9.8988f, 2.8709f, 10.5821f, 3.7313f, 10.972f, 4.7327f)
                curveTo(11.9104f, 4.6446f, 12.8467f, 4.9213f, 13.5865f, 5.5052f)
                curveTo(14.3263f, 6.0892f, 14.8128f, 6.9356f, 14.9451f, 7.8688f)
                curveTo(15.0773f, 8.8019f, 14.8452f, 9.7502f, 14.2968f, 10.5167f)
                curveTo(13.7484f, 11.2833f, 12.9259f, 11.8092f, 12.0f, 11.9854f)
                curveTo(11.9967f, 10.9585f, 11.5986f, 9.9721f, 10.8881f, 9.2307f)
                curveTo(10.1776f, 8.4892f, 9.2091f, 8.0494f, 8.1833f, 8.0024f)
                curveTo(7.1574f, 7.9554f, 6.1528f, 8.3047f, 5.3774f, 8.978f)
                curveTo(4.602f, 9.6513f, 4.1153f, 10.5971f, 4.018f, 11.6194f)
                verticalLineTo(11.62f)
                close()
                moveTo(8.6667f, 10.8447f)
                lineTo(9.976f, 10.0887f)
                lineTo(10.6427f, 11.2434f)
                lineTo(9.3334f, 12.0f)
                lineTo(10.6427f, 12.756f)
                lineTo(9.976f, 13.9107f)
                lineTo(8.6667f, 13.1547f)
                verticalLineTo(14.6667f)
                horizontalLineTo(7.3334f)
                verticalLineTo(13.1547f)
                lineTo(6.024f, 13.9107f)
                lineTo(5.3574f, 12.756f)
                lineTo(6.6667f, 12.0f)
                lineTo(5.3574f, 11.244f)
                lineTo(6.024f, 10.0894f)
                lineTo(7.3334f, 10.8454f)
                verticalLineTo(9.3334f)
                horizontalLineTo(8.6667f)
                verticalLineTo(10.8454f)
                verticalLineTo(10.8447f)
                close()
            }
        }
        .build()
        return _snowy!!
    }

private var _snowy: ImageVector? = null
