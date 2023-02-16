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

public val FillGroup.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(name = "ListCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3333f, 2.6667f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.3333f)
                verticalLineTo(2.6667f)
                close()
                moveTo(2.0f, 2.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.3333f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.3333f)
                close()
                moveTo(2.0f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(2.0f, 11.6667f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.6667f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.6667f)
                close()
                moveTo(5.3333f, 7.3333f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.6667f)
                horizontalLineTo(5.3333f)
                verticalLineTo(7.3333f)
                close()
                moveTo(5.3333f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.3333f)
                horizontalLineTo(5.3333f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
