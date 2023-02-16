package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.6667f, 5.6667f)
                    verticalLineTo(4.3333f)
                    curveTo(4.6667f, 3.4493f, 5.0179f, 2.6014f, 5.643f, 1.9763f)
                    curveTo(6.2681f, 1.3512f, 7.116f, 1.0f, 8.0f, 1.0f)
                    curveTo(8.8841f, 1.0f, 9.7319f, 1.3512f, 10.357f, 1.9763f)
                    curveTo(10.9821f, 2.6014f, 11.3333f, 3.4493f, 11.3333f, 4.3333f)
                    verticalLineTo(5.6667f)
                    horizontalLineTo(13.3333f)
                    curveTo(13.5101f, 5.6667f, 13.6797f, 5.7369f, 13.8047f, 5.8619f)
                    curveTo(13.9298f, 5.9869f, 14.0f, 6.1565f, 14.0f, 6.3333f)
                    verticalLineTo(14.3333f)
                    curveTo(14.0f, 14.5101f, 13.9298f, 14.6797f, 13.8047f, 14.8047f)
                    curveTo(13.6797f, 14.9298f, 13.5101f, 15.0f, 13.3333f, 15.0f)
                    horizontalLineTo(2.6667f)
                    curveTo(2.4899f, 15.0f, 2.3203f, 14.9298f, 2.1953f, 14.8047f)
                    curveTo(2.0702f, 14.6797f, 2.0f, 14.5101f, 2.0f, 14.3333f)
                    verticalLineTo(6.3333f)
                    curveTo(2.0f, 6.1565f, 2.0702f, 5.9869f, 2.1953f, 5.8619f)
                    curveTo(2.3203f, 5.7369f, 2.4899f, 5.6667f, 2.6667f, 5.6667f)
                    horizontalLineTo(4.6667f)
                    close()
                    moveTo(4.6667f, 7.0f)
                    horizontalLineTo(3.3333f)
                    verticalLineTo(13.6667f)
                    horizontalLineTo(12.6667f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(11.3333f)
                    verticalLineTo(8.3333f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(8.3333f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(6.0f, 5.6667f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(4.3333f)
                    curveTo(10.0f, 3.8029f, 9.7893f, 3.2942f, 9.4142f, 2.9191f)
                    curveTo(9.0391f, 2.544f, 8.5304f, 2.3333f, 8.0f, 2.3333f)
                    curveTo(7.4696f, 2.3333f, 6.9609f, 2.544f, 6.5858f, 2.9191f)
                    curveTo(6.2107f, 3.2942f, 6.0f, 3.8029f, 6.0f, 4.3333f)
                    verticalLineTo(5.6667f)
                    close()
                }
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
