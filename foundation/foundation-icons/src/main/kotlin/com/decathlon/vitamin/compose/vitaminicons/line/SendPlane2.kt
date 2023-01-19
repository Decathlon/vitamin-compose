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

public val LineGroup.SendPlane2: ImageVector
    get() {
        if (_sendPlane2 != null) {
            return _sendPlane2!!
        }
        _sendPlane2 = Builder(name = "SendPlane2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.494f, 0.9387f)
                lineTo(14.802f, 7.708f)
                curveTo(14.8543f, 7.7368f, 14.8978f, 7.779f, 14.9282f, 7.8304f)
                curveTo(14.9586f, 7.8818f, 14.9746f, 7.9403f, 14.9746f, 8.0f)
                curveTo(14.9746f, 8.0597f, 14.9586f, 8.1182f, 14.9282f, 8.1696f)
                curveTo(14.8978f, 8.221f, 14.8543f, 8.2632f, 14.802f, 8.292f)
                lineTo(2.494f, 15.0613f)
                curveTo(2.4432f, 15.0893f, 2.3861f, 15.1035f, 2.3282f, 15.1026f)
                curveTo(2.2703f, 15.1017f, 2.2136f, 15.0857f, 2.1637f, 15.0562f)
                curveTo(2.1139f, 15.0268f, 2.0725f, 14.9848f, 2.0438f, 14.9345f)
                curveTo(2.0151f, 14.8842f, 2.0f, 14.8273f, 2.0f, 14.7693f)
                verticalLineTo(1.2307f)
                curveTo(2.0f, 1.1727f, 2.0151f, 1.1158f, 2.0438f, 1.0655f)
                curveTo(2.0725f, 1.0152f, 2.1139f, 0.9732f, 2.1637f, 0.9438f)
                curveTo(2.2136f, 0.9143f, 2.2703f, 0.8983f, 2.3282f, 0.8974f)
                curveTo(2.3861f, 0.8965f, 2.4432f, 0.9107f, 2.494f, 0.9387f)
                close()
                moveTo(3.3333f, 8.6667f)
                verticalLineTo(13.078f)
                lineTo(12.5667f, 8.0f)
                lineTo(3.3333f, 2.922f)
                verticalLineTo(7.3333f)
                horizontalLineTo(6.6667f)
                verticalLineTo(8.6667f)
                horizontalLineTo(3.3333f)
                close()
            }
        }
        .build()
        return _sendPlane2!!
    }

private var _sendPlane2: ImageVector? = null
