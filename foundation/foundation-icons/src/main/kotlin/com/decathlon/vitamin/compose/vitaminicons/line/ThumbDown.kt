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

public val LineGroup.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown = Builder(name = "ThumbDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4696f, 16.0f, 1.9609f, 15.7893f, 1.5858f, 15.4142f)
                curveTo(1.2107f, 15.0391f, 1.0f, 14.5304f, 1.0f, 14.0f)
                verticalLineTo(11.896f)
                curveTo(0.9997f, 11.6346f, 1.0507f, 11.3758f, 1.15f, 11.134f)
                lineTo(4.246f, 3.62f)
                curveTo(4.3213f, 3.4367f, 4.4493f, 3.28f, 4.6138f, 3.1696f)
                curveTo(4.7783f, 3.0592f, 4.9719f, 3.0002f, 5.17f, 3.0f)
                horizontalLineTo(22.0f)
                curveTo(22.2652f, 3.0f, 22.5196f, 3.1054f, 22.7071f, 3.2929f)
                curveTo(22.8946f, 3.4804f, 23.0f, 3.7348f, 23.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 14.2652f, 22.8946f, 14.5196f, 22.7071f, 14.7071f)
                curveTo(22.5196f, 14.8946f, 22.2652f, 15.0f, 22.0f, 15.0f)
                horizontalLineTo(18.518f)
                curveTo(18.3579f, 15.0f, 18.2001f, 15.0384f, 18.058f, 15.112f)
                curveTo(17.9158f, 15.1856f, 17.7934f, 15.2922f, 17.701f, 15.423f)
                lineTo(12.248f, 23.149f)
                curveTo(12.1791f, 23.2467f, 12.0774f, 23.3164f, 11.9615f, 23.3456f)
                curveTo(11.8455f, 23.3748f, 11.723f, 23.3614f, 11.616f, 23.308f)
                lineTo(9.802f, 22.4f)
                curveTo(9.2915f, 22.1448f, 8.8837f, 21.7227f, 8.6463f, 21.2037f)
                curveTo(8.4089f, 20.6847f, 8.3562f, 20.1001f, 8.497f, 19.547f)
                lineTo(9.4f, 16.0f)
                close()
                moveTo(17.0f, 13.412f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.84f)
                lineTo(3.0f, 11.896f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.4f)
                curveTo(9.7046f, 14.0f, 10.0052f, 14.0697f, 10.2788f, 14.2035f)
                curveTo(10.5524f, 14.3374f, 10.7918f, 14.532f, 10.9787f, 14.7725f)
                curveTo(11.1657f, 15.013f, 11.2952f, 15.293f, 11.3575f, 15.5912f)
                curveTo(11.4197f, 15.8893f, 11.4131f, 16.1978f, 11.338f, 16.493f)
                lineTo(10.435f, 20.041f)
                curveTo(10.4067f, 20.1517f, 10.4172f, 20.2687f, 10.4647f, 20.3726f)
                curveTo(10.5122f, 20.4765f, 10.5938f, 20.561f, 10.696f, 20.612f)
                lineTo(11.357f, 20.942f)
                lineTo(16.067f, 14.27f)
                curveTo(16.317f, 13.916f, 16.637f, 13.626f, 17.0f, 13.412f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
