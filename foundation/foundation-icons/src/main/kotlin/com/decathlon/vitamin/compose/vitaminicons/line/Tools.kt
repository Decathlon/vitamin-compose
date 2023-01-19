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

public val LineGroup.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5533f, 2.1806f)
                curveTo(3.998f, 2.022f, 4.4804f, 2.0019f, 4.9367f, 2.1232f)
                curveTo(5.393f, 2.2444f, 5.8018f, 2.5013f, 6.1091f, 2.8597f)
                curveTo(6.4164f, 3.2182f, 6.6077f, 3.6615f, 6.6577f, 4.131f)
                curveTo(6.7077f, 4.6005f, 6.6142f, 5.0741f, 6.3893f, 5.4893f)
                lineTo(13.5287f, 12.6293f)
                lineTo(12.586f, 13.572f)
                lineTo(5.446f, 6.432f)
                curveTo(5.0307f, 6.6559f, 4.5573f, 6.7488f, 4.0882f, 6.6983f)
                curveTo(3.6191f, 6.6479f, 3.1763f, 6.4564f, 2.8181f, 6.1493f)
                curveTo(2.46f, 5.8422f, 2.2033f, 5.4337f, 2.0819f, 4.9778f)
                curveTo(1.9605f, 4.5219f, 1.98f, 4.0399f, 2.138f, 3.5953f)
                lineTo(3.6293f, 5.0866f)
                curveTo(3.7216f, 5.1821f, 3.8319f, 5.2583f, 3.9539f, 5.3107f)
                curveTo(4.0759f, 5.3632f, 4.2071f, 5.3907f, 4.3399f, 5.3919f)
                curveTo(4.4727f, 5.393f, 4.6044f, 5.3677f, 4.7273f, 5.3175f)
                curveTo(4.8502f, 5.2672f, 4.9618f, 5.1929f, 5.0557f, 5.099f)
                curveTo(5.1496f, 5.0051f, 5.2239f, 4.8935f, 5.2741f, 4.7706f)
                curveTo(5.3244f, 4.6477f, 5.3497f, 4.516f, 5.3486f, 4.3832f)
                curveTo(5.3474f, 4.2505f, 5.3198f, 4.1192f, 5.2674f, 3.9972f)
                curveTo(5.215f, 3.8752f, 5.1388f, 3.7649f, 5.0433f, 3.6726f)
                lineTo(3.5527f, 2.18f)
                lineTo(3.5533f, 2.1806f)
                close()
                moveTo(10.4647f, 3.4366f)
                lineTo(12.586f, 2.258f)
                lineTo(13.5287f, 3.2006f)
                lineTo(12.35f, 5.322f)
                lineTo(11.1713f, 5.558f)
                lineTo(9.758f, 6.972f)
                lineTo(8.8147f, 6.0293f)
                lineTo(10.2287f, 4.6153f)
                lineTo(10.4647f, 3.4366f)
                close()
                moveTo(5.986f, 8.858f)
                lineTo(6.9287f, 9.8006f)
                lineTo(3.3933f, 13.336f)
                curveTo(3.2731f, 13.4565f, 3.1114f, 13.5265f, 2.9412f, 13.5316f)
                curveTo(2.7711f, 13.5367f, 2.6054f, 13.4765f, 2.4782f, 13.3634f)
                curveTo(2.351f, 13.2502f, 2.2719f, 13.0927f, 2.2571f, 12.9232f)
                curveTo(2.2423f, 12.7536f, 2.293f, 12.5847f, 2.3987f, 12.4513f)
                lineTo(2.4507f, 12.3933f)
                lineTo(5.986f, 8.858f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
