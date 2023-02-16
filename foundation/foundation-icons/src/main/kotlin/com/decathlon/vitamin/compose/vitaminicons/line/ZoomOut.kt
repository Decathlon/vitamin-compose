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

public val LineGroup.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0207f, 11.078f)
                lineTo(14.876f, 13.9327f)
                lineTo(13.9327f, 14.876f)
                lineTo(11.078f, 12.0207f)
                curveTo(10.0159f, 12.8722f, 8.6947f, 13.3353f, 7.3334f, 13.3334f)
                curveTo(4.0214f, 13.3334f, 1.3334f, 10.6454f, 1.3334f, 7.3334f)
                curveTo(1.3334f, 4.0214f, 4.0214f, 1.3334f, 7.3334f, 1.3334f)
                curveTo(10.6454f, 1.3334f, 13.3334f, 4.0214f, 13.3334f, 7.3334f)
                curveTo(13.3353f, 8.6947f, 12.8722f, 10.0159f, 12.0207f, 11.078f)
                close()
                moveTo(10.6834f, 10.5834f)
                curveTo(11.5294f, 9.7133f, 12.0019f, 8.547f, 12.0f, 7.3334f)
                curveTo(12.0f, 4.7547f, 9.9114f, 2.6667f, 7.3334f, 2.6667f)
                curveTo(4.7547f, 2.6667f, 2.6667f, 4.7547f, 2.6667f, 7.3334f)
                curveTo(2.6667f, 9.9114f, 4.7547f, 12.0f, 7.3334f, 12.0f)
                curveTo(8.547f, 12.0019f, 9.7133f, 11.5294f, 10.5834f, 10.6834f)
                lineTo(10.6834f, 10.5834f)
                close()
                moveTo(4.6667f, 6.6667f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.6667f)
                verticalLineTo(6.6667f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
