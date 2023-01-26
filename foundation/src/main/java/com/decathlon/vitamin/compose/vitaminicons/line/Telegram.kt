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

public val LineGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(14.1217f, 20.0f, 16.1566f, 19.1571f, 17.6569f, 17.6569f)
                curveTo(19.1571f, 16.1566f, 20.0f, 14.1217f, 20.0f, 12.0f)
                curveTo(20.0f, 9.8783f, 19.1571f, 7.8434f, 17.6569f, 6.3432f)
                curveTo(16.1566f, 4.8429f, 14.1217f, 4.0f, 12.0f, 4.0f)
                curveTo(9.8783f, 4.0f, 7.8434f, 4.8429f, 6.3432f, 6.3432f)
                curveTo(4.8429f, 7.8434f, 4.0f, 9.8783f, 4.0f, 12.0f)
                curveTo(4.0f, 14.1217f, 4.8429f, 16.1566f, 6.3432f, 17.6569f)
                curveTo(7.8434f, 19.1571f, 9.8783f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.89f, 13.17f)
                lineTo(6.392f, 12.391f)
                curveTo(5.852f, 12.226f, 5.849f, 11.854f, 6.513f, 11.587f)
                lineTo(16.246f, 7.827f)
                curveTo(16.811f, 7.597f, 17.131f, 7.888f, 16.948f, 8.617f)
                lineTo(15.291f, 16.437f)
                curveTo(15.175f, 16.994f, 14.84f, 17.127f, 14.375f, 16.87f)
                lineTo(11.824f, 14.982f)
                lineTo(10.635f, 16.13f)
                curveTo(10.513f, 16.248f, 10.414f, 16.349f, 10.226f, 16.374f)
                curveTo(10.039f, 16.4f, 9.885f, 16.344f, 9.772f, 16.034f)
                lineTo(8.902f, 13.163f)
                lineTo(8.89f, 13.171f)
                verticalLineTo(13.17f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
