package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Flashlight: ImageVector
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
                moveTo(14.11f, 8.33f)
                curveTo(13.99f, 8.5f, 13.92f, 8.71f, 13.92f, 8.92f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.43f)
                verticalLineTo(8.92f)
                curveTo(10.43f, 8.71f, 10.36f, 8.5f, 10.24f, 8.33f)
                lineTo(8.38f, 5.76f)
                horizontalLineTo(15.96f)
                lineTo(14.1f, 8.33f)
                horizontalLineTo(14.11f)
                close()
                moveTo(16.35f, 3.76f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.35f)
                verticalLineTo(3.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.17f, 10.13f)
                horizontalLineTo(11.17f)
                verticalLineTo(13.1f)
                horizontalLineTo(13.17f)
                verticalLineTo(10.13f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
