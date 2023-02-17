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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9f, 2.1f)
                lineTo(20.799f, 3.515f)
                lineTo(22.213f, 13.415f)
                lineTo(13.021f, 22.607f)
                curveTo(12.8334f, 22.7945f, 12.5791f, 22.8998f, 12.314f, 22.8998f)
                curveTo(12.0488f, 22.8998f, 11.7945f, 22.7945f, 11.607f, 22.607f)
                lineTo(1.707f, 12.707f)
                curveTo(1.5195f, 12.5195f, 1.4142f, 12.2652f, 1.4142f, 12.0f)
                curveTo(1.4142f, 11.7348f, 1.5195f, 11.4805f, 1.707f, 11.293f)
                lineTo(10.9f, 2.1f)
                close()
                moveTo(11.607f, 4.222f)
                lineTo(3.828f, 12.0f)
                lineTo(12.314f, 20.485f)
                lineTo(20.092f, 12.707f)
                lineTo(19.032f, 5.282f)
                lineTo(11.607f, 4.222f)
                close()
                moveTo(13.727f, 10.586f)
                curveTo(13.3518f, 10.2107f, 13.1411f, 9.7018f, 13.1412f, 9.1712f)
                curveTo(13.1413f, 8.9084f, 13.1931f, 8.6482f, 13.2936f, 8.4055f)
                curveTo(13.3942f, 8.1628f, 13.5417f, 7.9423f, 13.7275f, 7.7565f)
                curveTo(13.9133f, 7.5708f, 14.1339f, 7.4234f, 14.3766f, 7.3229f)
                curveTo(14.6194f, 7.2224f, 14.8796f, 7.1707f, 15.1423f, 7.1708f)
                curveTo(15.673f, 7.1708f, 16.1818f, 7.3817f, 16.557f, 7.757f)
                curveTo(16.9321f, 8.1323f, 17.1428f, 8.6412f, 17.1427f, 9.1719f)
                curveTo(17.1426f, 9.7025f, 16.9318f, 10.2114f, 16.5565f, 10.5865f)
                curveTo(16.1812f, 10.9617f, 15.6723f, 11.1724f, 15.1416f, 11.1723f)
                curveTo(14.611f, 11.1722f, 14.1021f, 10.9613f, 13.727f, 10.586f)
                close()
            }
        }
        .build()
        return _priceTag!!
    }

private var _priceTag: ImageVector? = null
