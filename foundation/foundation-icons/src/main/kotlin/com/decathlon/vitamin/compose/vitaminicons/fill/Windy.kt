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

public val FillGroup.Windy: ImageVector
    get() {
        if (_windy != null) {
            return _windy!!
        }
        _windy = Builder(name = "Windy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                curveTo(11.1387f, 15.0003f, 11.7653f, 15.1753f, 12.3116f, 15.5061f)
                curveTo(12.858f, 15.837f, 13.3035f, 16.311f, 13.5997f, 16.877f)
                curveTo(13.8959f, 17.4429f, 14.0316f, 18.0791f, 13.992f, 18.7166f)
                curveTo(13.9525f, 19.3541f, 13.7393f, 19.9687f, 13.3755f, 20.4937f)
                curveTo(13.0116f, 21.0187f, 12.5111f, 21.4341f, 11.928f, 21.6949f)
                curveTo(11.3449f, 21.9557f, 10.7016f, 22.052f, 10.0677f, 21.9734f)
                curveTo(9.4338f, 21.8947f, 8.8336f, 21.6441f, 8.3319f, 21.2486f)
                curveTo(7.8303f, 20.8532f, 7.4465f, 20.328f, 7.222f, 19.73f)
                lineTo(9.095f, 19.027f)
                curveTo(9.1912f, 19.2833f, 9.3557f, 19.5084f, 9.5706f, 19.6779f)
                curveTo(9.7856f, 19.8474f, 10.0428f, 19.9549f, 10.3145f, 19.9886f)
                curveTo(10.5862f, 20.0223f, 10.8619f, 19.9811f, 11.1118f, 19.8693f)
                curveTo(11.3617f, 19.7575f, 11.5762f, 19.5795f, 11.7322f, 19.3545f)
                curveTo(11.8881f, 19.1295f, 11.9795f, 18.8662f, 11.9965f, 18.5929f)
                curveTo(12.0135f, 18.3197f, 11.9553f, 18.0471f, 11.8284f, 17.8045f)
                curveTo(11.7015f, 17.562f, 11.5106f, 17.3588f, 11.2764f, 17.217f)
                curveTo(11.0423f, 17.0752f, 10.7738f, 17.0001f, 10.5f, 17.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(18.5f)
                curveTo(19.1387f, 11.0003f, 19.7653f, 11.1753f, 20.3116f, 11.5061f)
                curveTo(20.858f, 11.837f, 21.3035f, 12.311f, 21.5997f, 12.877f)
                curveTo(21.8959f, 13.4429f, 22.0316f, 14.0791f, 21.992f, 14.7166f)
                curveTo(21.9525f, 15.3541f, 21.7393f, 15.9687f, 21.3755f, 16.4937f)
                curveTo(21.0116f, 17.0186f, 20.5111f, 17.4341f, 19.928f, 17.6949f)
                curveTo(19.3449f, 17.9557f, 18.7016f, 18.052f, 18.0677f, 17.9734f)
                curveTo(17.4338f, 17.8947f, 16.8336f, 17.6441f, 16.3319f, 17.2486f)
                curveTo(15.8303f, 16.8532f, 15.4465f, 16.328f, 15.222f, 15.73f)
                lineTo(17.095f, 15.027f)
                curveTo(17.1912f, 15.2833f, 17.3557f, 15.5084f, 17.5706f, 15.6779f)
                curveTo(17.7856f, 15.8474f, 18.0428f, 15.9549f, 18.3145f, 15.9886f)
                curveTo(18.5862f, 16.0223f, 18.8619f, 15.9811f, 19.1118f, 15.8693f)
                curveTo(19.3617f, 15.7575f, 19.5762f, 15.5795f, 19.7322f, 15.3545f)
                curveTo(19.8881f, 15.1295f, 19.9795f, 14.8662f, 19.9965f, 14.5929f)
                curveTo(20.0135f, 14.3197f, 19.9553f, 14.0471f, 19.8284f, 13.8045f)
                curveTo(19.7015f, 13.562f, 19.5106f, 13.3588f, 19.2764f, 13.217f)
                curveTo(19.0423f, 13.0752f, 18.7738f, 13.0001f, 18.5f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(4.2043f, 13.0f, 3.4413f, 12.684f, 2.8787f, 12.1213f)
                curveTo(2.3161f, 11.5587f, 2.0f, 10.7957f, 2.0f, 10.0f)
                curveTo(2.0f, 9.2044f, 2.3161f, 8.4413f, 2.8787f, 7.8787f)
                curveTo(3.4413f, 7.3161f, 4.2043f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(13.7738f, 6.9999f, 14.0423f, 6.9249f, 14.2764f, 6.7831f)
                curveTo(14.5106f, 6.6413f, 14.7015f, 6.4381f, 14.8284f, 6.1955f)
                curveTo(14.9553f, 5.953f, 15.0135f, 5.6803f, 14.9965f, 5.4071f)
                curveTo(14.9795f, 5.1339f, 14.8881f, 4.8705f, 14.7322f, 4.6455f)
                curveTo(14.5762f, 4.4205f, 14.3617f, 4.2425f, 14.1118f, 4.1307f)
                curveTo(13.8619f, 4.019f, 13.5862f, 3.9777f, 13.3145f, 4.0115f)
                curveTo(13.0428f, 4.0452f, 12.7856f, 4.1526f, 12.5706f, 4.3221f)
                curveTo(12.3557f, 4.4916f, 12.1912f, 4.7167f, 12.095f, 4.973f)
                lineTo(10.222f, 4.271f)
                curveTo(10.5105f, 3.5038f, 11.059f, 2.8622f, 11.7719f, 2.4578f)
                curveTo(12.4849f, 2.0535f, 13.3171f, 1.9121f, 14.1236f, 2.0584f)
                curveTo(14.9301f, 2.2046f, 15.6597f, 2.6292f, 16.1853f, 3.2581f)
                curveTo(16.711f, 3.887f, 16.9993f, 4.6804f, 17.0f, 5.5f)
                curveTo(17.0f, 6.4283f, 16.6313f, 7.3185f, 15.9749f, 7.9749f)
                curveTo(15.3185f, 8.6313f, 14.4283f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.7348f, 9.0f, 4.4804f, 9.1054f, 4.2929f, 9.2929f)
                curveTo(4.1054f, 9.4805f, 4.0f, 9.7348f, 4.0f, 10.0f)
                curveTo(4.0f, 10.2652f, 4.1054f, 10.5196f, 4.2929f, 10.7071f)
                curveTo(4.4804f, 10.8947f, 4.7348f, 11.0f, 5.0f, 11.0f)
                close()
            }
        }
        .build()
        return _windy!!
    }

private var _windy: ImageVector? = null
