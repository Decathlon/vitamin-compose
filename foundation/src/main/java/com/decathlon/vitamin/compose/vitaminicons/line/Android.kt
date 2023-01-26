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

public val LineGroup.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveTo(19.0f, 9.1435f, 18.2625f, 7.363f, 16.9497f, 6.0503f)
                curveTo(15.637f, 4.7375f, 13.8565f, 4.0f, 12.0f, 4.0f)
                curveTo(10.1435f, 4.0f, 8.363f, 4.7375f, 7.0503f, 6.0503f)
                curveTo(5.7375f, 7.363f, 5.0f, 9.1435f, 5.0f, 11.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(6.382f, 3.968f)
                curveTo(7.9757f, 2.6911f, 9.9578f, 1.9968f, 12.0f, 2.0f)
                curveTo(14.125f, 2.0f, 16.078f, 2.736f, 17.618f, 3.968f)
                lineTo(19.071f, 2.515f)
                lineTo(20.485f, 3.929f)
                lineTo(19.032f, 5.382f)
                curveTo(20.3089f, 6.9757f, 21.0033f, 8.9578f, 21.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.2652f, 20.8946f, 21.5196f, 20.7071f, 21.7071f)
                curveTo(20.5196f, 21.8947f, 20.2652f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 22.0f, 3.4804f, 21.8947f, 3.2929f, 21.7071f)
                curveTo(3.1054f, 21.5196f, 3.0f, 21.2652f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 8.875f, 3.736f, 6.922f, 4.968f, 5.382f)
                lineTo(3.515f, 3.93f)
                lineTo(4.929f, 2.516f)
                lineTo(6.382f, 3.969f)
                verticalLineTo(3.968f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(8.7348f, 9.0f, 8.4804f, 8.8947f, 8.2929f, 8.7071f)
                curveTo(8.1054f, 8.5196f, 8.0f, 8.2652f, 8.0f, 8.0f)
                curveTo(8.0f, 7.7348f, 8.1054f, 7.4804f, 8.2929f, 7.2929f)
                curveTo(8.4804f, 7.1054f, 8.7348f, 7.0f, 9.0f, 7.0f)
                curveTo(9.2652f, 7.0f, 9.5196f, 7.1054f, 9.7071f, 7.2929f)
                curveTo(9.8946f, 7.4804f, 10.0f, 7.7348f, 10.0f, 8.0f)
                curveTo(10.0f, 8.2652f, 9.8946f, 8.5196f, 9.7071f, 8.7071f)
                curveTo(9.5196f, 8.8947f, 9.2652f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(14.7348f, 9.0f, 14.4804f, 8.8947f, 14.2929f, 8.7071f)
                curveTo(14.1054f, 8.5196f, 14.0f, 8.2652f, 14.0f, 8.0f)
                curveTo(14.0f, 7.7348f, 14.1054f, 7.4804f, 14.2929f, 7.2929f)
                curveTo(14.4804f, 7.1054f, 14.7348f, 7.0f, 15.0f, 7.0f)
                curveTo(15.2652f, 7.0f, 15.5196f, 7.1054f, 15.7071f, 7.2929f)
                curveTo(15.8946f, 7.4804f, 16.0f, 7.7348f, 16.0f, 8.0f)
                curveTo(16.0f, 8.2652f, 15.8946f, 8.5196f, 15.7071f, 8.7071f)
                curveTo(15.5196f, 8.8947f, 15.2652f, 9.0f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
