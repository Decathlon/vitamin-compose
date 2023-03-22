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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(17.5f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.128f)
                curveTo(11.0f, 5.345f, 11.186f, 4.698f, 11.534f, 4.046f)
                curveTo(11.875f, 3.4018f, 12.4018f, 2.875f, 13.046f, 2.534f)
                curveTo(13.698f, 2.186f, 14.345f, 2.0f, 16.128f, 2.0f)
                curveTo(16.65f, 2.0f, 17.108f, 2.05f, 17.5f, 2.15f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.128f)
                curveTo(14.804f, 4.0f, 14.401f, 4.078f, 13.99f, 4.298f)
                curveTo(13.686f, 4.46f, 13.46f, 4.686f, 13.298f, 4.99f)
                curveTo(13.078f, 5.401f, 13.0f, 5.804f, 13.0f, 7.128f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
