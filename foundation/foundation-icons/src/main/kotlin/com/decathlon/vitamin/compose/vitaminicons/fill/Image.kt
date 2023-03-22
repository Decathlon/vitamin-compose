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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 3.993f)
                curveTo(2.0038f, 3.4466f, 2.4456f, 3.0044f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(21.9962f, 20.5534f, 21.5544f, 20.9956f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 20.9994f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                lineTo(13.292f, 9.706f)
                curveTo(13.6825f, 9.3156f, 14.3155f, 9.3156f, 14.706f, 9.706f)
                lineTo(20.0f, 15.01f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.0f, 9.0f)
                curveTo(6.0f, 10.1046f, 6.8954f, 11.0f, 8.0f, 11.0f)
                curveTo(9.1046f, 11.0f, 10.0f, 10.1046f, 10.0f, 9.0f)
                curveTo(10.0f, 7.8954f, 9.1046f, 7.0f, 8.0f, 7.0f)
                curveTo(6.8954f, 7.0f, 6.0f, 7.8954f, 6.0f, 9.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
