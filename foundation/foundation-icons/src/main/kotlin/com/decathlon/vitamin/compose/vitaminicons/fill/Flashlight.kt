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

public val FillGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.35f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 1.0f, 6.0f, 1.45f, 6.0f, 2.0f)
                verticalLineTo(5.55f)
                curveTo(6.0f, 5.76f, 6.07f, 5.97f, 6.19f, 6.14f)
                lineTo(8.43f, 9.24f)
                verticalLineTo(22.0f)
                curveTo(8.43f, 22.55f, 8.88f, 23.0f, 9.43f, 23.0f)
                horizontalLineTo(14.92f)
                curveTo(15.47f, 23.0f, 15.92f, 22.55f, 15.92f, 22.0f)
                verticalLineTo(9.24f)
                lineTo(18.16f, 6.14f)
                curveTo(18.28f, 5.97f, 18.35f, 5.76f, 18.35f, 5.55f)
                verticalLineTo(2.0f)
                curveTo(18.35f, 1.45f, 17.9f, 1.0f, 17.35f, 1.0f)
                close()
                moveTo(13.18f, 13.1f)
                horizontalLineTo(11.18f)
                verticalLineTo(10.13f)
                horizontalLineTo(13.18f)
                verticalLineTo(13.1f)
                close()
                moveTo(16.38f, 4.04f)
                horizontalLineTo(7.97f)
                verticalLineTo(2.97f)
                horizontalLineTo(16.37f)
                verticalLineTo(4.04f)
                horizontalLineTo(16.38f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
