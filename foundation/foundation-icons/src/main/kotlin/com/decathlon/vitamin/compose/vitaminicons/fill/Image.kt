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

public val FillGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3334f, 2.662f)
                curveTo(1.3359f, 2.2977f, 1.6304f, 2.0029f, 1.9947f, 2.0f)
                horizontalLineTo(14.0054f)
                curveTo(14.3707f, 2.0f, 14.6667f, 2.2967f, 14.6667f, 2.662f)
                verticalLineTo(13.338f)
                curveTo(14.6642f, 13.7023f, 14.3697f, 13.9971f, 14.0054f, 14.0f)
                horizontalLineTo(1.9947f)
                curveTo(1.6294f, 13.9996f, 1.3334f, 13.7034f, 1.3334f, 13.338f)
                verticalLineTo(2.662f)
                close()
                moveTo(13.3334f, 3.3333f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.6667f)
                lineTo(8.8614f, 6.4707f)
                curveTo(9.1217f, 6.2104f, 9.5437f, 6.2104f, 9.804f, 6.4707f)
                lineTo(13.3334f, 10.0067f)
                verticalLineTo(3.3333f)
                close()
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 6.7364f, 4.597f, 7.3333f, 5.3334f, 7.3333f)
                curveTo(6.0697f, 7.3333f, 6.6667f, 6.7364f, 6.6667f, 6.0f)
                curveTo(6.6667f, 5.2636f, 6.0697f, 4.6667f, 5.3334f, 4.6667f)
                curveTo(4.597f, 4.6667f, 4.0f, 5.2636f, 4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
