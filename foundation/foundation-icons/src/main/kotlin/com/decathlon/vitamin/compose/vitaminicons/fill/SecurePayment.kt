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

public val FillGroup.SecurePayment: ImageVector
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
                curveTo(12.4772f, 2.9403f, 12.6668f, 3.1982f, 12.6667f, 3.49f)
                verticalLineTo(4.6667f)
                horizontalLineTo(14.0f)
                curveTo(14.3682f, 4.6667f, 14.6667f, 4.9651f, 14.6667f, 5.3333f)
                verticalLineTo(6.6667f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.3333f)
                curveTo(6.0f, 4.9651f, 6.2985f, 4.6667f, 6.6667f, 4.6667f)
                horizontalLineTo(11.3333f)
                verticalLineTo(3.98f)
                lineTo(7.3333f, 2.7293f)
                lineTo(3.3333f, 3.98f)
                verticalLineTo(8.916f)
                curveTo(3.3331f, 9.7432f, 3.7168f, 10.5237f, 4.372f, 11.0287f)
                lineTo(4.498f, 11.1193f)
                lineTo(7.3333f, 13.0533f)
                lineTo(9.8547f, 11.3333f)
                horizontalLineTo(6.6667f)
                curveTo(6.2985f, 11.3333f, 6.0f, 11.0349f, 6.0f, 10.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.6667f)
                verticalLineTo(10.6667f)
                curveTo(14.6667f, 11.0349f, 14.3682f, 11.3333f, 14.0f, 11.3333f)
                lineTo(11.8533f, 11.334f)
                curveTo(11.5953f, 11.674f, 11.282f, 11.974f, 10.92f, 12.2207f)
                lineTo(7.3333f, 14.6667f)
                lineTo(3.7467f, 12.2213f)
                curveTo(2.6537f, 11.4762f, 1.9999f, 10.2388f, 2.0f, 8.916f)
                verticalLineTo(3.49f)
                curveTo(2.0002f, 3.1985f, 2.1897f, 2.9409f, 2.468f, 2.854f)
                lineTo(7.3333f, 1.3333f)
                close()
            }
        }
        .build()
        return _securePayment!!
    }

private var _securePayment: ImageVector? = null
