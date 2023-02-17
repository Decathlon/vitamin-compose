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

public val FillGroup.ArrowGoBack: ImageVector
    get() {
        if (_arrowGoBack != null) {
            return _arrowGoBack!!
        }
        _arrowGoBack = Builder(name = "ArrowGoBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                verticalLineTo(11.0f)
                lineTo(2.0f, 6.0f)
                lineTo(8.0f, 1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                curveTo(17.4183f, 5.0f, 21.0f, 8.5817f, 21.0f, 13.0f)
                curveTo(21.0f, 17.4183f, 17.4183f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                curveTo(16.3137f, 19.0f, 19.0f, 16.3137f, 19.0f, 13.0f)
                curveTo(19.0f, 9.6863f, 16.3137f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _arrowGoBack!!
    }

private var _arrowGoBack: ImageVector? = null
