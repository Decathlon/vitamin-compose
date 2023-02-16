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

public val LineGroup.ArrowGoBack: ImageVector
    get() {
        if (_arrowGoBack != null) {
            return _arrowGoBack!!
        }
        _arrowGoBack = Builder(name = "ArrowGoBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8854f, 4.6667f)
                lineTo(5.576f, 6.3573f)
                lineTo(4.6334f, 7.3f)
                lineTo(1.3334f, 4.0f)
                lineTo(4.6334f, 0.7f)
                lineTo(5.576f, 1.6427f)
                lineTo(3.8854f, 3.3333f)
                horizontalLineTo(8.6667f)
                curveTo(11.6122f, 3.3333f, 14.0f, 5.7212f, 14.0f, 8.6667f)
                curveTo(14.0f, 11.6122f, 11.6122f, 14.0f, 8.6667f, 14.0f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(8.6667f)
                curveTo(10.8758f, 12.6667f, 12.6667f, 10.8758f, 12.6667f, 8.6667f)
                curveTo(12.6667f, 6.4575f, 10.8758f, 4.6667f, 8.6667f, 4.6667f)
                horizontalLineTo(3.8854f)
                close()
            }
        }
        .build()
        return _arrowGoBack!!
    }

private var _arrowGoBack: ImageVector? = null
