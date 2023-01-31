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

public val FillGroup.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3299f, 3.271f)
                curveTo(5.954f, 3.0484f, 6.6284f, 3.0075f, 7.2748f, 3.153f)
                curveTo(7.9212f, 3.2985f, 8.513f, 3.6246f, 8.9814f, 4.0932f)
                curveTo(9.4498f, 4.5618f, 9.7755f, 5.1537f, 9.9208f, 5.8002f)
                curveTo(10.066f, 6.4466f, 10.0248f, 7.121f, 9.8019f, 7.745f)
                lineTo(20.6469f, 18.59f)
                lineTo(18.5249f, 20.711f)
                lineTo(7.6799f, 9.867f)
                curveTo(7.0559f, 10.0896f, 6.3815f, 10.1305f, 5.7351f, 9.985f)
                curveTo(5.0887f, 9.8394f, 4.4969f, 9.5134f, 4.0285f, 9.0448f)
                curveTo(3.5601f, 8.5762f, 3.2343f, 7.9843f, 3.0891f, 7.3378f)
                curveTo(2.9438f, 6.6913f, 2.985f, 6.0169f, 3.2079f, 5.393f)
                lineTo(5.4439f, 7.63f)
                curveTo(5.5823f, 7.7733f, 5.7478f, 7.8875f, 5.9308f, 7.9661f)
                curveTo(6.1138f, 8.0448f, 6.3106f, 8.0861f, 6.5098f, 8.0879f)
                curveTo(6.709f, 8.0896f, 6.9065f, 8.0517f, 7.0908f, 7.9762f)
                curveTo(7.2752f, 7.9008f, 7.4427f, 7.7894f, 7.5835f, 7.6486f)
                curveTo(7.7243f, 7.5078f, 7.8357f, 7.3403f, 7.9111f, 7.1559f)
                curveTo(7.9866f, 6.9716f, 8.0245f, 6.7741f, 8.0228f, 6.5749f)
                curveTo(8.0211f, 6.3757f, 7.9797f, 6.1789f, 7.9011f, 5.9959f)
                curveTo(7.8225f, 5.8129f, 7.7082f, 5.6474f, 7.5649f, 5.509f)
                lineTo(5.3289f, 3.27f)
                lineTo(5.3299f, 3.271f)
                close()
                moveTo(15.6969f, 5.155f)
                lineTo(18.8789f, 3.387f)
                lineTo(20.2929f, 4.801f)
                lineTo(18.5249f, 7.983f)
                lineTo(16.7569f, 8.337f)
                lineTo(14.6369f, 10.458f)
                lineTo(13.2219f, 9.044f)
                lineTo(15.3429f, 6.923f)
                lineTo(15.6969f, 5.155f)
                close()
                moveTo(8.6259f, 12.933f)
                lineTo(10.7469f, 15.055f)
                lineTo(5.7969f, 20.005f)
                curveTo(5.524f, 20.2754f, 5.1576f, 20.4308f, 4.7735f, 20.439f)
                curveTo(4.3894f, 20.4473f, 4.0167f, 20.3078f, 3.7324f, 20.0494f)
                curveTo(3.448f, 19.791f, 3.2737f, 19.4333f, 3.2453f, 19.0501f)
                curveTo(3.217f, 18.6669f, 3.3367f, 18.2875f, 3.5799f, 17.99f)
                lineTo(3.6769f, 17.883f)
                lineTo(8.6269f, 12.933f)
                horizontalLineTo(8.6259f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
