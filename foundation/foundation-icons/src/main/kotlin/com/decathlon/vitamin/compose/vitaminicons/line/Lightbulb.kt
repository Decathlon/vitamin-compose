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

public val LineGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.973f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.027f)
                curveTo(14.159f, 16.798f, 14.772f, 15.806f, 15.767f, 14.723f)
                curveTo(15.88f, 14.601f, 16.599f, 13.856f, 16.684f, 13.75f)
                curveTo(17.3903f, 12.8676f, 17.833f, 11.8037f, 17.9611f, 10.6807f)
                curveTo(18.0893f, 9.5578f, 17.8976f, 8.4215f, 17.4083f, 7.4027f)
                curveTo(16.9189f, 6.3839f, 16.1518f, 5.5241f, 15.1951f, 4.9222f)
                curveTo(14.2385f, 4.3203f, 13.1313f, 4.0008f, 12.0011f, 4.0005f)
                curveTo(10.8709f, 4.0003f, 9.7636f, 4.3193f, 8.8067f, 4.9208f)
                curveTo(7.8498f, 5.5223f, 7.0823f, 6.3818f, 6.5925f, 7.4004f)
                curveTo(6.1027f, 8.419f, 5.9106f, 9.5552f, 6.0382f, 10.6782f)
                curveTo(6.1659f, 11.8012f, 6.6081f, 12.8653f, 7.314f, 13.748f)
                curveTo(7.4f, 13.855f, 8.121f, 14.601f, 8.232f, 14.722f)
                curveTo(9.228f, 15.806f, 9.841f, 16.798f, 9.973f, 18.0f)
                close()
                moveTo(10.0f, 20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(5.754f, 15.0f)
                curveTo(4.8122f, 13.8233f, 4.222f, 12.4044f, 4.0513f, 10.9069f)
                curveTo(3.8806f, 9.4094f, 4.1364f, 7.8942f, 4.7893f, 6.5357f)
                curveTo(5.4421f, 5.1772f, 6.4655f, 4.0308f, 7.7414f, 3.2286f)
                curveTo(9.0173f, 2.4263f, 10.4939f, 2.0007f, 12.0011f, 2.001f)
                curveTo(13.5083f, 2.0012f, 14.9848f, 2.4272f, 16.2604f, 3.2299f)
                curveTo(17.5361f, 4.0326f, 18.5591f, 5.1793f, 19.2115f, 6.538f)
                curveTo(19.8639f, 7.8967f, 20.1192f, 9.412f, 19.9481f, 10.9095f)
                curveTo(19.7769f, 12.4069f, 19.1862f, 13.8256f, 18.244f, 15.002f)
                curveTo(17.624f, 15.774f, 16.0f, 17.0f, 16.0f, 18.5f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 21.5304f, 15.7893f, 22.0391f, 15.4142f, 22.4142f)
                curveTo(15.0392f, 22.7893f, 14.5305f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4696f, 23.0f, 8.9609f, 22.7893f, 8.5858f, 22.4142f)
                curveTo(8.2107f, 22.0391f, 8.0f, 21.5304f, 8.0f, 21.0f)
                verticalLineTo(18.5f)
                curveTo(8.0f, 17.0f, 6.375f, 15.774f, 5.754f, 15.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
