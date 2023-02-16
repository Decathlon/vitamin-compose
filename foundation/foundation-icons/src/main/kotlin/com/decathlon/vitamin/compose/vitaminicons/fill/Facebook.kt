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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3333f, 9.0f)
                horizontalLineTo(11.0f)
                lineTo(11.6666f, 6.3333f)
                horizontalLineTo(9.3333f)
                verticalLineTo(5.0f)
                curveTo(9.3333f, 4.3133f, 9.3333f, 3.6667f, 10.6666f, 3.6667f)
                horizontalLineTo(11.6666f)
                verticalLineTo(1.4267f)
                curveTo(11.4493f, 1.398f, 10.6286f, 1.3333f, 9.762f, 1.3333f)
                curveTo(7.952f, 1.3333f, 6.6666f, 2.438f, 6.6666f, 4.4667f)
                verticalLineTo(6.3333f)
                horizontalLineTo(4.6666f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.6666f)
                verticalLineTo(14.6667f)
                horizontalLineTo(9.3333f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
