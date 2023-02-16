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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3333f, 4.6667f)
                verticalLineTo(7.3334f)
                lineTo(1.3333f, 4.0f)
                lineTo(5.3333f, 0.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(8.6666f)
                curveTo(11.6121f, 3.3333f, 13.9999f, 5.7212f, 13.9999f, 8.6667f)
                curveTo(13.9999f, 11.6122f, 11.6121f, 14.0f, 8.6666f, 14.0f)
                horizontalLineTo(2.6666f)
                verticalLineTo(12.6667f)
                horizontalLineTo(8.6666f)
                curveTo(10.8757f, 12.6667f, 12.6666f, 10.8758f, 12.6666f, 8.6667f)
                curveTo(12.6666f, 6.4576f, 10.8757f, 4.6667f, 8.6666f, 4.6667f)
                horizontalLineTo(5.3333f)
                close()
            }
        }
        .build()
        return _arrowGoBack!!
    }

private var _arrowGoBack: ImageVector? = null
