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

public val LineGroup.BankCard: ImageVector
    get() {
        if (_bankCard != null) {
            return _bankCard!!
        }
        _bankCard = Builder(name = "BankCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9966f, 2.0f)
                horizontalLineTo(13.9936f)
                curveTo(14.1703f, 2.0f, 14.3399f, 2.0702f, 14.4649f, 2.1952f)
                curveTo(14.5899f, 2.3202f, 14.6601f, 2.4897f, 14.6601f, 2.6665f)
                verticalLineTo(13.3305f)
                curveTo(14.6601f, 13.5073f, 14.5899f, 13.6768f, 14.4649f, 13.8018f)
                curveTo(14.3399f, 13.9268f, 14.1703f, 13.997f, 13.9936f, 13.997f)
                horizontalLineTo(1.9966f)
                curveTo(1.8198f, 13.997f, 1.6503f, 13.9268f, 1.5253f, 13.8018f)
                curveTo(1.4003f, 13.6768f, 1.3301f, 13.5073f, 1.3301f, 13.3305f)
                verticalLineTo(2.6665f)
                curveTo(1.3301f, 2.4897f, 1.4003f, 2.3202f, 1.5253f, 2.1952f)
                curveTo(1.6503f, 2.0702f, 1.8198f, 2.0f, 1.9966f, 2.0f)
                close()
                moveTo(13.3271f, 7.332f)
                horizontalLineTo(2.6631f)
                verticalLineTo(12.664f)
                horizontalLineTo(13.3271f)
                verticalLineTo(7.332f)
                close()
                moveTo(13.3271f, 5.999f)
                verticalLineTo(3.333f)
                horizontalLineTo(2.6631f)
                verticalLineTo(5.999f)
                horizontalLineTo(13.3271f)
                close()
                moveTo(9.3281f, 9.998f)
                horizontalLineTo(11.9941f)
                verticalLineTo(11.331f)
                horizontalLineTo(9.3281f)
                verticalLineTo(9.998f)
                close()
            }
        }
        .build()
        return _bankCard!!
    }

private var _bankCard: ImageVector? = null
