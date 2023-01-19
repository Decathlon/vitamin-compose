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

public val LineGroup.Amazon: ImageVector
    get() {
        if (_amazon != null) {
            return _amazon!!
        }
        _amazon = Builder(name = "Amazon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3333f, 11.336f)
                curveTo(8.598f, 11.336f, 9.6786f, 10.826f, 10.4166f, 9.7467f)
                curveTo(10.702f, 10.462f, 10.856f, 10.7273f, 11.2046f, 11.162f)
                lineTo(12.2446f, 10.328f)
                curveTo(11.9793f, 9.9973f, 11.8926f, 9.8474f, 11.6553f, 9.2527f)
                curveTo(11.442f, 8.7187f, 11.3333f, 7.314f, 11.3333f, 5.548f)
                curveTo(11.3333f, 3.652f, 10.0686f, 2.2f, 8.3333f, 2.2f)
                curveTo(6.7953f, 2.2f, 5.628f, 3.0694f, 5.0366f, 4.7827f)
                lineTo(6.2966f, 5.2174f)
                curveTo(6.7066f, 4.0314f, 7.3753f, 3.5333f, 8.3333f, 3.5333f)
                curveTo(9.288f, 3.5333f, 10.0f, 4.3507f, 10.0f, 5.548f)
                verticalLineTo(5.6913f)
                lineTo(9.908f, 5.698f)
                curveTo(9.0433f, 5.762f, 8.8773f, 5.776f, 8.4766f, 5.8247f)
                curveTo(6.2313f, 6.1f, 4.8813f, 6.848f, 4.6713f, 8.5867f)
                curveTo(4.4826f, 10.154f, 5.7973f, 11.336f, 7.3333f, 11.336f)
                close()
                moveTo(13.8186f, 13.4033f)
                curveTo(13.6766f, 13.7507f, 13.9906f, 13.83f, 14.1713f, 13.6967f)
                curveTo(14.8119f, 13.2227f, 15.1879f, 11.864f, 14.9446f, 11.5107f)
                curveTo(14.8346f, 11.352f, 13.9313f, 11.226f, 13.1646f, 11.4553f)
                curveTo(12.9569f, 11.5179f, 12.7609f, 11.6143f, 12.5846f, 11.7407f)
                curveTo(12.4499f, 11.836f, 12.5093f, 12.0427f, 12.6453f, 12.034f)
                curveTo(12.718f, 12.0292f, 12.7844f, 12.0211f, 12.8537f, 12.0125f)
                curveTo(12.978f, 11.9972f, 13.1117f, 11.9807f, 13.3086f, 11.9807f)
                curveTo(13.6819f, 11.9807f, 13.8533f, 12.0653f, 13.9933f, 12.2353f)
                curveTo(14.1833f, 12.4647f, 13.9953f, 12.9713f, 13.8186f, 13.4033f)
                close()
                moveTo(13.3833f, 12.974f)
                curveTo(13.2101f, 13.1415f, 13.0252f, 13.2963f, 12.8299f, 13.4373f)
                curveTo(11.4153f, 14.5147f, 9.5833f, 15.0773f, 7.9913f, 15.0773f)
                curveTo(5.4293f, 15.0773f, 3.1379f, 13.882f, 1.3993f, 11.8807f)
                curveTo(1.2506f, 11.7273f, 1.3739f, 11.5033f, 1.5479f, 11.6247f)
                curveTo(3.4213f, 13.0093f, 5.7399f, 13.8467f, 8.1406f, 13.8467f)
                curveTo(9.6506f, 13.8467f, 11.2793f, 13.4887f, 12.8306f, 12.718f)
                curveTo(12.8839f, 12.693f, 12.9405f, 12.6634f, 12.9969f, 12.6339f)
                curveTo(13.0547f, 12.6037f, 13.1123f, 12.5736f, 13.1659f, 12.5487f)
                curveTo(13.4106f, 12.4087f, 13.6259f, 12.7527f, 13.3833f, 12.974f)
                close()
                moveTo(8.6385f, 7.148f)
                curveTo(9.0092f, 7.1027f, 9.1679f, 7.09f, 10.0066f, 7.0273f)
                horizontalLineTo(10.0146f)
                curveTo(9.6779f, 9.184f, 8.6925f, 10.0027f, 7.3332f, 10.0027f)
                curveTo(6.5352f, 10.0027f, 5.9112f, 9.442f, 5.9952f, 8.7467f)
                curveTo(6.1072f, 7.8167f, 6.9372f, 7.3567f, 8.6385f, 7.148f)
                close()
            }
        }
        .build()
        return _amazon!!
    }

private var _amazon: ImageVector? = null
