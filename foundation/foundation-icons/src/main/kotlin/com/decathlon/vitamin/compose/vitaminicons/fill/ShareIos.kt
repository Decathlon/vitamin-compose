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

public val FillGroup.ShareIos: ImageVector
    get() {
        if (_shareIos != null) {
            return _shareIos!!
        }
        _shareIos = Builder(name = "ShareIos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.1073f)
                curveTo(8.3422f, 10.1073f, 8.6124f, 9.8287f, 8.6124f, 9.5017f)
                verticalLineTo(3.4887f)
                lineTo(8.5644f, 2.5926f)
                lineTo(8.9127f, 3.0467f)
                lineTo(9.6992f, 3.8945f)
                curveTo(9.8073f, 4.0156f, 9.9574f, 4.0761f, 10.1075f, 4.0761f)
                curveTo(10.4017f, 4.0761f, 10.6479f, 3.8581f, 10.6479f, 3.5493f)
                curveTo(10.6479f, 3.3919f, 10.5879f, 3.2708f, 10.4798f, 3.1618f)
                lineTo(8.4743f, 1.218f)
                curveTo(8.3122f, 1.0605f, 8.1621f, 1.0f, 8.0f, 1.0f)
                curveTo(7.8379f, 1.0f, 7.6818f, 1.0605f, 7.5257f, 1.218f)
                lineTo(5.5202f, 3.1618f)
                curveTo(5.4061f, 3.2708f, 5.3461f, 3.3919f, 5.3461f, 3.5493f)
                curveTo(5.3461f, 3.8581f, 5.5922f, 4.0761f, 5.8865f, 4.0761f)
                curveTo(6.0366f, 4.0761f, 6.1927f, 4.0156f, 6.2948f, 3.8945f)
                lineTo(7.0873f, 3.0467f)
                lineTo(7.4356f, 2.5926f)
                lineTo(7.3815f, 3.4887f)
                verticalLineTo(9.5017f)
                curveTo(7.3815f, 9.8287f, 7.6578f, 10.1073f, 8.0f, 10.1073f)
                close()
                moveTo(4.5355f, 15.0f)
                horizontalLineTo(11.4645f)
                curveTo(12.7975f, 15.0f, 13.5f, 14.2915f, 13.5f, 12.9654f)
                verticalLineTo(7.0675f)
                curveTo(13.5f, 5.7414f, 12.7975f, 5.0329f, 11.4645f, 5.0329f)
                horizontalLineTo(9.8734f)
                verticalLineTo(6.3832f)
                horizontalLineTo(11.3504f)
                curveTo(11.8728f, 6.3832f, 12.161f, 6.6557f, 12.161f, 7.2067f)
                verticalLineTo(12.8261f)
                curveTo(12.161f, 13.3832f, 11.8728f, 13.6497f, 11.3504f, 13.6497f)
                horizontalLineTo(4.6496f)
                curveTo(4.1212f, 13.6497f, 3.839f, 13.3832f, 3.839f, 12.8261f)
                verticalLineTo(7.2067f)
                curveTo(3.839f, 6.6557f, 4.1212f, 6.3832f, 4.6496f, 6.3832f)
                horizontalLineTo(6.1446f)
                verticalLineTo(5.0329f)
                horizontalLineTo(4.5355f)
                curveTo(3.2085f, 5.0329f, 2.5f, 5.7414f, 2.5f, 7.0675f)
                verticalLineTo(12.9654f)
                curveTo(2.5f, 14.2976f, 3.2085f, 15.0f, 4.5355f, 15.0f)
                close()
            }
        }
        .build()
        return _shareIos!!
    }

private var _shareIos: ImageVector? = null
