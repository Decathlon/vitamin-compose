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

public val FillGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3332f, 5.3333f)
                horizontalLineTo(13.3332f)
                lineTo(15.3332f, 8.0373f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.9765f)
                curveTo(13.8973f, 12.5562f, 13.62f, 13.0651f, 13.1956f, 13.4333f)
                curveTo(12.7713f, 13.8015f, 12.2283f, 14.0042f, 11.6665f, 14.0042f)
                curveTo(11.1047f, 14.0042f, 10.5617f, 13.8015f, 10.1374f, 13.4333f)
                curveTo(9.713f, 13.0651f, 9.4358f, 12.5562f, 9.3565f, 12.0f)
                horizontalLineTo(5.9765f)
                curveTo(5.8973f, 12.5562f, 5.62f, 13.0651f, 5.1956f, 13.4333f)
                curveTo(4.7713f, 13.8015f, 4.2283f, 14.0042f, 3.6665f, 14.0042f)
                curveTo(3.1047f, 14.0042f, 2.5617f, 13.8015f, 2.1374f, 13.4333f)
                curveTo(1.713f, 13.0651f, 1.4358f, 12.5562f, 1.3565f, 12.0f)
                horizontalLineTo(0.6665f)
                verticalLineTo(4.0f)
                curveTo(0.6665f, 3.8232f, 0.7367f, 3.6536f, 0.8618f, 3.5286f)
                curveTo(0.9868f, 3.4035f, 1.1564f, 3.3333f, 1.3332f, 3.3333f)
                horizontalLineTo(10.6665f)
                curveTo(10.8433f, 3.3333f, 11.0129f, 3.4035f, 11.1379f, 3.5286f)
                curveTo(11.2629f, 3.6536f, 11.3332f, 3.8232f, 11.3332f, 4.0f)
                verticalLineTo(5.3333f)
                close()
                moveTo(11.3332f, 6.6666f)
                verticalLineTo(8.6666f)
                horizontalLineTo(13.9998f)
                verticalLineTo(8.4767f)
                lineTo(12.6612f, 6.6666f)
                horizontalLineTo(11.3332f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
