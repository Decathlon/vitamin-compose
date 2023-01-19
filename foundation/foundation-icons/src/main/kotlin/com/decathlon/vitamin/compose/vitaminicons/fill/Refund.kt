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

public val FillGroup.Refund: ImageVector
    get() {
        if (_refund != null) {
            return _refund!!
        }
        _refund = Builder(name = "Refund", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6667f, 4.6667f)
                horizontalLineTo(1.3334f)
                verticalLineTo(2.6667f)
                curveTo(1.3334f, 2.4899f, 1.4036f, 2.3203f, 1.5286f, 2.1953f)
                curveTo(1.6537f, 2.0702f, 1.8232f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.1769f, 2.0f, 14.3464f, 2.0702f, 14.4714f, 2.1953f)
                curveTo(14.5965f, 2.3203f, 14.6667f, 2.4899f, 14.6667f, 2.6667f)
                verticalLineTo(4.6667f)
                close()
                moveTo(14.6667f, 6.0f)
                verticalLineTo(13.3333f)
                curveTo(14.6667f, 13.5101f, 14.5965f, 13.6797f, 14.4714f, 13.8047f)
                curveTo(14.3464f, 13.9298f, 14.1769f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(2.0f)
                curveTo(1.8232f, 14.0f, 1.6537f, 13.9298f, 1.5286f, 13.8047f)
                curveTo(1.4036f, 13.6797f, 1.3334f, 13.5101f, 1.3334f, 13.3333f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.6667f)
                close()
                moveTo(7.3334f, 9.3333f)
                verticalLineTo(7.6667f)
                lineTo(4.3334f, 10.6667f)
                horizontalLineTo(11.3334f)
                verticalLineTo(9.3333f)
                horizontalLineTo(7.3334f)
                close()
            }
        }
        .build()
        return _refund!!
    }

private var _refund: ImageVector? = null
