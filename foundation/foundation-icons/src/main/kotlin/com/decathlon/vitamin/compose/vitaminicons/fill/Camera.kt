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

public val FillGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3334f, 4.0f)
                curveTo(1.3334f, 3.632f, 1.6367f, 3.3333f, 1.9947f, 3.3333f)
                horizontalLineTo(14.0054f)
                curveTo(14.3707f, 3.3333f, 14.6667f, 3.63f, 14.6667f, 4.0f)
                verticalLineTo(13.3333f)
                curveTo(14.6667f, 13.7013f, 14.3634f, 14.0f, 14.0054f, 14.0f)
                horizontalLineTo(1.9947f)
                curveTo(1.9075f, 13.9998f, 1.8211f, 13.9824f, 1.7406f, 13.9488f)
                curveTo(1.6601f, 13.9151f, 1.587f, 13.8659f, 1.5256f, 13.804f)
                curveTo(1.4641f, 13.7421f, 1.4155f, 13.6686f, 1.3826f, 13.5878f)
                curveTo(1.3496f, 13.5071f, 1.3329f, 13.4206f, 1.3334f, 13.3333f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.3334f, 12.0f)
                curveTo(10.2174f, 12.0f, 11.0653f, 11.6488f, 11.6904f, 11.0237f)
                curveTo(12.3155f, 10.3985f, 12.6667f, 9.5507f, 12.6667f, 8.6666f)
                curveTo(12.6667f, 7.7826f, 12.3155f, 6.9348f, 11.6904f, 6.3096f)
                curveTo(11.0653f, 5.6845f, 10.2174f, 5.3333f, 9.3334f, 5.3333f)
                curveTo(8.4493f, 5.3333f, 7.6015f, 5.6845f, 6.9764f, 6.3096f)
                curveTo(6.3512f, 6.9348f, 6.0001f, 7.7826f, 6.0001f, 8.6666f)
                curveTo(6.0001f, 9.5507f, 6.3512f, 10.3985f, 6.9764f, 11.0237f)
                curveTo(7.6015f, 11.6488f, 8.4493f, 12.0f, 9.3334f, 12.0f)
                close()
                moveTo(2.6667f, 4.6666f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.6667f)
                verticalLineTo(4.6666f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(2.6667f, 1.3333f)
                horizontalLineTo(6.6667f)
                verticalLineTo(2.6667f)
                horizontalLineTo(2.6667f)
                verticalLineTo(1.3333f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
