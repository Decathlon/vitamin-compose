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

public val FillGroup.Feedback: ImageVector
    get() {
        if (_feedback != null) {
            return _feedback!!
        }
        _feedback = Builder(name = "Feedback", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.7348f, 2.1054f, 3.4804f, 2.2929f, 3.2929f)
                curveTo(2.4804f, 3.1054f, 2.7348f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2652f, 3.0f, 21.5196f, 3.1054f, 21.7071f, 3.2929f)
                curveTo(21.8946f, 3.4804f, 22.0f, 3.7348f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.2652f, 21.8946f, 18.5196f, 21.7071f, 18.7071f)
                curveTo(21.5196f, 18.8946f, 21.2652f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                close()
                moveTo(11.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _feedback!!
    }

private var _feedback: ImageVector? = null
