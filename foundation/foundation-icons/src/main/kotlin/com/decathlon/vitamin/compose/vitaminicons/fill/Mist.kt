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

public val FillGroup.Mist: ImageVector
    get() {
        if (_mist != null) {
            return _mist!!
        }
        _mist = Builder(name = "Mist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6667f, 2.6666f)
                horizontalLineTo(5.3334f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.6667f)
                verticalLineTo(2.6666f)
                close()
                moveTo(10.6667f, 12.6666f)
                horizontalLineTo(13.3334f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(12.6666f)
                close()
                moveTo(1.3334f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(1.3334f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.3334f, 6.0f)
                horizontalLineTo(13.3334f)
                verticalLineTo(7.3333f)
                horizontalLineTo(9.3334f)
                verticalLineTo(6.0f)
                close()
                moveTo(2.6667f, 9.3333f)
                horizontalLineTo(6.6667f)
                verticalLineTo(10.6666f)
                horizontalLineTo(2.6667f)
                verticalLineTo(9.3333f)
                close()
                moveTo(8.0f, 9.3333f)
                horizontalLineTo(14.6667f)
                verticalLineTo(10.6666f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.3333f)
                close()
                moveTo(6.6667f, 2.6666f)
                horizontalLineTo(14.6667f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.6667f)
                verticalLineTo(2.6666f)
                close()
                moveTo(1.3334f, 12.6666f)
                horizontalLineTo(9.3334f)
                verticalLineTo(14.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(12.6666f)
                close()
            }
        }
        .build()
        return _mist!!
    }

private var _mist: ImageVector? = null
