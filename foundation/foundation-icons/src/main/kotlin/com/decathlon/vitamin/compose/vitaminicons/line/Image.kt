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

public val LineGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2187f, 14.0f)
                lineTo(3.2053f, 14.0133f)
                lineTo(3.1913f, 14.0f)
                horizontalLineTo(1.9947f)
                curveTo(1.8192f, 13.9998f, 1.651f, 13.93f, 1.527f, 13.8059f)
                curveTo(1.403f, 13.6817f, 1.3333f, 13.5135f, 1.3333f, 13.338f)
                verticalLineTo(2.662f)
                curveTo(1.3345f, 2.4869f, 1.4046f, 2.3193f, 1.5283f, 2.1955f)
                curveTo(1.6521f, 2.0716f, 1.8196f, 2.0014f, 1.9947f, 2.0f)
                horizontalLineTo(14.0053f)
                curveTo(14.3706f, 2.0f, 14.6666f, 2.2967f, 14.6666f, 2.662f)
                verticalLineTo(13.338f)
                curveTo(14.6654f, 13.5131f, 14.5954f, 13.6807f, 14.4716f, 13.8045f)
                curveTo(14.3479f, 13.9284f, 14.1804f, 13.9986f, 14.0053f, 14.0f)
                horizontalLineTo(3.2187f)
                close()
                moveTo(13.3333f, 10.0f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.6667f)
                lineTo(9.3333f, 6.0f)
                lineTo(13.3333f, 10.0f)
                close()
                moveTo(13.3333f, 11.8853f)
                lineTo(9.3333f, 7.8853f)
                lineTo(4.552f, 12.6667f)
                horizontalLineTo(13.3333f)
                verticalLineTo(11.8853f)
                close()
                moveTo(5.3333f, 7.3333f)
                curveTo(4.9797f, 7.3333f, 4.6406f, 7.1929f, 4.3905f, 6.9428f)
                curveTo(4.1405f, 6.6928f, 4.0f, 6.3536f, 4.0f, 6.0f)
                curveTo(4.0f, 5.6464f, 4.1405f, 5.3072f, 4.3905f, 5.0572f)
                curveTo(4.6406f, 4.8071f, 4.9797f, 4.6667f, 5.3333f, 4.6667f)
                curveTo(5.6869f, 4.6667f, 6.0261f, 4.8071f, 6.2761f, 5.0572f)
                curveTo(6.5262f, 5.3072f, 6.6666f, 5.6464f, 6.6666f, 6.0f)
                curveTo(6.6666f, 6.3536f, 6.5262f, 6.6928f, 6.2761f, 6.9428f)
                curveTo(6.0261f, 7.1929f, 5.6869f, 7.3333f, 5.3333f, 7.3333f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
