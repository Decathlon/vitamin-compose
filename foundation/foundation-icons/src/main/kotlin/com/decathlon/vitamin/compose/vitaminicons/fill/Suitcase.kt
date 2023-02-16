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

public val FillGroup.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(10.368f, 2.0f, 10.6667f, 2.2987f, 10.6667f, 2.6667f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                curveTo(14.368f, 4.0f, 14.6667f, 4.2987f, 14.6667f, 4.6667f)
                verticalLineTo(13.3333f)
                curveTo(14.6667f, 13.7013f, 14.368f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(2.0f)
                curveTo(1.632f, 14.0f, 1.3334f, 13.7013f, 1.3334f, 13.3333f)
                verticalLineTo(4.6667f)
                curveTo(1.3334f, 4.2987f, 1.632f, 4.0f, 2.0f, 4.0f)
                horizontalLineTo(5.3334f)
                verticalLineTo(2.6667f)
                curveTo(5.3334f, 2.2987f, 5.632f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(5.3334f, 5.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.6667f)
                horizontalLineTo(5.3334f)
                verticalLineTo(5.3333f)
                close()
                moveTo(12.0f, 5.3333f)
                horizontalLineTo(10.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.3333f)
                close()
                moveTo(9.3334f, 3.3333f)
                horizontalLineTo(6.6667f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.3334f)
                verticalLineTo(3.3333f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
