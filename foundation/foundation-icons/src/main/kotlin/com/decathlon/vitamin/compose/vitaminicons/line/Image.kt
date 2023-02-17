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

public val LineGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.828f, 21.0f)
                lineTo(4.808f, 21.02f)
                lineTo(4.787f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.7288f, 20.9997f, 2.4765f, 20.895f, 2.2905f, 20.7088f)
                curveTo(2.1045f, 20.5226f, 2.0f, 20.2702f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(2.0018f, 3.7304f, 2.1069f, 3.479f, 2.2925f, 3.2932f)
                curveTo(2.4781f, 3.1074f, 2.7294f, 3.0021f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(21.9982f, 20.2696f, 21.8931f, 20.521f, 21.7075f, 20.7068f)
                curveTo(21.5219f, 20.8926f, 21.2706f, 20.9979f, 21.008f, 21.0f)
                horizontalLineTo(4.828f)
                close()
                moveTo(20.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                lineTo(14.0f, 9.0f)
                lineTo(20.0f, 15.0f)
                close()
                moveTo(20.0f, 17.828f)
                lineTo(14.0f, 11.828f)
                lineTo(6.828f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.828f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(7.4696f, 11.0f, 6.9609f, 10.7893f, 6.5858f, 10.4142f)
                curveTo(6.2107f, 10.0391f, 6.0f, 9.5304f, 6.0f, 9.0f)
                curveTo(6.0f, 8.4696f, 6.2107f, 7.9609f, 6.5858f, 7.5858f)
                curveTo(6.9609f, 7.2107f, 7.4696f, 7.0f, 8.0f, 7.0f)
                curveTo(8.5304f, 7.0f, 9.0391f, 7.2107f, 9.4142f, 7.5858f)
                curveTo(9.7893f, 7.9609f, 10.0f, 8.4696f, 10.0f, 9.0f)
                curveTo(10.0f, 9.5304f, 9.7893f, 10.0391f, 9.4142f, 10.4142f)
                curveTo(9.0391f, 10.7893f, 8.5304f, 11.0f, 8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
