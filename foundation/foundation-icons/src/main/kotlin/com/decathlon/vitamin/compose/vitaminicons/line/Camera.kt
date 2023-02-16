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

public val LineGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3333f, 4.0f)
                curveTo(1.3333f, 3.632f, 1.6367f, 3.3333f, 1.9947f, 3.3333f)
                horizontalLineTo(14.0053f)
                curveTo(14.3707f, 3.3333f, 14.6667f, 3.63f, 14.6667f, 4.0f)
                verticalLineTo(13.3333f)
                curveTo(14.6667f, 13.7013f, 14.3633f, 14.0f, 14.0053f, 14.0f)
                horizontalLineTo(1.9947f)
                curveTo(1.9074f, 13.9998f, 1.8211f, 13.9824f, 1.7406f, 13.9488f)
                curveTo(1.66f, 13.9151f, 1.587f, 13.8659f, 1.5255f, 13.804f)
                curveTo(1.4641f, 13.7421f, 1.4155f, 13.6686f, 1.3825f, 13.5878f)
                curveTo(1.3495f, 13.5071f, 1.3328f, 13.4206f, 1.3333f, 13.3333f)
                verticalLineTo(4.0f)
                close()
                moveTo(2.6667f, 4.6666f)
                verticalLineTo(12.6666f)
                horizontalLineTo(13.3333f)
                verticalLineTo(4.6666f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(9.3333f, 10.6666f)
                curveTo(9.8638f, 10.6666f, 10.3725f, 10.4559f, 10.7475f, 10.0809f)
                curveTo(11.1226f, 9.7058f, 11.3333f, 9.1971f, 11.3333f, 8.6666f)
                curveTo(11.3333f, 8.1362f, 11.1226f, 7.6275f, 10.7475f, 7.2524f)
                curveTo(10.3725f, 6.8774f, 9.8638f, 6.6666f, 9.3333f, 6.6666f)
                curveTo(8.8029f, 6.6666f, 8.2942f, 6.8774f, 7.9191f, 7.2524f)
                curveTo(7.544f, 7.6275f, 7.3333f, 8.1362f, 7.3333f, 8.6666f)
                curveTo(7.3333f, 9.1971f, 7.544f, 9.7058f, 7.9191f, 10.0809f)
                curveTo(8.2942f, 10.4559f, 8.8029f, 10.6666f, 9.3333f, 10.6666f)
                close()
                moveTo(9.3333f, 12.0f)
                curveTo(8.4493f, 12.0f, 7.6014f, 11.6488f, 6.9763f, 11.0237f)
                curveTo(6.3512f, 10.3985f, 6.0f, 9.5507f, 6.0f, 8.6666f)
                curveTo(6.0f, 7.7826f, 6.3512f, 6.9348f, 6.9763f, 6.3096f)
                curveTo(7.6014f, 5.6845f, 8.4493f, 5.3333f, 9.3333f, 5.3333f)
                curveTo(10.2174f, 5.3333f, 11.0652f, 5.6845f, 11.6903f, 6.3096f)
                curveTo(12.3155f, 6.9348f, 12.6667f, 7.7826f, 12.6667f, 8.6666f)
                curveTo(12.6667f, 9.5507f, 12.3155f, 10.3985f, 11.6903f, 11.0237f)
                curveTo(11.0652f, 11.6488f, 10.2174f, 12.0f, 9.3333f, 12.0f)
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
