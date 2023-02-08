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

public val FillGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9656f, 2.7397f)
                curveTo(4.8496f, 2.3079f, 4.4564f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.141f)
                lineTo(4.981f, 16.1493f)
                lineTo(5.0041f, 16.2598f)
                curveTo(5.1202f, 16.6916f, 5.5133f, 16.9995f, 5.9697f, 16.9995f)
                horizontalLineTo(19.0044f)
                lineTo(19.1202f, 16.9928f)
                curveTo(19.5388f, 16.9443f, 19.8877f, 16.6356f, 19.9807f, 16.2159f)
                lineTo(21.9763f, 7.2132f)
                lineTo(21.9952f, 7.0967f)
                curveTo(22.0547f, 6.5172f, 21.5996f, 5.9968f, 21.0f, 5.9968f)
                lineTo(5.466f, 5.997f)
                lineTo(4.9887f, 2.8502f)
                lineTo(4.9656f, 2.7397f)
                close()
                moveTo(8.0f, 23.0f)
                curveTo(6.8954f, 23.0f, 6.0f, 22.1046f, 6.0f, 21.0f)
                curveTo(6.0f, 19.8954f, 6.8954f, 19.0f, 8.0f, 19.0f)
                curveTo(9.1046f, 19.0f, 10.0f, 19.8954f, 10.0f, 21.0f)
                curveTo(10.0f, 22.1046f, 9.1046f, 23.0f, 8.0f, 23.0f)
                close()
                moveTo(17.0f, 23.0f)
                curveTo(15.8954f, 23.0f, 15.0f, 22.1046f, 15.0f, 21.0f)
                curveTo(15.0f, 19.8954f, 15.8954f, 19.0f, 17.0f, 19.0f)
                curveTo(18.1046f, 19.0f, 19.0f, 19.8954f, 19.0f, 21.0f)
                curveTo(19.0f, 22.1046f, 18.1046f, 23.0f, 17.0f, 23.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
