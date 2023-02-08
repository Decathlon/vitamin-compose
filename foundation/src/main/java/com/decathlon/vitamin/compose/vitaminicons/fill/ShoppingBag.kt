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

public val FillGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.6566f, 2.0f, 13.3068f, 2.1293f, 13.9134f, 2.3806f)
                curveTo(14.52f, 2.6319f, 15.0712f, 3.0002f, 15.5355f, 3.4645f)
                curveTo(15.9998f, 3.9288f, 16.3681f, 4.4799f, 16.6194f, 5.0866f)
                curveTo(16.8707f, 5.6932f, 17.0f, 6.3434f, 17.0f, 7.0f)
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
                verticalLineTo(7.0f)
                curveTo(7.0f, 5.6739f, 7.5268f, 4.4022f, 8.4645f, 3.4645f)
                curveTo(9.4022f, 2.5268f, 10.6739f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                curveTo(15.0003f, 13.2549f, 15.0979f, 13.5f, 15.2728f, 13.6854f)
                curveTo(15.4478f, 13.8707f, 15.687f, 13.9822f, 15.9414f, 13.9972f)
                curveTo(16.1958f, 14.0121f, 16.4464f, 13.9293f, 16.6418f, 13.7657f)
                curveTo(16.8373f, 13.6021f, 16.9629f, 13.3701f, 16.993f, 13.117f)
                lineTo(17.0f, 13.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0003f, 13.2549f, 7.0979f, 13.5f, 7.2729f, 13.6854f)
                curveTo(7.4478f, 13.8707f, 7.687f, 13.9822f, 7.9414f, 13.9972f)
                curveTo(8.1958f, 14.0121f, 8.4464f, 13.9293f, 8.6418f, 13.7657f)
                curveTo(8.8373f, 13.6021f, 8.9629f, 13.3701f, 8.993f, 13.117f)
                lineTo(9.0f, 13.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(11.2348f, 4.0f, 10.4985f, 4.2923f, 9.9417f, 4.8173f)
                curveTo(9.385f, 5.3422f, 9.0499f, 6.0601f, 9.005f, 6.824f)
                lineTo(9.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 6.2348f, 14.7077f, 5.4985f, 14.1827f, 4.9417f)
                curveTo(13.6578f, 4.385f, 12.9399f, 4.0499f, 12.176f, 4.005f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
