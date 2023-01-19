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

public val FillGroup.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0206f, 11.078f)
                lineTo(14.8759f, 13.9327f)
                lineTo(13.9326f, 14.876f)
                lineTo(11.0779f, 12.0207f)
                curveTo(10.0157f, 12.8722f, 8.6946f, 13.3353f, 7.3333f, 13.3334f)
                curveTo(4.0212f, 13.3334f, 1.3333f, 10.6454f, 1.3333f, 7.3334f)
                curveTo(1.3333f, 4.0214f, 4.0212f, 1.3334f, 7.3333f, 1.3334f)
                curveTo(10.6452f, 1.3334f, 13.3332f, 4.0214f, 13.3332f, 7.3334f)
                curveTo(13.3352f, 8.6947f, 12.8721f, 10.0159f, 12.0206f, 11.078f)
                close()
                moveTo(4.6666f, 6.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.9999f)
                verticalLineTo(6.6667f)
                horizontalLineTo(4.6666f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
