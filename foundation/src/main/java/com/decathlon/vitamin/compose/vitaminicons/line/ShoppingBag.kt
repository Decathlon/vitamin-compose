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
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 9.0f)
                    verticalLineTo(7.0f)
                    curveTo(7.0f, 5.6739f, 7.5268f, 4.4022f, 8.4645f, 3.4645f)
                    curveTo(9.4022f, 2.5268f, 10.6739f, 2.0f, 12.0f, 2.0f)
                    curveTo(13.3261f, 2.0f, 14.5979f, 2.5268f, 15.5355f, 3.4645f)
                    curveTo(16.4732f, 4.4022f, 17.0f, 5.6739f, 17.0f, 7.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.2652f, 9.0f, 20.5196f, 9.1054f, 20.7071f, 9.2929f)
                    curveTo(20.8946f, 9.4804f, 21.0f, 9.7348f, 21.0f, 10.0f)
                    verticalLineTo(22.0f)
                    curveTo(21.0f, 22.2652f, 20.8946f, 22.5196f, 20.7071f, 22.7071f)
                    curveTo(20.5196f, 22.8946f, 20.2652f, 23.0f, 20.0f, 23.0f)
                    horizontalLineTo(4.0f)
                    curveTo(3.7348f, 23.0f, 3.4804f, 22.8946f, 3.2929f, 22.7071f)
                    curveTo(3.1054f, 22.5196f, 3.0f, 22.2652f, 3.0f, 22.0f)
                    verticalLineTo(10.0f)
                    curveTo(3.0f, 9.7348f, 3.1054f, 9.4804f, 3.2929f, 9.2929f)
                    curveTo(3.4804f, 9.1054f, 3.7348f, 9.0f, 4.0f, 9.0f)
                    horizontalLineTo(7.0f)
                    close()
                    moveTo(7.0f, 11.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(9.0f, 9.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(7.0f)
                    curveTo(15.0f, 6.2043f, 14.6839f, 5.4413f, 14.1213f, 4.8787f)
                    curveTo(13.5587f, 4.3161f, 12.7956f, 4.0f, 12.0f, 4.0f)
                    curveTo(11.2044f, 4.0f, 10.4413f, 4.3161f, 9.8787f, 4.8787f)
                    curveTo(9.3161f, 5.4413f, 9.0f, 6.2043f, 9.0f, 7.0f)
                    verticalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
