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

public val FillGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                horizontalLineTo(16.5f)
                lineTo(17.5f, 9.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                curveTo(14.0f, 6.47f, 14.0f, 5.5f, 16.0f, 5.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(2.14f)
                curveTo(17.174f, 2.097f, 15.943f, 2.0f, 14.643f, 2.0f)
                curveTo(11.928f, 2.0f, 10.0f, 3.657f, 10.0f, 6.7f)
                verticalLineTo(9.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
