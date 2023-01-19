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

public val LineGroup.SecurePayment: ImageVector
    get() {
        if (_securePayment != null) {
            return _securePayment!!
        }
        _securePayment = Builder(name = "SecurePayment", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3333f, 1.3333f)
                lineTo(12.1987f, 2.8533f)
                curveTo(12.3344f, 2.8957f, 12.453f, 2.9803f, 12.5372f, 3.0949f)
                curveTo(12.6214f, 3.2094f, 12.6667f, 3.3479f, 12.6667f, 3.49f)
                verticalLineTo(4.6667f)
                horizontalLineTo(14.0f)
                curveTo(14.1768f, 4.6667f, 14.3464f, 4.7369f, 14.4714f, 4.8619f)
                curveTo(14.5964f, 4.987f, 14.6667f, 5.1565f, 14.6667f, 5.3333f)
                verticalLineTo(10.6667f)
                curveTo(14.6667f, 10.8435f, 14.5964f, 11.0131f, 14.4714f, 11.1381f)
                curveTo(14.3464f, 11.2631f, 14.1768f, 11.3333f, 14.0f, 11.3333f)
                lineTo(11.8533f, 11.334f)
                curveTo(11.5953f, 11.674f, 11.282f, 11.974f, 10.92f, 12.2207f)
                lineTo(7.3333f, 14.6667f)
                lineTo(3.7467f, 12.2213f)
                curveTo(3.2083f, 11.8543f, 2.7678f, 11.3613f, 2.4634f, 10.7853f)
                curveTo(2.159f, 10.2092f, 1.9999f, 9.5675f, 2.0f, 8.916f)
                verticalLineTo(3.49f)
                curveTo(2.0001f, 3.348f, 2.0455f, 3.2097f, 2.1297f, 3.0953f)
                curveTo(2.2139f, 2.9809f, 2.3324f, 2.8963f, 2.468f, 2.854f)
                lineTo(7.3333f, 1.3333f)
                close()
                moveTo(7.3333f, 2.7293f)
                lineTo(3.3333f, 3.98f)
                verticalLineTo(8.916f)
                curveTo(3.3332f, 9.3242f, 3.4268f, 9.7269f, 3.6069f, 10.0932f)
                curveTo(3.787f, 10.4594f, 4.0487f, 10.7795f, 4.372f, 11.0287f)
                lineTo(4.498f, 11.1193f)
                lineTo(7.3333f, 13.0533f)
                lineTo(9.8547f, 11.3333f)
                horizontalLineTo(6.6667f)
                curveTo(6.4899f, 11.3333f, 6.3203f, 11.2631f, 6.1953f, 11.1381f)
                curveTo(6.0702f, 11.0131f, 6.0f, 10.8435f, 6.0f, 10.6667f)
                verticalLineTo(5.3333f)
                curveTo(6.0f, 5.1565f, 6.0702f, 4.987f, 6.1953f, 4.8619f)
                curveTo(6.3203f, 4.7369f, 6.4899f, 4.6667f, 6.6667f, 4.6667f)
                horizontalLineTo(11.3333f)
                verticalLineTo(3.98f)
                lineTo(7.3333f, 2.7293f)
                close()
                moveTo(7.3333f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.3333f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.3333f)
                close()
                moveTo(7.3333f, 6.6667f)
                horizontalLineTo(13.3333f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(6.6667f)
                close()
            }
        }
        .build()
        return _securePayment!!
    }

private var _securePayment: ImageVector? = null
