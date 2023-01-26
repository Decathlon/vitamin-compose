package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.ShutDown: ImageVector
    get() {
        if (_shutDown != null) {
            return _shutDown!!
        }
        _shutDown = Builder(name = "ShutDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(7.412f, 5.446f)
                lineTo(6.265f, 3.807f)
                curveTo(3.5901f, 5.6771f, 1.9977f, 8.7362f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0024f, 8.7362f, 20.4099f, 5.6771f, 17.735f, 3.807f)
                lineTo(16.588f, 5.446f)
                curveTo(19.4484f, 7.4485f, 20.6797f, 11.0748f, 19.6299f, 14.4049f)
                curveTo(18.58f, 17.7351f, 15.4917f, 19.9996f, 12.0f, 19.9996f)
                curveTo(8.5083f, 19.9996f, 5.42f, 17.7351f, 4.3702f, 14.4049f)
                curveTo(3.3203f, 11.0748f, 4.5516f, 7.4485f, 7.412f, 5.446f)
                close()
            }
        }
        .build()
        return _shutDown!!
    }

private var _shutDown: ImageVector? = null
