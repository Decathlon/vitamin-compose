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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.031f, 16.617f)
                lineTo(22.314f, 20.899f)
                lineTo(20.899f, 22.314f)
                lineTo(16.617f, 18.031f)
                curveTo(15.0237f, 19.3082f, 13.042f, 20.0029f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0029f, 13.042f, 19.3082f, 15.0237f, 18.031f, 16.617f)
                close()
                moveTo(16.025f, 15.875f)
                curveTo(17.2941f, 14.5699f, 18.0029f, 12.8204f, 18.0f, 11.0f)
                curveTo(18.0f, 7.132f, 14.867f, 4.0f, 11.0f, 4.0f)
                curveTo(7.132f, 4.0f, 4.0f, 7.132f, 4.0f, 11.0f)
                curveTo(4.0f, 14.867f, 7.132f, 18.0f, 11.0f, 18.0f)
                curveTo(12.8204f, 18.0029f, 14.5699f, 17.2941f, 15.875f, 16.025f)
                lineTo(16.025f, 15.875f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
