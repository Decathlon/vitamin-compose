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

public val LineGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9214f, 12.8646f)
                curveTo(10.7488f, 13.6084f, 9.3885f, 14.0022f, 8.0f, 14.0f)
                curveTo(4.4054f, 14.0f, 1.4147f, 11.4133f, 0.7874f, 8.0f)
                curveTo(1.074f, 6.4471f, 1.8551f, 5.0286f, 3.014f, 3.956f)
                lineTo(0.928f, 1.872f)
                lineTo(1.8714f, 0.9287f)
                lineTo(15.0707f, 14.1286f)
                lineTo(14.1274f, 15.0713f)
                lineTo(11.9207f, 12.8646f)
                horizontalLineTo(11.9214f)
                close()
                moveTo(3.9567f, 4.9f)
                curveTo(3.0507f, 5.7237f, 2.4196f, 6.8058f, 2.1487f, 8.0f)
                curveTo(2.3569f, 8.9109f, 2.7749f, 9.7607f, 3.3694f, 10.4817f)
                curveTo(3.9639f, 11.2027f, 4.7184f, 11.7749f, 5.5731f, 12.1529f)
                curveTo(6.4277f, 12.5308f, 7.3587f, 12.704f, 8.2921f, 12.6587f)
                curveTo(9.2254f, 12.6134f, 10.1353f, 12.3509f, 10.9494f, 11.892f)
                lineTo(9.5974f, 10.54f)
                curveTo(9.0218f, 10.9025f, 8.3401f, 11.0587f, 7.6642f, 10.9829f)
                curveTo(6.9882f, 10.9072f, 6.358f, 10.6039f, 5.8771f, 10.1229f)
                curveTo(5.3961f, 9.642f, 5.0928f, 9.0118f, 5.0171f, 8.3358f)
                curveTo(4.9413f, 7.6599f, 5.0975f, 6.9782f, 5.46f, 6.4026f)
                lineTo(3.9567f, 4.9f)
                close()
                moveTo(8.6094f, 9.552f)
                lineTo(6.448f, 7.3906f)
                curveTo(6.3294f, 7.6926f, 6.3015f, 8.0226f, 6.3677f, 8.3402f)
                curveTo(6.4339f, 8.6578f, 6.5914f, 8.9492f, 6.8208f, 9.1786f)
                curveTo(7.0502f, 9.408f, 7.3415f, 9.5654f, 7.6591f, 9.6316f)
                curveTo(7.9767f, 9.6979f, 8.3067f, 9.6699f, 8.6087f, 9.5513f)
                lineTo(8.6094f, 9.552f)
                close()
                moveTo(13.8714f, 11.0613f)
                lineTo(12.9174f, 10.108f)
                curveTo(13.363f, 9.4728f, 13.6803f, 8.7568f, 13.8514f, 8.0f)
                curveTo(13.6702f, 7.2065f, 13.3295f, 6.4581f, 12.8501f, 5.8003f)
                curveTo(12.3707f, 5.1425f, 11.7625f, 4.5891f, 11.0626f, 4.1737f)
                curveTo(10.3627f, 3.7583f, 9.5856f, 3.4896f, 8.7785f, 3.3838f)
                curveTo(7.9715f, 3.2781f, 7.1514f, 3.3376f, 6.368f, 3.5587f)
                lineTo(5.316f, 2.5066f)
                curveTo(6.1473f, 2.18f, 7.0533f, 2.0f, 8.0f, 2.0f)
                curveTo(11.5947f, 2.0f, 14.5854f, 4.5866f, 15.2127f, 8.0f)
                curveTo(15.0084f, 9.1104f, 14.5493f, 10.1584f, 13.8714f, 11.0613f)
                close()
                moveTo(7.8154f, 5.0053f)
                curveTo(8.2397f, 4.9791f, 8.6648f, 5.0434f, 9.0624f, 5.1939f)
                curveTo(9.46f, 5.3444f, 9.8211f, 5.5777f, 10.1217f, 5.8783f)
                curveTo(10.4223f, 6.1789f, 10.6556f, 6.54f, 10.8061f, 6.9376f)
                curveTo(10.9566f, 7.3352f, 11.0209f, 7.7603f, 10.9947f, 8.1847f)
                lineTo(7.8147f, 5.0053f)
                horizontalLineTo(7.8154f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
