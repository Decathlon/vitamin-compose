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

public val FillGroup.ShareAndroid: ImageVector
    get() {
        if (_shareAndroid != null) {
            return _shareAndroid!!
        }
        _shareAndroid = Builder(name = "ShareAndroid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.576f, 17.271f)
                lineTo(8.466f, 14.484f)
                curveTo(7.9755f, 14.9709f, 7.3518f, 15.3017f, 6.6736f, 15.4346f)
                curveTo(5.9953f, 15.5676f, 5.2929f, 15.4968f, 4.6549f, 15.2311f)
                curveTo(4.0168f, 14.9654f, 3.4718f, 14.5168f, 3.0883f, 13.9418f)
                curveTo(2.7049f, 13.3668f, 2.5002f, 12.6911f, 2.5002f, 12.0f)
                curveTo(2.5002f, 11.3089f, 2.7049f, 10.6332f, 3.0883f, 10.0582f)
                curveTo(3.4718f, 9.4832f, 4.0168f, 9.0345f, 4.6549f, 8.7689f)
                curveTo(5.2929f, 8.5032f, 5.9953f, 8.4324f, 6.6736f, 8.5654f)
                curveTo(7.3518f, 8.6983f, 7.9755f, 9.0291f, 8.466f, 9.516f)
                lineTo(13.576f, 6.729f)
                curveTo(13.4007f, 5.9067f, 13.5273f, 5.0489f, 13.9326f, 4.3122f)
                curveTo(14.3378f, 3.5756f, 14.9947f, 3.0095f, 15.7831f, 2.7174f)
                curveTo(16.5714f, 2.4253f, 17.4386f, 2.4268f, 18.226f, 2.7215f)
                curveTo(19.0134f, 3.0162f, 19.6683f, 3.5845f, 20.0712f, 4.3224f)
                curveTo(20.474f, 5.0604f, 20.5977f, 5.9187f, 20.4197f, 6.7403f)
                curveTo(20.2418f, 7.562f, 19.7739f, 8.2922f, 19.1019f, 8.7973f)
                curveTo(18.4298f, 9.3024f, 17.5983f, 9.5487f, 16.7596f, 9.4912f)
                curveTo(15.9208f, 9.4337f, 15.1308f, 9.0761f, 14.534f, 8.484f)
                lineTo(9.424f, 11.271f)
                curveTo(9.5259f, 11.7516f, 9.5259f, 12.2483f, 9.424f, 12.729f)
                lineTo(14.534f, 15.516f)
                curveTo(15.1308f, 14.9238f, 15.9208f, 14.5663f, 16.7596f, 14.5088f)
                curveTo(17.5983f, 14.4513f, 18.4298f, 14.6976f, 19.1019f, 15.2027f)
                curveTo(19.7739f, 15.7078f, 20.2418f, 16.438f, 20.4197f, 17.2596f)
                curveTo(20.5977f, 18.0813f, 20.474f, 18.9396f, 20.0712f, 19.6776f)
                curveTo(19.6683f, 20.4155f, 19.0134f, 20.9838f, 18.226f, 21.2785f)
                curveTo(17.4386f, 21.5732f, 16.5714f, 21.5747f, 15.7831f, 21.2826f)
                curveTo(14.9947f, 20.9905f, 14.3378f, 20.4243f, 13.9326f, 19.6877f)
                curveTo(13.5273f, 18.9511f, 13.4007f, 18.0933f, 13.576f, 17.271f)
                close()
            }
        }
        .build()
        return _shareAndroid!!
    }

private var _shareAndroid: ImageVector? = null
