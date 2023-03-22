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

public val LineGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(4.4564f, 2.0f, 4.8496f, 2.3079f, 4.9656f, 2.7397f)
                lineTo(4.9887f, 2.8502f)
                lineTo(5.466f, 5.997f)
                lineTo(21.0f, 5.9968f)
                curveTo(21.5996f, 5.9968f, 22.0547f, 6.5172f, 21.9952f, 7.0967f)
                lineTo(21.9763f, 7.2132f)
                lineTo(19.9807f, 16.2159f)
                curveTo(19.8877f, 16.6356f, 19.5388f, 16.9443f, 19.1202f, 16.9928f)
                lineTo(19.0044f, 16.9995f)
                horizontalLineTo(5.9697f)
                curveTo(5.5133f, 16.9995f, 5.1202f, 16.6916f, 5.0041f, 16.2598f)
                lineTo(4.981f, 16.1493f)
                lineTo(3.141f, 4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(6.0f, 21.0f)
                curveTo(6.0f, 22.1046f, 6.8954f, 23.0f, 8.0f, 23.0f)
                curveTo(9.1046f, 23.0f, 10.0f, 22.1046f, 10.0f, 21.0f)
                curveTo(10.0f, 19.8954f, 9.1046f, 19.0f, 8.0f, 19.0f)
                curveTo(6.8954f, 19.0f, 6.0f, 19.8954f, 6.0f, 21.0f)
                close()
                moveTo(15.0f, 21.0f)
                curveTo(15.0f, 22.1046f, 15.8954f, 23.0f, 17.0f, 23.0f)
                curveTo(18.1046f, 23.0f, 19.0f, 22.1046f, 19.0f, 21.0f)
                curveTo(19.0f, 19.8954f, 18.1046f, 19.0f, 17.0f, 19.0f)
                curveTo(15.8954f, 19.0f, 15.0f, 19.8954f, 15.0f, 21.0f)
                close()
                moveTo(5.769f, 7.997f)
                lineTo(6.83f, 15.0f)
                horizontalLineTo(18.203f)
                lineTo(19.755f, 7.997f)
                horizontalLineTo(5.769f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
