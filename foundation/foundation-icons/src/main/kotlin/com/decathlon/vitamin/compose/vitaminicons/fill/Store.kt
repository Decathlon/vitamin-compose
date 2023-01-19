package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.3333f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(14.0f, 13.3333f)
                verticalLineTo(8.6667f)
                horizontalLineTo(14.6667f)
                verticalLineTo(7.3333f)
                lineTo(14.0f, 4.0f)
                horizontalLineTo(2.0f)
                lineTo(1.3334f, 7.3333f)
                verticalLineTo(8.6667f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.3333f)
                curveTo(2.0f, 13.7015f, 2.2985f, 14.0f, 2.6667f, 14.0f)
                horizontalLineTo(13.3334f)
                curveTo(13.7016f, 14.0f, 14.0f, 13.7015f, 14.0f, 13.3333f)
                close()
                moveTo(3.3334f, 12.6667f)
                verticalLineTo(8.6667f)
                horizontalLineTo(12.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(3.3334f)
                close()
                moveTo(4.0f, 9.3333f)
                horizontalLineTo(9.3334f)
                verticalLineTo(11.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.3333f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
