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

public val LineGroup.Walk: ImageVector
    get() {
        if (_walk != null) {
            return _walk!!
        }
        _walk = Builder(name = "Walk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.617f, 8.712f)
                lineTo(10.822f, 6.384f)
                curveTo(11.1818f, 6.1207f, 11.6194f, 5.9855f, 12.065f, 6.0f)
                curveTo(12.6085f, 6.0135f, 13.1343f, 6.1961f, 13.5693f, 6.5223f)
                curveTo(14.0042f, 6.8485f, 14.3268f, 7.3021f, 14.492f, 7.82f)
                curveTo(14.678f, 8.403f, 14.848f, 8.797f, 15.002f, 9.002f)
                curveTo(15.4673f, 9.6228f, 16.0709f, 10.1266f, 16.7649f, 10.4734f)
                curveTo(17.4589f, 10.8203f, 18.2242f, 11.0005f, 19.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(17.9673f, 13.0011f, 16.9472f, 12.7733f, 16.0131f, 12.3329f)
                curveTo(15.079f, 11.8925f, 14.2542f, 11.2504f, 13.598f, 10.453f)
                lineTo(12.901f, 14.408f)
                lineTo(14.962f, 16.138f)
                lineTo(17.185f, 22.246f)
                lineTo(15.305f, 22.93f)
                lineTo(13.265f, 17.326f)
                lineTo(9.875f, 14.481f)
                curveTo(9.5968f, 14.2564f, 9.3839f, 13.9612f, 9.2585f, 13.6264f)
                curveTo(9.1331f, 13.2915f, 9.0998f, 12.9291f, 9.162f, 12.577f)
                lineTo(9.671f, 9.692f)
                lineTo(8.994f, 10.184f)
                lineTo(6.867f, 13.112f)
                lineTo(5.249f, 11.936f)
                lineTo(7.6f, 8.7f)
                lineTo(7.617f, 8.712f)
                close()
                moveTo(13.5f, 5.5f)
                curveTo(12.9696f, 5.5f, 12.4609f, 5.2893f, 12.0858f, 4.9142f)
                curveTo(11.7107f, 4.5391f, 11.5f, 4.0304f, 11.5f, 3.5f)
                curveTo(11.5f, 2.9696f, 11.7107f, 2.4609f, 12.0858f, 2.0858f)
                curveTo(12.4609f, 1.7107f, 12.9696f, 1.5f, 13.5f, 1.5f)
                curveTo(14.0305f, 1.5f, 14.5392f, 1.7107f, 14.9142f, 2.0858f)
                curveTo(15.2893f, 2.4609f, 15.5f, 2.9696f, 15.5f, 3.5f)
                curveTo(15.5f, 4.0304f, 15.2893f, 4.5391f, 14.9142f, 4.9142f)
                curveTo(14.5392f, 5.2893f, 14.0305f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(10.528f, 18.681f)
                lineTo(7.314f, 22.511f)
                lineTo(5.782f, 21.226f)
                lineTo(8.758f, 17.68f)
                lineTo(9.504f, 15.5f)
                lineTo(11.295f, 17.0f)
                lineTo(10.528f, 18.681f)
                close()
            }
        }
        .build()
        return _walk!!
    }

private var _walk: ImageVector? = null
