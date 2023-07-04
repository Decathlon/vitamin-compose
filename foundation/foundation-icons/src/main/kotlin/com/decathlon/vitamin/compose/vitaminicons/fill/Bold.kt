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

public val FillGroup.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(13.163f, 11.0f, 13.7989f, 10.7366f, 14.2678f, 10.2678f)
                curveTo(14.7366f, 9.7989f, 15.0f, 9.163f, 15.0f, 8.5f)
                curveTo(15.0f, 7.837f, 14.7366f, 7.2011f, 14.2678f, 6.7322f)
                curveTo(13.7989f, 6.2634f, 13.163f, 6.0f, 12.5f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(18.0f, 15.5f)
                curveTo(18.0f, 16.0909f, 17.8836f, 16.6761f, 17.6575f, 17.2221f)
                curveTo(17.4313f, 17.768f, 17.0998f, 18.2641f, 16.682f, 18.682f)
                curveTo(16.2641f, 19.0998f, 15.768f, 19.4313f, 15.2221f, 19.6575f)
                curveTo(14.6761f, 19.8836f, 14.0909f, 20.0f, 13.5f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.5f)
                curveTo(13.381f, 4.0f, 14.2425f, 4.2586f, 14.9779f, 4.7438f)
                curveTo(15.7132f, 5.2289f, 16.29f, 5.9192f, 16.6367f, 6.7291f)
                curveTo(16.9834f, 7.5389f, 17.0847f, 8.4328f, 16.9282f, 9.2997f)
                curveTo(16.7716f, 10.1666f, 16.3641f, 10.9685f, 15.756f, 11.606f)
                curveTo(16.4386f, 12.0013f, 17.0053f, 12.5692f, 17.3992f, 13.2526f)
                curveTo(17.7931f, 13.9361f, 18.0003f, 14.7112f, 18.0f, 15.5f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                curveTo(14.163f, 18.0f, 14.7989f, 17.7366f, 15.2678f, 17.2678f)
                curveTo(15.7366f, 16.7989f, 16.0f, 16.163f, 16.0f, 15.5f)
                curveTo(16.0f, 14.837f, 15.7366f, 14.2011f, 15.2678f, 13.7322f)
                curveTo(14.7989f, 13.2634f, 14.163f, 13.0f, 13.5f, 13.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
