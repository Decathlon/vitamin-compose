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

public val LineGroup.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.2652f, 20.8946f, 20.5196f, 20.7071f, 20.7071f)
                curveTo(20.5196f, 20.8946f, 20.2652f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 21.0f, 3.4804f, 20.8946f, 3.2929f, 20.7071f)
                curveTo(3.1054f, 20.5196f, 3.0f, 20.2652f, 3.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineTo(21.0f)
                lineTo(22.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(5.0f, 13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.04f, 11.0f)
                horizontalLineTo(19.96f)
                lineTo(19.36f, 8.0f)
                horizontalLineTo(4.64f)
                lineTo(4.04f, 11.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
