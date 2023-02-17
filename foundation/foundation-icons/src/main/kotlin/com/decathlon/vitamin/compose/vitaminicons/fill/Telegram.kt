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

public val FillGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.89f, 13.17f)
                lineTo(8.903f, 13.163f)
                lineTo(9.773f, 16.033f)
                curveTo(9.885f, 16.344f, 10.039f, 16.4f, 10.226f, 16.374f)
                curveTo(10.414f, 16.349f, 10.513f, 16.248f, 10.636f, 16.13f)
                lineTo(11.824f, 14.982f)
                lineTo(14.374f, 16.87f)
                curveTo(14.84f, 17.127f, 15.175f, 16.994f, 15.291f, 16.438f)
                lineTo(16.948f, 8.616f)
                curveTo(17.131f, 7.888f, 16.811f, 7.596f, 16.246f, 7.828f)
                lineTo(6.513f, 11.588f)
                curveTo(5.849f, 11.854f, 5.853f, 12.226f, 6.393f, 12.391f)
                lineTo(8.89f, 13.171f)
                verticalLineTo(13.17f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
