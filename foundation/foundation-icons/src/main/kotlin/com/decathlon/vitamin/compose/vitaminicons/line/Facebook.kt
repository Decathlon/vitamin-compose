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

public val LineGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6667f, 6.0f)
                horizontalLineTo(11.6667f)
                lineTo(11.3334f, 7.3333f)
                horizontalLineTo(8.6667f)
                verticalLineTo(13.3333f)
                horizontalLineTo(7.3334f)
                verticalLineTo(7.3333f)
                horizontalLineTo(4.6667f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.3334f)
                verticalLineTo(4.752f)
                curveTo(7.3334f, 3.5633f, 7.4573f, 3.132f, 7.6894f, 2.6973f)
                curveTo(7.9167f, 2.2679f, 8.2679f, 1.9167f, 8.6973f, 1.6893f)
                curveTo(9.132f, 1.4573f, 9.5633f, 1.3333f, 10.752f, 1.3333f)
                curveTo(11.1f, 1.3333f, 11.4054f, 1.3667f, 11.6667f, 1.4333f)
                verticalLineTo(2.6667f)
                horizontalLineTo(10.752f)
                curveTo(9.8694f, 2.6667f, 9.6007f, 2.7187f, 9.3267f, 2.8653f)
                curveTo(9.124f, 2.9733f, 8.9733f, 3.124f, 8.8653f, 3.3267f)
                curveTo(8.7187f, 3.6007f, 8.6667f, 3.8693f, 8.6667f, 4.752f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
