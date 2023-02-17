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
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                lineTo(18.298f, 4.28f)
                curveTo(18.7158f, 4.4104f, 19.0002f, 4.7973f, 19.0f, 5.235f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 7.0f, 22.0f, 7.4477f, 22.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                curveTo(9.0f, 7.4477f, 9.4477f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.97f)
                lineTo(11.0f, 4.094f)
                lineTo(5.0f, 5.97f)
                verticalLineTo(13.374f)
                curveTo(4.9997f, 14.6148f, 5.5753f, 15.7855f, 6.558f, 16.543f)
                lineTo(6.747f, 16.679f)
                lineTo(11.0f, 19.58f)
                lineTo(14.782f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 17.0f, 9.0f, 16.5523f, 9.0f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.5523f, 21.5523f, 17.0f, 21.0f, 17.0f)
                lineTo(17.78f, 17.001f)
                curveTo(17.393f, 17.511f, 16.923f, 17.961f, 16.38f, 18.331f)
                lineTo(11.0f, 22.0f)
                lineTo(5.62f, 18.332f)
                curveTo(3.9806f, 17.2142f, 2.9998f, 15.3582f, 3.0f, 13.374f)
                verticalLineTo(5.235f)
                curveTo(3.0003f, 4.7977f, 3.2846f, 4.4113f, 3.702f, 4.281f)
                lineTo(11.0f, 2.0f)
                close()
            }
        }
        .build()
        return _securePayment!!
    }

private var _securePayment: ImageVector? = null
