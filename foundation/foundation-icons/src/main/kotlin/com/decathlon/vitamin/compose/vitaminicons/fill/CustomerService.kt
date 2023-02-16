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

public val FillGroup.CustomerService: ImageVector
    get() {
        if (_customerService != null) {
            return _customerService!!
        }
        _customerService = Builder(name = "CustomerService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.3333f)
                curveTo(14.3536f, 5.3333f, 14.6927f, 5.4738f, 14.9428f, 5.7238f)
                curveTo(15.1928f, 5.9739f, 15.3333f, 6.313f, 15.3333f, 6.6666f)
                verticalLineTo(9.3333f)
                curveTo(15.3333f, 9.6869f, 15.1928f, 10.0261f, 14.9428f, 10.2761f)
                curveTo(14.6927f, 10.5262f, 14.3536f, 10.6666f, 14.0f, 10.6666f)
                horizontalLineTo(13.292f)
                curveTo(13.1294f, 11.9555f, 12.5021f, 13.1408f, 11.5278f, 14.0f)
                curveTo(10.5534f, 14.8592f, 9.299f, 15.3333f, 8.0f, 15.3333f)
                verticalLineTo(14.0f)
                curveTo(9.0608f, 14.0f, 10.0782f, 13.5785f, 10.8284f, 12.8284f)
                curveTo(11.5785f, 12.0783f, 12.0f, 11.0608f, 12.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(12.0f, 4.9391f, 11.5785f, 3.9217f, 10.8284f, 3.1716f)
                curveTo(10.0782f, 2.4214f, 9.0608f, 2.0f, 8.0f, 2.0f)
                curveTo(6.9391f, 2.0f, 5.9217f, 2.4214f, 5.1715f, 3.1716f)
                curveTo(4.4214f, 3.9217f, 4.0f, 4.9391f, 4.0f, 6.0f)
                verticalLineTo(10.6666f)
                horizontalLineTo(2.0f)
                curveTo(1.6463f, 10.6666f, 1.3072f, 10.5262f, 1.0572f, 10.2761f)
                curveTo(0.8071f, 10.0261f, 0.6666f, 9.6869f, 0.6666f, 9.3333f)
                verticalLineTo(6.6666f)
                curveTo(0.6666f, 6.313f, 0.8071f, 5.9739f, 1.0572f, 5.7238f)
                curveTo(1.3072f, 5.4738f, 1.6463f, 5.3333f, 2.0f, 5.3333f)
                horizontalLineTo(2.708f)
                curveTo(2.8707f, 4.0446f, 3.498f, 2.8595f, 4.4723f, 2.0004f)
                curveTo(5.4467f, 1.1414f, 6.701f, 0.6674f, 8.0f, 0.6674f)
                curveTo(9.2989f, 0.6674f, 10.5532f, 1.1414f, 11.5276f, 2.0004f)
                curveTo(12.5019f, 2.8595f, 13.1293f, 4.0446f, 13.292f, 5.3333f)
                horizontalLineTo(14.0f)
                close()
                moveTo(5.1733f, 10.5233f)
                lineTo(5.88f, 9.3926f)
                curveTo(6.5153f, 9.7907f, 7.2502f, 10.0012f, 8.0f, 10.0f)
                curveTo(8.7497f, 10.0012f, 9.4846f, 9.7907f, 10.12f, 9.3926f)
                lineTo(10.8266f, 10.5233f)
                curveTo(9.9795f, 11.0541f, 8.9997f, 11.3348f, 8.0f, 11.3333f)
                curveTo(7.0003f, 11.3348f, 6.0205f, 11.0541f, 5.1733f, 10.5233f)
                close()
            }
        }
        .build()
        return _customerService!!
    }

private var _customerService: ImageVector? = null
