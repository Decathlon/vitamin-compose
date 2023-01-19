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

public val LineGroup.PriceTag: ImageVector
    get() {
        if (_priceTag != null) {
            return _priceTag!!
        }
        _priceTag = Builder(name = "PriceTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2666f, 1.4f)
                lineTo(13.8659f, 2.3433f)
                lineTo(14.8086f, 8.9433f)
                lineTo(8.6806f, 15.0713f)
                curveTo(8.5556f, 15.1963f, 8.3861f, 15.2665f, 8.2093f, 15.2665f)
                curveTo(8.0325f, 15.2665f, 7.863f, 15.1963f, 7.7379f, 15.0713f)
                lineTo(1.1379f, 8.4713f)
                curveTo(1.013f, 8.3463f, 0.9427f, 8.1768f, 0.9427f, 8.0f)
                curveTo(0.9427f, 7.8232f, 1.013f, 7.6537f, 1.1379f, 7.5287f)
                lineTo(7.2666f, 1.4f)
                close()
                moveTo(7.7379f, 2.8147f)
                lineTo(2.5519f, 8.0f)
                lineTo(8.2093f, 13.6567f)
                lineTo(13.3946f, 8.4713f)
                lineTo(12.6879f, 3.5213f)
                lineTo(7.7379f, 2.8147f)
                close()
                moveTo(9.1513f, 7.0573f)
                curveTo(8.9012f, 6.8071f, 8.7607f, 6.4679f, 8.7608f, 6.1141f)
                curveTo(8.7608f, 5.9389f, 8.7953f, 5.7655f, 8.8624f, 5.6037f)
                curveTo(8.9295f, 5.4419f, 9.0277f, 5.2948f, 9.1516f, 5.171f)
                curveTo(9.2755f, 5.0472f, 9.4226f, 4.9489f, 9.5844f, 4.8819f)
                curveTo(9.7462f, 4.8149f, 9.9197f, 4.7805f, 10.0948f, 4.7805f)
                curveTo(10.4486f, 4.7806f, 10.7878f, 4.9211f, 11.0379f, 5.1713f)
                curveTo(11.288f, 5.4215f, 11.4285f, 5.7608f, 11.4284f, 6.1146f)
                curveTo(11.4284f, 6.4683f, 11.2878f, 6.8076f, 11.0376f, 7.0577f)
                curveTo(10.7874f, 7.3078f, 10.4481f, 7.4482f, 10.0944f, 7.4482f)
                curveTo(9.7406f, 7.4481f, 9.4014f, 7.3075f, 9.1513f, 7.0573f)
                close()
            }
        }
        .build()
        return _priceTag!!
    }

private var _priceTag: ImageVector? = null
