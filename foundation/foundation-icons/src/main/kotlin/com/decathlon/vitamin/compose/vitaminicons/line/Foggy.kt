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

public val LineGroup.Foggy: ImageVector
    get() {
        if (_foggy != null) {
            return _foggy!!
        }
        _foggy = Builder(name = "Foggy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.584f, 13.007f)
                curveTo(0.8006f, 11.0347f, 0.8327f, 8.832f, 1.6733f, 6.8834f)
                curveTo(2.514f, 4.9348f, 4.0942f, 3.4f, 6.0665f, 2.6165f)
                curveTo(8.0388f, 1.8331f, 10.2415f, 1.8652f, 12.1901f, 2.7058f)
                curveTo(14.1387f, 3.5464f, 15.6736f, 5.1267f, 16.457f, 7.099f)
                curveTo(17.2952f, 6.937f, 18.1595f, 6.9724f, 18.9816f, 7.2023f)
                curveTo(19.8037f, 7.4321f, 20.561f, 7.8502f, 21.1936f, 8.4234f)
                curveTo(21.8262f, 8.9966f, 22.3167f, 9.7092f, 22.6262f, 10.5048f)
                curveTo(22.9357f, 11.3003f, 23.0559f, 12.157f, 22.977f, 13.007f)
                horizontalLineTo(20.964f)
                curveTo(21.0714f, 12.2759f, 20.9447f, 11.5295f, 20.6019f, 10.8749f)
                curveTo(20.2591f, 10.2202f, 19.718f, 9.6908f, 19.0559f, 9.3626f)
                curveTo(18.3939f, 9.0343f, 17.6449f, 8.924f, 16.9163f, 9.0475f)
                curveTo(16.1877f, 9.171f, 15.5169f, 9.5219f, 15.0f, 10.05f)
                verticalLineTo(10.0f)
                curveTo(14.9998f, 9.0795f, 14.7877f, 8.1713f, 14.3803f, 7.3459f)
                curveTo(13.9729f, 6.5204f, 13.381f, 5.7998f, 12.6504f, 5.2398f)
                curveTo(11.9199f, 4.6797f, 11.0702f, 4.2953f, 10.1673f, 4.1162f)
                curveTo(9.2644f, 3.9371f, 8.3323f, 3.9682f, 7.4433f, 4.207f)
                curveTo(6.5543f, 4.4458f, 5.7322f, 4.886f, 5.0406f, 5.4935f)
                curveTo(4.3489f, 6.1009f, 3.8063f, 6.8594f, 3.4548f, 7.7102f)
                curveTo(3.1033f, 8.5609f, 2.9522f, 9.4812f, 3.0133f, 10.3997f)
                curveTo(3.0743f, 11.3182f, 3.3459f, 12.2103f, 3.807f, 13.007f)
                horizontalLineTo(1.584f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _foggy!!
    }

private var _foggy: ImageVector? = null
