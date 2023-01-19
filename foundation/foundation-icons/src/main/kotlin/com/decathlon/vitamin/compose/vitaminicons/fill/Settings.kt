package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.3633f, 1.472f)
                curveTo(8.4638f, 1.2843f, 7.5352f, 1.2847f, 6.636f, 1.4733f)
                curveTo(6.5143f, 2.2739f, 6.0349f, 2.9763f, 5.3333f, 3.3807f)
                curveTo(4.6318f, 3.7863f, 3.7837f, 3.8503f, 3.0293f, 3.5547f)
                curveTo(2.4174f, 4.24f, 1.9531f, 5.0441f, 1.6653f, 5.9166f)
                curveTo(2.2987f, 6.4222f, 2.6673f, 7.1889f, 2.6666f, 7.9993f)
                curveTo(2.6672f, 8.8091f, 2.2992f, 9.5751f, 1.6666f, 10.0806f)
                curveTo(1.9526f, 10.9542f, 2.4163f, 11.7591f, 3.0286f, 12.4446f)
                curveTo(3.7832f, 12.1485f, 4.6315f, 12.2123f, 5.3333f, 12.618f)
                curveTo(6.036f, 13.0229f, 6.5158f, 13.726f, 6.6366f, 14.528f)
                curveTo(7.5362f, 14.7152f, 8.4648f, 14.7143f, 9.3639f, 14.5253f)
                curveTo(9.4856f, 13.7247f, 9.965f, 13.023f, 10.6666f, 12.6186f)
                curveTo(11.3681f, 12.213f, 12.2162f, 12.1489f, 12.9706f, 12.4446f)
                curveTo(13.5825f, 11.7592f, 14.0468f, 10.9552f, 14.3346f, 10.0826f)
                curveTo(13.724f, 9.594f, 13.3333f, 8.8427f, 13.3333f, 8.0f)
                curveTo(13.3323f, 7.1898f, 13.7004f, 6.4232f, 14.3333f, 5.9173f)
                curveTo(14.0472f, 5.044f, 13.5835f, 4.2393f, 12.9713f, 3.554f)
                curveTo(12.2166f, 3.8499f, 11.3683f, 3.7859f, 10.6666f, 3.38f)
                curveTo(9.9644f, 2.9755f, 9.4847f, 2.2732f, 9.3633f, 1.472f)
                close()
                moveTo(10.0f, 8.0f)
                curveTo(10.0f, 9.1045f, 9.1045f, 10.0f, 8.0f, 10.0f)
                curveTo(6.8954f, 10.0f, 6.0f, 9.1045f, 6.0f, 8.0f)
                curveTo(6.0f, 6.8954f, 6.8954f, 6.0f, 8.0f, 6.0f)
                curveTo(9.1045f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
