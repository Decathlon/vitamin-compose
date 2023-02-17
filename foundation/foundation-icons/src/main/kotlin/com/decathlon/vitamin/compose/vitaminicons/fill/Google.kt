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

public val FillGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.064f, 7.51f)
                curveTo(4.7608f, 4.1311f, 8.219f, 1.9988f, 12.0f, 2.0f)
                curveTo(14.695f, 2.0f, 16.959f, 2.99f, 18.69f, 4.605f)
                lineTo(15.823f, 7.473f)
                curveTo(14.786f, 6.482f, 13.468f, 5.977f, 12.0f, 5.977f)
                curveTo(9.395f, 5.977f, 7.19f, 7.737f, 6.405f, 10.1f)
                curveTo(6.205f, 10.7f, 6.091f, 11.34f, 6.091f, 12.0f)
                curveTo(6.091f, 12.66f, 6.205f, 13.3f, 6.405f, 13.9f)
                curveTo(7.191f, 16.264f, 9.395f, 18.023f, 12.0f, 18.023f)
                curveTo(13.345f, 18.023f, 14.49f, 17.668f, 15.386f, 17.068f)
                curveTo(16.4357f, 16.3769f, 17.1569f, 15.2864f, 17.382f, 14.05f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.182f)
                horizontalLineTo(21.418f)
                curveTo(21.536f, 10.836f, 21.6f, 11.518f, 21.6f, 12.227f)
                curveTo(21.6f, 15.273f, 20.51f, 17.837f, 18.618f, 19.577f)
                curveTo(16.964f, 21.105f, 14.7f, 22.0f, 12.0f, 22.0f)
                curveTo(9.3475f, 22.0011f, 6.8033f, 20.9478f, 4.9278f, 19.0722f)
                curveTo(3.0522f, 17.1966f, 1.9989f, 14.6525f, 2.0f, 12.0f)
                curveTo(2.0f, 10.386f, 2.386f, 8.86f, 3.064f, 7.51f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
