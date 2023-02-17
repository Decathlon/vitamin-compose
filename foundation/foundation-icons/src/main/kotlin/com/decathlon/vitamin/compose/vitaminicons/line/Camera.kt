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

public val LineGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.448f, 2.455f, 5.0f, 2.992f, 5.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 5.0f, 22.0f, 5.445f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.8612f, 20.9997f, 2.7316f, 20.9736f, 2.6109f, 20.9232f)
                curveTo(2.4901f, 20.8727f, 2.3805f, 20.7989f, 2.2883f, 20.706f)
                curveTo(2.1962f, 20.6131f, 2.1232f, 20.5029f, 2.0738f, 20.3818f)
                curveTo(2.0243f, 20.2606f, 1.9992f, 20.1309f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(14.0f, 16.0f)
                curveTo(14.7957f, 16.0f, 15.5587f, 15.6839f, 16.1213f, 15.1213f)
                curveTo(16.6839f, 14.5587f, 17.0f, 13.7956f, 17.0f, 13.0f)
                curveTo(17.0f, 12.2044f, 16.6839f, 11.4413f, 16.1213f, 10.8787f)
                curveTo(15.5587f, 10.3161f, 14.7957f, 10.0f, 14.0f, 10.0f)
                curveTo(13.2044f, 10.0f, 12.4413f, 10.3161f, 11.8787f, 10.8787f)
                curveTo(11.3161f, 11.4413f, 11.0f, 12.2044f, 11.0f, 13.0f)
                curveTo(11.0f, 13.7956f, 11.3161f, 14.5587f, 11.8787f, 15.1213f)
                curveTo(12.4413f, 15.6839f, 13.2044f, 16.0f, 14.0f, 16.0f)
                close()
                moveTo(14.0f, 18.0f)
                curveTo(12.6739f, 18.0f, 11.4022f, 17.4732f, 10.4645f, 16.5355f)
                curveTo(9.5268f, 15.5979f, 9.0f, 14.3261f, 9.0f, 13.0f)
                curveTo(9.0f, 11.6739f, 9.5268f, 10.4021f, 10.4645f, 9.4645f)
                curveTo(11.4022f, 8.5268f, 12.6739f, 8.0f, 14.0f, 8.0f)
                curveTo(15.3261f, 8.0f, 16.5979f, 8.5268f, 17.5356f, 9.4645f)
                curveTo(18.4732f, 10.4021f, 19.0f, 11.6739f, 19.0f, 13.0f)
                curveTo(19.0f, 14.3261f, 18.4732f, 15.5979f, 17.5356f, 16.5355f)
                curveTo(16.5979f, 17.4732f, 15.3261f, 18.0f, 14.0f, 18.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
