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

public val FillGroup.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.2652f, 2.0f, 19.5196f, 2.1054f, 19.7071f, 2.2929f)
                curveTo(19.8946f, 2.4804f, 20.0f, 2.7348f, 20.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.2652f, 19.8946f, 21.5196f, 19.7071f, 21.7071f)
                curveTo(19.5196f, 21.8946f, 19.2652f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.7348f, 22.0f, 4.4804f, 21.8946f, 4.2929f, 21.7071f)
                curveTo(4.1054f, 21.5196f, 4.0f, 21.2652f, 4.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.7348f, 4.1054f, 2.4804f, 4.2929f, 2.2929f)
                curveTo(4.4804f, 2.1054f, 4.7348f, 2.0f, 5.0f, 2.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(11.7348f, 17.0f, 11.4804f, 17.1054f, 11.2929f, 17.2929f)
                curveTo(11.1054f, 17.4804f, 11.0f, 17.7348f, 11.0f, 18.0f)
                curveTo(11.0f, 18.2652f, 11.1054f, 18.5196f, 11.2929f, 18.7071f)
                curveTo(11.4804f, 18.8946f, 11.7348f, 19.0f, 12.0f, 19.0f)
                curveTo(12.2652f, 19.0f, 12.5196f, 18.8946f, 12.7071f, 18.7071f)
                curveTo(12.8946f, 18.5196f, 13.0f, 18.2652f, 13.0f, 18.0f)
                curveTo(13.0f, 17.7348f, 12.8946f, 17.4804f, 12.7071f, 17.2929f)
                curveTo(12.5196f, 17.1054f, 12.2652f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
