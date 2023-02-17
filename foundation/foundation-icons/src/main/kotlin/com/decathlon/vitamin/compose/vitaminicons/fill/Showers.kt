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

public val FillGroup.Showers: ImageVector
    get() {
        if (_showers != null) {
            return _showers!!
        }
        _showers = Builder(name = "Showers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.748f)
                curveTo(5.6737f, 17.4048f, 4.4578f, 16.7267f, 3.4687f, 15.7788f)
                curveTo(2.4797f, 14.8309f, 1.7506f, 13.6448f, 1.3514f, 12.3343f)
                curveTo(0.9521f, 11.0238f, 0.8961f, 9.6327f, 1.1888f, 8.2944f)
                curveTo(1.4814f, 6.956f, 2.1128f, 5.7152f, 3.0225f, 4.6909f)
                curveTo(3.9322f, 3.6665f, 5.0897f, 2.893f, 6.3841f, 2.4443f)
                curveTo(7.6785f, 1.9956f, 9.0665f, 1.8868f, 10.415f, 2.1284f)
                curveTo(11.7635f, 2.37f, 13.0273f, 2.9539f, 14.0855f, 3.824f)
                curveTo(15.1436f, 4.6942f, 15.9605f, 5.8215f, 16.458f, 7.098f)
                curveTo(17.2101f, 6.9541f, 17.9839f, 6.9688f, 18.7299f, 7.1412f)
                curveTo(19.4759f, 7.3136f, 20.1778f, 7.6398f, 20.7904f, 8.0991f)
                curveTo(21.4031f, 8.5583f, 21.9131f, 9.1404f, 22.2879f, 9.8081f)
                curveTo(22.6626f, 10.4758f, 22.8938f, 11.2144f, 22.9667f, 11.9767f)
                curveTo(23.0395f, 12.7389f, 22.9524f, 13.5079f, 22.711f, 14.2345f)
                curveTo(22.4695f, 14.9611f, 22.0789f, 15.6293f, 21.5644f, 16.1963f)
                curveTo(21.0498f, 16.7633f, 20.4225f, 17.2166f, 19.7226f, 17.5272f)
                curveTo(19.0227f, 17.8378f, 18.2657f, 17.9988f, 17.5f, 18.0f)
                lineTo(17.0f, 18.001f)
                verticalLineTo(21.001f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.001f)
                verticalLineTo(18.0f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _showers!!
    }

private var _showers: ImageVector? = null
